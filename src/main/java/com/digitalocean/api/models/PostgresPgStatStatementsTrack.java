package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Controls which statements are counted. Specify 'top' to track top-level statements (those issued directly by
 * clients), 'all' to also track nested statements (such as statements invoked within functions), or 'none' to disable
 * statement statistics collection. The default value is top.
 */
public final class PostgresPgStatStatementsTrack extends ExpandableStringEnum<PostgresPgStatStatementsTrack> {
    /** Static value all for PostgresPgStatStatementsTrack. */
    public static final PostgresPgStatStatementsTrack ALL = fromString("all");

    /** Static value top for PostgresPgStatStatementsTrack. */
    public static final PostgresPgStatStatementsTrack TOP = fromString("top");

    /** Static value none for PostgresPgStatStatementsTrack. */
    public static final PostgresPgStatStatementsTrack NONE = fromString("none");

    /**
     * Creates or finds a PostgresPgStatStatementsTrack from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostgresPgStatStatementsTrack.
     */
    @JsonCreator
    public static PostgresPgStatStatementsTrack fromString(String name) {
        return fromString(name, PostgresPgStatStatementsTrack.class);
    }

    /**
     * Gets known PostgresPgStatStatementsTrack values.
     *
     * @return known PostgresPgStatStatementsTrack values.
     */
    public static Collection<PostgresPgStatStatementsTrack> values() {
        return values(PostgresPgStatStatementsTrack.class);
    }
}
