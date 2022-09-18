package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Components1UmkrblResponsesProjectsListContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectBaseEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1UmkrblResponsesProjectsListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1UmkrblResponsesProjectsListContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":125308373},\"projects\":[{\"is_default\":true,\"owner_uuid\":\"jc\",\"owner_id\":1567399572,\"name\":\"vguy\",\"description\":\"nxelrjkfzcde\",\"purpose\":\"wwezhyfkdilb\",\"environment\":\"Development\",\"created_at\":\"2021-07-07T05:24:16Z\",\"updated_at\":\"2021-01-26T16:40:40Z\"},{\"is_default\":false,\"owner_uuid\":\"rtybcel\",\"owner_id\":80272315,\"name\":\"odnjyhzfaxskdv\",\"description\":\"lumodpegqxsorc\",\"purpose\":\"zrqoxzyhlbeqvh\",\"environment\":\"Staging\",\"created_at\":\"2021-04-12T02:23:32Z\",\"updated_at\":\"2021-05-01T07:42:14Z\"},{\"is_default\":true,\"owner_uuid\":\"ggfzgaefh\",\"owner_id\":6022297,\"name\":\"ibuydwiurnicu\",\"description\":\"y\",\"purpose\":\"qmiuvjpl\",\"environment\":\"Staging\",\"created_at\":\"2021-08-28T18:11:37Z\",\"updated_at\":\"2020-12-28T14:34:19Z\"},{\"is_default\":true,\"owner_uuid\":\"txynoflqobfixngx\",\"owner_id\":245806082,\"name\":\"exhnkingi\",\"description\":\"dolrpgup\",\"purpose\":\"lbsm\",\"environment\":\"Staging\",\"created_at\":\"2021-11-08T03:57:01Z\",\"updated_at\":\"2021-06-15T13:22:19Z\"}]}").toObject(Components1UmkrblResponsesProjectsListContentApplicationJsonSchema.class);
        Assertions.assertEquals("vguy", model.getProjects().get(0).getName());
        Assertions.assertEquals("nxelrjkfzcde", model.getProjects().get(0).getDescription());
        Assertions.assertEquals("wwezhyfkdilb", model.getProjects().get(0).getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getProjects().get(0).getEnvironment());
        Assertions.assertEquals(true, model.getProjects().get(0).isDefault());
        Assertions.assertEquals(125308373, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1UmkrblResponsesProjectsListContentApplicationJsonSchema model = new Components1UmkrblResponsesProjectsListContentApplicationJsonSchema().setProjects(Arrays.asList(new Project().setName("vguy").setDescription("nxelrjkfzcde").setPurpose("wwezhyfkdilb").setEnvironment(ProjectBaseEnvironment.DEVELOPMENT).setIsDefault(true), new Project().setName("odnjyhzfaxskdv").setDescription("lumodpegqxsorc").setPurpose("zrqoxzyhlbeqvh").setEnvironment(ProjectBaseEnvironment.STAGING).setIsDefault(false), new Project().setName("ibuydwiurnicu").setDescription("y").setPurpose("qmiuvjpl").setEnvironment(ProjectBaseEnvironment.STAGING).setIsDefault(true), new Project().setName("exhnkingi").setDescription("dolrpgup").setPurpose("lbsm").setEnvironment(ProjectBaseEnvironment.STAGING).setIsDefault(true))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(125308373));
        model = BinaryData.fromObject(model).toObject(Components1UmkrblResponsesProjectsListContentApplicationJsonSchema.class);
        Assertions.assertEquals("vguy", model.getProjects().get(0).getName());
        Assertions.assertEquals("nxelrjkfzcde", model.getProjects().get(0).getDescription());
        Assertions.assertEquals("wwezhyfkdilb", model.getProjects().get(0).getPurpose());
        Assertions.assertEquals(ProjectBaseEnvironment.DEVELOPMENT, model.getProjects().get(0).getEnvironment());
        Assertions.assertEquals(true, model.getProjects().get(0).isDefault());
        Assertions.assertEquals(125308373, model.getMeta().getTotal());
    }
}
