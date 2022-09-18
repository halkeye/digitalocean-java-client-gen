package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema;
import com.digitalocean.api.models.Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":817826430},\"actions\":[{\"id\":1699420866,\"status\":\"errored\",\"type\":\"szrbwtdrcwg\",\"started_at\":\"2021-10-16T13:26:22Z\",\"completed_at\":\"2021-03-27T20:10:13Z\",\"resource_id\":1078640782,\"resource_type\":\"hfixa\",\"region\":{\"name\":\"c\",\"slug\":\"lzjrmhpfy\",\"available\":true}}]}").toObject(Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1699420866, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("szrbwtdrcwg", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T13:26:22Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T20:10:13Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1078640782, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("hfixa", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("c", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("lzjrmhpfy", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(817826430, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema model = new Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema().setActions(Arrays.asList(new Action().setId(1699420866).setStatus(ActionStatus.ERRORED).setType("szrbwtdrcwg").setStartedAt(OffsetDateTime.parse("2021-10-16T13:26:22Z")).setCompletedAt(OffsetDateTime.parse("2021-03-27T20:10:13Z")).setResourceId(1078640782).setResourceType("hfixa").setRegion(new Region().setName("c").setSlug("lzjrmhpfy").setAvailable(true)))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(817826430));
        model = BinaryData.fromObject(model).toObject(Components19JfuwyResponsesAllDropletActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1699420866, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("szrbwtdrcwg", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T13:26:22Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T20:10:13Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1078640782, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("hfixa", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("c", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("lzjrmhpfy", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(817826430, model.getMeta().getTotal());
    }
}
