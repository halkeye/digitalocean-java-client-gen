package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ProjectBase;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectBaseTests {
    @Test
    public void testDeserialize() {
        ProjectBase model =
                BinaryData.fromString(
                                "{\"owner_uuid\":\"cprfcsjvjnko\",\"owner_id\":770714358,\"name\":\"sqbibaa\",\"description\":\"icovj\",\"purpose\":\"vwrmjx\",\"environment\":\"Development\",\"created_at\":\"2021-08-17T19:10:52Z\",\"updated_at\":\"2021-06-21T05:48:57Z\"}")
                        .toObject(ProjectBase.class);
        Assertions.assertEquals("sqbibaa", model.getName());
        Assertions.assertEquals("icovj", model.getDescription());
        Assertions.assertEquals("vwrmjx", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
    }

    @Test
    public void testSerialize() {
        ProjectBase model =
                new ProjectBase()
                        .setName("sqbibaa")
                        .setDescription("icovj")
                        .setPurpose("vwrmjx")
                        .setEnvironment(ProjectBaseEnvironment.DEVELOPMENT);
        model = BinaryData.fromObject(model).toObject(ProjectBase.class);
        Assertions.assertEquals("sqbibaa", model.getName());
        Assertions.assertEquals("icovj", model.getDescription());
        Assertions.assertEquals("vwrmjx", model.getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getEnvironment());
    }
}
