package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components7Bz540ResponsesExistingProjectContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema model = BinaryData.fromString("{\"project\":{\"is_default\":false,\"owner_uuid\":\"j\",\"owner_id\":1740464848,\"name\":\"evsfgdrmnsz\",\"description\":\"smjsqsvzvmx\",\"purpose\":\"wghndaevhgs\",\"environment\":\"Staging\",\"created_at\":\"2021-04-25T03:14:57Z\",\"updated_at\":\"2021-02-27T16:25:22Z\"}}").toObject(Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema.class);
        Assertions.assertEquals("evsfgdrmnsz", model.getProject().getName());
        Assertions.assertEquals("smjsqsvzvmx", model.getProject().getDescription());
        Assertions.assertEquals("wghndaevhgs", model.getProject().getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.STAGING, model.getProject().getEnvironment());
        Assertions.assertEquals(false, model.getProject().isDefault());
    }

    @Test
    public void testSerialize() {
        Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema model = new Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema().setProject(new Project().setName("evsfgdrmnsz").setDescription("smjsqsvzvmx").setPurpose("wghndaevhgs").setEnvironment(ProjectBaseEnvironment.STAGING).setIsDefault(false));
        model = BinaryData.fromObject(model).toObject(Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema.class);
        Assertions.assertEquals("evsfgdrmnsz", model.getProject().getName());
        Assertions.assertEquals("smjsqsvzvmx", model.getProject().getDescription());
        Assertions.assertEquals("wghndaevhgs", model.getProject().getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.STAGING, model.getProject().getEnvironment());
        Assertions.assertEquals(false, model.getProject().isDefault());
    }
}
