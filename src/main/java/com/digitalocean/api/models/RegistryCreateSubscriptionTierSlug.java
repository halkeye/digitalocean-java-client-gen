package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The slug of the subscription tier to sign up for. Valid values can be retrieved using the options endpoint.
 */
public final class RegistryCreateSubscriptionTierSlug extends ExpandableStringEnum<RegistryCreateSubscriptionTierSlug> {
    /**
     * Static value starter for RegistryCreateSubscriptionTierSlug.
     */
    public static final RegistryCreateSubscriptionTierSlug STARTER = fromString("starter");

    /**
     * Static value basic for RegistryCreateSubscriptionTierSlug.
     */
    public static final RegistryCreateSubscriptionTierSlug BASIC = fromString("basic");

    /**
     * Static value professional for RegistryCreateSubscriptionTierSlug.
     */
    public static final RegistryCreateSubscriptionTierSlug PROFESSIONAL = fromString("professional");

    /**
     * Creates or finds a RegistryCreateSubscriptionTierSlug from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RegistryCreateSubscriptionTierSlug.
     */
    @JsonCreator
    public static RegistryCreateSubscriptionTierSlug fromString(String name) {
        return fromString(name, RegistryCreateSubscriptionTierSlug.class);
    }

    /**
     * Gets known RegistryCreateSubscriptionTierSlug values.
     * 
     * @return known RegistryCreateSubscriptionTierSlug values.
     */
    public static Collection<RegistryCreateSubscriptionTierSlug> values() {
        return values(RegistryCreateSubscriptionTierSlug.class);
    }
}
