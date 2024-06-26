/*
 * This file is generated by jOOQ.
 */
package ru.panic.generatedClasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
import ru.panic.generatedClasses.tables.records.UsersRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>public.users.id</code>.
     */
    public final TableField<UsersRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.users.btc_balance</code>.
     */
    public final TableField<UsersRecord, Double> BTC_BALANCE = createField(DSL.name("btc_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.eth_balance</code>.
     */
    public final TableField<UsersRecord, Double> ETH_BALANCE = createField(DSL.name("eth_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.ip_address</code>.
     */
    public final TableField<UsersRecord, String> IP_ADDRESS = createField(DSL.name("ip_address"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.is_account_non_locked</code>.
     */
    public final TableField<UsersRecord, Boolean> IS_ACCOUNT_NON_LOCKED = createField(DSL.name("is_account_non_locked"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.users.is_multi_account</code>.
     */
    public final TableField<UsersRecord, Boolean> IS_MULTI_ACCOUNT = createField(DSL.name("is_multi_account"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.users.progress</code>.
     */
    public final TableField<UsersRecord, Double> PROGRESS = createField(DSL.name("progress"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.rank</code>.
     */
    public final TableField<UsersRecord, String> RANK = createField(DSL.name("rank"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.ltc_balance</code>.
     */
    public final TableField<UsersRecord, Double> LTC_BALANCE = createField(DSL.name("ltc_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.matic_balance</code>.
     */
    public final TableField<UsersRecord, Double> MATIC_BALANCE = createField(DSL.name("matic_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.tethererc20balance</code>.
     */
    public final TableField<UsersRecord, Double> TETHERERC20BALANCE = createField(DSL.name("tethererc20balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.ton_balance</code>.
     */
    public final TableField<UsersRecord, Double> TON_BALANCE = createField(DSL.name("ton_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.trx_balance</code>.
     */
    public final TableField<UsersRecord, Double> TRX_BALANCE = createField(DSL.name("trx_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.xrp_balance</code>.
     */
    public final TableField<UsersRecord, Double> XRP_BALANCE = createField(DSL.name("xrp_balance"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.timestamp</code>.
     */
    public final TableField<UsersRecord, Long> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.users.city</code>.
     */
    public final TableField<UsersRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.country</code>.
     */
    public final TableField<UsersRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.postcode</code>.
     */
    public final TableField<UsersRecord, Integer> POSTCODE = createField(DSL.name("postcode"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.users.street</code>.
     */
    public final TableField<UsersRecord, String> STREET = createField(DSL.name("street"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.birthday</code>.
     */
    public final TableField<UsersRecord, String> BIRTHDAY = createField(DSL.name("birthday"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.firstname</code>.
     */
    public final TableField<UsersRecord, String> FIRSTNAME = createField(DSL.name("firstname"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.gender</code>.
     */
    public final TableField<UsersRecord, String> GENDER = createField(DSL.name("gender"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.lastname</code>.
     */
    public final TableField<UsersRecord, String> LASTNAME = createField(DSL.name("lastname"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(255), this, "");

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>public.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<UsersRecord, Long> getIdentity() {
        return (Identity<UsersRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    @Override
    public List<Check<UsersRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("users_gender_check"), "(((gender)::text = ANY ((ARRAY['MALE'::character varying, 'FEMALE'::character varying, 'OTHER'::character varying])::text[])))", true),
            Internal.createCheck(this, DSL.name("users_rank_check"), "(((rank)::text = ANY ((ARRAY['BRONZE'::character varying, 'SILVER'::character varying, 'GOLD'::character varying, 'PLATINUM'::character varying, 'DIAMOND'::character varying, 'ELITE'::character varying])::text[])))", true)
        );
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    @Override
    public Users as(Table<?> alias) {
        return new Users(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Table<?> name) {
        return new Users(name.getQualifiedName(), null);
    }
}
