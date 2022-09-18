package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsGetInstanceSizeResponse model.
 */
@Fluent
public final class AppsGetInstanceSizeResponse {
    /*
     * The instance_size property.
     */
    @JsonProperty(value = "instance_size")
    private AppsInstanceSize instanceSize;

    /**
     * Get the instanceSize property: The instance_size property.
     * 
     * @return the instanceSize value.
     */
    public AppsInstanceSize getInstanceSize() {
        return this.instanceSize;
    }

    /**
     * Set the instanceSize property: The instance_size property.
     * 
     * @param instanceSize the instanceSize value to set.
     * @return the AppsGetInstanceSizeResponse object itself.
     */
    public AppsGetInstanceSizeResponse setInstanceSize(AppsInstanceSize instanceSize) {
        this.instanceSize = instanceSize;
        return this;
    }
}
