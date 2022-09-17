package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsGetTierResponse model. */
@Fluent
public final class AppsGetTierResponse {
    /*
     * The tier property.
     */
    @JsonProperty(value = "tier")
    private AppsTier tier;

    /**
     * Get the tier property: The tier property.
     *
     * @return the tier value.
     */
    public AppsTier getTier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier property.
     *
     * @param tier the tier value to set.
     * @return the AppsGetTierResponse object itself.
     */
    public AppsGetTierResponse setTier(AppsTier tier) {
        this.tier = tier;
        return this;
    }
}
