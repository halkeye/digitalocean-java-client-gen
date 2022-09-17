package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reserve to Region. */
@Fluent
public final class ReserveToRegion {
    /*
     * The slug identifier for the region the floating IP will be reserved to.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /**
     * Get the region property: The slug identifier for the region the floating IP will be reserved to.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region the floating IP will be reserved to.
     *
     * @param region the region value to set.
     * @return the ReserveToRegion object itself.
     */
    public ReserveToRegion setRegion(String region) {
        this.region = region;
        return this;
    }
}
