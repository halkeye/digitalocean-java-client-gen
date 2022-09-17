package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DropletActionRestore model. */
@Fluent
public final class DropletActionRestore extends DropletAction {
    /*
     * The ID of a backup of the current Droplet instance to restore from.
     */
    @JsonProperty(value = "image")
    private Integer image;

    /**
     * Get the image property: The ID of a backup of the current Droplet instance to restore from.
     *
     * @return the image value.
     */
    public Integer getImage() {
        return this.image;
    }

    /**
     * Set the image property: The ID of a backup of the current Droplet instance to restore from.
     *
     * @param image the image value to set.
     * @return the DropletActionRestore object itself.
     */
    public DropletActionRestore setImage(Integer image) {
        this.image = image;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DropletActionRestore setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
