package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * The RegistrySubscription model.
 */
@Fluent
public final class RegistrySubscription extends Subscription {
    /**
     * {@inheritDoc}
     */
    @Override
    public RegistrySubscription setTier(SubscriptionTierBase tier) {
        super.setTier(tier);
        return this;
    }
}
