package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum18. */
public final class Enum18 extends ExpandableStringEnum<Enum18> {
    /** Static value UNSPECIFIED for Enum18. */
    public static final Enum18 UNSPECIFIED = fromString("UNSPECIFIED");

    /** Static value BUILD for Enum18. */
    public static final Enum18 BUILD = fromString("BUILD");

    /** Static value DEPLOY for Enum18. */
    public static final Enum18 DEPLOY = fromString("DEPLOY");

    /** Static value RUN for Enum18. */
    public static final Enum18 RUN = fromString("RUN");

    /**
     * Creates or finds a Enum18 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum18.
     */
    @JsonCreator
    public static Enum18 fromString(String name) {
        return fromString(name, Enum18.class);
    }

    /**
     * Gets known Enum18 values.
     *
     * @return known Enum18 values.
     */
    public static Collection<Enum18> values() {
        return values(Enum18.class);
    }
}
