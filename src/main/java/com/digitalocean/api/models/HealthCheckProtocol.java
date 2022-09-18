package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https`, or `tcp`.
 */
public final class HealthCheckProtocol extends ExpandableStringEnum<HealthCheckProtocol> {
    /**
     * Static value http for HealthCheckProtocol.
     */
    public static final HealthCheckProtocol HTTP = fromString("http");

    /**
     * Static value https for HealthCheckProtocol.
     */
    public static final HealthCheckProtocol HTTPS = fromString("https");

    /**
     * Static value tcp for HealthCheckProtocol.
     */
    public static final HealthCheckProtocol TCP = fromString("tcp");

    /**
     * Creates or finds a HealthCheckProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HealthCheckProtocol.
     */
    @JsonCreator
    public static HealthCheckProtocol fromString(String name) {
        return fromString(name, HealthCheckProtocol.class);
    }

    /**
     * Gets known HealthCheckProtocol values.
     * 
     * @return known HealthCheckProtocol values.
     */
    public static Collection<HealthCheckProtocol> values() {
        return values(HealthCheckProtocol.class);
    }
}
