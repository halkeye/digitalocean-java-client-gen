package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems;
import com.digitalocean.api.models.RegistryOptionsResponseApplicationJsonProperties;
import com.digitalocean.api.models.SubscriptionTierExtendedEligibilityReasonsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegistryOptionsResponseApplicationJsonPropertiesTests {
    @Test
    public void testDeserialize() {
        RegistryOptionsResponseApplicationJsonProperties model = BinaryData.fromString("{\"available_regions\":[\"xhmewyaol\",\"lzxkrdpuyyt\",\"pkrpkhqetpoe\"],\"subscription_tiers\":[{\"eligible\":false,\"eligibility_reasons\":[\"OverRepositoryLimit\"],\"name\":\"nrxiyrxow\",\"slug\":\"ufcmuajwblxp\",\"included_repositories\":942163314,\"included_storage_bytes\":989975634,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":1270563817,\"monthly_price_in_cents\":1556184463,\"storage_overage_price_in_cents\":556988146},{\"eligible\":false,\"eligibility_reasons\":[\"OverStorageLimit\",\"OverStorageLimit\",\"OverRepositoryLimit\"],\"name\":\"htibufgz\",\"slug\":\"h\",\"included_repositories\":1919382389,\"included_storage_bytes\":2109140215,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":2018719493,\"monthly_price_in_cents\":737774627,\"storage_overage_price_in_cents\":352932012},{\"eligible\":true,\"eligibility_reasons\":[\"OverStorageLimit\",\"OverStorageLimit\",\"OverStorageLimit\",\"OverStorageLimit\"],\"name\":\"jxdumhycxonebld\",\"slug\":\"gmdfjwc\",\"included_repositories\":792135044,\"included_storage_bytes\":1501932061,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":1493112239,\"monthly_price_in_cents\":1797900196,\"storage_overage_price_in_cents\":76327917},{\"eligible\":true,\"eligibility_reasons\":[\"OverStorageLimit\"],\"name\":\"rpjuvgzacr\",\"slug\":\"nsbylgmgbh\",\"included_repositories\":1378560905,\"included_storage_bytes\":1050376390,\"allow_storage_overage\":false,\"included_bandwidth_bytes\":1651287638,\"monthly_price_in_cents\":254771931,\"storage_overage_price_in_cents\":275550546}]}").toObject(RegistryOptionsResponseApplicationJsonProperties.class);
        Assertions.assertEquals("xhmewyaol", model.getAvailableRegions().get(0));
        Assertions.assertEquals("nrxiyrxow", model.getSubscriptionTiers().get(0).getName());
        Assertions.assertEquals("ufcmuajwblxp", model.getSubscriptionTiers().get(0).getSlug());
        Assertions.assertEquals(942163314, model.getSubscriptionTiers().get(0).getIncludedRepositories());
        Assertions.assertEquals(989975634, model.getSubscriptionTiers().get(0).getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getSubscriptionTiers().get(0).isAllowStorageOverage());
        Assertions.assertEquals(1270563817, model.getSubscriptionTiers().get(0).getIncludedBandwidthBytes());
        Assertions.assertEquals(1556184463, model.getSubscriptionTiers().get(0).getMonthlyPriceInCents());
        Assertions.assertEquals(556988146, model.getSubscriptionTiers().get(0).getStorageOveragePriceInCents());
        Assertions.assertEquals(false, model.getSubscriptionTiers().get(0).isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT, model.getSubscriptionTiers().get(0).getEligibilityReasons().get(0));
    }

    @Test
    public void testSerialize() {
        RegistryOptionsResponseApplicationJsonProperties model = new RegistryOptionsResponseApplicationJsonProperties().setAvailableRegions(Arrays.asList("xhmewyaol", "lzxkrdpuyyt", "pkrpkhqetpoe")).setSubscriptionTiers(Arrays.asList(new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("nrxiyrxow").setSlug("ufcmuajwblxp").setIncludedRepositories(942163314).setIncludedStorageBytes(989975634).setAllowStorageOverage(false).setIncludedBandwidthBytes(1270563817).setMonthlyPriceInCents(1556184463).setStorageOveragePriceInCents(556988146).setEligible(false).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT)), new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("htibufgz").setSlug("h").setIncludedRepositories(1919382389).setIncludedStorageBytes(2109140215).setAllowStorageOverage(false).setIncludedBandwidthBytes(2018719493).setMonthlyPriceInCents(737774627).setStorageOveragePriceInCents(352932012).setEligible(false).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT)), new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("jxdumhycxonebld").setSlug("gmdfjwc").setIncludedRepositories(792135044).setIncludedStorageBytes(1501932061).setAllowStorageOverage(false).setIncludedBandwidthBytes(1493112239).setMonthlyPriceInCents(1797900196).setStorageOveragePriceInCents(76327917).setEligible(true).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT, SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT)), new Components1Vh7GehResponsesRegistryOptionsResponseContentApplicationJsonSchemaPropertiesOptionsPropertiesSubscriptionTiersItems().setName("rpjuvgzacr").setSlug("nsbylgmgbh").setIncludedRepositories(1378560905).setIncludedStorageBytes(1050376390).setAllowStorageOverage(false).setIncludedBandwidthBytes(1651287638).setMonthlyPriceInCents(254771931).setStorageOveragePriceInCents(275550546).setEligible(true).setEligibilityReasons(Arrays.asList(SubscriptionTierExtendedEligibilityReasonsItem.OVER_STORAGE_LIMIT))));
        model = BinaryData.fromObject(model).toObject(RegistryOptionsResponseApplicationJsonProperties.class);
        Assertions.assertEquals("xhmewyaol", model.getAvailableRegions().get(0));
        Assertions.assertEquals("nrxiyrxow", model.getSubscriptionTiers().get(0).getName());
        Assertions.assertEquals("ufcmuajwblxp", model.getSubscriptionTiers().get(0).getSlug());
        Assertions.assertEquals(942163314, model.getSubscriptionTiers().get(0).getIncludedRepositories());
        Assertions.assertEquals(989975634, model.getSubscriptionTiers().get(0).getIncludedStorageBytes());
        Assertions.assertEquals(false, model.getSubscriptionTiers().get(0).isAllowStorageOverage());
        Assertions.assertEquals(1270563817, model.getSubscriptionTiers().get(0).getIncludedBandwidthBytes());
        Assertions.assertEquals(1556184463, model.getSubscriptionTiers().get(0).getMonthlyPriceInCents());
        Assertions.assertEquals(556988146, model.getSubscriptionTiers().get(0).getStorageOveragePriceInCents());
        Assertions.assertEquals(false, model.getSubscriptionTiers().get(0).isEligible());
        Assertions.assertEquals(SubscriptionTierExtendedEligibilityReasonsItem.OVER_REPOSITORY_LIMIT, model.getSubscriptionTiers().get(0).getEligibilityReasons().get(0));
    }
}
