package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema {
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
     * @return the ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema object itself.
     */
    public ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema setKubernetesCluster(
            Cluster kubernetesCluster) {
        this.kubernetesCluster = kubernetesCluster;
        return this;
    }
}
