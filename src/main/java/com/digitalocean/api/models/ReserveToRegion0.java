package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Reserve to Region.
 */
@Fluent
public final class ReserveToRegion0 {
    /*
     * The slug identifier for the region the reserved IP will be reserved to.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /**
     * Get the region property: The slug identifier for the region the reserved IP will be reserved to.
     * 
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region the reserved IP will be reserved to.
     * 
     * @param region the region value to set.
     * @return the ReserveToRegion0 object itself.
     */
    public ReserveToRegion0 setRegion(String region) {
        this.region = region;
        return this;
    }
}
