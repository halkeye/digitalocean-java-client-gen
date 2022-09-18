package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema model = BinaryData.fromString("{\"project\":{\"is_default\":true,\"owner_uuid\":\"fjjuzkilm\",\"owner_id\":510356749,\"name\":\"hyzekypyovljlb\",\"description\":\"lby\",\"purpose\":\"axhpz\",\"environment\":\"Staging\",\"created_at\":\"2021-01-12T18:55:27Z\",\"updated_at\":\"2021-02-08T19:56:21Z\"}}").toObject(Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema.class);
        Assertions.assertEquals("hyzekypyovljlb", model.getProject().getName());
        Assertions.assertEquals("lby", model.getProject().getDescription());
        Assertions.assertEquals("axhpz", model.getProject().getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.STAGING, model.getProject().getEnvironment());
        Assertions.assertEquals(true, model.getProject().isDefault());
    }

    @Test
    public void testSerialize() {
        Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema model = new Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema().setProject(new Project().setName("hyzekypyovljlb").setDescription("lby").setPurpose("axhpz").setEnvironment(ProjectBaseEnvironment.STAGING).setIsDefault(true));
        model = BinaryData.fromObject(model).toObject(Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema.class);
        Assertions.assertEquals("hyzekypyovljlb", model.getProject().getName());
        Assertions.assertEquals("lby", model.getProject().getDescription());
        Assertions.assertEquals("axhpz", model.getProject().getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.STAGING, model.getProject().getEnvironment());
        Assertions.assertEquals(true, model.getProject().isDefault());
    }
}
