/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables.records;


import com.trivadis.jooq.generated.sakila.tables.FilmList;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class FilmListRecord extends TableRecordImpl<FilmListRecord> implements Record8<BigDecimal, String, String, String, BigDecimal, BigDecimal, String, String> {

	private static final long serialVersionUID = -25883569;

	/**
	 * Setter for <code>FILM_LIST.FID</code>.
	 */
	public void setFid(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>FILM_LIST.FID</code>.
	 */
	public BigDecimal getFid() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>FILM_LIST.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>FILM_LIST.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>FILM_LIST.DESCRIPTION</code>.
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>FILM_LIST.DESCRIPTION</code>.
	 */
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>FILM_LIST.CATEGORY</code>.
	 */
	public void setCategory(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>FILM_LIST.CATEGORY</code>.
	 */
	public String getCategory() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>FILM_LIST.PRICE</code>.
	 */
	public void setPrice(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>FILM_LIST.PRICE</code>.
	 */
	public BigDecimal getPrice() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>FILM_LIST.LENGTH</code>.
	 */
	public void setLength(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>FILM_LIST.LENGTH</code>.
	 */
	public BigDecimal getLength() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>FILM_LIST.RATING</code>.
	 */
	public void setRating(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>FILM_LIST.RATING</code>.
	 */
	public String getRating() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>FILM_LIST.ACTORS</code>.
	 */
	public void setActors(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>FILM_LIST.ACTORS</code>.
	 */
	public String getActors() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, BigDecimal, BigDecimal, String, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, BigDecimal, BigDecimal, String, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return FilmList.FILM_LIST.FID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return FilmList.FILM_LIST.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return FilmList.FILM_LIST.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return FilmList.FILM_LIST.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return FilmList.FILM_LIST.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return FilmList.FILM_LIST.LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return FilmList.FILM_LIST.RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return FilmList.FILM_LIST.ACTORS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getFid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getActors();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value1(BigDecimal value) {
		setFid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value4(String value) {
		setCategory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value5(BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value6(BigDecimal value) {
		setLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value7(String value) {
		setRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord value8(String value) {
		setActors(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmListRecord values(BigDecimal value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, String value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmListRecord
	 */
	public FilmListRecord() {
		super(FilmList.FILM_LIST);
	}

	/**
	 * Create a detached, initialised FilmListRecord
	 */
	public FilmListRecord(BigDecimal fid, String title, String description, String category, BigDecimal price, BigDecimal length, String rating, String actors) {
		super(FilmList.FILM_LIST);

		setValue(0, fid);
		setValue(1, title);
		setValue(2, description);
		setValue(3, category);
		setValue(4, price);
		setValue(5, length);
		setValue(6, rating);
		setValue(7, actors);
	}
}
