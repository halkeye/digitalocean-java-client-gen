package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsListTiersResponse model. */
@Fluent
public final class AppsListTiersResponse {
    /*
     * The tiers property.
     */
    @JsonProperty(value = "tiers")
    private List<AppsTier> tiers;

    /**
     * Get the tiers property: The tiers property.
     *
     * @return the tiers value.
     */
    public List<AppsTier> getTiers() {
        return this.tiers;
    }

    /**
     * Set the tiers property: The tiers property.
     *
     * @param tiers the tiers value to set.
     * @return the AppsListTiersResponse object itself.
     */
    public AppsListTiersResponse setTiers(List<AppsTier> tiers) {
        this.tiers = tiers;
        return this;
    }
}
