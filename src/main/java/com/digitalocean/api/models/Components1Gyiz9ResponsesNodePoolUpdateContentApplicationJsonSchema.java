package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema model. */
@Fluent
public final class Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema {
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
     * @return the Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema object itself.
     */
    public Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema setNodePool(
            KubernetesNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
}
