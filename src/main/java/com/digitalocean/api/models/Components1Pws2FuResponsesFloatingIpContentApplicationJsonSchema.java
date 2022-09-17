package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema model. */
@Fluent
public final class Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema {
    /*
     * The floating_ip property.
     */
    @JsonProperty(value = "floating_ip")
    private FloatingIp floatingIp;

    /**
     * Get the floatingIp property: The floating_ip property.
     *
     * @return the floatingIp value.
     */
    public FloatingIp getFloatingIp() {
        return this.floatingIp;
    }

    /**
     * Set the floatingIp property: The floating_ip property.
     *
     * @param floatingIp the floatingIp value to set.
     * @return the Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema object itself.
     */
    public Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema setFloatingIp(FloatingIp floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }
}
