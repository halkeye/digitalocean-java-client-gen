package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"is_default\":true,\"owner_uuid\":\"zges\",\"owner_id\":2103329399,\"name\":\"ag\",\"description\":\"hnezpbyfyv\",\"purpose\":\"pmggqgagenvqbug\",\"environment\":\"Development\",\"created_at\":\"2021-03-15T06:04:27Z\",\"updated_at\":\"2021-05-06T17:16:59Z\"}").toObject(Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("ag", model.getName());
        Assertions.assertEquals("hnezpbyfyv", model.getDescription());
        Assertions.assertEquals("pmggqgagenvqbug", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
        Assertions.assertEquals(true, model.isDefault());
    }

    @Test
    public void testSerialize() {
        Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema model = new Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema().setName("ag").setDescription("hnezpbyfyv").setPurpose("pmggqgagenvqbug").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(true);
        model = BinaryData.fromObject(model).toObject(Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("ag", model.getName());
        Assertions.assertEquals("hnezpbyfyv", model.getDescription());
        Assertions.assertEquals("pmggqgagenvqbug", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
        Assertions.assertEquals(true, model.isDefault());
    }
}
