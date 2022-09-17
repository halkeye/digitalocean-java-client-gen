package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The VolumesXfs model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "filesystem_type")
@JsonTypeName("XFS")
@Fluent
public final class VolumesXfs extends VolumeWriteFileSystemType {
    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region", required = true)
    private RegionSlug region;

    /*
     * Any object
     */
    @JsonProperty(value = "filesystem_label")
    private Object filesystemLabel;

    /*
     * The unique identifier for the block storage volume.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * An array containing the IDs of the Droplets the volume is attached to. Note that at this time, a volume can only
     * be attached to a single Droplet.
     */
    @JsonProperty(value = "droplet_ids", access = JsonProperty.Access.WRITE_ONLY)
    private List<Integer> dropletIds;

    /*
     * A human-readable name for the block storage volume. Must be lowercase and be composed only of numbers, letters
     * and "-", up to a limit of 64 characters. The name must begin with a letter.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An optional free-form text field to describe a block storage volume.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The size of the block storage volume in GiB (1024^3).
     */
    @JsonProperty(value = "size_gigabytes")
    private Integer sizeGigabytes;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the block storage volume was
     * created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private String createdAt;

    /*
     * A flat array of tag names as strings to be applied to the resource. Tag names may be for either existing or new
     * tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * The unique identifier for the volume snapshot from which to create the volume.
     */
    @JsonProperty(value = "snapshot_id")
    private String snapshotId;

    /**
     * Get the region property: The slug identifier for the region where the resource will initially be available.
     *
     * @return the region value.
     */
    public RegionSlug getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the resource will initially be available.
     *
     * @param region the region value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setRegion(RegionSlug region) {
        this.region = region;
        return this;
    }

    /**
     * Get the filesystemLabel property: Any object.
     *
     * @return the filesystemLabel value.
     */
    public Object getFilesystemLabel() {
        return this.filesystemLabel;
    }

    /**
     * Set the filesystemLabel property: Any object.
     *
     * @param filesystemLabel the filesystemLabel value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setFilesystemLabel(Object filesystemLabel) {
        this.filesystemLabel = filesystemLabel;
        return this;
    }

    /**
     * Get the id property: The unique identifier for the block storage volume.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets the volume is attached to. Note that at
     * this time, a volume can only be attached to a single Droplet.
     *
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Get the name property: A human-readable name for the block storage volume. Must be lowercase and be composed only
     * of numbers, letters and "-", up to a limit of 64 characters. The name must begin with a letter.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for the block storage volume. Must be lowercase and be composed only
     * of numbers, letters and "-", up to a limit of 64 characters. The name must begin with a letter.
     *
     * @param name the name value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: An optional free-form text field to describe a block storage volume.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: An optional free-form text field to describe a block storage volume.
     *
     * @param description the description value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sizeGigabytes property: The size of the block storage volume in GiB (1024^3).
     *
     * @return the sizeGigabytes value.
     */
    public Integer getSizeGigabytes() {
        return this.sizeGigabytes;
    }

    /**
     * Set the sizeGigabytes property: The size of the block storage volume in GiB (1024^3).
     *
     * @param sizeGigabytes the sizeGigabytes value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setSizeGigabytes(Integer sizeGigabytes) {
        this.sizeGigabytes = sizeGigabytes;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * block storage volume was created.
     *
     * @return the createdAt value.
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     *
     * @param tags the tags value to set.
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

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
     * @return the VolumesXfs object itself.
     */
    public VolumesXfs setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
}
