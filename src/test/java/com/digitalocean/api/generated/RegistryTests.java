package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Registry;
import com.digitalocean.api.models.RegistrySubscription;
import com.digitalocean.api.models.SubscriptionTierBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegistryTests {
    @Test
    public void testDeserialize() {
        Registry model =
                BinaryData.fromString(
                                "{\"name\":\"fkvg\",\"created_at\":\"2021-08-02T21:10:37Z\",\"region\":\"tuxlbpxrhrfjen\",\"storage_usage_bytes\":1045878056,\"storage_usage_bytes_updated_at\":\"2021-09-16T19:55:40Z\",\"subscription\":{\"tier\":{\"name\":\"tlhqas\",\"slug\":\"ostjixyz\",\"included_repositories\":963766917,\"included_storage_bytes\":1671356692,\"allow_storage_overage\":true,\"included_bandwidth_bytes\":2130673798,\"monthly_price_in_cents\":819938698,\"storage_overage_price_in_cents\":1089497944},\"created_at\":\"2021-11-28T05:08:17Z\",\"updated_at\":\"2021-03-24T23:03:03Z\"}}")
                        .toObject(Registry.class);
        Assertions.assertEquals("fkvg", model.getName());
        Assertions.assertEquals("tuxlbpxrhrfjen", model.getRegion());
        Assertions.assertEquals("tlhqas", model.getSubscription().getTier().getName());
        Assertions.assertEquals("ostjixyz", model.getSubscription().getTier().getSlug());
        Assertions.assertEquals(963766917, model.getSubscription().getTier().getIncludedRepositories());
        Assertions.assertEquals(1671356692, model.getSubscription().getTier().getIncludedStorageBytes());
        Assertions.assertEquals(true, model.getSubscription().getTier().isAllowStorageOverage());
        Assertions.assertEquals(2130673798, model.getSubscription().getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(819938698, model.getSubscription().getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1089497944, model.getSubscription().getTier().getStorageOveragePriceInCents());
    }

    @Test
    public void testSerialize() {
        Registry model =
                new Registry()
                        .setName("fkvg")
                        .setRegion("tuxlbpxrhrfjen")
                        .setSubscription(
                                new RegistrySubscription()
                                        .setTier(
                                                new SubscriptionTierBase()
                                                        .setName("tlhqas")
                                                        .setSlug("ostjixyz")
                                                        .setIncludedRepositories(963766917)
                                                        .setIncludedStorageBytes(1671356692)
                                                        .setAllowStorageOverage(true)
                                                        .setIncludedBandwidthBytes(2130673798)
                                                        .setMonthlyPriceInCents(819938698)
                                                        .setStorageOveragePriceInCents(1089497944)));
        model = BinaryData.fromObject(model).toObject(Registry.class);
        Assertions.assertEquals("fkvg", model.getName());
        Assertions.assertEquals("tuxlbpxrhrfjen", model.getRegion());
        Assertions.assertEquals("tlhqas", model.getSubscription().getTier().getName());
        Assertions.assertEquals("ostjixyz", model.getSubscription().getTier().getSlug());
        Assertions.assertEquals(963766917, model.getSubscription().getTier().getIncludedRepositories());
        Assertions.assertEquals(1671356692, model.getSubscription().getTier().getIncludedStorageBytes());
        Assertions.assertEquals(true, model.getSubscription().getTier().isAllowStorageOverage());
        Assertions.assertEquals(2130673798, model.getSubscription().getTier().getIncludedBandwidthBytes());
        Assertions.assertEquals(819938698, model.getSubscription().getTier().getMonthlyPriceInCents());
        Assertions.assertEquals(1089497944, model.getSubscription().getTier().getStorageOveragePriceInCents());
    }
}
