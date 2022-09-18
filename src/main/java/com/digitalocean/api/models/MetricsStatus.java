package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for MetricsStatus.
 */
public final class MetricsStatus extends ExpandableStringEnum<MetricsStatus> {
    /**
     * Static value success for MetricsStatus.
     */
    public static final MetricsStatus SUCCESS = fromString("success");

    /**
     * Static value error for MetricsStatus.
     */
    public static final MetricsStatus ERROR = fromString("error");

    /**
     * Creates or finds a MetricsStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MetricsStatus.
     */
    @JsonCreator
    public static MetricsStatus fromString(String name) {
        return fromString(name, MetricsStatus.class);
    }

    /**
     * Gets known MetricsStatus values.
     * 
     * @return known MetricsStatus values.
     */
    public static Collection<MetricsStatus> values() {
        return values(MetricsStatus.class);
    }
}
