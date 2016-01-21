/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trivadis.jooq.jooqtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static com.trivadis.jooq.generated.sakila.Tables.*;
import com.trivadis.jooq.generated.sakila.tables.*;
import com.trivadis.jooq.generated.sakila.tables.records.*;
import java.math.BigDecimal;
import java.util.Random;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jooq.exception.DataAccessException;

public class DisplayFilms {

  private final static Logger logger = Logger.getLogger(DisplayFilms.class.getName());
  private final static String userName = "sakila";
  private final static String password = "sakila";
  private final static String url = "jdbc:oracle:thin:@(DESCRIPTION=(TRANSPORT_CONNECT_TIMEOUT=5)(RETRY_COUNT=6)"
    + "(ADDRESS_LIST=(LOAD_BALANCE=ON)(FAILOVER=ON)"
    + "(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.100.25)(PORT = 1521))"
    + "(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.100.26)(PORT = 1521)))"
    + "(CONNECT_DATA=(SERVER= DEDICATED)(SERVICE_NAME = pdb1)))";

  private static final int CUSTOMER_MAX_ID = 599;
  private static final int CATEGORY_MAX_ID = 15;

  public static void main(String[] args) throws SQLException {

    long startTime = System.nanoTime();

    try (Connection conn = DriverManager.getConnection(url, userName, password)) {

      //conn.setClientInfo("OCSID.MODULE", "jooqtest");
      IntStream.range(0, 10000).forEach(i -> {
        try {
          new DisplayFilms().doWork(conn);
        } catch (SQLException ex) {
          Logger.getLogger(DisplayFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
      });
    }

    long endTime = System.nanoTime();
    long durationMs = (endTime - startTime) / 1000000;
    logger.info("Execution time: " + durationMs);
  }

  public void doWork(Connection conn) throws SQLException {

    /* the target customer */
    CustomerRecord customer = getCustomer(conn);
    logger.info("Customer is: " + customer.getCustomerId());

    /* find similar customers. Similar here means living in same country */
    /* Step 1: target customer's country */
    //CountryRecord customerCountry = getCountry(conn, customer.getAddressId());
    //logger.info("Customer lives in country: " + customerCountry.getCountry());

    /* Step 2: customers who live in same country */
    //List<BigDecimal> similarCustomerIds = getSimilarCustomers(conn, customerCountry.getCountryId());
    //logger.info("Similar customers are: " + similarCustomerIds.toString());

    /* 1 Step Method to find similar customers */
    List<BigDecimal> similarCustomerIds = getSimilarCustomers1Step(conn, customer.getAddressId());
    logger.info("Similar customers are: " + similarCustomerIds.toString());

    /* target customer's preferred category */
    BigDecimal categoryId = getPreferredCategory(conn, customer);
    logger.info("Customer preferred category: " + categoryId);

    /* inventories for similar customers */
    //List<BigDecimal> filmIds = getFilmIds(conn, similarCustomerIds);
    //logger.info("Relevant inventories are: " + filmIds.toString());

    /* display films where similarity criterion and category criterion both match */
    //List<FilmRecord> films = getFilmInfo(conn, filmIds, categoryId);
    List<FilmRecord> films = getFilmInfo1Step(conn, similarCustomerIds, categoryId);

    logger.info("Displaying films: " + films.stream().map(film -> film.getTitle()).collect(Collectors.toList()));
    //logger.info("Unique films: " + films.size() + ", matching inventories: " + filmIds.size() + ", similar customers: "
    //     + similarCustomerIds.size());
    logger.info("Unique films: " + films.size() + ", similar customers: " + similarCustomerIds.size());

  }

  private List<FilmRecord> getFilmInfo(Connection conn, List<BigDecimal> filmIds, BigDecimal categoryId) {

    List<FilmRecord> films = DSL.using(conn, SQLDialect.ORACLE)
      .selectDistinct(FILM.FILM_ID, FILM.DESCRIPTION, FILM.LANGUAGE_ID, FILM.LAST_UPDATE, FILM.LENGTH,
        FILM.ORIGINAL_LANGUAGE_ID, FILM.RATING, FILM.RELEASE_YEAR, FILM.RENTAL_DURATION,
        FILM.RENTAL_RATE, FILM.REPLACEMENT_COST, FILM.SPECIAL_FEATURES, FILM.TITLE)
      .from(FILM)
      .join(FILM_CATEGORY)
      .on(FILM_CATEGORY.FILM_ID.equal(FILM.FILM_ID))
      .join(CATEGORY)
      .on(CATEGORY.CATEGORY_ID.equal(FILM_CATEGORY.CATEGORY_ID))
      .where(FILM.FILM_ID.in(filmIds.stream().limit(1000).collect(Collectors.toList())))
      .and(CATEGORY.CATEGORY_ID.equal(categoryId))
      .fetchInto(FilmRecord.class);
    return films;

  }

  /*
   SELECT inventory.film_id 
   FROM inventory JOIN rental ON inventory.inventory_id = rental.inventory_id 
   WHERE rental.customer_id IN (:1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , :20 )
   */
  private List<BigDecimal> getFilmIds(Connection conn, List<BigDecimal> similarCustomerIds) {

    List<BigDecimal> filmIds = DSL.using(conn, SQLDialect.ORACLE)
      .select(INVENTORY.FILM_ID)
      .from(INVENTORY)
      .join(RENTAL)
      .on(INVENTORY.INVENTORY_ID.equal(RENTAL.INVENTORY_ID))
      .where(RENTAL.CUSTOMER_ID.in(similarCustomerIds))
      .fetchInto(BigDecimal.class);
    return filmIds;
  }

  /* 
   SELECT customer.customer_id, customer.store_id, customer.first_name, customer.last_name, customer.email, customer.address_id,
   customer.active, customer.create_date, customer.last_update 
   FROM
   customer WHERE customer.customer_id = :1 
   */
  private CustomerRecord getCustomer(Connection conn) {

    return DSL.using(conn, SQLDialect.ORACLE)
      .selectFrom(CUSTOMER)
      .where(CUSTOMER.CUSTOMER_ID.equal(
          BigDecimal.valueOf(new Random().nextInt(CUSTOMER_MAX_ID) + 1)))
      .fetchOne();

  }

  //.where(CUSTOMER.CUSTOMER_ID.equal(BigDecimal.valueOf(52)))
    /*
   SELECT country.country_id, country.country, country.last_update 
   FROM address JOIN city ON city.city_id = address.city_id JOIN country 
   ON country.country_id = city.country_id WHERE address.address_id = :1 
   */
  private CountryRecord getCountry(Connection conn, BigDecimal addressId) {

    return DSL.using(conn, SQLDialect.ORACLE)
      .select(COUNTRY.COUNTRY_ID, COUNTRY.COUNTRY_, COUNTRY.LAST_UPDATE)
      .from(ADDRESS)
      .join(CITY)
      .on(CITY.CITY_ID.equal(ADDRESS.CITY_ID))
      .join(COUNTRY)
      .on(COUNTRY.COUNTRY_ID.equal(CITY.COUNTRY_ID))
      .where(ADDRESS.ADDRESS_ID.equal(addressId))
      .fetchOneInto(CountryRecord.class);

  }

  /*
   SELECT category.category_id 
   FROM category WHERE category.category_id = :1 
   */
  private BigDecimal getPreferredCategory(Connection conn, CustomerRecord customer) {

    return DSL.using(conn, SQLDialect.ORACLE)
      .select(CATEGORY.CATEGORY_ID)
      .from(CATEGORY)
      .where(CATEGORY.CATEGORY_ID.equal(BigDecimal.valueOf(
            new Random().nextInt(CATEGORY_MAX_ID) + 1)))
      .fetchOneInto(BigDecimal.class);

  }

  //.where(CATEGORY.CATEGORY_ID.equal(BigDecimal.valueOf(8)))
  /*
   SELECT customer.customer_id 
   FROM customer JOIN address ON customer.address_id = address.address_id JOIN city 
   ON city.city_id = address.city_id JOIN country ON country.country_id = city.country_id WHERE country.country_id = :1 
   */
  private List<BigDecimal> getSimilarCustomers(Connection conn, BigDecimal countryId) {

    return DSL.using(conn, SQLDialect.ORACLE)
      .select(CUSTOMER.CUSTOMER_ID)
      .from(CUSTOMER)
      .join(ADDRESS)
      .on(CUSTOMER.ADDRESS_ID.equal(ADDRESS.ADDRESS_ID))
      .join(CITY)
      .on(CITY.CITY_ID.equal(ADDRESS.CITY_ID))
      .join(COUNTRY)
      .on(COUNTRY.COUNTRY_ID.equal(CITY.COUNTRY_ID))
      .where(COUNTRY.COUNTRY_ID.equal(countryId))
      .fetchInto(BigDecimal.class);

  }

  /*
   select c1.customer_id
   from customer c1 
   join address a1 on c1.address_id=a1.address_id
   join city ci1 on ci1.city_id = a1.city_id
   join country co1 on co1.country_id=ci1.country_id
   join country co2 on co1.country_id = co2.country_id
   join city ci2  on co2.country_id=ci2.country_id
   join address a2 on ci2.city_id=a2.city_id
   WHERE a2.address_id = 1
   */
  private List<BigDecimal> getSimilarCustomers1Step(Connection conn, BigDecimal addressId) {

    Customer c1 = CUSTOMER.as("c1");
    Address a1 = ADDRESS.as("a1");
    City ci1 = CITY.as("ci1");
    Country co1 = COUNTRY.as("co1");
    Address a2 = ADDRESS.as("a2");
    City ci2 = CITY.as("ci2");
    Country co2 = COUNTRY.as("co2");
    return DSL.using(conn, SQLDialect.ORACLE)
      .select(c1.CUSTOMER_ID).from(c1)
      .join(a1).on(c1.ADDRESS_ID.equal(a1.ADDRESS_ID))
      .join(ci1).on(ci1.CITY_ID.equal(a1.CITY_ID))
      .join(co1).on(co1.COUNTRY_ID.equal(ci1.COUNTRY_ID))
      .join(co2).on(co1.COUNTRY_ID.equal(co2.COUNTRY_ID))
      .join(ci2).on(co2.COUNTRY_ID.equal(ci2.COUNTRY_ID))
      .join(a2).on(ci2.CITY_ID.equal(a2.CITY_ID))
      .where(a2.ADDRESS_ID.equal(addressId))
      .fetchInto(BigDecimal.class);
  }

  /*
   SELECT DISTINCT film.film_id, film.description, film.language_id, film.last_update, film.length, film.original_language_id, film.rating, film.release_year, film.rental_duration, film.rental_rate, film.replacement_cost, film.special_features, film.title 
   FROM film 
   JOIN film_category ON film_category.film_id = film.film_id 
   JOIN category ON category.category_id = film_category.category_id 
   JOIN inventory ON inventory.film_id = film.film_id 
   JOIN rental ON rental.inventory_id = inventory.inventory_id 
   WHERE (category.category_id = :1
   AND rental.customer_id IN (:2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , :20 , :21 , :22 , :23 , :24 , :25 , :26 , :27 , :28 , :29 , :30 , :31 , :32 , :33 , :34 , :35 , :36 , :37 ))
   */
  private List<FilmRecord> getFilmInfo1Step(Connection conn, List<BigDecimal> similarCustomerIds,
    BigDecimal categoryId) {

    List<FilmRecord> films = DSL.using(conn, SQLDialect.ORACLE)
      .selectDistinct(FILM.FILM_ID, FILM.DESCRIPTION, FILM.LANGUAGE_ID, FILM.LAST_UPDATE, FILM.LENGTH,
        FILM.ORIGINAL_LANGUAGE_ID, FILM.RATING, FILM.RELEASE_YEAR, FILM.RENTAL_DURATION,
        FILM.RENTAL_RATE, FILM.REPLACEMENT_COST, FILM.SPECIAL_FEATURES, FILM.TITLE)
      .from(FILM)
      .join(FILM_CATEGORY).on(FILM_CATEGORY.FILM_ID.equal(FILM.FILM_ID))
      .join(CATEGORY).on(CATEGORY.CATEGORY_ID.equal(FILM_CATEGORY.CATEGORY_ID))
      .join(INVENTORY).on(INVENTORY.FILM_ID.equal(FILM.FILM_ID))
      .join(RENTAL).on(RENTAL.INVENTORY_ID.equal(INVENTORY.INVENTORY_ID))
      .where(CATEGORY.CATEGORY_ID.equal(categoryId))
      .and(RENTAL.CUSTOMER_ID.in(similarCustomerIds))
      .fetchInto(FilmRecord.class);
    return films;

  }

}
