package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema;
import com.digitalocean.api.models.Registry;
import com.digitalocean.api.models.RegistrySubscription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"registry\":{\"name\":\"cjomipvwkaujtt\",\"created_at\":\"2021-07-11T22:50:52Z\",\"region\":\"xv\",\"storage_usage_bytes\":1036708004,\"storage_usage_bytes_updated_at\":\"2021-12-04T08:26:49Z\",\"subscription\":{\"created_at\":\"2021-08-05T15:53:27Z\",\"updated_at\":\"2021-11-19T00:56:31Z\"}}}")
                        .toObject(Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjomipvwkaujtt", model.getRegistry().getName());
        Assertions.assertEquals("xv", model.getRegistry().getRegion());
    }

    @Test
    public void testSerialize() {
        Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema model =
                new Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema()
                        .setRegistry(
                                new Registry()
                                        .setName("cjomipvwkaujtt")
                                        .setRegion("xv")
                                        .setSubscription(new RegistrySubscription()));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjomipvwkaujtt", model.getRegistry().getName());
        Assertions.assertEquals("xv", model.getRegistry().getRegion());
    }
}
