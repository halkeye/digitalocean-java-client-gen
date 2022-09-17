package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Controls the amount of detail written in the server log for each message that is logged. */
public final class PostgresLogErrorVerbosity extends ExpandableStringEnum<PostgresLogErrorVerbosity> {
    /** Static value TERSE for PostgresLogErrorVerbosity. */
    public static final PostgresLogErrorVerbosity TERSE = fromString("TERSE");

    /** Static value DEFAULT for PostgresLogErrorVerbosity. */
    public static final PostgresLogErrorVerbosity DEFAULT = fromString("DEFAULT");

    /** Static value VERBOSE for PostgresLogErrorVerbosity. */
    public static final PostgresLogErrorVerbosity VERBOSE = fromString("VERBOSE");

    /**
     * Creates or finds a PostgresLogErrorVerbosity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostgresLogErrorVerbosity.
     */
    @JsonCreator
    public static PostgresLogErrorVerbosity fromString(String name) {
        return fromString(name, PostgresLogErrorVerbosity.class);
    }

    /**
     * Gets known PostgresLogErrorVerbosity values.
     *
     * @return known PostgresLogErrorVerbosity values.
     */
    public static Collection<PostgresLogErrorVerbosity> values() {
        return values(PostgresLogErrorVerbosity.class);
    }
}
