package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems;
import com.digitalocean.api.models.ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.RegistryOptionsResponseApplicationJsonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"options\":{\"available_regions\":[\"udusdmtxqlefnohe\",\"wvfopkyllrey\",\"nj\",\"w\"],\"subscription_tiers\":[{\"eligible\":false,\"eligibility_reasons\":[],\"name\":\"rsvevcneqswxhqh\",\"slug\":\"htbzvulqevvj\",\"included_repositories\":1612618025,\"included_storage_bytes\":849520881,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":1748233159,\"monthly_price_in_cents\":1900327762,\"storage_overage_price_in_cents\":1025712447},{\"eligible\":true,\"eligibility_reasons\":[],\"name\":\"xmlwk\",\"slug\":\"fbcyjrtalqeebud\",\"included_repositories\":2120737760,\"included_storage_bytes\":54432197,\"allow_storage_overage\":true,\"included_bandwidth_bytes\":2014584581,\"monthly_price_in_cents\":1986605864,\"storage_overage_price_in_cents\":330831932},{\"eligible\":false,\"eligibility_reasons\":[],\"name\":\"hlqwbywa\",\"slug\":\"baeeekfztv\",\"included_repositories\":666401996,\"included_storage_bytes\":675641627,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":2055967188,\"monthly_price_in_cents\":312991851,\"storage_overage_price_in_cents\":1140144638}]}}").toObject(ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("udusdmtxqlefnohe", model.getOptions().getAvailableRegions().get(0));
        Assertions.assertEquals("rsvevcneqswxhqh", model.getOptions().getSubscriptionTiers().get(0).getName());
        Assertions.assertEquals("htbzvulqevvj", model.getOptions().getSubscriptionTiers().get(0).getSlug());
        Assertions.assertEquals(1612618025, model.getOptions().getSubscriptionTiers().get(0).getIncludedRepositories());
        Assertions.assertEquals(849520881, model.getOptions().getSubscriptionTiers().get(0).getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getOptions().getSubscriptionTiers().get(0).isAllowStorageOverage());
        Assertions.assertEquals(1748233159, model.getOptions().getSubscriptionTiers().get(0).getIncludedBandwidthBytes());
        Assertions.assertEquals(1900327762, model.getOptions().getSubscriptionTiers().get(0).getMonthlyPriceInCents());
        Assertions.assertEquals(1025712447, model.getOptions().getSubscriptionTiers().get(0).getStorageOveragePriceInCents());
        Assertions.assertEquals(false, model.getOptions().getSubscriptionTiers().get(0).isEligible());
    }

    @Test
    public void testSerialize() {
        ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema model = new ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema().setOptions(new RegistryOptionsResponseApplicationJsonProperties().setAvailableRegions(Arrays.asList("udusdmtxqlefnohe", "wvfopkyllrey", "nj", "w")).setSubscriptionTiers(Arrays.asList(new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("rsvevcneqswxhqh").setSlug("htbzvulqevvj").setIncludedRepositories(1612618025).setIncludedStorageBytes(849520881).setAllowStorageOverage(false).setIncludedBandwidthBytes(1748233159).setMonthlyPriceInCents(1900327762).setStorageOveragePriceInCents(1025712447).setEligible(false).setEligibilityReasons(Arrays.asList()), new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("xmlwk").setSlug("fbcyjrtalqeebud").setIncludedRepositories(2120737760).setIncludedStorageBytes(54432197).setAllowStorageOverage(true).setIncludedBandwidthBytes(2014584581).setMonthlyPriceInCents(1986605864).setStorageOveragePriceInCents(330831932).setEligible(true).setEligibilityReasons(Arrays.asList()), new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("hlqwbywa").setSlug("baeeekfztv").setIncludedRepositories(666401996).setIncludedStorageBytes(675641627).setAllowStorageOverage(false).setIncludedBandwidthBytes(2055967188).setMonthlyPriceInCents(312991851).setStorageOveragePriceInCents(1140144638).setEligible(false).setEligibilityReasons(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("udusdmtxqlefnohe", model.getOptions().getAvailableRegions().get(0));
        Assertions.assertEquals("rsvevcneqswxhqh", model.getOptions().getSubscriptionTiers().get(0).getName());
        Assertions.assertEquals("htbzvulqevvj", model.getOptions().getSubscriptionTiers().get(0).getSlug());
        Assertions.assertEquals(1612618025, model.getOptions().getSubscriptionTiers().get(0).getIncludedRepositories());
        Assertions.assertEquals(849520881, model.getOptions().getSubscriptionTiers().get(0).getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getOptions().getSubscriptionTiers().get(0).isAllowStorageOverage());
        Assertions.assertEquals(1748233159, model.getOptions().getSubscriptionTiers().get(0).getIncludedBandwidthBytes());
        Assertions.assertEquals(1900327762, model.getOptions().getSubscriptionTiers().get(0).getMonthlyPriceInCents());
        Assertions.assertEquals(1025712447, model.getOptions().getSubscriptionTiers().get(0).getStorageOveragePriceInCents());
        Assertions.assertEquals(false, model.getOptions().getSubscriptionTiers().get(0).isEligible());
    }
}
