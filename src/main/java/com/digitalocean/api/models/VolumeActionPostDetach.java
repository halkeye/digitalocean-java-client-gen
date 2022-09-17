package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VolumeActionPostDetach model. */
@Fluent
public final class VolumeActionPostDetach extends VolumeActionPostBase {
    /*
     * The unique identifier for the Droplet the volume will be attached or detached from.
     */
    @JsonProperty(value = "droplet_id", required = true)
    private int dropletId;

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
     * @return the VolumeActionPostDetach object itself.
     */
    public VolumeActionPostDetach setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostDetach setType(VolumeActionPostBaseType type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeActionPostDetach setRegion(RegionSlug region) {
        super.setRegion(region);
        return this;
    }
}
