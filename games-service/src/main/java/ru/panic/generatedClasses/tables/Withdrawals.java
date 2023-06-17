/*
 * This file is generated by jOOQ.
 */
package ru.panic.generatedClasses.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.panic.generatedClasses.Keys;
import ru.panic.generatedClasses.Public;
import ru.panic.generatedClasses.tables.records.WithdrawalsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Withdrawals extends TableImpl<WithdrawalsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.withdrawals</code>
     */
    public static final Withdrawals WITHDRAWALS = new Withdrawals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WithdrawalsRecord> getRecordType() {
        return WithdrawalsRecord.class;
    }

    /**
     * The column <code>public.withdrawals.id</code>.
     */
    public final TableField<WithdrawalsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.withdrawals.amount</code>.
     */
    public final TableField<WithdrawalsRecord, Double> AMOUNT = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.currency</code>.
     */
    public final TableField<WithdrawalsRecord, String> CURRENCY = createField(DSL.name("currency"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.gas</code>.
     */
    public final TableField<WithdrawalsRecord, Double> GAS = createField(DSL.name("gas"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.status</code>.
     */
    public final TableField<WithdrawalsRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.timestamp</code>.
     */
    public final TableField<WithdrawalsRecord, Long> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.user_id</code>.
     */
    public final TableField<WithdrawalsRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.username</code>.
     */
    public final TableField<WithdrawalsRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.withdrawals.wallet_id</code>.
     */
    public final TableField<WithdrawalsRecord, String> WALLET_ID = createField(DSL.name("wallet_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Withdrawals(Name alias, Table<WithdrawalsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Withdrawals(Name alias, Table<WithdrawalsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.withdrawals</code> table reference
     */
    public Withdrawals(String alias) {
        this(DSL.name(alias), WITHDRAWALS);
    }

    /**
     * Create an aliased <code>public.withdrawals</code> table reference
     */
    public Withdrawals(Name alias) {
        this(alias, WITHDRAWALS);
    }

    /**
     * Create a <code>public.withdrawals</code> table reference
     */
    public Withdrawals() {
        this(DSL.name("withdrawals"), null);
    }

    public <O extends Record> Withdrawals(Table<O> child, ForeignKey<O, WithdrawalsRecord> key) {
        super(child, key, WITHDRAWALS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<WithdrawalsRecord, Long> getIdentity() {
        return (Identity<WithdrawalsRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<WithdrawalsRecord> getPrimaryKey() {
        return Keys.WITHDRAWALS_PKEY;
    }

    @Override
    public List<Check<WithdrawalsRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("withdrawals_currency_check"), "(((currency)::text = ANY ((ARRAY['BTC'::character varying, 'ETH'::character varying, 'LTC'::character varying, 'TETHER_ERC20'::character varying, 'TRX'::character varying, 'MATIC'::character varying, 'XRP'::character varying, 'TON'::character varying])::text[])))", true),
            Internal.createCheck(this, DSL.name("withdrawals_status_check"), "(((status)::text = ANY ((ARRAY['UNSUCCESSFULLY'::character varying, 'PENDING'::character varying, 'SUCCESSFULLY'::character varying])::text[])))", true)
        );
    }

    @Override
    public Withdrawals as(String alias) {
        return new Withdrawals(DSL.name(alias), this);
    }

    @Override
    public Withdrawals as(Name alias) {
        return new Withdrawals(alias, this);
    }

    @Override
    public Withdrawals as(Table<?> alias) {
        return new Withdrawals(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Withdrawals rename(String name) {
        return new Withdrawals(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Withdrawals rename(Name name) {
        return new Withdrawals(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Withdrawals rename(Table<?> name) {
        return new Withdrawals(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Double, String, Double, String, Long, Long, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Double, ? super String, ? super Double, ? super String, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Double, ? super String, ? super Double, ? super String, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}