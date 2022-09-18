package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema {
    /*
     * The node_pools property.
     */
    @JsonProperty(value = "node_pools")
    private List<KubernetesNodePool> nodePools;

    /**
     * Get the nodePools property: The node_pools property.
     * 
     * @return the nodePools value.
     */
    public List<KubernetesNodePool> getNodePools() {
        return this.nodePools;
    }

    /**
     * Set the nodePools property: The node_pools property.
     * 
     * @param nodePools the nodePools value to set.
     * @return the ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema object itself.
     */
    public ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema setNodePools(List<KubernetesNodePool> nodePools) {
        this.nodePools = nodePools;
        return this;
    }
}
