package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1598988170},\"actions\":[{\"id\":843273318,\"status\":\"in-progress\",\"type\":\"exduetbapfczew\",\"started_at\":\"2021-10-04T17:52:57Z\",\"completed_at\":\"2021-08-24T22:12:47Z\",\"resource_id\":1369595242,\"resource_type\":\"yazkjpir\",\"region\":{\"name\":\"xvb\",\"slug\":\"zwhy\",\"available\":false}}]}").toObject(ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(843273318, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("exduetbapfczew", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-04T17:52:57Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-24T22:12:47Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1369595242, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("yazkjpir", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("xvb", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("zwhy", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1598988170, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema model = new ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema().setActions(Arrays.asList(new Action().setId(843273318).setStatus(ActionStatus.IN_PROGRESS).setType("exduetbapfczew").setStartedAt(OffsetDateTime.parse("2021-10-04T17:52:57Z")).setCompletedAt(OffsetDateTime.parse("2021-08-24T22:12:47Z")).setResourceId(1369595242).setResourceType("yazkjpir").setRegion(new Region().setName("xvb").setSlug("zwhy").setAvailable(false)))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1598988170));
        model = BinaryData.fromObject(model).toObject(ComponentsNhzig9ResponsesGetImageActionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(843273318, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("exduetbapfczew", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-04T17:52:57Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-24T22:12:47Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1369595242, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("yazkjpir", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("xvb", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("zwhy", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1598988170, model.getMeta().getTotal());
    }
}
