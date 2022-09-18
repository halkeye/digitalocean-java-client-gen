package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A slug representing the database engine used for the cluster. The possible values are: "pg" for PostgreSQL, "mysql" for MySQL, "redis" for Redis, and "mongodb" for MongoDB.
 */
public final class DatabaseClusterEngine extends ExpandableStringEnum<DatabaseClusterEngine> {
    /**
     * Static value pg for DatabaseClusterEngine.
     */
    public static final DatabaseClusterEngine PG = fromString("pg");

    /**
     * Static value mysql for DatabaseClusterEngine.
     */
    public static final DatabaseClusterEngine MYSQL = fromString("mysql");

    /**
     * Static value redis for DatabaseClusterEngine.
     */
    public static final DatabaseClusterEngine REDIS = fromString("redis");

    /**
     * Static value mongodb for DatabaseClusterEngine.
     */
    public static final DatabaseClusterEngine MONGODB = fromString("mongodb");

    /**
     * Creates or finds a DatabaseClusterEngine from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseClusterEngine.
     */
    @JsonCreator
    public static DatabaseClusterEngine fromString(String name) {
        return fromString(name, DatabaseClusterEngine.class);
    }

    /**
     * Gets known DatabaseClusterEngine values.
     * 
     * @return known DatabaseClusterEngine values.
     */
    public static Collection<DatabaseClusterEngine> values() {
        return values(DatabaseClusterEngine.class);
    }
}
