package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PostContentSchemaTierSlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"tier_slug\":\"starter\"}")
                        .toObject(Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(PostContentSchemaTierSlug.STARTER, model.getTierSlug());
    }

    @Test
    public void testSerialize() {
        Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema model =
                new Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema()
                        .setTierSlug(PostContentSchemaTierSlug.STARTER);
        model =
                BinaryData.fromObject(model)
                        .toObject(Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(PostContentSchemaTierSlug.STARTER, model.getTierSlug());
    }
}
