package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object containing additional information about resource related to a Droplet requested to be destroyed. */
@Fluent
public final class AssociatedResourceStatusResources {
    /*
     * The reserved_ips property.
     */
    @JsonProperty(value = "reserved_ips")
    private List<DestroyedAssociatedResource> reservedIps;

    /*
     * The floating_ips property.
     */
    @JsonProperty(value = "floating_ips")
    private List<DestroyedAssociatedResource> floatingIps;

    /*
     * The snapshots property.
     */
    @JsonProperty(value = "snapshots")
    private List<DestroyedAssociatedResource> snapshots;

    /*
     * The volumes property.
     */
    @JsonProperty(value = "volumes")
    private List<DestroyedAssociatedResource> volumes;

    /*
     * The volume_snapshots property.
     */
    @JsonProperty(value = "volume_snapshots")
    private List<DestroyedAssociatedResource> volumeSnapshots;

    /**
     * Get the reservedIps property: The reserved_ips property.
     *
     * @return the reservedIps value.
     */
    public List<DestroyedAssociatedResource> getReservedIps() {
        return this.reservedIps;
    }

    /**
     * Set the reservedIps property: The reserved_ips property.
     *
     * @param reservedIps the reservedIps value to set.
     * @return the AssociatedResourceStatusResources object itself.
     */
    public AssociatedResourceStatusResources setReservedIps(List<DestroyedAssociatedResource> reservedIps) {
        this.reservedIps = reservedIps;
        return this;
    }

    /**
     * Get the floatingIps property: The floating_ips property.
     *
     * @return the floatingIps value.
     */
    public List<DestroyedAssociatedResource> getFloatingIps() {
        return this.floatingIps;
    }

    /**
     * Set the floatingIps property: The floating_ips property.
     *
     * @param floatingIps the floatingIps value to set.
     * @return the AssociatedResourceStatusResources object itself.
     */
    public AssociatedResourceStatusResources setFloatingIps(List<DestroyedAssociatedResource> floatingIps) {
        this.floatingIps = floatingIps;
        return this;
    }

    /**
     * Get the snapshots property: The snapshots property.
     *
     * @return the snapshots value.
     */
    public List<DestroyedAssociatedResource> getSnapshots() {
        return this.snapshots;
    }

    /**
     * Set the snapshots property: The snapshots property.
     *
     * @param snapshots the snapshots value to set.
     * @return the AssociatedResourceStatusResources object itself.
     */
    public AssociatedResourceStatusResources setSnapshots(List<DestroyedAssociatedResource> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * Get the volumes property: The volumes property.
     *
     * @return the volumes value.
     */
    public List<DestroyedAssociatedResource> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: The volumes property.
     *
     * @param volumes the volumes value to set.
     * @return the AssociatedResourceStatusResources object itself.
     */
    public AssociatedResourceStatusResources setVolumes(List<DestroyedAssociatedResource> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: The volume_snapshots property.
     *
     * @return the volumeSnapshots value.
     */
    public List<DestroyedAssociatedResource> getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: The volume_snapshots property.
     *
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the AssociatedResourceStatusResources object itself.
     */
    public AssociatedResourceStatusResources setVolumeSnapshots(List<DestroyedAssociatedResource> volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }
}
