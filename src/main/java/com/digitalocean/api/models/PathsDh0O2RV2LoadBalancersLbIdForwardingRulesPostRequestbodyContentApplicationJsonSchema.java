package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema {
    /*
     * The forwarding_rules property.
     */
    @JsonProperty(value = "forwarding_rules", required = true)
    private List<ForwardingRule> forwardingRules;

    /**
     * Get the forwardingRules property: The forwarding_rules property.
     * 
     * @return the forwardingRules value.
     */
    public List<ForwardingRule> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * Set the forwardingRules property: The forwarding_rules property.
     * 
     * @param forwardingRules the forwardingRules value to set.
     * @return the PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema object
     * itself.
     */
    public PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema setForwardingRules(List<ForwardingRule> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
}
