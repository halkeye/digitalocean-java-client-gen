package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"projects\":[{\"is_default\":true,\"owner_uuid\":\"cnhpplzhcfzxjzi\",\"owner_id\":917946265,\"name\":\"lnewnuwkkfz\",\"description\":\"tlvhdyxzl\",\"purpose\":\"ywj\",\"environment\":\"Development\",\"created_at\":\"2021-08-16T14:03:32Z\",\"updated_at\":\"2021-11-25T05:05:31Z\"},{\"is_default\":true,\"owner_uuid\":\"ddarcbcdwhslxe\",\"owner_id\":182441741,\"name\":\"dknmstb\",\"description\":\"prwkampyhw\",\"purpose\":\"ldzniudrcycm\",\"environment\":\"Development\",\"created_at\":\"2021-08-10T12:41:21Z\",\"updated_at\":\"2021-08-02T13:51:22Z\"},{\"is_default\":true,\"owner_uuid\":\"qknlvkmnbzkopaii\",\"owner_id\":718633143,\"name\":\"ud\",\"description\":\"quxsyjofp\",\"purpose\":\"edrobujnjgybuxm\",\"environment\":\"Development\",\"created_at\":\"2021-01-25T21:38:50Z\",\"updated_at\":\"2021-06-20T14:25:39Z\"},{\"is_default\":false,\"owner_uuid\":\"gcps\",\"owner_id\":1768158249,\"name\":\"nytslgsazuqznghx\",\"description\":\"yqz\",\"purpose\":\"dkpvnrvzw\",\"environment\":\"Production\",\"created_at\":\"2021-10-14T06:54:57Z\",\"updated_at\":\"2021-11-13T19:30:39Z\"}]}").toObject(Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("lnewnuwkkfz", model.getProjects().get(0).getName());
        Assertions.assertEquals("tlvhdyxzl", model.getProjects().get(0).getDescription());
        Assertions.assertEquals("ywj", model.getProjects().get(0).getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getProjects().get(0).getEnvironment());
        Assertions.assertEquals(true, model.getProjects().get(0).isDefault());
    }

    @Test
    public void testSerialize() {
        Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 model = new Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0().setProjects(Arrays.asList(new Project().setName("lnewnuwkkfz").setDescription("tlvhdyxzl").setPurpose("ywj").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(true), new Project().setName("dknmstb").setDescription("prwkampyhw").setPurpose("ldzniudrcycm").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(true), new Project().setName("ud").setDescription("quxsyjofp").setPurpose("edrobujnjgybuxm").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(true), new Project().setName("nytslgsazuqznghx").setDescription("yqz").setPurpose("dkpvnrvzw").setEnvironment(ProjectBaseEnvironment.PRODUCTION).setIsDefault(false)));
        model = BinaryData.fromObject(model).toObject(Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("lnewnuwkkfz", model.getProjects().get(0).getName());
        Assertions.assertEquals("tlvhdyxzl", model.getProjects().get(0).getDescription());
        Assertions.assertEquals("ywj", model.getProjects().get(0).getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getProjects().get(0).getEnvironment());
        Assertions.assertEquals(true, model.getProjects().get(0).isDefault());
    }
}
