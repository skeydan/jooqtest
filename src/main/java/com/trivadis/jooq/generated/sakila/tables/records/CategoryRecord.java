/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables.records;


import com.trivadis.jooq.generated.sakila.tables.Category;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record3<BigDecimal, String, Date> {

	private static final long serialVersionUID = -986829956;

	/**
	 * Setter for <code>CATEGORY.CATEGORY_ID</code>.
	 */
	public void setCategoryId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>CATEGORY.CATEGORY_ID</code>.
	 */
	public BigDecimal getCategoryId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>CATEGORY.NAME</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>CATEGORY.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>CATEGORY.LAST_UPDATE</code>.
	 */
	public void setLastUpdate(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>CATEGORY.LAST_UPDATE</code>.
	 */
	public Date getLastUpdate() {
		return (Date) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, String, Date> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, String, Date> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Category.CATEGORY.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Category.CATEGORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return Category.CATEGORY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value1(BigDecimal value) {
		setCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value3(Date value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord values(BigDecimal value1, String value2, Date value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CategoryRecord
	 */
	public CategoryRecord() {
		super(Category.CATEGORY);
	}

	/**
	 * Create a detached, initialised CategoryRecord
	 */
	public CategoryRecord(BigDecimal categoryId, String name, Date lastUpdate) {
		super(Category.CATEGORY);

		setValue(0, categoryId);
		setValue(1, name);
		setValue(2, lastUpdate);
	}
}
