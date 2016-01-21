/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.Keys;
import com.trivadis.jooq.generated.sakila.tables.records.AddressRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<AddressRecord> {

	private static final long serialVersionUID = -5546372;

	/**
	 * The reference instance of <code>ADDRESS</code>
	 */
	public static final Address ADDRESS = new Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AddressRecord> getRecordType() {
		return AddressRecord.class;
	}

	/**
	 * The column <code>ADDRESS.ADDRESS_ID</code>.
	 */
	public final TableField<AddressRecord, BigDecimal> ADDRESS_ID = createField("ADDRESS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>ADDRESS.ADDRESS</code>.
	 */
	public final TableField<AddressRecord, String> ADDRESS_ = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>ADDRESS.ADDRESS2</code>.
	 */
	public final TableField<AddressRecord, String> ADDRESS2 = createField("ADDRESS2", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaulted(true), this, "");

	/**
	 * The column <code>ADDRESS.DISTRICT</code>.
	 */
	public final TableField<AddressRecord, String> DISTRICT = createField("DISTRICT", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>ADDRESS.CITY_ID</code>.
	 */
	public final TableField<AddressRecord, BigDecimal> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>ADDRESS.POSTAL_CODE</code>.
	 */
	public final TableField<AddressRecord, String> POSTAL_CODE = createField("POSTAL_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(10).defaulted(true), this, "");

	/**
	 * The column <code>ADDRESS.PHONE</code>.
	 */
	public final TableField<AddressRecord, String> PHONE = createField("PHONE", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>ADDRESS.LAST_UPDATE</code>.
	 */
	public final TableField<AddressRecord, Date> LAST_UPDATE = createField("LAST_UPDATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>ADDRESS</code> table reference
	 */
	public Address() {
		this("ADDRESS", null);
	}

	/**
	 * Create an aliased <code>ADDRESS</code> table reference
	 */
	public Address(String alias) {
		this(alias, ADDRESS);
	}

	private Address(String alias, Table<AddressRecord> aliased) {
		this(alias, aliased, null);
	}

	private Address(String alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AddressRecord> getPrimaryKey() {
		return Keys.SYS_C0012542;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AddressRecord>> getKeys() {
		return Arrays.<UniqueKey<AddressRecord>>asList(Keys.SYS_C0012542);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AddressRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AddressRecord, ?>>asList(Keys.FK_ADDRESS_CITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Address as(String alias) {
		return new Address(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Address rename(String name) {
		return new Address(name, null);
	}
}