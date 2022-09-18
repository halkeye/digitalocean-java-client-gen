package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema {
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
     * @return the Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema object itself.
     */
    public Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema setImage(Image image) {
        this.image = image;
        return this;
    }
}
