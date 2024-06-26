/*
 * This file is generated by jOOQ.
 */
package ru.panic.generatedClasses;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.panic.generatedClasses.tables.FlywaySchemaHistory;
import ru.panic.generatedClasses.tables.Games;
import ru.panic.generatedClasses.tables.Replenishments;
import ru.panic.generatedClasses.tables.Users;
import ru.panic.generatedClasses.tables.UsersActivity;
import ru.panic.generatedClasses.tables.Withdrawals;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.games</code>.
     */
    public final Games GAMES = Games.GAMES;

    /**
     * The table <code>public.replenishments</code>.
     */
    public final Replenishments REPLENISHMENTS = Replenishments.REPLENISHMENTS;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * The table <code>public.users_activity</code>.
     */
    public final UsersActivity USERS_ACTIVITY = UsersActivity.USERS_ACTIVITY;

    /**
     * The table <code>public.withdrawals</code>.
     */
    public final Withdrawals WITHDRAWALS = Withdrawals.WITHDRAWALS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Games.GAMES,
            Replenishments.REPLENISHMENTS,
            Users.USERS,
            UsersActivity.USERS_ACTIVITY,
            Withdrawals.WITHDRAWALS
        );
    }
}
