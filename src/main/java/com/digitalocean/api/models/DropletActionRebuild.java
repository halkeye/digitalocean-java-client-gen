package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The DropletActionRebuild model.
 */
@Fluent
public final class DropletActionRebuild extends DropletAction {
    /*
     * The image ID of a public or private image or the slug identifier for a public image. The Droplet will be rebuilt
     * using this image as its base.
     */
    @JsonProperty(value = "image")
    private Object image;

    /**
     * Get the image property: The image ID of a public or private image or the slug identifier for a public image. The
     * Droplet will be rebuilt using this image as its base.
     * 
     * @return the image value.
     */
    public Object getImage() {
        return this.image;
    }

    /**
     * Set the image property: The image ID of a public or private image or the slug identifier for a public image. The
     * Droplet will be rebuilt using this image as its base.
     * 
     * @param image the image value to set.
     * @return the DropletActionRebuild object itself.
     */
    public DropletActionRebuild setImage(Object image) {
        this.image = image;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletActionRebuild setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
