package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FirewallRulesInboundRulesItem model. */
@Fluent
public final class FirewallRulesInboundRulesItem extends FirewallRuleBase {
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
     * @return the FirewallRulesInboundRulesItem object itself.
     */
    public FirewallRulesInboundRulesItem setSources(FirewallRulesInboundRulesAllOfProperties sources) {
        this.sources = sources;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesItem setProtocol(FirewallRuleBaseProtocol protocol) {
        super.setProtocol(protocol);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesItem setPorts(String ports) {
        super.setPorts(ports);
        return this;
    }
}
