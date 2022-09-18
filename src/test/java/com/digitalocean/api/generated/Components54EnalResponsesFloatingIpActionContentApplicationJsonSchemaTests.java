package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components54EnalResponsesFloatingIpActionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema model = BinaryData.fromString("{\"action\":{\"id\":773330116,\"status\":\"in-progress\",\"type\":\"mkdhwqcqweba\",\"started_at\":\"2021-08-27T16:53:34Z\",\"completed_at\":\"2021-03-10T20:23:37Z\",\"resource_id\":581179024,\"resource_type\":\"ujeucosvkkeer\",\"region\":{\"name\":\"ypaxpjp\",\"slug\":\"illgnu\",\"available\":true}}}").toObject(Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(773330116, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("mkdhwqcqweba", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T16:53:34Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T20:23:37Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(581179024, model.getAction().getResourceId());
        Assertions.assertEquals("ujeucosvkkeer", model.getAction().getResourceType());
        Assertions.assertEquals("ypaxpjp", model.getAction().getRegion().getName());
        Assertions.assertEquals("illgnu", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema model = new Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema().setAction(new Action().setId(773330116).setStatus(ActionStatus.IN_PROGRESS).setType("mkdhwqcqweba").setStartedAt(OffsetDateTime.parse("2021-08-27T16:53:34Z")).setCompletedAt(OffsetDateTime.parse("2021-03-10T20:23:37Z")).setResourceId(581179024).setResourceType("ujeucosvkkeer").setRegion(new Region().setName("ypaxpjp").setSlug("illgnu").setAvailable(true)));
        model = BinaryData.fromObject(model).toObject(Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(773330116, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("mkdhwqcqweba", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T16:53:34Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T20:23:37Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(581179024, model.getAction().getResourceId());
        Assertions.assertEquals("ujeucosvkkeer", model.getAction().getResourceType());
        Assertions.assertEquals("ypaxpjp", model.getAction().getRegion().getName());
        Assertions.assertEquals("illgnu", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }
}
