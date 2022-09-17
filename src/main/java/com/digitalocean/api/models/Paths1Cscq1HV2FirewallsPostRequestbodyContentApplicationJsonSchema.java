package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema extends Firewall {
    /** {@inheritDoc} */
    @Override
    public Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema setDropletIds(List<Integer> dropletIds) {
        super.setDropletIds(dropletIds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema setTags(Object tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema setInboundRules(
            List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema setOutboundRules(
            List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
