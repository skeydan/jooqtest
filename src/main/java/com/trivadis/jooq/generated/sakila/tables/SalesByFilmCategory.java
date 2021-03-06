/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables;


import com.trivadis.jooq.generated.sakila.DefaultSchema;
import com.trivadis.jooq.generated.sakila.tables.records.SalesByFilmCategoryRecord;

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
public class SalesByFilmCategory extends TableImpl<SalesByFilmCategoryRecord> {

	private static final long serialVersionUID = -1138793153;

	/**
	 * The reference instance of <code>SALES_BY_FILM_CATEGORY</code>
	 */
	public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = new SalesByFilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SalesByFilmCategoryRecord> getRecordType() {
		return SalesByFilmCategoryRecord.class;
	}

	/**
	 * The column <code>SALES_BY_FILM_CATEGORY.CATEGORY</code>.
	 */
	public final TableField<SalesByFilmCategoryRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

	/**
	 * The column <code>SALES_BY_FILM_CATEGORY.TOTAL_SALES</code>.
	 */
	public final TableField<SalesByFilmCategoryRecord, BigDecimal> TOTAL_SALES = createField("TOTAL_SALES", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>SALES_BY_FILM_CATEGORY</code> table reference
	 */
	public SalesByFilmCategory() {
		this("SALES_BY_FILM_CATEGORY", null);
	}

	/**
	 * Create an aliased <code>SALES_BY_FILM_CATEGORY</code> table reference
	 */
	public SalesByFilmCategory(String alias) {
		this(alias, SALES_BY_FILM_CATEGORY);
	}

	private SalesByFilmCategory(String alias, Table<SalesByFilmCategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private SalesByFilmCategory(String alias, Table<SalesByFilmCategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByFilmCategory as(String alias) {
		return new SalesByFilmCategory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SalesByFilmCategory rename(String name) {
		return new SalesByFilmCategory(name, null);
	}
}
