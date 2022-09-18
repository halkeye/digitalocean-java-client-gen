package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The day of the maintenance window policy. May be one of `monday` through `sunday`, or `any` to indicate an arbitrary week day.
 */
public final class MaintenancePolicyDay extends ExpandableStringEnum<MaintenancePolicyDay> {
    /**
     * Static value any for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay ANY = fromString("any");

    /**
     * Static value monday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay MONDAY = fromString("monday");

    /**
     * Static value tuesday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay TUESDAY = fromString("tuesday");

    /**
     * Static value wednesday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay WEDNESDAY = fromString("wednesday");

    /**
     * Static value thursday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay THURSDAY = fromString("thursday");

    /**
     * Static value friday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay FRIDAY = fromString("friday");

    /**
     * Static value saturday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay SATURDAY = fromString("saturday");

    /**
     * Static value sunday for MaintenancePolicyDay.
     */
    public static final MaintenancePolicyDay SUNDAY = fromString("sunday");

    /**
     * Creates or finds a MaintenancePolicyDay from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MaintenancePolicyDay.
     */
    @JsonCreator
    public static MaintenancePolicyDay fromString(String name) {
        return fromString(name, MaintenancePolicyDay.class);
    }

    /**
     * Gets known MaintenancePolicyDay values.
     * 
     * @return known MaintenancePolicyDay values.
     */
    public static Collection<MaintenancePolicyDay> values() {
        return values(MaintenancePolicyDay.class);
    }
}
