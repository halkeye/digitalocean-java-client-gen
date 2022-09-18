package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 {
    /*
     * The kubernetes_clusters property.
     */
    @JsonProperty(value = "kubernetes_clusters")
    private List<Cluster> kubernetesClusters;

    /**
     * Get the kubernetesClusters property: The kubernetes_clusters property.
     * 
     * @return the kubernetesClusters value.
     */
    public List<Cluster> getKubernetesClusters() {
        return this.kubernetesClusters;
    }

    /**
     * Set the kubernetesClusters property: The kubernetes_clusters property.
     * 
     * @param kubernetesClusters the kubernetesClusters value to set.
     * @return the ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 setKubernetesClusters(List<Cluster> kubernetesClusters) {
        this.kubernetesClusters = kubernetesClusters;
        return this;
    }
}
