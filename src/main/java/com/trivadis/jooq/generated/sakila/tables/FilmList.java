/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.tables.records.FilmListRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class FilmList extends TableImpl<FilmListRecord> {

	private static final long serialVersionUID = -420254644;

	/**
	 * The reference instance of <code>FILM_LIST</code>
	 */
	public static final FilmList FILM_LIST = new FilmList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FilmListRecord> getRecordType() {
		return FilmListRecord.class;
	}

	/**
	 * The column <code>FILM_LIST.FID</code>.
	 */
	public final TableField<FilmListRecord, BigDecimal> FID = createField("FID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>FILM_LIST.TITLE</code>.
	 */
	public final TableField<FilmListRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>FILM_LIST.DESCRIPTION</code>.
	 */
	public final TableField<FilmListRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>FILM_LIST.CATEGORY</code>.
	 */
	public final TableField<FilmListRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

	/**
	 * The column <code>FILM_LIST.PRICE</code>.
	 */
	public final TableField<FilmListRecord, BigDecimal> PRICE = createField("PRICE", org.jooq.impl.SQLDataType.NUMERIC.precision(4, 2), this, "");

	/**
	 * The column <code>FILM_LIST.LENGTH</code>.
	 */
	public final TableField<FilmListRecord, BigDecimal> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>FILM_LIST.RATING</code>.
	 */
	public final TableField<FilmListRecord, String> RATING = createField("RATING", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>FILM_LIST.ACTORS</code>.
	 */
	public final TableField<FilmListRecord, String> ACTORS = createField("ACTORS", org.jooq.impl.SQLDataType.VARCHAR.length(91), this, "");

	/**
	 * Create a <code>FILM_LIST</code> table reference
	 */
	public FilmList() {
		this("FILM_LIST", null);
	}

	/**
	 * Create an aliased <code>FILM_LIST</code> table reference
	 */
	public FilmList(String alias) {
		this(alias, FILM_LIST);
	}

	private FilmList(String alias, Table<FilmListRecord> aliased) {
		this(alias, aliased, null);
	}

	private FilmList(String alias, Table<FilmListRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmList as(String alias) {
		return new FilmList(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FilmList rename(String name) {
		return new FilmList(name, null);
	}
}
