package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema {
    /*
     * The slug of the subscription tier to sign up for.
     */
    @JsonProperty(value = "tier_slug")
    private PostContentSchemaTierSlug tierSlug;

    /**
     * Get the tierSlug property: The slug of the subscription tier to sign up for.
     *
     * @return the tierSlug value.
     */
    public PostContentSchemaTierSlug getTierSlug() {
        return this.tierSlug;
    }

    /**
     * Set the tierSlug property: The slug of the subscription tier to sign up for.
     *
     * @param tierSlug the tierSlug value to set.
     * @return the Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema setTierSlug(
            PostContentSchemaTierSlug tierSlug) {
        this.tierSlug = tierSlug;
        return this;
    }
}
