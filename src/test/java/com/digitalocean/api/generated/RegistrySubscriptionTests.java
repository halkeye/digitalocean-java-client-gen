package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegistrySubscription;
import com.digitalocean.api.models.SubscriptionTierBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegistrySubscriptionTests {
    @Test
    public void testDeserialize() {
        RegistrySubscription model =
                BinaryData.fromString(
                                "{\"tier\":{\"name\":\"cbpzf\",\"slug\":\"csaugbrhfiwltkfy\",\"included_repositories\":225608257,\"included_storage_bytes\":473787042,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":1308673596,\"monthly_price_in_cents\":889144251,\"storage_overage_price_in_cents\":1781629734},\"created_at\":\"2021-11-16T14:39:03Z\",\"updated_at\":\"2021-07-25T16:36:18Z\"}")
                        .toObject(RegistrySubscription.class);
        Assertions.assertEquals("cbpzf", model.getTier().getName());
        Assertions.assertEquals("csaugbrhfiwltkfy", model.getTier().getSlug());
        Assertions.assertEquals(225608257, model.getTier().getIncludedRepositories());
        Assertions.assertEquals(473787042, model.getTier().getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getTier().isAllowStorageOverage());
        Assertions.assertEquals(1308673596, model.getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(889144251, model.getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1781629734, model.getTier().getStorageOveragePriceInCents());
    }

    @Test
    public void testSerialize() {
        RegistrySubscription model =
                new RegistrySubscription()
                        .setTier(
                                new SubscriptionTierBase()
                                        .setName("cbpzf")
                                        .setSlug("csaugbrhfiwltkfy")
                                        .setIncludedRepositories(225608257)
                                        .setIncludedStorageBytes(473787042)
                                        .setAllowStorageOverage(false)
                                        .setIncludedBandwidthBytes(1308673596)
                                        .setMonthlyPriceInCents(889144251)
                                        .setStorageOveragePriceInCents(1781629734));
        model = BinaryData.fromObject(model).toObject(RegistrySubscription.class);
        Assertions.assertEquals("cbpzf", model.getTier().getName());
        Assertions.assertEquals("csaugbrhfiwltkfy", model.getTier().getSlug());
        Assertions.assertEquals(225608257, model.getTier().getIncludedRepositories());
        Assertions.assertEquals(473787042, model.getTier().getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getTier().isAllowStorageOverage());
        Assertions.assertEquals(1308673596, model.getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(889144251, model.getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1781629734, model.getTier().getStorageOveragePriceInCents());
    }
}
