package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"actions\":[{\"id\":235116549,\"status\":\"errored\",\"type\":\"hhavzfuxnvk\",\"started_at\":\"2021-06-16T14:36:32Z\",\"completed_at\":\"2020-12-25T15:59:54Z\",\"resource_id\":515750778,\"resource_type\":\"tfuehouisak\",\"region\":{\"name\":\"jfddxqfussub\",\"slug\":\"sspmjvailfauyv\",\"available\":false}},{\"id\":906019889,\"status\":\"completed\",\"type\":\"gwbztrthldwvo\",\"started_at\":\"2021-01-24T19:26:53Z\",\"completed_at\":\"2020-12-25T13:48:27Z\",\"resource_id\":1773749362,\"resource_type\":\"slormhb\",\"region\":{\"name\":\"fcvxkylhc\",\"slug\":\"sdylmnq\",\"available\":false}}]}").toObject(Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(235116549, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("hhavzfuxnvk", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T14:36:32Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T15:59:54Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(515750778, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("tfuehouisak", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("jfddxqfussub", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("sspmjvailfauyv", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0 model = new Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0().setActions(Arrays.asList(new Action().setId(235116549).setStatus(ActionStatus.ERRORED).setType("hhavzfuxnvk").setStartedAt(OffsetDateTime.parse("2021-06-16T14:36:32Z")).setCompletedAt(OffsetDateTime.parse("2020-12-25T15:59:54Z")).setResourceId(515750778).setResourceType("tfuehouisak").setRegion(new Region().setName("jfddxqfussub").setSlug("sspmjvailfauyv").setAvailable(false)), new Action().setId(906019889).setStatus(ActionStatus.COMPLETED).setType("gwbztrthldwvo").setStartedAt(OffsetDateTime.parse("2021-01-24T19:26:53Z")).setCompletedAt(OffsetDateTime.parse("2020-12-25T13:48:27Z")).setResourceId(1773749362).setResourceType("slormhb").setRegion(new Region().setName("fcvxkylhc").setSlug("sdylmnq").setAvailable(false))));
        model = BinaryData.fromObject(model).toObject(Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(235116549, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("hhavzfuxnvk", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T14:36:32Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T15:59:54Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(515750778, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("tfuehouisak", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("jfddxqfussub", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("sspmjvailfauyv", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }
}
