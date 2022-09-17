package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema model. */
@Fluent
public final class Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema {
    /*
     * The node_pool property.
     */
    @JsonProperty(value = "node_pool")
    private KubernetesNodePool nodePool;

    /**
     * Get the nodePool property: The node_pool property.
     *
     * @return the nodePool value.
     */
    public KubernetesNodePool getNodePool() {
        return this.nodePool;
    }

    /**
     * Set the nodePool property: The node_pool property.
     *
     * @param nodePool the nodePool value to set.
     * @return the Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema object itself.
     */
    public Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema setNodePool(
            KubernetesNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
}
