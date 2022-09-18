package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the current status of the database cluster.
 */
public final class DatabaseClusterStatus extends ExpandableStringEnum<DatabaseClusterStatus> {
    /**
     * Static value creating for DatabaseClusterStatus.
     */
    public static final DatabaseClusterStatus CREATING = fromString("creating");

    /**
     * Static value online for DatabaseClusterStatus.
     */
    public static final DatabaseClusterStatus ONLINE = fromString("online");

    /**
     * Static value resizing for DatabaseClusterStatus.
     */
    public static final DatabaseClusterStatus RESIZING = fromString("resizing");

    /**
     * Static value migrating for DatabaseClusterStatus.
     */
    public static final DatabaseClusterStatus MIGRATING = fromString("migrating");

    /**
     * Static value forking for DatabaseClusterStatus.
     */
    public static final DatabaseClusterStatus FORKING = fromString("forking");

    /**
     * Creates or finds a DatabaseClusterStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseClusterStatus.
     */
    @JsonCreator
    public static DatabaseClusterStatus fromString(String name) {
        return fromString(name, DatabaseClusterStatus.class);
    }

    /**
     * Gets known DatabaseClusterStatus values.
     * 
     * @return known DatabaseClusterStatus values.
     */
    public static Collection<DatabaseClusterStatus> values() {
        return values(DatabaseClusterStatus.class);
    }
}
