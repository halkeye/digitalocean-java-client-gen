package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * An object containing the IDs of resources associated with a Kubernetes cluster.
 */
@Fluent
public final class AssociatedKubernetesResources {
    /*
     * A list of names and IDs for associated load balancers that can be destroyed along with the cluster.
     */
    @JsonProperty(value = "load_balancers")
    private List<AssociatedKubernetesResource> loadBalancers;

    /*
     * A list of names and IDs for associated volumes that can be destroyed along with the cluster.
     */
    @JsonProperty(value = "volumes")
    private List<AssociatedKubernetesResource> volumes;

    /*
     * A list of names and IDs for associated volume snapshots that can be destroyed along with the cluster.
     */
    @JsonProperty(value = "volume_snapshots")
    private List<AssociatedKubernetesResource> volumeSnapshots;

    /**
     * Get the loadBalancers property: A list of names and IDs for associated load balancers that can be destroyed
     * along with the cluster.
     * 
     * @return the loadBalancers value.
     */
    public List<AssociatedKubernetesResource> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * Set the loadBalancers property: A list of names and IDs for associated load balancers that can be destroyed
     * along with the cluster.
     * 
     * @param loadBalancers the loadBalancers value to set.
     * @return the AssociatedKubernetesResources object itself.
     */
    public AssociatedKubernetesResources setLoadBalancers(List<AssociatedKubernetesResource> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }

    /**
     * Get the volumes property: A list of names and IDs for associated volumes that can be destroyed along with the
     * cluster.
     * 
     * @return the volumes value.
     */
    public List<AssociatedKubernetesResource> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: A list of names and IDs for associated volumes that can be destroyed along with the
     * cluster.
     * 
     * @param volumes the volumes value to set.
     * @return the AssociatedKubernetesResources object itself.
     */
    public AssociatedKubernetesResources setVolumes(List<AssociatedKubernetesResource> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: A list of names and IDs for associated volume snapshots that can be destroyed
     * along with the cluster.
     * 
     * @return the volumeSnapshots value.
     */
    public List<AssociatedKubernetesResource> getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: A list of names and IDs for associated volume snapshots that can be destroyed
     * along with the cluster.
     * 
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the AssociatedKubernetesResources object itself.
     */
    public AssociatedKubernetesResources setVolumeSnapshots(List<AssociatedKubernetesResource> volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }
}
