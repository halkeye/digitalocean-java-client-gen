package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"is_default\":true,\"owner_uuid\":\"bloejzsaxzgkq\",\"owner_id\":507820267,\"name\":\"ppjnaphifkfr\",\"description\":\"p\",\"purpose\":\"bpebrmj\",\"environment\":\"Production\",\"created_at\":\"2021-08-09T06:01:59Z\",\"updated_at\":\"2021-05-15T19:53:19Z\"}").toObject(PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("ppjnaphifkfr", model.getName());
        Assertions.assertEquals("p", model.getDescription());
        Assertions.assertEquals("bpebrmj", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.PRODUCTION, model.getEnvironment());
        Assertions.assertEquals(true, model.isDefault());
    }

    @Test
    public void testSerialize() {
        PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema model = new PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema().setName("ppjnaphifkfr").setDescription("p").setPurpose("bpebrmj").setEnvironment(ProjectBaseEnvironment.PRODUCTION).setIsDefault(true);
        model = BinaryData.fromObject(model).toObject(PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("ppjnaphifkfr", model.getName());
        Assertions.assertEquals("p", model.getDescription());
        Assertions.assertEquals("bpebrmj", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.PRODUCTION, model.getEnvironment());
        Assertions.assertEquals(true, model.isDefault());
    }
}
