/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.Keys;
import com.trivadis.jooq.generated.sakila.tables.records.FilmRecord;

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
public class Film extends TableImpl<FilmRecord> {

	private static final long serialVersionUID = -1989920614;

	/**
	 * The reference instance of <code>FILM</code>
	 */
	public static final Film FILM = new Film();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FilmRecord> getRecordType() {
		return FilmRecord.class;
	}

	/**
	 * The column <code>FILM.FILM_ID</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> FILM_ID = createField("FILM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>FILM.TITLE</code>.
	 */
	public final TableField<FilmRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>FILM.DESCRIPTION</code>.
	 */
	public final TableField<FilmRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB.defaulted(true), this, "");

	/**
	 * The column <code>FILM.RELEASE_YEAR</code>.
	 */
	public final TableField<FilmRecord, String> RELEASE_YEAR = createField("RELEASE_YEAR", org.jooq.impl.SQLDataType.VARCHAR.length(4).defaulted(true), this, "");

	/**
	 * The column <code>FILM.LANGUAGE_ID</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>FILM.ORIGINAL_LANGUAGE_ID</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> ORIGINAL_LANGUAGE_ID = createField("ORIGINAL_LANGUAGE_ID", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), this, "");

	/**
	 * The column <code>FILM.RENTAL_DURATION</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> RENTAL_DURATION = createField("RENTAL_DURATION", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>FILM.RENTAL_RATE</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> RENTAL_RATE = createField("RENTAL_RATE", org.jooq.impl.SQLDataType.NUMERIC.precision(4, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>FILM.LENGTH</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), this, "");

	/**
	 * The column <code>FILM.REPLACEMENT_COST</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> REPLACEMENT_COST = createField("REPLACEMENT_COST", org.jooq.impl.SQLDataType.NUMERIC.precision(5, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>FILM.RATING</code>.
	 */
	public final TableField<FilmRecord, String> RATING = createField("RATING", org.jooq.impl.SQLDataType.VARCHAR.length(10).defaulted(true), this, "");

	/**
	 * The column <code>FILM.SPECIAL_FEATURES</code>.
	 */
	public final TableField<FilmRecord, String> SPECIAL_FEATURES = createField("SPECIAL_FEATURES", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaulted(true), this, "");

	/**
	 * The column <code>FILM.LAST_UPDATE</code>.
	 */
	public final TableField<FilmRecord, Date> LAST_UPDATE = createField("LAST_UPDATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>FILM</code> table reference
	 */
	public Film() {
		this("FILM", null);
	}

	/**
	 * Create an aliased <code>FILM</code> table reference
	 */
	public Film(String alias) {
		this(alias, FILM);
	}

	private Film(String alias, Table<FilmRecord> aliased) {
		this(alias, aliased, null);
	}

	private Film(String alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FilmRecord> getPrimaryKey() {
		return Keys.SYS_C0012569;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FilmRecord>> getKeys() {
		return Arrays.<UniqueKey<FilmRecord>>asList(Keys.SYS_C0012569);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FilmRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FilmRecord, ?>>asList(Keys.FK_FILM_LANGUAGE, Keys.FK_FILM_LANGUAGE_ORIGINAL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Film as(String alias) {
		return new Film(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Film rename(String name) {
		return new Film(name, null);
	}
}
