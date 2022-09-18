package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema {
    /*
     * The 1_clicks property.
     */
    @JsonProperty(value = "1_clicks")
    private List<OneClicks> oneClicks;

    /**
     * Get the oneClicks property: The 1_clicks property.
     * 
     * @return the oneClicks value.
     */
    public List<OneClicks> getOneClicks() {
        return this.oneClicks;
    }

    /**
     * Set the oneClicks property: The 1_clicks property.
     * 
     * @param oneClicks the oneClicks value to set.
     * @return the ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema object itself.
     */
    public ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema setOneClicks(List<OneClicks> oneClicks) {
        this.oneClicks = oneClicks;
        return this;
    }
}
