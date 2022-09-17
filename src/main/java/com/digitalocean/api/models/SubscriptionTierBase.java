package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SubscriptionTierBase model. */
@Fluent
public class SubscriptionTierBase {
    /*
     * The name of the subscription tier.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The slug identifier of the subscription tier.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The number of repositories included in the subscription tier. `0` indicates that the subscription tier includes
     * unlimited repositories.
     */
    @JsonProperty(value = "included_repositories")
    private Integer includedRepositories;

    /*
     * The amount of storage included in the subscription tier in bytes.
     */
    @JsonProperty(value = "included_storage_bytes")
    private Integer includedStorageBytes;

    /*
     * A boolean indicating whether the subscription tier supports additional storage above what is included in the
     * base plan at an additional cost per GiB used.
     */
    @JsonProperty(value = "allow_storage_overage")
    private Boolean allowStorageOverage;

    /*
     * The amount of outbound data transfer included in the subscription tier in bytes.
     */
    @JsonProperty(value = "included_bandwidth_bytes")
    private Integer includedBandwidthBytes;

    /*
     * The monthly cost of the subscription tier in cents.
     */
    @JsonProperty(value = "monthly_price_in_cents")
    private Integer monthlyPriceInCents;

    /*
     * The price paid in cents per GiB for additional storage beyond what is included in the subscription plan.
     */
    @JsonProperty(value = "storage_overage_price_in_cents")
    private Integer storageOveragePriceInCents;

    /**
     * Get the name property: The name of the subscription tier.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the subscription tier.
     *
     * @param name the name value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The slug identifier of the subscription tier.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug identifier of the subscription tier.
     *
     * @param slug the slug value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the includedRepositories property: The number of repositories included in the subscription tier. `0`
     * indicates that the subscription tier includes unlimited repositories.
     *
     * @return the includedRepositories value.
     */
    public Integer getIncludedRepositories() {
        return this.includedRepositories;
    }

    /**
     * Set the includedRepositories property: The number of repositories included in the subscription tier. `0`
     * indicates that the subscription tier includes unlimited repositories.
     *
     * @param includedRepositories the includedRepositories value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setIncludedRepositories(Integer includedRepositories) {
        this.includedRepositories = includedRepositories;
        return this;
    }

    /**
     * Get the includedStorageBytes property: The amount of storage included in the subscription tier in bytes.
     *
     * @return the includedStorageBytes value.
     */
    public Integer getIncludedStorageBytes() {
        return this.includedStorageBytes;
    }

    /**
     * Set the includedStorageBytes property: The amount of storage included in the subscription tier in bytes.
     *
     * @param includedStorageBytes the includedStorageBytes value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setIncludedStorageBytes(Integer includedStorageBytes) {
        this.includedStorageBytes = includedStorageBytes;
        return this;
    }

    /**
     * Get the allowStorageOverage property: A boolean indicating whether the subscription tier supports additional
     * storage above what is included in the base plan at an additional cost per GiB used.
     *
     * @return the allowStorageOverage value.
     */
    public Boolean isAllowStorageOverage() {
        return this.allowStorageOverage;
    }

    /**
     * Set the allowStorageOverage property: A boolean indicating whether the subscription tier supports additional
     * storage above what is included in the base plan at an additional cost per GiB used.
     *
     * @param allowStorageOverage the allowStorageOverage value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setAllowStorageOverage(Boolean allowStorageOverage) {
        this.allowStorageOverage = allowStorageOverage;
        return this;
    }

    /**
     * Get the includedBandwidthBytes property: The amount of outbound data transfer included in the subscription tier
     * in bytes.
     *
     * @return the includedBandwidthBytes value.
     */
    public Integer getIncludedBandwidthBytes() {
        return this.includedBandwidthBytes;
    }

    /**
     * Set the includedBandwidthBytes property: The amount of outbound data transfer included in the subscription tier
     * in bytes.
     *
     * @param includedBandwidthBytes the includedBandwidthBytes value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setIncludedBandwidthBytes(Integer includedBandwidthBytes) {
        this.includedBandwidthBytes = includedBandwidthBytes;
        return this;
    }

    /**
     * Get the monthlyPriceInCents property: The monthly cost of the subscription tier in cents.
     *
     * @return the monthlyPriceInCents value.
     */
    public Integer getMonthlyPriceInCents() {
        return this.monthlyPriceInCents;
    }

    /**
     * Set the monthlyPriceInCents property: The monthly cost of the subscription tier in cents.
     *
     * @param monthlyPriceInCents the monthlyPriceInCents value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setMonthlyPriceInCents(Integer monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
        return this;
    }

    /**
     * Get the storageOveragePriceInCents property: The price paid in cents per GiB for additional storage beyond what
     * is included in the subscription plan.
     *
     * @return the storageOveragePriceInCents value.
     */
    public Integer getStorageOveragePriceInCents() {
        return this.storageOveragePriceInCents;
    }

    /**
     * Set the storageOveragePriceInCents property: The price paid in cents per GiB for additional storage beyond what
     * is included in the subscription plan.
     *
     * @param storageOveragePriceInCents the storageOveragePriceInCents value to set.
     * @return the SubscriptionTierBase object itself.
     */
    public SubscriptionTierBase setStorageOveragePriceInCents(Integer storageOveragePriceInCents) {
        this.storageOveragePriceInCents = storageOveragePriceInCents;
        return this;
    }
}
