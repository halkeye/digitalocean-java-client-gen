package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema model. */
@Fluent
public final class Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema {
    /*
     * The subscription property.
     */
    @JsonProperty(value = "subscription")
    private Subscription subscription;

    /**
     * Get the subscription property: The subscription property.
     *
     * @return the subscription value.
     */
    public Subscription getSubscription() {
        return this.subscription;
    }

    /**
     * Set the subscription property: The subscription property.
     *
     * @param subscription the subscription value to set.
     * @return the Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema object itself.
     */
    public Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema setSubscription(
            Subscription subscription) {
        this.subscription = subscription;
        return this;
    }
}
