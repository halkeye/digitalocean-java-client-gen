package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyRequestWindow. */
public final class AlertPolicyRequestWindow extends ExpandableStringEnum<AlertPolicyRequestWindow> {
    /** Static value 5m for AlertPolicyRequestWindow. */
    public static final AlertPolicyRequestWindow FIVEM = fromString("5m");

    /** Static value 10m for AlertPolicyRequestWindow. */
    public static final AlertPolicyRequestWindow TENM = fromString("10m");

    /** Static value 30m for AlertPolicyRequestWindow. */
    public static final AlertPolicyRequestWindow THIRTYM = fromString("30m");

    /** Static value 1h for AlertPolicyRequestWindow. */
    public static final AlertPolicyRequestWindow ONEH = fromString("1h");

    /**
     * Creates or finds a AlertPolicyRequestWindow from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyRequestWindow.
     */
    @JsonCreator
    public static AlertPolicyRequestWindow fromString(String name) {
        return fromString(name, AlertPolicyRequestWindow.class);
    }

    /**
     * Gets known AlertPolicyRequestWindow values.
     *
     * @return known AlertPolicyRequestWindow values.
     */
    public static Collection<AlertPolicyRequestWindow> values() {
        return values(AlertPolicyRequestWindow.class);
    }
}
