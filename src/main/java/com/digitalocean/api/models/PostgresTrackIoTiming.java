package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the
 * operating system for the current time, which may cause significant overhead on some platforms.
 */
public final class PostgresTrackIoTiming extends ExpandableStringEnum<PostgresTrackIoTiming> {
    /** Static value off for PostgresTrackIoTiming. */
    public static final PostgresTrackIoTiming OFF = fromString("off");

    /** Static value on for PostgresTrackIoTiming. */
    public static final PostgresTrackIoTiming ON = fromString("on");

    /**
     * Creates or finds a PostgresTrackIoTiming from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostgresTrackIoTiming.
     */
    @JsonCreator
    public static PostgresTrackIoTiming fromString(String name) {
        return fromString(name, PostgresTrackIoTiming.class);
    }

    /**
     * Gets known PostgresTrackIoTiming values.
     *
     * @return known PostgresTrackIoTiming values.
     */
    public static Collection<PostgresTrackIoTiming> values() {
        return values(PostgresTrackIoTiming.class);
    }
}
