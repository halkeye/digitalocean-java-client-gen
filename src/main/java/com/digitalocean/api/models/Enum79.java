package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum79. */
public final class Enum79 extends ExpandableStringEnum<Enum79> {
    /** Static value inbound for Enum79. */
    public static final Enum79 INBOUND = fromString("inbound");

    /** Static value outbound for Enum79. */
    public static final Enum79 OUTBOUND = fromString("outbound");

    /**
     * Creates or finds a Enum79 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum79.
     */
    @JsonCreator
    public static Enum79 fromString(String name) {
        return fromString(name, Enum79.class);
    }

    /**
     * Gets known Enum79 values.
     *
     * @return known Enum79 values.
     */
    public static Collection<Enum79> values() {
        return values(Enum79.class);
    }
}
