package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The SubscriptionTierExtended model.
 */
@Fluent
public class SubscriptionTierExtended {
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
     * @return the SubscriptionTierExtended object itself.
     */
    public SubscriptionTierExtended setEligible(Boolean eligible) {
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
     * @return the SubscriptionTierExtended object itself.
     */
    public SubscriptionTierExtended setEligibilityReasons(List<SubscriptionTierExtendedEligibilityReasonsItem> eligibilityReasons) {
        this.eligibilityReasons = eligibilityReasons;
        return this;
    }
}
