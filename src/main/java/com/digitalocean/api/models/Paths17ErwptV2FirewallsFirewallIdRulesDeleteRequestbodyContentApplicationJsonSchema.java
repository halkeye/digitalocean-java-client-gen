package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema
        extends FirewallRules {
    /** {@inheritDoc} */
    @Override
    public Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema setInboundRules(
            List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema setOutboundRules(
            List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
