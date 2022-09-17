package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RegistryOptionsResponseApplicationJsonProperties model. */
@Fluent
public final class RegistryOptionsResponseApplicationJsonProperties {
    /*
     * The available_regions property.
     */
    @JsonProperty(value = "available_regions")
    private List<String> availableRegions;

    /*
     * The subscription_tiers property.
     */
    @JsonProperty(value = "subscription_tiers")
    private List<
                    Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems>
            subscriptionTiers;

    /**
     * Get the availableRegions property: The available_regions property.
     *
     * @return the availableRegions value.
     */
    public List<String> getAvailableRegions() {
        return this.availableRegions;
    }

    /**
     * Set the availableRegions property: The available_regions property.
     *
     * @param availableRegions the availableRegions value to set.
     * @return the RegistryOptionsResponseApplicationJsonProperties object itself.
     */
    public RegistryOptionsResponseApplicationJsonProperties setAvailableRegions(List<String> availableRegions) {
        this.availableRegions = availableRegions;
        return this;
    }

    /**
     * Get the subscriptionTiers property: The subscription_tiers property.
     *
     * @return the subscriptionTiers value.
     */
    public List<
                    Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems>
            getSubscriptionTiers() {
        return this.subscriptionTiers;
    }

    /**
     * Set the subscriptionTiers property: The subscription_tiers property.
     *
     * @param subscriptionTiers the subscriptionTiers value to set.
     * @return the RegistryOptionsResponseApplicationJsonProperties object itself.
     */
    public RegistryOptionsResponseApplicationJsonProperties setSubscriptionTiers(
            List<
                            Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems>
                    subscriptionTiers) {
        this.subscriptionTiers = subscriptionTiers;
        return this;
    }
}
