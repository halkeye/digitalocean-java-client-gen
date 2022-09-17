package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 {
    /*
     * The firewalls property.
     */
    @JsonProperty(value = "firewalls")
    private List<Firewall> firewalls;

    /**
     * Get the firewalls property: The firewalls property.
     *
     * @return the firewalls value.
     */
    public List<Firewall> getFirewalls() {
        return this.firewalls;
    }

    /**
     * Set the firewalls property: The firewalls property.
     *
     * @param firewalls the firewalls value to set.
     * @return the ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 setFirewalls(
            List<Firewall> firewalls) {
        this.firewalls = firewalls;
        return this;
    }
}
