package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImageActionTransfer model. */
@Fluent
public final class ImageActionTransfer extends ImageActionBase {
    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region", required = true)
    private RegionSlug region;

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
     * @return the ImageActionTransfer object itself.
     */
    public ImageActionTransfer setRegion(RegionSlug region) {
        this.region = region;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageActionTransfer setType(ImageActionBaseType type) {
        super.setType(type);
        return this;
    }
}
