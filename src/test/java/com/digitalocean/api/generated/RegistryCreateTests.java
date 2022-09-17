package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegistryCreate;
import com.digitalocean.api.models.RegistryCreateRegion;
import com.digitalocean.api.models.RegistryCreateSubscriptionTierSlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegistryCreateTests {
    @Test
    public void testDeserialize() {
        RegistryCreate model =
                BinaryData.fromString(
                                "{\"name\":\"ujcy\",\"subscription_tier_slug\":\"professional\",\"region\":\"nyc3\"}")
                        .toObject(RegistryCreate.class);
        Assertions.assertEquals("ujcy", model.getName());
        Assertions.assertEquals(RegistryCreateSubscriptionTierSlug.PROFESSIONAL, model.getSubscriptionTierSlug());
        Assertions.assertEquals(RegistryCreateRegion.NYC3, model.getRegion());
    }

    @Test
    public void testSerialize() {
        RegistryCreate model =
                new RegistryCreate()
                        .setName("ujcy")
                        .setSubscriptionTierSlug(RegistryCreateSubscriptionTierSlug.PROFESSIONAL)
                        .setRegion(RegistryCreateRegion.NYC3);
        model = BinaryData.fromObject(model).toObject(RegistryCreate.class);
        Assertions.assertEquals("ujcy", model.getName());
        Assertions.assertEquals(RegistryCreateSubscriptionTierSlug.PROFESSIONAL, model.getSubscriptionTierSlug());
        Assertions.assertEquals(RegistryCreateRegion.NYC3, model.getRegion());
    }
}
