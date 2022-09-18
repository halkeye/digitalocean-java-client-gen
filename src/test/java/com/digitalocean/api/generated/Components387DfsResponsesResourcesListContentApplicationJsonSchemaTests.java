package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components387DfsResponsesResourcesListContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Resource;
import com.digitalocean.api.models.ResourceLinks;
import com.digitalocean.api.models.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components387DfsResponsesResourcesListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components387DfsResponsesResourcesListContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":88448219},\"resources\":[{\"urn\":\"skh\",\"assigned_at\":\"2021-08-04T18:01:56Z\",\"links\":{\"self\":\"ykrsm\"},\"status\":\"not_found\"}]}").toObject(Components387DfsResponsesResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("skh", model.getResources().get(0).getUrn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-04T18:01:56Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("ykrsm", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.NOT_FOUND, model.getResources().get(0).getStatus());
        Assertions.assertEquals(88448219, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components387DfsResponsesResourcesListContentApplicationJsonSchema model = new Components387DfsResponsesResourcesListContentApplicationJsonSchema().setResources(Arrays.asList(new Resource().setUrn("skh").setAssignedAt(OffsetDateTime.parse("2021-08-04T18:01:56Z")).setLinks(new ResourceLinks().setSelf("ykrsm")).setStatus(ResourceStatus.NOT_FOUND))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(88448219));
        model = BinaryData.fromObject(model).toObject(Components387DfsResponsesResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("skh", model.getResources().get(0).getUrn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-04T18:01:56Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("ykrsm", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.NOT_FOUND, model.getResources().get(0).getStatus());
        Assertions.assertEquals(88448219, model.getMeta().getTotal());
    }
}
