package com.trivadis.jooq.jooqtest;

import java.sql.*;
import java.util.logging.Logger;
import org.jooq.*;
import org.jooq.impl.*;
import org.jooq.conf.*;
import static com.trivadis.jooq.generated.sakila.Tables.*;
import java.math.BigDecimal;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class.getName());
    private final static String userName = "sakila";
    private final static String password = "sakila";
    private final static String url = "jdbc:oracle:thin:@(DESCRIPTION=(TRANSPORT_CONNECT_TIMEOUT=5)(RETRY_COUNT=6)"
            + "(ADDRESS_LIST=(LOAD_BALANCE=ON)(FAILOVER=ON)"
            + "(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.100.25)(PORT = 1521))"
            + "(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.100.26)(PORT = 1521)))"
            + "(CONNECT_DATA=(SERVER= DEDICATED)(SERVICE_NAME = pdb1)))";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {

            Settings settings = new Settings();
            logger.info("Optimistic logging: " + settings.isExecuteWithOptimisticLocking());
            DSLContext create = DSL.using(conn, SQLDialect.ORACLE, settings);

            fetchFilmsByCategory(conn);
            fetchFilmsByCategoryIfAvailable(conn);
            fetchFilmsByCategoryIfAvailableInStore(conn);
            fetchFilmsByCategoryIfAvailableInStoreLocatedIn(conn);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void fetchFilmsByCategory(Connection conn) {
        
        Result<Record> result = DSL.using(conn, SQLDialect.ORACLE)
                .select()
                .hint("/* JOOQ fetchFilmsByCategory */") 
                .from(FILM)
                .join(FILM_CATEGORY)
                .on(FILM.FILM_ID.equal(FILM_CATEGORY.FILM_ID))
                .join(CATEGORY)
                .on(CATEGORY.CATEGORY_ID.equal(FILM_CATEGORY.CATEGORY_ID))
                .where(CATEGORY.NAME.equal("Sports"))
                .fetch();
     
        for (Record r : result) {
            BigDecimal id = r.getValue(FILM.FILM_ID);
            String title = r.getValue(FILM.TITLE);
            String category = r.getValue(CATEGORY.NAME);
            logger.info("ID: " + id + " title: " + title + " category: " + category);
        }
    }

    private static void fetchFilmsByCategoryIfAvailable(Connection conn) {
        Result<Record> result = DSL.using(conn, SQLDialect.ORACLE)
                .select()
                .hint("/* JOOQ fetchFilmsByCategoryAndLanguage */") 
                .from(FILM)
                .join(FILM_CATEGORY)
                .on(FILM.FILM_ID.equal(FILM_CATEGORY.FILM_ID))
                .join(CATEGORY)
                .on(CATEGORY.CATEGORY_ID.equal(FILM_CATEGORY.CATEGORY_ID))
                .leftSemiJoin(INVENTORY)
                .on(INVENTORY.FILM_ID.equal(FILM.FILM_ID))
                .where(CATEGORY.NAME.equal("Sports"))
                .fetch();
     
        for (Record r : result) {
            BigDecimal id = r.getValue(FILM.FILM_ID);
            String title = r.getValue(FILM.TITLE);
            String category = r.getValue(CATEGORY.NAME);
            String language = r.getValue(LANGUAGE.NAME);
            logger.info("ID: " + id + " title: " + title + " category: " + category + " language: " + language);
        }
    }

    private static void fetchFilmsByCategoryIfAvailableInStoreLocatedIn(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void fetchFilmsByCategoryIfAvailableInStore(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
