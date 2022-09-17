package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyCompare. */
public final class AlertPolicyCompare extends ExpandableStringEnum<AlertPolicyCompare> {
    /** Static value GreaterThan for AlertPolicyCompare. */
    public static final AlertPolicyCompare GREATER_THAN = fromString("GreaterThan");

    /** Static value LessThan for AlertPolicyCompare. */
    public static final AlertPolicyCompare LESS_THAN = fromString("LessThan");

    /**
     * Creates or finds a AlertPolicyCompare from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyCompare.
     */
    @JsonCreator
    public static AlertPolicyCompare fromString(String name) {
        return fromString(name, AlertPolicyCompare.class);
    }

    /**
     * Gets known AlertPolicyCompare values.
     *
     * @return known AlertPolicyCompare values.
     */
    public static Collection<AlertPolicyCompare> values() {
        return values(AlertPolicyCompare.class);
    }
}
