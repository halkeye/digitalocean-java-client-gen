package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The FirewallRulesInboundRulesAllOfProperties model. */
@Fluent
public final class FirewallRulesInboundRulesAllOfProperties extends FirewallRuleTarget {
    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesAllOfProperties setAddresses(List<String> addresses) {
        super.setAddresses(addresses);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesAllOfProperties setDropletIds(List<Integer> dropletIds) {
        super.setDropletIds(dropletIds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesAllOfProperties setLoadBalancerUids(List<String> loadBalancerUids) {
        super.setLoadBalancerUids(loadBalancerUids);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesAllOfProperties setKubernetesIds(List<String> kubernetesIds) {
        super.setKubernetesIds(kubernetesIds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallRulesInboundRulesAllOfProperties setTags(Object tags) {
        super.setTags(tags);
        return this;
    }
}
