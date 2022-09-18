package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppsListRegionsResponse model.
 */
@Fluent
public final class AppsListRegionsResponse {
    /*
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<AppsRegion> regions;

    /**
     * Get the regions property: The regions property.
     * 
     * @return the regions value.
     */
    public List<AppsRegion> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     * 
     * @param regions the regions value to set.
     * @return the AppsListRegionsResponse object itself.
     */
    public AppsListRegionsResponse setRegions(List<AppsRegion> regions) {
        this.regions = regions;
        return this;
    }
}
