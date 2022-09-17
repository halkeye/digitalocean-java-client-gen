package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Subscription model. */
@Fluent
public class Subscription {
    /*
     * The tier property.
     */
    @JsonProperty(value = "tier")
    private SubscriptionTierBase tier;

    /*
     * The time at which the subscription was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time at which the subscription was last updated.
     */
    @JsonProperty(value = "updated_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /**
     * Get the tier property: The tier property.
     *
     * @return the tier value.
     */
    public SubscriptionTierBase getTier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier property.
     *
     * @param tier the tier value to set.
     * @return the Subscription object itself.
     */
    public Subscription setTier(SubscriptionTierBase tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the createdAt property: The time at which the subscription was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time at which the subscription was last updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
}
