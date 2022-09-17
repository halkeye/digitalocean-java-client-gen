package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema model. */
@Fluent
public final class Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema {
    /*
     * The firewall property.
     */
    @JsonProperty(value = "firewall")
    private Firewall firewall;

    /**
     * Get the firewall property: The firewall property.
     *
     * @return the firewall value.
     */
    public Firewall getFirewall() {
        return this.firewall;
    }

    /**
     * Set the firewall property: The firewall property.
     *
     * @param firewall the firewall value to set.
     * @return the Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema object itself.
     */
    public Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema setFirewall(Firewall firewall) {
        this.firewall = firewall;
        return this;
    }
}
