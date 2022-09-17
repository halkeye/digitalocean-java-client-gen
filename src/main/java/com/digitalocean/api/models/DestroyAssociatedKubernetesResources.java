package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object containing the IDs of resources to be destroyed along with their associated with a Kubernetes cluster. */
@Fluent
public final class DestroyAssociatedKubernetesResources {
    /*
     * A list of IDs for associated load balancers to destroy along with the cluster.
     */
    @JsonProperty(value = "load_balancers")
    private List<String> loadBalancers;

    /*
     * A list of IDs for associated volumes to destroy along with the cluster.
     */
    @JsonProperty(value = "volumes")
    private List<String> volumes;

    /*
     * A list of IDs for associated volume snapshots to destroy along with the cluster.
     */
    @JsonProperty(value = "volume_snapshots")
    private List<String> volumeSnapshots;

    /**
     * Get the loadBalancers property: A list of IDs for associated load balancers to destroy along with the cluster.
     *
     * @return the loadBalancers value.
     */
    public List<String> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * Set the loadBalancers property: A list of IDs for associated load balancers to destroy along with the cluster.
     *
     * @param loadBalancers the loadBalancers value to set.
     * @return the DestroyAssociatedKubernetesResources object itself.
     */
    public DestroyAssociatedKubernetesResources setLoadBalancers(List<String> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }

    /**
     * Get the volumes property: A list of IDs for associated volumes to destroy along with the cluster.
     *
     * @return the volumes value.
     */
    public List<String> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: A list of IDs for associated volumes to destroy along with the cluster.
     *
     * @param volumes the volumes value to set.
     * @return the DestroyAssociatedKubernetesResources object itself.
     */
    public DestroyAssociatedKubernetesResources setVolumes(List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: A list of IDs for associated volume snapshots to destroy along with the
     * cluster.
     *
     * @return the volumeSnapshots value.
     */
    public List<String> getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: A list of IDs for associated volume snapshots to destroy along with the
     * cluster.
     *
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the DestroyAssociatedKubernetesResources object itself.
     */
    public DestroyAssociatedKubernetesResources setVolumeSnapshots(List<String> volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }
}
