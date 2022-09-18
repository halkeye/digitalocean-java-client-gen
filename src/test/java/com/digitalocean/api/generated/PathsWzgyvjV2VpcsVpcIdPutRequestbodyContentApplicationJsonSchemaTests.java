package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.VpcUpdatable;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"default\":false,\"name\":\"gaex\",\"description\":\"skvctvu\"}").toObject(PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("gaex", model.getName());
        Assertions.assertEquals("skvctvu", model.getDescription());
        Assertions.assertEquals(false, model.isDefaultProperty());
    }

    @Test
    public void testSerialize() {
        PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema model = new PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema().setName("gaex").setDescription("skvctvu").setDefaultProperty(false);
        model = BinaryData.fromObject(model).toObject(PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("gaex", model.getName());
        Assertions.assertEquals("skvctvu", model.getDescription());
        Assertions.assertEquals(false, model.isDefaultProperty());
    }
}
