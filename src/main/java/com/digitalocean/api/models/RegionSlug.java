package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The slug identifier for the region where the resource will initially be  available.
 */
public final class RegionSlug extends ExpandableStringEnum<RegionSlug> {
    /**
     * Static value ams1 for RegionSlug.
     */
    public static final RegionSlug AMS1 = fromString("ams1");

    /**
     * Static value ams2 for RegionSlug.
     */
    public static final RegionSlug AMS2 = fromString("ams2");

    /**
     * Static value ams3 for RegionSlug.
     */
    public static final RegionSlug AMS3 = fromString("ams3");

    /**
     * Static value blr1 for RegionSlug.
     */
    public static final RegionSlug BLR1 = fromString("blr1");

    /**
     * Static value fra1 for RegionSlug.
     */
    public static final RegionSlug FRA1 = fromString("fra1");

    /**
     * Static value lon1 for RegionSlug.
     */
    public static final RegionSlug LON1 = fromString("lon1");

    /**
     * Static value nyc1 for RegionSlug.
     */
    public static final RegionSlug NYC1 = fromString("nyc1");

    /**
     * Static value nyc2 for RegionSlug.
     */
    public static final RegionSlug NYC2 = fromString("nyc2");

    /**
     * Static value nyc3 for RegionSlug.
     */
    public static final RegionSlug NYC3 = fromString("nyc3");

    /**
     * Static value sfo1 for RegionSlug.
     */
    public static final RegionSlug SFO1 = fromString("sfo1");

    /**
     * Static value sfo2 for RegionSlug.
     */
    public static final RegionSlug SFO2 = fromString("sfo2");

    /**
     * Static value sfo3 for RegionSlug.
     */
    public static final RegionSlug SFO3 = fromString("sfo3");

    /**
     * Static value sgp1 for RegionSlug.
     */
    public static final RegionSlug SGP1 = fromString("sgp1");

    /**
     * Static value tor1 for RegionSlug.
     */
    public static final RegionSlug TOR1 = fromString("tor1");

    /**
     * Creates or finds a RegionSlug from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RegionSlug.
     */
    @JsonCreator
    public static RegionSlug fromString(String name) {
        return fromString(name, RegionSlug.class);
    }

    /**
     * Gets known RegionSlug values.
     * 
     * @return known RegionSlug values.
     */
    public static Collection<RegionSlug> values() {
        return values(RegionSlug.class);
    }
}
