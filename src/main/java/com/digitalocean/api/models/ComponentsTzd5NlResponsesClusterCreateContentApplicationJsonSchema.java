package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema {
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
     * @return the ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema object itself.
     */
    public ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema setKubernetesCluster(
            Cluster kubernetesCluster) {
        this.kubernetesCluster = kubernetesCluster;
        return this;
    }
}
