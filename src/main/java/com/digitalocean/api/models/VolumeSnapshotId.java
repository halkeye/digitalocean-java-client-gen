package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VolumeSnapshotId model. */
@Fluent
public class VolumeSnapshotId {
    /*
     * The unique identifier for the volume snapshot from which to create the volume.
     */
    @JsonProperty(value = "snapshot_id")
    private String snapshotId;

    /**
     * Get the snapshotId property: The unique identifier for the volume snapshot from which to create the volume.
     *
     * @return the snapshotId value.
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * Set the snapshotId property: The unique identifier for the volume snapshot from which to create the volume.
     *
     * @param snapshotId the snapshotId value to set.
     * @return the VolumeSnapshotId object itself.
     */
    public VolumeSnapshotId setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
}
