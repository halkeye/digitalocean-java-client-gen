package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SubscriptionTierExtended;
import com.digitalocean.api.models.SubscriptionTierExtendedEligibilityReasonsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SubscriptionTierExtendedTests {
    @Test
    public void testDeserialize() {
        SubscriptionTierExtended model = BinaryData.fromString("{\"eligible\":true,\"eligibility_reasons\":[\"OverRepositoryLimit\"]}").toObject(SubscriptionTierExtended.class);
        Assertions.assertEquals(true, model.isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT, model.getEligibilityReasons().get(0));
    }

    @Test
    public void testSerialize() {
        SubscriptionTierExtended model = new SubscriptionTierExtended().setEligible(true).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT));
        model = BinaryData.fromObject(model).toObject(SubscriptionTierExtended.class);
        Assertions.assertEquals(true, model.isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT, model.getEligibilityReasons().get(0));
    }
}
