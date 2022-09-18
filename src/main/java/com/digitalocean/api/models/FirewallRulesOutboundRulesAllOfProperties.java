package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The FirewallRulesOutboundRulesAllOfProperties model.
 */
@Fluent
public final class FirewallRulesOutboundRulesAllOfProperties extends FirewallRuleTarget {
    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallRulesOutboundRulesAllOfProperties setAddresses(List<String> addresses) {
        super.setAddresses(addresses);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallRulesOutboundRulesAllOfProperties setDropletIds(List<Integer> dropletIds) {
        super.setDropletIds(dropletIds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallRulesOutboundRulesAllOfProperties setLoadBalancerUids(List<String> loadBalancerUids) {
        super.setLoadBalancerUids(loadBalancerUids);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallRulesOutboundRulesAllOfProperties setKubernetesIds(List<String> kubernetesIds) {
        super.setKubernetesIds(kubernetesIds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallRulesOutboundRulesAllOfProperties setTags(Object tags) {
        super.setTags(tags);
        return this;
    }
}
