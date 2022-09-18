package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema {
    /*
     * The rules property.
     */
    @JsonProperty(value = "rules")
    private List<FirewallRule> rules;

    /**
     * Get the rules property: The rules property.
     * 
     * @return the rules value.
     */
    public List<FirewallRule> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules property.
     * 
     * @param rules the rules value to set.
     * @return the ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema object itself.
     */
    public ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema setRules(List<FirewallRule> rules) {
        this.rules = rules;
        return this;
    }
}
