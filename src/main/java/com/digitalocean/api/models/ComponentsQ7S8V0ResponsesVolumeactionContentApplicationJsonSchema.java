package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema {
    /*
     * The action property.
     */
    @JsonProperty(value = "action")
    private VolumeAction action;

    /**
     * Get the action property: The action property.
     * 
     * @return the action value.
     */
    public VolumeAction getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action property.
     * 
     * @param action the action value to set.
     * @return the ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema object itself.
     */
    public ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema setAction(VolumeAction action) {
        this.action = action;
        return this;
    }
}
