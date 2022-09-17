package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VolumeActionPostAttach model. */
@Fluent
public final class VolumeActionPostAttach extends VolumeActionPostBase {
    /*
     * The unique identifier for the Droplet the volume will be attached or detached from.
     */
    @JsonProperty(value = "droplet_id", required = true)
    private int dropletId;

    /*
     * A flat array of tag names as strings to be applied to the resource. Tag names may be for either existing or new
     * tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get the dropletId property: The unique identifier for the Droplet the volume will be attached or detached from.
     *
     * @return the dropletId value.
     */
    public int getDropletId() {
        return this.dropletId;
    }

    /**
     * Set the dropletId property: The unique identifier for the Droplet the volume will be attached or detached from.
     *
     * @param dropletId the dropletId value to set.
     * @return the VolumeActionPostAttach object itself.
     */
    public VolumeActionPostAttach setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
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
     * @return the VolumeActionPostAttach object itself.
     */
    public VolumeActionPostAttach setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostAttach setType(VolumeActionPostBaseType type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostAttach setRegion(RegionSlug region) {
        super.setRegion(region);
        return this;
    }
}
