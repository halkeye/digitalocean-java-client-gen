package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Record commit time of transactions.
 */
public final class PostgresTrackCommitTimestamp extends ExpandableStringEnum<PostgresTrackCommitTimestamp> {
    /**
     * Static value off for PostgresTrackCommitTimestamp.
     */
    public static final PostgresTrackCommitTimestamp OFF = fromString("off");

    /**
     * Static value on for PostgresTrackCommitTimestamp.
     */
    public static final PostgresTrackCommitTimestamp ON = fromString("on");

    /**
     * Creates or finds a PostgresTrackCommitTimestamp from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PostgresTrackCommitTimestamp.
     */
    @JsonCreator
    public static PostgresTrackCommitTimestamp fromString(String name) {
        return fromString(name, PostgresTrackCommitTimestamp.class);
    }

    /**
     * Gets known PostgresTrackCommitTimestamp values.
     * 
     * @return known PostgresTrackCommitTimestamp values.
     */
    public static Collection<PostgresTrackCommitTimestamp> values() {
        return values(PostgresTrackCommitTimestamp.class);
    }
}
