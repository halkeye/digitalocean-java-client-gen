package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SubscriptionTierBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SubscriptionTierBaseTests {
    @Test
    public void testDeserialize() {
        SubscriptionTierBase model = BinaryData.fromString("{\"name\":\"xagysokli\",\"slug\":\"s\",\"included_repositories\":1698205031,\"included_storage_bytes\":437815467,\"allow_storage_overage\":true,\"included_bandwidth_bytes\":1737482959,\"monthly_price_in_cents\":1165187891,\"storage_overage_price_in_cents\":856342763}").toObject(SubscriptionTierBase.class);
        Assertions.assertEquals("xagysokli", model.getName());
        Assertions.assertEquals("s", model.getSlug());
        Assertions.assertEquals(1698205031, model.getIncludedRepositories());
        Assertions.assertEquals(437815467, model.getIncludedStorageBytes());
        Assertions.assertEquals(true, model.isAllowStorageOverage());
        Assertions.assertEquals(1737482959, model.getIncludedBandwidthBytes());
        Assertions.assertEquals(1165187891, model.getMonthlyPriceInCents());
        Assertions.assertEquals(856342763, model.getStorageOveragePriceInCents());
    }

    @Test
    public void testSerialize() {
        SubscriptionTierBase model = new SubscriptionTierBase().setName("xagysokli").setSlug("s").setIncludedRepositories(1698205031).setIncludedStorageBytes(437815467).setAllowStorageOverage(true).setIncludedBandwidthBytes(1737482959).setMonthlyPriceInCents(1165187891).setStorageOveragePriceInCents(856342763);
        model = BinaryData.fromObject(model).toObject(SubscriptionTierBase.class);
        Assertions.assertEquals("xagysokli", model.getName());
        Assertions.assertEquals("s", model.getSlug());
        Assertions.assertEquals(1698205031, model.getIncludedRepositories());
        Assertions.assertEquals(437815467, model.getIncludedStorageBytes());
        Assertions.assertEquals(true, model.isAllowStorageOverage());
        Assertions.assertEquals(1737482959, model.getIncludedBandwidthBytes());
        Assertions.assertEquals(1165187891, model.getMonthlyPriceInCents());
        Assertions.assertEquals(856342763, model.getStorageOveragePriceInCents());
    }
}
