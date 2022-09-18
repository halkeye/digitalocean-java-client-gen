package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBase;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectTests {
    @Test
    public void testDeserialize() {
        Project model = BinaryData.fromString("{\"is_default\":false,\"owner_uuid\":\"vehoh\",\"owner_id\":1179468470,\"name\":\"vbgtzqzqweuy\",\"description\":\"bnairvhpqsv\",\"purpose\":\"eoge\",\"environment\":\"Development\",\"created_at\":\"2021-06-19T14:24:38Z\",\"updated_at\":\"2021-09-05T20:08:46Z\"}").toObject(Project.class);
        Assertions.assertEquals("vbgtzqzqweuy", model.getName());
        Assertions.assertEquals("bnairvhpqsv", model.getDescription());
        Assertions.assertEquals("eoge", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
        Assertions.assertEquals(false, model.isDefault());
    }

    @Test
    public void testSerialize() {
        Project model = new Project().setName("vbgtzqzqweuy").setDescription("bnairvhpqsv").setPurpose("eoge").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(false);
        model = BinaryData.fromObject(model).toObject(Project.class);
        Assertions.assertEquals("vbgtzqzqweuy", model.getName());
        Assertions.assertEquals("bnairvhpqsv", model.getDescription());
        Assertions.assertEquals("eoge", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
        Assertions.assertEquals(false, model.isDefault());
    }
}
