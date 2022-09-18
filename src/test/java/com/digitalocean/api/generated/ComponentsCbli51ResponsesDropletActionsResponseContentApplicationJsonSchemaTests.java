package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"actions\":[{\"id\":21349222,\"status\":\"completed\",\"type\":\"ezpfki\",\"started_at\":\"2021-06-20T10:54:30Z\",\"completed_at\":\"2020-12-23T00:05:51Z\",\"resource_id\":1056831410,\"resource_type\":\"aoq\",\"region\":{\"name\":\"gpto\",\"slug\":\"xjqfiafcnlrtbfi\",\"available\":true}},{\"id\":1825571960,\"status\":\"in-progress\",\"type\":\"olbuauktwieope\",\"started_at\":\"2021-07-10T13:35Z\",\"completed_at\":\"2021-07-29T21:43:01Z\",\"resource_id\":207870243,\"resource_type\":\"swyiljpibkgxyxy\",\"region\":{\"name\":\"xre\",\"slug\":\"do\",\"available\":true}}]}").toObject(ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(21349222, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("ezpfki", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T10:54:30Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T00:05:51Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1056831410, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("aoq", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("gpto", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("xjqfiafcnlrtbfi", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema model = new ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema().setActions(Arrays.asList(new Action().setId(21349222).setStatus(ActionStatus.COMPLETED).setType("ezpfki").setStartedAt(OffsetDateTime.parse("2021-06-20T10:54:30Z")).setCompletedAt(OffsetDateTime.parse("2020-12-23T00:05:51Z")).setResourceId(1056831410).setResourceType("aoq").setRegion(new Region().setName("gpto").setSlug("xjqfiafcnlrtbfi").setAvailable(true)), new Action().setId(1825571960).setStatus(ActionStatus.IN_PROGRESS).setType("olbuauktwieope").setStartedAt(OffsetDateTime.parse("2021-07-10T13:35Z")).setCompletedAt(OffsetDateTime.parse("2021-07-29T21:43:01Z")).setResourceId(207870243).setResourceType("swyiljpibkgxyxy").setRegion(new Region().setName("xre").setSlug("do").setAvailable(true))));
        model = BinaryData.fromObject(model).toObject(ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(21349222, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("ezpfki", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T10:54:30Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T00:05:51Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1056831410, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("aoq", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("gpto", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("xjqfiafcnlrtbfi", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
    }
}
