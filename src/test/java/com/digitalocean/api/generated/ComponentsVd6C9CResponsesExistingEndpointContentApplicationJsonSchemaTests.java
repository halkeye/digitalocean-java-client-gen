package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CdnEndpoint;
import com.digitalocean.api.models.CdnEndpointTtl;
import com.digitalocean.api.models.ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"endpoint\":{\"origin\":\"ujcngo\",\"endpoint\":\"yedmzrgj\",\"ttl\":60,\"custom_domain\":\"bnoit\",\"created_at\":\"2021-05-10T14:50Z\"}}")
                        .toObject(ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujcngo", model.getEndpoint().getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIXTY, model.getEndpoint().getTtl());
        Assertions.assertEquals("bnoit", model.getEndpoint().getCustomDomain());
    }

    @Test
    public void testSerialize() {
        ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema model =
                new ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema()
                        .setEndpoint(
                                new CdnEndpoint()
                                        .setOrigin("ujcngo")
                                        .setTtl(CdnEndpointTtl.SIXTY)
                                        .setCustomDomain("bnoit"));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujcngo", model.getEndpoint().getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIXTY, model.getEndpoint().getTtl());
        Assertions.assertEquals("bnoit", model.getEndpoint().getCustomDomain());
    }
}
