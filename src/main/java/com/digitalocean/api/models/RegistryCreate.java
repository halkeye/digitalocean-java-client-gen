package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The RegistryCreate model.
 */
@Fluent
public final class RegistryCreate {
    /*
     * A globally unique name for the container registry. Must be lowercase and be composed only of numbers, letters
     * and `-`, up to a limit of 63 characters.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The slug of the subscription tier to sign up for. Valid values can be retrieved using the options endpoint.
     */
    @JsonProperty(value = "subscription_tier_slug", required = true)
    private RegistryCreateSubscriptionTierSlug subscriptionTierSlug;

    /*
     * Slug of the region where registry data is stored. When not provided, a region will be selected.
     */
    @JsonProperty(value = "region")
    private RegistryCreateRegion region;

    /**
     * Get the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @param name the name value to set.
     * @return the RegistryCreate object itself.
     */
    public RegistryCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionTierSlug property: The slug of the subscription tier to sign up for. Valid values can be
     * retrieved using the options endpoint.
     * 
     * @return the subscriptionTierSlug value.
     */
    public RegistryCreateSubscriptionTierSlug getSubscriptionTierSlug() {
        return this.subscriptionTierSlug;
    }

    /**
     * Set the subscriptionTierSlug property: The slug of the subscription tier to sign up for. Valid values can be
     * retrieved using the options endpoint.
     * 
     * @param subscriptionTierSlug the subscriptionTierSlug value to set.
     * @return the RegistryCreate object itself.
     */
    public RegistryCreate setSubscriptionTierSlug(RegistryCreateSubscriptionTierSlug subscriptionTierSlug) {
        this.subscriptionTierSlug = subscriptionTierSlug;
        return this;
    }

    /**
     * Get the region property: Slug of the region where registry data is stored. When not provided, a region will be
     * selected.
     * 
     * @return the region value.
     */
    public RegistryCreateRegion getRegion() {
        return this.region;
    }

    /**
     * Set the region property: Slug of the region where registry data is stored. When not provided, a region will be
     * selected.
     * 
     * @param region the region value to set.
     * @return the RegistryCreate object itself.
     */
    public RegistryCreate setRegion(RegistryCreateRegion region) {
        this.region = region;
        return this;
    }
}
