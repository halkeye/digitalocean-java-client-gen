package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 {
    /*
     * The reserved_ips property.
     */
    @JsonProperty(value = "reserved_ips")
    private List<ReservedIp> reservedIps;

    /**
     * Get the reservedIps property: The reserved_ips property.
     *
     * @return the reservedIps value.
     */
    public List<ReservedIp> getReservedIps() {
        return this.reservedIps;
    }

    /**
     * Set the reservedIps property: The reserved_ips property.
     *
     * @param reservedIps the reservedIps value to set.
     * @return the ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 setReservedIps(
            List<ReservedIp> reservedIps) {
        this.reservedIps = reservedIps;
        return this;
    }
}
