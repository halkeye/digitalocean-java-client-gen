package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The RegionList model.
 */
@Fluent
public class RegionList {
    /*
     * The regions property.
     */
    @JsonProperty(value = "regions", required = true)
    private List<Region> regions;

    /**
     * Get the regions property: The regions property.
     * 
     * @return the regions value.
     */
    public List<Region> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     * 
     * @param regions the regions value to set.
     * @return the RegionList object itself.
     */
    public RegionList setRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }
}
