package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum78.
 */
public final class Enum78 extends ExpandableStringEnum<Enum78> {
    /**
     * Static value private for Enum78.
     */
    public static final Enum78 PRIVATE = fromString("private");

    /**
     * Static value public for Enum78.
     */
    public static final Enum78 PUBLIC = fromString("public");

    /**
     * Creates or finds a Enum78 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum78.
     */
    @JsonCreator
    public static Enum78 fromString(String name) {
        return fromString(name, Enum78.class);
    }

    /**
     * Gets known Enum78 values.
     * 
     * @return known Enum78 values.
     */
    public static Collection<Enum78> values() {
        return values(Enum78.class);
    }
}
