package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Slug of the region where registry data is stored. When not provided, a region will be selected.
 */
public final class RegistryCreateRegion extends ExpandableStringEnum<RegistryCreateRegion> {
    /**
     * Static value nyc3 for RegistryCreateRegion.
     */
    public static final RegistryCreateRegion NYC3 = fromString("nyc3");

    /**
     * Static value sfo3 for RegistryCreateRegion.
     */
    public static final RegistryCreateRegion SFO3 = fromString("sfo3");

    /**
     * Static value ams3 for RegistryCreateRegion.
     */
    public static final RegistryCreateRegion AMS3 = fromString("ams3");

    /**
     * Static value sgp1 for RegistryCreateRegion.
     */
    public static final RegistryCreateRegion SGP1 = fromString("sgp1");

    /**
     * Static value fra1 for RegistryCreateRegion.
     */
    public static final RegistryCreateRegion FRA1 = fromString("fra1");

    /**
     * Creates or finds a RegistryCreateRegion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RegistryCreateRegion.
     */
    @JsonCreator
    public static RegistryCreateRegion fromString(String name) {
        return fromString(name, RegistryCreateRegion.class);
    }

    /**
     * Gets known RegistryCreateRegion values.
     * 
     * @return known RegistryCreateRegion values.
     */
    public static Collection<RegistryCreateRegion> values() {
        return values(RegistryCreateRegion.class);
    }
}
