/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila;


import com.trivadis.jooq.generated.sakila.tables.Actor;
import com.trivadis.jooq.generated.sakila.tables.Address;
import com.trivadis.jooq.generated.sakila.tables.Category;
import com.trivadis.jooq.generated.sakila.tables.City;
import com.trivadis.jooq.generated.sakila.tables.Country;
import com.trivadis.jooq.generated.sakila.tables.Customer;
import com.trivadis.jooq.generated.sakila.tables.Film;
import com.trivadis.jooq.generated.sakila.tables.FilmActor;
import com.trivadis.jooq.generated.sakila.tables.FilmCategory;
import com.trivadis.jooq.generated.sakila.tables.FilmText;
import com.trivadis.jooq.generated.sakila.tables.Inventory;
import com.trivadis.jooq.generated.sakila.tables.Language;
import com.trivadis.jooq.generated.sakila.tables.Payment;
import com.trivadis.jooq.generated.sakila.tables.Rental;
import com.trivadis.jooq.generated.sakila.tables.Staff;
import com.trivadis.jooq.generated.sakila.tables.Store;
import com.trivadis.jooq.generated.sakila.tables.records.ActorRecord;
import com.trivadis.jooq.generated.sakila.tables.records.AddressRecord;
import com.trivadis.jooq.generated.sakila.tables.records.CategoryRecord;
import com.trivadis.jooq.generated.sakila.tables.records.CityRecord;
import com.trivadis.jooq.generated.sakila.tables.records.CountryRecord;
import com.trivadis.jooq.generated.sakila.tables.records.CustomerRecord;
import com.trivadis.jooq.generated.sakila.tables.records.FilmActorRecord;
import com.trivadis.jooq.generated.sakila.tables.records.FilmCategoryRecord;
import com.trivadis.jooq.generated.sakila.tables.records.FilmRecord;
import com.trivadis.jooq.generated.sakila.tables.records.FilmTextRecord;
import com.trivadis.jooq.generated.sakila.tables.records.InventoryRecord;
import com.trivadis.jooq.generated.sakila.tables.records.LanguageRecord;
import com.trivadis.jooq.generated.sakila.tables.records.PaymentRecord;
import com.trivadis.jooq.generated.sakila.tables.records.RentalRecord;
import com.trivadis.jooq.generated.sakila.tables.records.StaffRecord;
import com.trivadis.jooq.generated.sakila.tables.records.StoreRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ActorRecord> SYS_C0012526 = UniqueKeys0.SYS_C0012526;
	public static final UniqueKey<AddressRecord> SYS_C0012542 = UniqueKeys0.SYS_C0012542;
	public static final UniqueKey<CategoryRecord> SYS_C0012551 = UniqueKeys0.SYS_C0012551;
	public static final UniqueKey<CityRecord> SYS_C0012534 = UniqueKeys0.SYS_C0012534;
	public static final UniqueKey<CountryRecord> SYS_C0012529 = UniqueKeys0.SYS_C0012529;
	public static final UniqueKey<CustomerRecord> SYS_C0012560 = UniqueKeys0.SYS_C0012560;
	public static final UniqueKey<FilmRecord> SYS_C0012569 = UniqueKeys0.SYS_C0012569;
	public static final UniqueKey<FilmActorRecord> SYS_C0012577 = UniqueKeys0.SYS_C0012577;
	public static final UniqueKey<FilmCategoryRecord> SYS_C0012583 = UniqueKeys0.SYS_C0012583;
	public static final UniqueKey<FilmTextRecord> SYS_C0012588 = UniqueKeys0.SYS_C0012588;
	public static final UniqueKey<InventoryRecord> SYS_C0012593 = UniqueKeys0.SYS_C0012593;
	public static final UniqueKey<LanguageRecord> SYS_C0012547 = UniqueKeys0.SYS_C0012547;
	public static final UniqueKey<PaymentRecord> SYS_C0012618 = UniqueKeys0.SYS_C0012618;
	public static final UniqueKey<RentalRecord> SYS_C0012627 = UniqueKeys0.SYS_C0012627;
	public static final UniqueKey<StaffRecord> SYS_C0012603 = UniqueKeys0.SYS_C0012603;
	public static final UniqueKey<StoreRecord> SYS_C0012609 = UniqueKeys0.SYS_C0012609;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<AddressRecord, CityRecord> FK_ADDRESS_CITY = ForeignKeys0.FK_ADDRESS_CITY;
	public static final ForeignKey<CityRecord, CountryRecord> FK_CITY_COUNTRY = ForeignKeys0.FK_CITY_COUNTRY;
	public static final ForeignKey<CustomerRecord, StoreRecord> FK_CUSTOMER_STORE = ForeignKeys0.FK_CUSTOMER_STORE;
	public static final ForeignKey<CustomerRecord, AddressRecord> FK_CUSTOMER_ADDRESS = ForeignKeys0.FK_CUSTOMER_ADDRESS;
	public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE = ForeignKeys0.FK_FILM_LANGUAGE;
	public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = ForeignKeys0.FK_FILM_LANGUAGE_ORIGINAL;
	public static final ForeignKey<FilmActorRecord, ActorRecord> FK_FILM_ACTOR_ACTOR = ForeignKeys0.FK_FILM_ACTOR_ACTOR;
	public static final ForeignKey<FilmActorRecord, FilmRecord> FK_FILM_ACTOR_FILM = ForeignKeys0.FK_FILM_ACTOR_FILM;
	public static final ForeignKey<FilmCategoryRecord, FilmRecord> FK_FILM_CATEGORY_FILM = ForeignKeys0.FK_FILM_CATEGORY_FILM;
	public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FK_FILM_CATEGORY_CATEGORY = ForeignKeys0.FK_FILM_CATEGORY_CATEGORY;
	public static final ForeignKey<InventoryRecord, FilmRecord> FK_INVENTORY_FILM = ForeignKeys0.FK_INVENTORY_FILM;
	public static final ForeignKey<InventoryRecord, StoreRecord> FK_INVENTORY_STORE = ForeignKeys0.FK_INVENTORY_STORE;
	public static final ForeignKey<PaymentRecord, CustomerRecord> FK_PAYMENT_CUSTOMER = ForeignKeys0.FK_PAYMENT_CUSTOMER;
	public static final ForeignKey<PaymentRecord, StaffRecord> FK_PAYMENT_STAFF = ForeignKeys0.FK_PAYMENT_STAFF;
	public static final ForeignKey<PaymentRecord, RentalRecord> FK_PAYMENT_RENTAL = ForeignKeys0.FK_PAYMENT_RENTAL;
	public static final ForeignKey<RentalRecord, InventoryRecord> FK_RENTAL_INVENTORY = ForeignKeys0.FK_RENTAL_INVENTORY;
	public static final ForeignKey<RentalRecord, CustomerRecord> FK_RENTAL_CUSTOMER = ForeignKeys0.FK_RENTAL_CUSTOMER;
	public static final ForeignKey<RentalRecord, StaffRecord> FK_RENTAL_STAFF = ForeignKeys0.FK_RENTAL_STAFF;
	public static final ForeignKey<StaffRecord, AddressRecord> FK_STAFF_ADDRESS = ForeignKeys0.FK_STAFF_ADDRESS;
	public static final ForeignKey<StaffRecord, StoreRecord> FK_STAFF_STORE = ForeignKeys0.FK_STAFF_STORE;
	public static final ForeignKey<StoreRecord, StaffRecord> FK_STORE_STAFF = ForeignKeys0.FK_STORE_STAFF;
	public static final ForeignKey<StoreRecord, AddressRecord> FK_STORE_ADDRESS = ForeignKeys0.FK_STORE_ADDRESS;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ActorRecord> SYS_C0012526 = createUniqueKey(Actor.ACTOR, Actor.ACTOR.ACTOR_ID);
		public static final UniqueKey<AddressRecord> SYS_C0012542 = createUniqueKey(Address.ADDRESS, Address.ADDRESS.ADDRESS_ID);
		public static final UniqueKey<CategoryRecord> SYS_C0012551 = createUniqueKey(Category.CATEGORY, Category.CATEGORY.CATEGORY_ID);
		public static final UniqueKey<CityRecord> SYS_C0012534 = createUniqueKey(City.CITY, City.CITY.CITY_ID);
		public static final UniqueKey<CountryRecord> SYS_C0012529 = createUniqueKey(Country.COUNTRY, Country.COUNTRY.COUNTRY_ID);
		public static final UniqueKey<CustomerRecord> SYS_C0012560 = createUniqueKey(Customer.CUSTOMER, Customer.CUSTOMER.CUSTOMER_ID);
		public static final UniqueKey<FilmRecord> SYS_C0012569 = createUniqueKey(Film.FILM, Film.FILM.FILM_ID);
		public static final UniqueKey<FilmActorRecord> SYS_C0012577 = createUniqueKey(FilmActor.FILM_ACTOR, FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID);
		public static final UniqueKey<FilmCategoryRecord> SYS_C0012583 = createUniqueKey(FilmCategory.FILM_CATEGORY, FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID);
		public static final UniqueKey<FilmTextRecord> SYS_C0012588 = createUniqueKey(FilmText.FILM_TEXT, FilmText.FILM_TEXT.FILM_ID);
		public static final UniqueKey<InventoryRecord> SYS_C0012593 = createUniqueKey(Inventory.INVENTORY, Inventory.INVENTORY.INVENTORY_ID);
		public static final UniqueKey<LanguageRecord> SYS_C0012547 = createUniqueKey(Language.LANGUAGE, Language.LANGUAGE.LANGUAGE_ID);
		public static final UniqueKey<PaymentRecord> SYS_C0012618 = createUniqueKey(Payment.PAYMENT, Payment.PAYMENT.PAYMENT_ID);
		public static final UniqueKey<RentalRecord> SYS_C0012627 = createUniqueKey(Rental.RENTAL, Rental.RENTAL.RENTAL_ID);
		public static final UniqueKey<StaffRecord> SYS_C0012603 = createUniqueKey(Staff.STAFF, Staff.STAFF.STAFF_ID);
		public static final UniqueKey<StoreRecord> SYS_C0012609 = createUniqueKey(Store.STORE, Store.STORE.STORE_ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<AddressRecord, CityRecord> FK_ADDRESS_CITY = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012534, Address.ADDRESS, Address.ADDRESS.CITY_ID);
		public static final ForeignKey<CityRecord, CountryRecord> FK_CITY_COUNTRY = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012529, City.CITY, City.CITY.COUNTRY_ID);
		public static final ForeignKey<CustomerRecord, StoreRecord> FK_CUSTOMER_STORE = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012609, Customer.CUSTOMER, Customer.CUSTOMER.STORE_ID);
		public static final ForeignKey<CustomerRecord, AddressRecord> FK_CUSTOMER_ADDRESS = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012542, Customer.CUSTOMER, Customer.CUSTOMER.ADDRESS_ID);
		public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012547, Film.FILM, Film.FILM.LANGUAGE_ID);
		public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012547, Film.FILM, Film.FILM.ORIGINAL_LANGUAGE_ID);
		public static final ForeignKey<FilmActorRecord, ActorRecord> FK_FILM_ACTOR_ACTOR = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012526, FilmActor.FILM_ACTOR, FilmActor.FILM_ACTOR.ACTOR_ID);
		public static final ForeignKey<FilmActorRecord, FilmRecord> FK_FILM_ACTOR_FILM = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012569, FilmActor.FILM_ACTOR, FilmActor.FILM_ACTOR.FILM_ID);
		public static final ForeignKey<FilmCategoryRecord, FilmRecord> FK_FILM_CATEGORY_FILM = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012569, FilmCategory.FILM_CATEGORY, FilmCategory.FILM_CATEGORY.FILM_ID);
		public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FK_FILM_CATEGORY_CATEGORY = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012551, FilmCategory.FILM_CATEGORY, FilmCategory.FILM_CATEGORY.CATEGORY_ID);
		public static final ForeignKey<InventoryRecord, FilmRecord> FK_INVENTORY_FILM = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012569, Inventory.INVENTORY, Inventory.INVENTORY.FILM_ID);
		public static final ForeignKey<InventoryRecord, StoreRecord> FK_INVENTORY_STORE = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012609, Inventory.INVENTORY, Inventory.INVENTORY.STORE_ID);
		public static final ForeignKey<PaymentRecord, CustomerRecord> FK_PAYMENT_CUSTOMER = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012560, Payment.PAYMENT, Payment.PAYMENT.CUSTOMER_ID);
		public static final ForeignKey<PaymentRecord, StaffRecord> FK_PAYMENT_STAFF = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012603, Payment.PAYMENT, Payment.PAYMENT.STAFF_ID);
		public static final ForeignKey<PaymentRecord, RentalRecord> FK_PAYMENT_RENTAL = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012627, Payment.PAYMENT, Payment.PAYMENT.RENTAL_ID);
		public static final ForeignKey<RentalRecord, InventoryRecord> FK_RENTAL_INVENTORY = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012593, Rental.RENTAL, Rental.RENTAL.INVENTORY_ID);
		public static final ForeignKey<RentalRecord, CustomerRecord> FK_RENTAL_CUSTOMER = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012560, Rental.RENTAL, Rental.RENTAL.CUSTOMER_ID);
		public static final ForeignKey<RentalRecord, StaffRecord> FK_RENTAL_STAFF = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012603, Rental.RENTAL, Rental.RENTAL.STAFF_ID);
		public static final ForeignKey<StaffRecord, AddressRecord> FK_STAFF_ADDRESS = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012542, Staff.STAFF, Staff.STAFF.ADDRESS_ID);
		public static final ForeignKey<StaffRecord, StoreRecord> FK_STAFF_STORE = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012609, Staff.STAFF, Staff.STAFF.STORE_ID);
		public static final ForeignKey<StoreRecord, StaffRecord> FK_STORE_STAFF = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012603, Store.STORE, Store.STORE.MANAGER_STAFF_ID);
		public static final ForeignKey<StoreRecord, AddressRecord> FK_STORE_ADDRESS = createForeignKey(com.trivadis.jooq.generated.sakila.Keys.SYS_C0012542, Store.STORE, Store.STORE.ADDRESS_ID);
	}
}
