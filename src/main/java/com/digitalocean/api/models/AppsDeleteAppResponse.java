package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsDeleteAppResponse model.
 */
@Fluent
public final class AppsDeleteAppResponse {
    /*
     * The ID of the app that was deleted
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The ID of the app that was deleted.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the app that was deleted.
     * 
     * @param id the id value to set.
     * @return the AppsDeleteAppResponse object itself.
     */
    public AppsDeleteAppResponse setId(String id) {
        this.id = id;
        return this;
    }
}
