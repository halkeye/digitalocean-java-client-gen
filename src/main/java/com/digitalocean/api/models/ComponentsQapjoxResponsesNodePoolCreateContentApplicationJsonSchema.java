package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema {
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
     * @return the ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema object itself.
     */
    public ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema setNodePool(KubernetesNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
}
