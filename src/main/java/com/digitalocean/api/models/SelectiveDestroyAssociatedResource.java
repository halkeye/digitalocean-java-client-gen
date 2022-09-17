package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object containing information about a resource to be scheduled for deletion. */
@Fluent
public final class SelectiveDestroyAssociatedResource {
    /*
     * An array of unique identifiers for the floating IPs to be scheduled for deletion.
     */
    @JsonProperty(value = "floating_ips")
    private List<String> floatingIps;

    /*
     * An array of unique identifiers for the reserved IPs to be scheduled for deletion.
     */
    @JsonProperty(value = "reserved_ips")
    private List<String> reservedIps;

    /*
     * An array of unique identifiers for the snapshots to be scheduled for deletion.
     */
    @JsonProperty(value = "snapshots")
    private List<String> snapshots;

    /*
     * An array of unique identifiers for the volumes to be scheduled for deletion.
     */
    @JsonProperty(value = "volumes")
    private List<String> volumes;

    /*
     * An array of unique identifiers for the volume snapshots to be scheduled for deletion.
     */
    @JsonProperty(value = "volume_snapshots")
    private List<String> volumeSnapshots;

    /**
     * Get the floatingIps property: An array of unique identifiers for the floating IPs to be scheduled for deletion.
     *
     * @return the floatingIps value.
     */
    public List<String> getFloatingIps() {
        return this.floatingIps;
    }

    /**
     * Set the floatingIps property: An array of unique identifiers for the floating IPs to be scheduled for deletion.
     *
     * @param floatingIps the floatingIps value to set.
     * @return the SelectiveDestroyAssociatedResource object itself.
     */
    public SelectiveDestroyAssociatedResource setFloatingIps(List<String> floatingIps) {
        this.floatingIps = floatingIps;
        return this;
    }

    /**
     * Get the reservedIps property: An array of unique identifiers for the reserved IPs to be scheduled for deletion.
     *
     * @return the reservedIps value.
     */
    public List<String> getReservedIps() {
        return this.reservedIps;
    }

    /**
     * Set the reservedIps property: An array of unique identifiers for the reserved IPs to be scheduled for deletion.
     *
     * @param reservedIps the reservedIps value to set.
     * @return the SelectiveDestroyAssociatedResource object itself.
     */
    public SelectiveDestroyAssociatedResource setReservedIps(List<String> reservedIps) {
        this.reservedIps = reservedIps;
        return this;
    }

    /**
     * Get the snapshots property: An array of unique identifiers for the snapshots to be scheduled for deletion.
     *
     * @return the snapshots value.
     */
    public List<String> getSnapshots() {
        return this.snapshots;
    }

    /**
     * Set the snapshots property: An array of unique identifiers for the snapshots to be scheduled for deletion.
     *
     * @param snapshots the snapshots value to set.
     * @return the SelectiveDestroyAssociatedResource object itself.
     */
    public SelectiveDestroyAssociatedResource setSnapshots(List<String> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * Get the volumes property: An array of unique identifiers for the volumes to be scheduled for deletion.
     *
     * @return the volumes value.
     */
    public List<String> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: An array of unique identifiers for the volumes to be scheduled for deletion.
     *
     * @param volumes the volumes value to set.
     * @return the SelectiveDestroyAssociatedResource object itself.
     */
    public SelectiveDestroyAssociatedResource setVolumes(List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: An array of unique identifiers for the volume snapshots to be scheduled for
     * deletion.
     *
     * @return the volumeSnapshots value.
     */
    public List<String> getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: An array of unique identifiers for the volume snapshots to be scheduled for
     * deletion.
     *
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the SelectiveDestroyAssociatedResource object itself.
     */
    public SelectiveDestroyAssociatedResource setVolumeSnapshots(List<String> volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }
}
