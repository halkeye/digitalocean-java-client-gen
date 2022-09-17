package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enables tracking of function call counts and time used. */
public final class PostgresTrackFunctions extends ExpandableStringEnum<PostgresTrackFunctions> {
    /** Static value all for PostgresTrackFunctions. */
    public static final PostgresTrackFunctions ALL = fromString("all");

    /** Static value pl for PostgresTrackFunctions. */
    public static final PostgresTrackFunctions PL = fromString("pl");

    /** Static value none for PostgresTrackFunctions. */
    public static final PostgresTrackFunctions NONE = fromString("none");

    /**
     * Creates or finds a PostgresTrackFunctions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostgresTrackFunctions.
     */
    @JsonCreator
    public static PostgresTrackFunctions fromString(String name) {
        return fromString(name, PostgresTrackFunctions.class);
    }

    /**
     * Gets known PostgresTrackFunctions values.
     *
     * @return known PostgresTrackFunctions values.
     */
    public static Collection<PostgresTrackFunctions> values() {
        return values(PostgresTrackFunctions.class);
    }
}
