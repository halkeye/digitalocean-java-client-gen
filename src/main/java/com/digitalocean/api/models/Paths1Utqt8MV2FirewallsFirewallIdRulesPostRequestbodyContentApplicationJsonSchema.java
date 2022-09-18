package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema extends FirewallRules {
    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema setInboundRules(List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema setOutboundRules(List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
