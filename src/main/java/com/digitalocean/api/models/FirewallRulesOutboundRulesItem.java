package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FirewallRulesOutboundRulesItem model. */
@Fluent
public final class FirewallRulesOutboundRulesItem extends FirewallRuleBase {
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
     * @return the FirewallRulesOutboundRulesItem object itself.
     */
    public FirewallRulesOutboundRulesItem setDestinations(FirewallRulesOutboundRulesAllOfProperties destinations) {
        this.destinations = destinations;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesOutboundRulesItem setProtocol(FirewallRuleBaseProtocol protocol) {
        super.setProtocol(protocol);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesOutboundRulesItem setPorts(String ports) {
        super.setPorts(ports);
        return this;
    }
}
