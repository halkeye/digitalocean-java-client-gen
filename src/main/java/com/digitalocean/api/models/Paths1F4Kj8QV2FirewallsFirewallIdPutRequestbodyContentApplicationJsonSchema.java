package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema extends Firewall {
    /** {@inheritDoc} */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setDropletIds(
            List<Integer> dropletIds) {
        super.setDropletIds(dropletIds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setTags(Object tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setInboundRules(
            List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setOutboundRules(
            List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
