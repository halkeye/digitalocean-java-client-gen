package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SubscriptionTierExtendedEligibilityReasonsItem.
 */
public final class SubscriptionTierExtendedEligibilityReasonsItem extends ExpandableStringEnum<SubscriptionTierExtendedEligibilityReasonsItem> {
    /**
     * Static value OverRepositoryLimit for SubscriptionTierExtendedEligibilityReasonsItem.
     */
    public static final SubscriptionTierExtendedEligibilityReasonsItem OVER_REPOSITORY_LIMIT = fromString("OverRepositoryLimit");

    /**
     * Static value OverStorageLimit for SubscriptionTierExtendedEligibilityReasonsItem.
     */
    public static final SubscriptionTierExtendedEligibilityReasonsItem OVER_STORAGE_LIMIT = fromString("OverStorageLimit");

    /**
     * Creates or finds a SubscriptionTierExtendedEligibilityReasonsItem from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SubscriptionTierExtendedEligibilityReasonsItem.
     */
    @JsonCreator
    public static SubscriptionTierExtendedEligibilityReasonsItem fromString(String name) {
        return fromString(name, SubscriptionTierExtendedEligibilityReasonsItem.class);
    }

    /**
     * Gets known SubscriptionTierExtendedEligibilityReasonsItem values.
     * 
     * @return known SubscriptionTierExtendedEligibilityReasonsItem values.
     */
    public static Collection<SubscriptionTierExtendedEligibilityReasonsItem> values() {
        return values(SubscriptionTierExtendedEligibilityReasonsItem.class);
    }
}
