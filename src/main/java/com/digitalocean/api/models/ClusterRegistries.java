package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ClusterRegistries model. */
@Fluent
public final class ClusterRegistries {
    /*
     * An array containing the UUIDs of Kubernetes clusters.
     */
    @JsonProperty(value = "cluster_uuids")
    private List<String> clusterUuids;

    /**
     * Get the clusterUuids property: An array containing the UUIDs of Kubernetes clusters.
     *
     * @return the clusterUuids value.
     */
    public List<String> getClusterUuids() {
        return this.clusterUuids;
    }

    /**
     * Set the clusterUuids property: An array containing the UUIDs of Kubernetes clusters.
     *
     * @param clusterUuids the clusterUuids value to set.
     * @return the ClusterRegistries object itself.
     */
    public ClusterRegistries setClusterUuids(List<String> clusterUuids) {
        this.clusterUuids = clusterUuids;
        return this;
    }
}
