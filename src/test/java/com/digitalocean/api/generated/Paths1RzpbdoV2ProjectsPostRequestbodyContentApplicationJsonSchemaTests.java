package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.ProjectBase;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"owner_uuid\":\"bassqfyylwpp\",\"owner_id\":88731524,\"name\":\"bzbloasyb\",\"description\":\"qvovdpmhttu\",\"purpose\":\"qjsrvjnqtaqgxq\",\"environment\":\"Development\",\"created_at\":\"2021-03-06T16:26:54Z\",\"updated_at\":\"2021-03-09T23:29:24Z\"}").toObject(Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("bzbloasyb", model.getName());
        Assertions.assertEquals("qvovdpmhttu", model.getDescription());
        Assertions.assertEquals("qjsrvjnqtaqgxq", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
    }

    @Test
    public void testSerialize() {
        Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema model = new Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema().setName("bzbloasyb").setDescription("qvovdpmhttu").setPurpose("qjsrvjnqtaqgxq").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT);
        model = BinaryData.fromObject(model).toObject(Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("bzbloasyb", model.getName());
        Assertions.assertEquals("qvovdpmhttu", model.getDescription());
        Assertions.assertEquals("qjsrvjnqtaqgxq", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
    }
}
