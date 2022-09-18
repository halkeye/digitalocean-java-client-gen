package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum89.
 */
public final class Enum89 extends ExpandableStringEnum<Enum89> {
    /**
     * Static value droplet for Enum89.
     */
    public static final Enum89 DROPLET = fromString("droplet");

    /**
     * Static value volume for Enum89.
     */
    public static final Enum89 VOLUME = fromString("volume");

    /**
     * Creates or finds a Enum89 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum89.
     */
    @JsonCreator
    public static Enum89 fromString(String name) {
        return fromString(name, Enum89.class);
    }

    /**
     * Gets known Enum89 values.
     * 
     * @return known Enum89 values.
     */
    public static Collection<Enum89> values() {
        return values(Enum89.class);
    }
}
