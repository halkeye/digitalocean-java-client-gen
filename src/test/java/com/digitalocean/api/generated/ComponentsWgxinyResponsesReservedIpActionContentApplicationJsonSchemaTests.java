package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema model = BinaryData.fromString("{\"action\":{\"id\":1499800798,\"status\":\"in-progress\",\"type\":\"gkwedwlxtzhgbgb\",\"started_at\":\"2021-01-22T14:24:40Z\",\"completed_at\":\"2021-11-15T03:09:21Z\",\"resource_id\":1767903934,\"resource_type\":\"mvrrqfibpk\",\"region\":{\"name\":\"amrlfizjuddnd\",\"slug\":\"hupngyhylqyafew\",\"available\":true}}}").toObject(ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(1499800798, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("gkwedwlxtzhgbgb", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-22T14:24:40Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-15T03:09:21Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1767903934, model.getAction().getResourceId());
        Assertions.assertEquals("mvrrqfibpk", model.getAction().getResourceType());
        Assertions.assertEquals("amrlfizjuddnd", model.getAction().getRegion().getName());
        Assertions.assertEquals("hupngyhylqyafew", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema model = new ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema().setAction(new Action().setId(1499800798).setStatus(ActionStatus.IN_PROGRESS).setType("gkwedwlxtzhgbgb").setStartedAt(OffsetDateTime.parse("2021-01-22T14:24:40Z")).setCompletedAt(OffsetDateTime.parse("2021-11-15T03:09:21Z")).setResourceId(1767903934).setResourceType("mvrrqfibpk").setRegion(new Region().setName("amrlfizjuddnd").setSlug("hupngyhylqyafew").setAvailable(true)));
        model = BinaryData.fromObject(model).toObject(ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(1499800798, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("gkwedwlxtzhgbgb", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-22T14:24:40Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-15T03:09:21Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1767903934, model.getAction().getResourceId());
        Assertions.assertEquals("mvrrqfibpk", model.getAction().getResourceType());
        Assertions.assertEquals("amrlfizjuddnd", model.getAction().getRegion().getName());
        Assertions.assertEquals("hupngyhylqyafew", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }
}
