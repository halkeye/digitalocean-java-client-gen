package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DatabaseRegionOptions model.
 */
@Immutable
public class DatabaseRegionOptions {
    /*
     * An array of strings containing the names of available regions
     */
    @JsonProperty(value = "regions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> regions;

    /**
     * Get the regions property: An array of strings containing the names of available regions.
     * 
     * @return the regions value.
     */
    public List<String> getRegions() {
        return this.regions;
    }
}
