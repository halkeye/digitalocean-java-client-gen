package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum59.
 */
public final class Enum59 extends ExpandableStringEnum<Enum59> {
    /**
     * Static value application for Enum59.
     */
    public static final Enum59 APPLICATION = fromString("application");

    /**
     * Static value distribution for Enum59.
     */
    public static final Enum59 DISTRIBUTION = fromString("distribution");

    /**
     * Creates or finds a Enum59 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum59.
     */
    @JsonCreator
    public static Enum59 fromString(String name) {
        return fromString(name, Enum59.class);
    }

    /**
     * Gets known Enum59 values.
     * 
     * @return known Enum59 values.
     */
    public static Collection<Enum59> values() {
        return values(Enum59.class);
    }
}
