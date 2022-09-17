package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.EvictionPolicyModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema model =
                BinaryData.fromString("{\"eviction_policy\":\"noeviction\"}")
                        .toObject(ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getEvictionPolicy());
    }

    @Test
    public void testSerialize() {
        ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema model =
                new ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema()
                        .setEvictionPolicy(EvictionPolicyModel.NOEVICTION);
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getEvictionPolicy());
    }
}
