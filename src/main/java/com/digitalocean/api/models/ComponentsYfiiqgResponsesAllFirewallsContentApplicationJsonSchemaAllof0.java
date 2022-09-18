package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 {
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
     * @return the ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 setFirewalls(List<Firewall> firewalls) {
        this.firewalls = firewalls;
        return this;
    }
}
