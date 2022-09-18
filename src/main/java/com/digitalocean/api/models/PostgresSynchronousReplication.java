package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Synchronous replication type. Note that the service plan also needs to support synchronous replication.
 */
public final class PostgresSynchronousReplication extends ExpandableStringEnum<PostgresSynchronousReplication> {
    /**
     * Static value off for PostgresSynchronousReplication.
     */
    public static final PostgresSynchronousReplication OFF = fromString("off");

    /**
     * Static value quorum for PostgresSynchronousReplication.
     */
    public static final PostgresSynchronousReplication QUORUM = fromString("quorum");

    /**
     * Creates or finds a PostgresSynchronousReplication from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PostgresSynchronousReplication.
     */
    @JsonCreator
    public static PostgresSynchronousReplication fromString(String name) {
        return fromString(name, PostgresSynchronousReplication.class);
    }

    /**
     * Gets known PostgresSynchronousReplication values.
     * 
     * @return known PostgresSynchronousReplication values.
     */
    public static Collection<PostgresSynchronousReplication> values() {
        return values(PostgresSynchronousReplication.class);
    }
}
