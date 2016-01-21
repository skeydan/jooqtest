/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.Keys;
import com.trivadis.jooq.generated.sakila.tables.records.FilmCategoryRecord;

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
public class FilmCategory extends TableImpl<FilmCategoryRecord> {

	private static final long serialVersionUID = 1959327673;

	/**
	 * The reference instance of <code>FILM_CATEGORY</code>
	 */
	public static final FilmCategory FILM_CATEGORY = new FilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FilmCategoryRecord> getRecordType() {
		return FilmCategoryRecord.class;
	}

	/**
	 * The column <code>FILM_CATEGORY.FILM_ID</code>.
	 */
	public final TableField<FilmCategoryRecord, BigDecimal> FILM_ID = createField("FILM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>FILM_CATEGORY.CATEGORY_ID</code>.
	 */
	public final TableField<FilmCategoryRecord, BigDecimal> CATEGORY_ID = createField("CATEGORY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>FILM_CATEGORY.LAST_UPDATE</code>.
	 */
	public final TableField<FilmCategoryRecord, Date> LAST_UPDATE = createField("LAST_UPDATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>FILM_CATEGORY</code> table reference
	 */
	public FilmCategory() {
		this("FILM_CATEGORY", null);
	}

	/**
	 * Create an aliased <code>FILM_CATEGORY</code> table reference
	 */
	public FilmCategory(String alias) {
		this(alias, FILM_CATEGORY);
	}

	private FilmCategory(String alias, Table<FilmCategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private FilmCategory(String alias, Table<FilmCategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FilmCategoryRecord> getPrimaryKey() {
		return Keys.SYS_C0012583;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FilmCategoryRecord>> getKeys() {
		return Arrays.<UniqueKey<FilmCategoryRecord>>asList(Keys.SYS_C0012583);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FilmCategoryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FilmCategoryRecord, ?>>asList(Keys.FK_FILM_CATEGORY_FILM, Keys.FK_FILM_CATEGORY_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategory as(String alias) {
		return new FilmCategory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FilmCategory rename(String name) {
		return new FilmCategory(name, null);
	}
}