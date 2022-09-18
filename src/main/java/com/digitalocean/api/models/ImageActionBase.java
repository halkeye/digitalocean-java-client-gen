package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The ImageActionBase model.
 */
@Fluent
public class ImageActionBase {
    /*
     * The action to be taken on the image. Can be either `convert` or `transfer`.
     */
    @JsonProperty(value = "type", required = true)
    private ImageActionBaseType type;

    /**
     * Get the type property: The action to be taken on the image. Can be either `convert` or `transfer`.
     * 
     * @return the type value.
     */
    public ImageActionBaseType getType() {
        return this.type;
    }

    /**
     * Set the type property: The action to be taken on the image. Can be either `convert` or `transfer`.
     * 
     * @param type the type value to set.
     * @return the ImageActionBase object itself.
     */
    public ImageActionBase setType(ImageActionBaseType type) {
        this.type = type;
        return this;
    }
}
