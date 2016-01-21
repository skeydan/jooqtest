/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.Keys;
import com.trivadis.jooq.generated.sakila.tables.records.LanguageRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Language extends TableImpl<LanguageRecord> {

	private static final long serialVersionUID = 1346366242;

	/**
	 * The reference instance of <code>LANGUAGE</code>
	 */
	public static final Language LANGUAGE = new Language();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LanguageRecord> getRecordType() {
		return LanguageRecord.class;
	}

	/**
	 * The column <code>LANGUAGE.LANGUAGE_ID</code>.
	 */
	public final TableField<LanguageRecord, BigDecimal> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>LANGUAGE.NAME</code>.
	 */
	public final TableField<LanguageRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.CHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>LANGUAGE.LAST_UPDATE</code>.
	 */
	public final TableField<LanguageRecord, Date> LAST_UPDATE = createField("LAST_UPDATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>LANGUAGE</code> table reference
	 */
	public Language() {
		this("LANGUAGE", null);
	}

	/**
	 * Create an aliased <code>LANGUAGE</code> table reference
	 */
	public Language(String alias) {
		this(alias, LANGUAGE);
	}

	private Language(String alias, Table<LanguageRecord> aliased) {
		this(alias, aliased, null);
	}

	private Language(String alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LanguageRecord> getPrimaryKey() {
		return Keys.SYS_C0012547;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LanguageRecord>> getKeys() {
		return Arrays.<UniqueKey<LanguageRecord>>asList(Keys.SYS_C0012547);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Language as(String alias) {
		return new Language(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Language rename(String name) {
		return new Language(name, null);
	}
}