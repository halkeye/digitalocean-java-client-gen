package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema model. */
@Fluent
public final class Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema {
    /*
     * The image property.
     */
    @JsonProperty(value = "image")
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
     * @return the Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema object itself.
     */
    public Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema setImage(Image image) {
        this.image = image;
        return this;
    }
}
