package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 model.
 */
@Fluent
public class ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 {
    /*
     * The destinations property.
     */
    @JsonProperty(value = "destinations", required = true)
    private FirewallRulesOutboundRulesAllOfProperties destinations;

    /**
     * Get the destinations property: The destinations property.
     * 
     * @return the destinations value.
     */
    public FirewallRulesOutboundRulesAllOfProperties getDestinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: The destinations property.
     * 
     * @param destinations the destinations value to set.
     * @return the ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 object itself.
     */
    public ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 setDestinations(FirewallRulesOutboundRulesAllOfProperties destinations) {
        this.destinations = destinations;
        return this;
    }
}
