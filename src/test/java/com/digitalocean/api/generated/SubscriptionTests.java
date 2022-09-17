package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Subscription;
import com.digitalocean.api.models.SubscriptionTierBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SubscriptionTests {
    @Test
    public void testDeserialize() {
        Subscription model =
                BinaryData.fromString(
                                "{\"tier\":{\"name\":\"gqokjbmsrk\",\"slug\":\"yxxhwrlqom\",\"included_repositories\":1725463021,\"included_storage_bytes\":789600653,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":86867819,\"monthly_price_in_cents\":1364902399,\"storage_overage_price_in_cents\":745842544},\"created_at\":\"2021-05-31T20:29:17Z\",\"updated_at\":\"2021-11-12T12:18Z\"}")
                        .toObject(Subscription.class);
        Assertions.assertEquals("gqokjbmsrk", model.getTier().getName());
        Assertions.assertEquals("yxxhwrlqom", model.getTier().getSlug());
        Assertions.assertEquals(1725463021, model.getTier().getIncludedRepositories());
        Assertions.assertEquals(789600653, model.getTier().getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getTier().isAllowStorageOverage());
        Assertions.assertEquals(86867819, model.getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(1364902399, model.getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(745842544, model.getTier().getStorageOveragePriceInCents());
    }

    @Test
    public void testSerialize() {
        Subscription model =
                new Subscription()
                        .setTier(
                                new SubscriptionTierBase()
                                        .setName("gqokjbmsrk")
                                        .setSlug("yxxhwrlqom")
                                        .setIncludedRepositories(1725463021)
                                        .setIncludedStorageBytes(789600653)
                                        .setAllowStorageOverage(false)
                                        .setIncludedBandwidthBytes(86867819)
                                        .setMonthlyPriceInCents(1364902399)
                                        .setStorageOveragePriceInCents(745842544));
        model = BinaryData.fromObject(model).toObject(Subscription.class);
        Assertions.assertEquals("gqokjbmsrk", model.getTier().getName());
        Assertions.assertEquals("yxxhwrlqom", model.getTier().getSlug());
        Assertions.assertEquals(1725463021, model.getTier().getIncludedRepositories());
        Assertions.assertEquals(789600653, model.getTier().getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getTier().isAllowStorageOverage());
        Assertions.assertEquals(86867819, model.getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(1364902399, model.getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(745842544, model.getTier().getStorageOveragePriceInCents());
    }
}
