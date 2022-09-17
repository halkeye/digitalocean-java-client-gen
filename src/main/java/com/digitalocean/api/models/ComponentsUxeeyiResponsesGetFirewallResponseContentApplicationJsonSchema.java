package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema {
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
     * @return the ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema setFirewall(Firewall firewall) {
        this.firewall = firewall;
        return this;
    }
}