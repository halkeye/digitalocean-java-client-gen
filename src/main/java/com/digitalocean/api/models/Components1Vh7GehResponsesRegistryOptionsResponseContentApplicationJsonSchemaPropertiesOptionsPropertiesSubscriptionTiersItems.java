package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The
 * Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems
 * model.
 */
@Fluent
public final class Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems extends SubscriptionTierBase {
    /*
     * A boolean indicating whether your account it eligible to use a certain subscription tier.
     */
    @JsonProperty(value = "eligible")
    private Boolean eligible;

    /*
     * If your account is not eligible to use a certain subscription tier, this will include a list of reasons that
     * prevent you from using the tier.
     */
    @JsonProperty(value = "eligibility_reasons")
    private List<SubscriptionTierExtendedEligibilityReasonsItem> eligibilityReasons;

    /**
     * Get the eligible property: A boolean indicating whether your account it eligible to use a certain subscription
     * tier.
     * 
     * @return the eligible value.
     */
    public Boolean isEligible() {
        return this.eligible;
    }

    /**
     * Set the eligible property: A boolean indicating whether your account it eligible to use a certain subscription
     * tier.
     * 
     * @param eligible the eligible value to set.
     * @return the
     * Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems
     * object itself.
     */
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setEligible(Boolean eligible) {
        this.eligible = eligible;
        return this;
    }

    /**
     * Get the eligibilityReasons property: If your account is not eligible to use a certain subscription tier, this
     * will include a list of reasons that prevent you from using the tier.
     * 
     * @return the eligibilityReasons value.
     */
    public List<SubscriptionTierExtendedEligibilityReasonsItem> getEligibilityReasons() {
        return this.eligibilityReasons;
    }

    /**
     * Set the eligibilityReasons property: If your account is not eligible to use a certain subscription tier, this
     * will include a list of reasons that prevent you from using the tier.
     * 
     * @param eligibilityReasons the eligibilityReasons value to set.
     * @return the
     * Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems
     * object itself.
     */
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setEligibilityReasons(List<SubscriptionTierExtendedEligibilityReasonsItem> eligibilityReasons) {
        this.eligibilityReasons = eligibilityReasons;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setSlug(String slug) {
        super.setSlug(slug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setIncludedRepositories(Integer includedRepositories) {
        super.setIncludedRepositories(includedRepositories);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setIncludedStorageBytes(Integer includedStorageBytes) {
        super.setIncludedStorageBytes(includedStorageBytes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setAllowStorageOverage(Boolean allowStorageOverage) {
        super.setAllowStorageOverage(allowStorageOverage);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setIncludedBandwidthBytes(Integer includedBandwidthBytes) {
        super.setIncludedBandwidthBytes(includedBandwidthBytes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setMonthlyPriceInCents(Integer monthlyPriceInCents) {
        super.setMonthlyPriceInCents(monthlyPriceInCents);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems setStorageOveragePriceInCents(Integer storageOveragePriceInCents) {
        super.setStorageOveragePriceInCents(storageOveragePriceInCents);
        return this;
    }
}
