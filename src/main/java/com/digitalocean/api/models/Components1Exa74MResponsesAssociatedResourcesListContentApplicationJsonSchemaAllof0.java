package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 {
    /*
     * The reserved_ips property.
     */
    @JsonProperty(value = "reserved_ips")
    private List<AssociatedResource> reservedIps;

    /*
     * The floating_ips property.
     */
    @JsonProperty(value = "floating_ips")
    private List<AssociatedResource> floatingIps;

    /*
     * The snapshots property.
     */
    @JsonProperty(value = "snapshots")
    private List<AssociatedResource> snapshots;

    /*
     * The volumes property.
     */
    @JsonProperty(value = "volumes")
    private List<AssociatedResource> volumes;

    /*
     * The volume_snapshots property.
     */
    @JsonProperty(value = "volume_snapshots")
    private List<AssociatedResource> volumeSnapshots;

    /**
     * Get the reservedIps property: The reserved_ips property.
     *
     * @return the reservedIps value.
     */
    public List<AssociatedResource> getReservedIps() {
        return this.reservedIps;
    }

    /**
     * Set the reservedIps property: The reserved_ips property.
     *
     * @param reservedIps the reservedIps value to set.
     * @return the Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 setReservedIps(
            List<AssociatedResource> reservedIps) {
        this.reservedIps = reservedIps;
        return this;
    }

    /**
     * Get the floatingIps property: The floating_ips property.
     *
     * @return the floatingIps value.
     */
    public List<AssociatedResource> getFloatingIps() {
        return this.floatingIps;
    }

    /**
     * Set the floatingIps property: The floating_ips property.
     *
     * @param floatingIps the floatingIps value to set.
     * @return the Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 setFloatingIps(
            List<AssociatedResource> floatingIps) {
        this.floatingIps = floatingIps;
        return this;
    }

    /**
     * Get the snapshots property: The snapshots property.
     *
     * @return the snapshots value.
     */
    public List<AssociatedResource> getSnapshots() {
        return this.snapshots;
    }

    /**
     * Set the snapshots property: The snapshots property.
     *
     * @param snapshots the snapshots value to set.
     * @return the Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 setSnapshots(
            List<AssociatedResource> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * Get the volumes property: The volumes property.
     *
     * @return the volumes value.
     */
    public List<AssociatedResource> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: The volumes property.
     *
     * @param volumes the volumes value to set.
     * @return the Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 setVolumes(
            List<AssociatedResource> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: The volume_snapshots property.
     *
     * @return the volumeSnapshots value.
     */
    public List<AssociatedResource> getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: The volume_snapshots property.
     *
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 setVolumeSnapshots(
            List<AssociatedResource> volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }
}
