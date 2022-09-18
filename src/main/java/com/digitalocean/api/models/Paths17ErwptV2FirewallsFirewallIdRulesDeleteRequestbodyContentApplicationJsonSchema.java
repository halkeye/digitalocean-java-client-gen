package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema extends FirewallRules {
    /**
     * {@inheritDoc}
     */
    @Override
    public Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema setInboundRules(List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema setOutboundRules(List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
