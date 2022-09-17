package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The RegistrySubscription model. */
@Fluent
public final class RegistrySubscription extends Subscription {
    /** {@inheritDoc} */
    @Override
    public RegistrySubscription setTier(SubscriptionTierBase tier) {
        super.setTier(tier);
        return this;
    }
}
