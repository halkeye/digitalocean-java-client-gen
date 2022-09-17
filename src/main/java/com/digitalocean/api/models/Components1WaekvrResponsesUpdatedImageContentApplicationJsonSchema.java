package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema model. */
@Fluent
public final class Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema {
    /*
     * The image property.
     */
    @JsonProperty(value = "image", required = true)
    private Image image;

    /**
     * Get the image property: The image property.
     *
     * @return the image value.
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Set the image property: The image property.
     *
     * @param image the image value to set.
     * @return the Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema object itself.
     */
    public Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema setImage(Image image) {
        this.image = image;
        return this;
    }
}
