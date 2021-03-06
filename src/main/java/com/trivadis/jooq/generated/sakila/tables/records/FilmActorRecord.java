/**
 * This class is generated by jOOQ
 */
package com.trivadis.jooq.generated.sakila.tables.records;


import com.trivadis.jooq.generated.sakila.tables.FilmActor;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
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
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> implements Record3<BigDecimal, BigDecimal, Date> {

	private static final long serialVersionUID = 2015365516;

	/**
	 * Setter for <code>FILM_ACTOR.ACTOR_ID</code>.
	 */
	public void setActorId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>FILM_ACTOR.ACTOR_ID</code>.
	 */
	public BigDecimal getActorId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>FILM_ACTOR.FILM_ID</code>.
	 */
	public void setFilmId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>FILM_ACTOR.FILM_ID</code>.
	 */
	public BigDecimal getFilmId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>FILM_ACTOR.LAST_UPDATE</code>.
	 */
	public void setLastUpdate(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>FILM_ACTOR.LAST_UPDATE</code>.
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
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, BigDecimal, Date> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, BigDecimal, Date> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return FilmActor.FILM_ACTOR.ACTOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return FilmActor.FILM_ACTOR.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return FilmActor.FILM_ACTOR.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getActorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getFilmId();
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
	public FilmActorRecord value1(BigDecimal value) {
		setActorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmActorRecord value2(BigDecimal value) {
		setFilmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmActorRecord value3(Date value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmActorRecord values(BigDecimal value1, BigDecimal value2, Date value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmActorRecord
	 */
	public FilmActorRecord() {
		super(FilmActor.FILM_ACTOR);
	}

	/**
	 * Create a detached, initialised FilmActorRecord
	 */
	public FilmActorRecord(BigDecimal actorId, BigDecimal filmId, Date lastUpdate) {
		super(FilmActor.FILM_ACTOR);

		setValue(0, actorId);
		setValue(1, filmId);
		setValue(2, lastUpdate);
	}
}
