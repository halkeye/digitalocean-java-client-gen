package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 model. */
@Fluent
public class Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 {
    /*
     * The sources property.
     */
    @JsonProperty(value = "sources", required = true)
    private FirewallRulesInboundRulesAllOfProperties sources;

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    public FirewallRulesInboundRulesAllOfProperties getSources() {
        return this.sources;
    }

    /**
     * Set the sources property: The sources property.
     *
     * @param sources the sources value to set.
     * @return the Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 object itself.
     */
    public Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 setSources(
            FirewallRulesInboundRulesAllOfProperties sources) {
        this.sources = sources;
        return this;
    }
}
