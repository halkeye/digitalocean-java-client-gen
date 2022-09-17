package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"default\":false,\"name\":\"wttmhlvry\",\"description\":\"xrnwukfajnp\"}")
                        .toObject(Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("wttmhlvry", model.getName());
        Assertions.assertEquals("xrnwukfajnp", model.getDescription());
        Assertions.assertEquals(false, model.isDefaultProperty());
    }

    @Test
    public void testSerialize() {
        Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema model =
                new Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema()
                        .setName("wttmhlvry")
                        .setDescription("xrnwukfajnp")
                        .setDefaultProperty(false);
        model =
                BinaryData.fromObject(model)
                        .toObject(Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("wttmhlvry", model.getName());
        Assertions.assertEquals("xrnwukfajnp", model.getDescription());
        Assertions.assertEquals(false, model.isDefaultProperty());
    }
}
