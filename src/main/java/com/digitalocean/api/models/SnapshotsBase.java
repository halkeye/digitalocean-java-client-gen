package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The SnapshotsBase model. */
@Fluent
public class SnapshotsBase {
    /*
     * A human-readable name for the snapshot.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the snapshot was created.
     */
    @JsonProperty(value = "created_at", required = true)
    private OffsetDateTime createdAt;

    /*
     * An array of the regions that the snapshot is available in. The regions are represented by their identifying slug
     * values.
     */
    @JsonProperty(value = "regions", required = true)
    private List<String> regions;

    /*
     * The minimum size in GB required for a volume or Droplet to use this snapshot.
     */
    @JsonProperty(value = "min_disk_size", required = true)
    private int minDiskSize;

    /*
     * The billable size of the snapshot in gigabytes.
     */
    @JsonProperty(value = "size_gigabytes", required = true)
    private float sizeGigabytes;

    /**
     * Get the name property: A human-readable name for the snapshot.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for the snapshot.
     *
     * @param name the name value to set.
     * @return the SnapshotsBase object itself.
     */
    public SnapshotsBase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * snapshot was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * snapshot was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the SnapshotsBase object itself.
     */
    public SnapshotsBase setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the regions property: An array of the regions that the snapshot is available in. The regions are represented
     * by their identifying slug values.
     *
     * @return the regions value.
     */
    public List<String> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: An array of the regions that the snapshot is available in. The regions are represented
     * by their identifying slug values.
     *
     * @param regions the regions value to set.
     * @return the SnapshotsBase object itself.
     */
    public SnapshotsBase setRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the minDiskSize property: The minimum size in GB required for a volume or Droplet to use this snapshot.
     *
     * @return the minDiskSize value.
     */
    public int getMinDiskSize() {
        return this.minDiskSize;
    }

    /**
     * Set the minDiskSize property: The minimum size in GB required for a volume or Droplet to use this snapshot.
     *
     * @param minDiskSize the minDiskSize value to set.
     * @return the SnapshotsBase object itself.
     */
    public SnapshotsBase setMinDiskSize(int minDiskSize) {
        this.minDiskSize = minDiskSize;
        return this;
    }

    /**
     * Get the sizeGigabytes property: The billable size of the snapshot in gigabytes.
     *
     * @return the sizeGigabytes value.
     */
    public float getSizeGigabytes() {
        return this.sizeGigabytes;
    }

    /**
     * Set the sizeGigabytes property: The billable size of the snapshot in gigabytes.
     *
     * @param sizeGigabytes the sizeGigabytes value to set.
     * @return the SnapshotsBase object itself.
     */
    public SnapshotsBase setSizeGigabytes(float sizeGigabytes) {
        this.sizeGigabytes = sizeGigabytes;
        return this;
    }
}
