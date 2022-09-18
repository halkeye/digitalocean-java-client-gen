package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Subscription;
import com.digitalocean.api.models.SubscriptionTierBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"subscription\":{\"tier\":{\"name\":\"pstizsyqagqllcb\",\"slug\":\"aidyl\",\"included_repositories\":2106525612,\"included_storage_bytes\":536739646,\"allow_storage_overage\":true,\"included_bandwidth_bytes\":112409200,\"monthly_price_in_cents\":1838829901,\"storage_overage_price_in_cents\":1600689171},\"created_at\":\"2020-12-26T15:03:15Z\",\"updated_at\":\"2021-09-13T10:05:41Z\"}}").toObject(Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("pstizsyqagqllcb", model.getSubscription().getTier().getName());
        Assertions.assertEquals("aidyl", model.getSubscription().getTier().getSlug());
        Assertions.assertEquals(2106525612, model.getSubscription().getTier().getIncludedRepositories());
        Assertions.assertEquals(536739646, model.getSubscription().getTier().getIncludedStorageBytes());
        Assertions.assertEquals(true, model.getSubscription().getTier().isAllowStorageOverage());
        Assertions.assertEquals(112409200, model.getSubscription().getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(1838829901, model.getSubscription().getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1600689171, model.getSubscription().getTier().getStorageOveragePriceInCents());
    }

    @Test
    public void testSerialize() {
        Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema model = new Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema().setSubscription(new Subscription().setTier(new SubscriptionTierBase().setName("pstizsyqagqllcb").setSlug("aidyl").setIncludedRepositories(2106525612).setIncludedStorageBytes(536739646).setAllowStorageOverage(true).setIncludedBandwidthBytes(112409200).setMonthlyPriceInCents(1838829901).setStorageOveragePriceInCents(1600689171)));
        model = BinaryData.fromObject(model).toObject(Components1Ie0A5GResponsesSubscriptionResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("pstizsyqagqllcb", model.getSubscription().getTier().getName());
        Assertions.assertEquals("aidyl", model.getSubscription().getTier().getSlug());
        Assertions.assertEquals(2106525612, model.getSubscription().getTier().getIncludedRepositories());
        Assertions.assertEquals(536739646, model.getSubscription().getTier().getIncludedStorageBytes());
        Assertions.assertEquals(true, model.getSubscription().getTier().isAllowStorageOverage());
        Assertions.assertEquals(112409200, model.getSubscription().getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(1838829901, model.getSubscription().getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1600689171, model.getSubscription().getTier().getStorageOveragePriceInCents());
    }
}
