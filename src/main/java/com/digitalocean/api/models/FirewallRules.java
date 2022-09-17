package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FirewallRules model. */
@Fluent
public class FirewallRules {
    /*
     * The inbound_rules property.
     */
    @JsonProperty(value = "inbound_rules")
    private List<FirewallRulesInboundRulesItem> inboundRules;

    /*
     * The outbound_rules property.
     */
    @JsonProperty(value = "outbound_rules")
    private List<FirewallRulesOutboundRulesItem> outboundRules;

    /**
     * Get the inboundRules property: The inbound_rules property.
     *
     * @return the inboundRules value.
     */
    public List<FirewallRulesInboundRulesItem> getInboundRules() {
        return this.inboundRules;
    }

    /**
     * Set the inboundRules property: The inbound_rules property.
     *
     * @param inboundRules the inboundRules value to set.
     * @return the FirewallRules object itself.
     */
    public FirewallRules setInboundRules(List<FirewallRulesInboundRulesItem> inboundRules) {
        this.inboundRules = inboundRules;
        return this;
    }

    /**
     * Get the outboundRules property: The outbound_rules property.
     *
     * @return the outboundRules value.
     */
    public List<FirewallRulesOutboundRulesItem> getOutboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outboundRules property: The outbound_rules property.
     *
     * @param outboundRules the outboundRules value to set.
     * @return the FirewallRules object itself.
     */
    public FirewallRules setOutboundRules(List<FirewallRulesOutboundRulesItem> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }
}
