package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** - MYSQL: MySQL - PG: PostgreSQL - REDIS: Redis. */
public final class AppDatabaseSpecEngine extends ExpandableStringEnum<AppDatabaseSpecEngine> {
    /** Static value UNSET for AppDatabaseSpecEngine. */
    public static final AppDatabaseSpecEngine UNSET = fromString("UNSET");

    /** Static value MYSQL for AppDatabaseSpecEngine. */
    public static final AppDatabaseSpecEngine MYSQL = fromString("MYSQL");

    /** Static value PG for AppDatabaseSpecEngine. */
    public static final AppDatabaseSpecEngine PG = fromString("PG");

    /** Static value REDIS for AppDatabaseSpecEngine. */
    public static final AppDatabaseSpecEngine REDIS = fromString("REDIS");

    /**
     * Creates or finds a AppDatabaseSpecEngine from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppDatabaseSpecEngine.
     */
    @JsonCreator
    public static AppDatabaseSpecEngine fromString(String name) {
        return fromString(name, AppDatabaseSpecEngine.class);
    }

    /**
     * Gets known AppDatabaseSpecEngine values.
     *
     * @return known AppDatabaseSpecEngine values.
     */
    public static Collection<AppDatabaseSpecEngine> values() {
        return values(AppDatabaseSpecEngine.class);
    }
}
