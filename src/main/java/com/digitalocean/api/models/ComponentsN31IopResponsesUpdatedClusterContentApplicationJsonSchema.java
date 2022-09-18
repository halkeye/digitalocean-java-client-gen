package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema {
    /*
     * The kubernetes_cluster property.
     */
    @JsonProperty(value = "kubernetes_cluster")
    private Cluster kubernetesCluster;

    /**
     * Get the kubernetesCluster property: The kubernetes_cluster property.
     * 
     * @return the kubernetesCluster value.
     */
    public Cluster getKubernetesCluster() {
        return this.kubernetesCluster;
    }

    /**
     * Set the kubernetesCluster property: The kubernetes_cluster property.
     * 
     * @param kubernetesCluster the kubernetesCluster value to set.
     * @return the ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema object itself.
     */
    public ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema setKubernetesCluster(Cluster kubernetesCluster) {
        this.kubernetesCluster = kubernetesCluster;
        return this;
    }
}
