package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 {
    /*
     * The floating_ips property.
     */
    @JsonProperty(value = "floating_ips")
    private List<FloatingIp> floatingIps;

    /**
     * Get the floatingIps property: The floating_ips property.
     * 
     * @return the floatingIps value.
     */
    public List<FloatingIp> getFloatingIps() {
        return this.floatingIps;
    }

    /**
     * Set the floatingIps property: The floating_ips property.
     * 
     * @param floatingIps the floatingIps value to set.
     * @return the Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 setFloatingIps(List<FloatingIp> floatingIps) {
        this.floatingIps = floatingIps;
        return this;
    }
}
