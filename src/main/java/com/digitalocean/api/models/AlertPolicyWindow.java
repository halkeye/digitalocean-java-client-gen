package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyWindow. */
public final class AlertPolicyWindow extends ExpandableStringEnum<AlertPolicyWindow> {
    /** Static value 5m for AlertPolicyWindow. */
    public static final AlertPolicyWindow FIVEM = fromString("5m");

    /** Static value 10m for AlertPolicyWindow. */
    public static final AlertPolicyWindow TENM = fromString("10m");

    /** Static value 30m for AlertPolicyWindow. */
    public static final AlertPolicyWindow THIRTYM = fromString("30m");

    /** Static value 1h for AlertPolicyWindow. */
    public static final AlertPolicyWindow ONEH = fromString("1h");

    /**
     * Creates or finds a AlertPolicyWindow from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyWindow.
     */
    @JsonCreator
    public static AlertPolicyWindow fromString(String name) {
        return fromString(name, AlertPolicyWindow.class);
    }

    /**
     * Gets known AlertPolicyWindow values.
     *
     * @return known AlertPolicyWindow values.
     */
    public static Collection<AlertPolicyWindow> values() {
        return values(AlertPolicyWindow.class);
    }
}
