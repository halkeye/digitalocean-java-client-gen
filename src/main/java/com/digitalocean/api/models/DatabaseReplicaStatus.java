package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the current status of the database cluster.
 */
public final class DatabaseReplicaStatus extends ExpandableStringEnum<DatabaseReplicaStatus> {
    /**
     * Static value creating for DatabaseReplicaStatus.
     */
    public static final DatabaseReplicaStatus CREATING = fromString("creating");

    /**
     * Static value online for DatabaseReplicaStatus.
     */
    public static final DatabaseReplicaStatus ONLINE = fromString("online");

    /**
     * Static value resizing for DatabaseReplicaStatus.
     */
    public static final DatabaseReplicaStatus RESIZING = fromString("resizing");

    /**
     * Static value migrating for DatabaseReplicaStatus.
     */
    public static final DatabaseReplicaStatus MIGRATING = fromString("migrating");

    /**
     * Static value forking for DatabaseReplicaStatus.
     */
    public static final DatabaseReplicaStatus FORKING = fromString("forking");

    /**
     * Creates or finds a DatabaseReplicaStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseReplicaStatus.
     */
    @JsonCreator
    public static DatabaseReplicaStatus fromString(String name) {
        return fromString(name, DatabaseReplicaStatus.class);
    }

    /**
     * Gets known DatabaseReplicaStatus values.
     * 
     * @return known DatabaseReplicaStatus values.
     */
    public static Collection<DatabaseReplicaStatus> values() {
        return values(DatabaseReplicaStatus.class);
    }
}
