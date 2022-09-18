package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems;
import com.digitalocean.api.models.SubscriptionTierBase;
import com.digitalocean.api.models.SubscriptionTierExtendedEligibilityReasonsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItemsTests {
    @Test
    public void testDeserialize() {
        Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems model = BinaryData.fromString("{\"eligible\":true,\"eligibility_reasons\":[\"OverStorageLimit\"],\"name\":\"qwbztilqbzbwb\",\"slug\":\"zhbhfl\",\"included_repositories\":1273666613,\"included_storage_bytes\":1203342325,\"allow_storage_overage\":true,\"included_bandwidth_bytes\":506949252,\"monthly_price_in_cents\":1646695807,\"storage_overage_price_in_cents\":1614061530}").toObject(Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems.class);
        Assertions.assertEquals("qwbztilqbzbwb", model.getName());
        Assertions.assertEquals("zhbhfl", model.getSlug());
        Assertions.assertEquals(1273666613, model.getIncludedRepositories());
        Assertions.assertEquals(1203342325, model.getIncludedStorageBytes());
        Assertions.assertEquals(true, model.isAllowStorageOverage());
        Assertions.assertEquals(506949252, model.getIncludedBandwidthBytes());
        Assertions.assertEquals(1646695807, model.getMonthlyPriceInCents());
        Assertions.assertEquals(1614061530, model.getStorageOveragePriceInCents());
        Assertions.assertEquals(true, model.isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, model.getEligibilityReasons().get(0));
    }

    @Test
    public void testSerialize() {
        Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems model = new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("qwbztilqbzbwb").setSlug("zhbhfl").setIncludedRepositories(1273666613).setIncludedStorageBytes(1203342325).setAllowStorageOverage(true).setIncludedBandwidthBytes(506949252).setMonthlyPriceInCents(1646695807).setStorageOveragePriceInCents(1614061530).setEligible(true).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT));
        model = BinaryData.fromObject(model).toObject(Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems.class);
        Assertions.assertEquals("qwbztilqbzbwb", model.getName());
        Assertions.assertEquals("zhbhfl", model.getSlug());
        Assertions.assertEquals(1273666613, model.getIncludedRepositories());
        Assertions.assertEquals(1203342325, model.getIncludedStorageBytes());
        Assertions.assertEquals(true, model.isAllowStorageOverage());
        Assertions.assertEquals(506949252, model.getIncludedBandwidthBytes());
        Assertions.assertEquals(1646695807, model.getMonthlyPriceInCents());
        Assertions.assertEquals(1614061530, model.getStorageOveragePriceInCents());
        Assertions.assertEquals(true, model.isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, model.getEligibilityReasons().get(0));
    }
}
