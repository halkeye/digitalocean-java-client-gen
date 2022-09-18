package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema extends Firewall {
    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setDropletIds(List<Integer> dropletIds) {
        super.setDropletIds(dropletIds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setTags(Object tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setInboundRules(List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema setOutboundRules(List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
