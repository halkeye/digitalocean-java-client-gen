package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema model. */
@Fluent
public final class Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema {
    /*
     * The reserved_ip property.
     */
    @JsonProperty(value = "reserved_ip")
    private ReservedIp reservedIp;

    /**
     * Get the reservedIp property: The reserved_ip property.
     *
     * @return the reservedIp value.
     */
    public ReservedIp getReservedIp() {
        return this.reservedIp;
    }

    /**
     * Set the reservedIp property: The reserved_ip property.
     *
     * @param reservedIp the reservedIp value to set.
     * @return the Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema object itself.
     */
    public Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema setReservedIp(ReservedIp reservedIp) {
        this.reservedIp = reservedIp;
        return this;
    }
}
