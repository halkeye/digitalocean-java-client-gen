package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
 * model.
 */
@Fluent
public final class Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema {
    /*
     * The nodes property.
     */
    @JsonProperty(value = "nodes")
    private List<String> nodes;

    /**
     * Get the nodes property: The nodes property.
     * 
     * @return the nodes value.
     */
    public List<String> getNodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: The nodes property.
     * 
     * @param nodes the nodes value to set.
     * @return the
     * Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
     * object itself.
     */
    public Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
}
