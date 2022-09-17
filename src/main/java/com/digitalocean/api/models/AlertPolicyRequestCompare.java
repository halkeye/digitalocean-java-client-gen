package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyRequestCompare. */
public final class AlertPolicyRequestCompare extends ExpandableStringEnum<AlertPolicyRequestCompare> {
    /** Static value GreaterThan for AlertPolicyRequestCompare. */
    public static final AlertPolicyRequestCompare GREATER_THAN = fromString("GreaterThan");

    /** Static value LessThan for AlertPolicyRequestCompare. */
    public static final AlertPolicyRequestCompare LESS_THAN = fromString("LessThan");

    /**
     * Creates or finds a AlertPolicyRequestCompare from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyRequestCompare.
     */
    @JsonCreator
    public static AlertPolicyRequestCompare fromString(String name) {
        return fromString(name, AlertPolicyRequestCompare.class);
    }

    /**
     * Gets known AlertPolicyRequestCompare values.
     *
     * @return known AlertPolicyRequestCompare values.
     */
    public static Collection<AlertPolicyRequestCompare> values() {
        return values(AlertPolicyRequestCompare.class);
    }
}
