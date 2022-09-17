package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VolumeActionPostResize model. */
@Fluent
public final class VolumeActionPostResize extends VolumeActionPostBase {
    /*
     * The new size of the block storage volume in GiB (1024^3).
     */
    @JsonProperty(value = "size_gigabytes", required = true)
    private int sizeGigabytes;

    /**
     * Get the sizeGigabytes property: The new size of the block storage volume in GiB (1024^3).
     *
     * @return the sizeGigabytes value.
     */
    public int getSizeGigabytes() {
        return this.sizeGigabytes;
    }

    /**
     * Set the sizeGigabytes property: The new size of the block storage volume in GiB (1024^3).
     *
     * @param sizeGigabytes the sizeGigabytes value to set.
     * @return the VolumeActionPostResize object itself.
     */
    public VolumeActionPostResize setSizeGigabytes(int sizeGigabytes) {
        this.sizeGigabytes = sizeGigabytes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostResize setType(VolumeActionPostBaseType type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostResize setRegion(RegionSlug region) {
        super.setRegion(region);
        return this;
    }
}
