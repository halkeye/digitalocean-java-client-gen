package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema {
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
     * @return the Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema object
     * itself.
     */
    public Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema setRules(List<FirewallRule> rules) {
        this.rules = rules;
        return this;
    }
}
