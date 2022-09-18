package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 {
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
     * @return the Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 setRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }
}
