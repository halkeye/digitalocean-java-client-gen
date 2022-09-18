package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"actions\":[{\"id\":1419244382,\"status\":\"in-progress\",\"type\":\"wtnhxbnjbiksqr\",\"started_at\":\"2021-08-17T11:42:15Z\",\"completed_at\":\"2021-11-27T09:59:40Z\",\"resource_id\":1437691312,\"resource_type\":\"p\",\"region\":{\"name\":\"nzl\",\"slug\":\"jfm\",\"available\":false}}]}").toObject(Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1419244382, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("wtnhxbnjbiksqr", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T11:42:15Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-27T09:59:40Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1437691312, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("p", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("nzl", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("jfm", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0 model = new Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0().setActions(Arrays.asList(new Action().setId(1419244382).setStatus(ActionStatus.IN_PROGRESS).setType("wtnhxbnjbiksqr").setStartedAt(OffsetDateTime.parse("2021-08-17T11:42:15Z")).setCompletedAt(OffsetDateTime.parse("2021-11-27T09:59:40Z")).setResourceId(1437691312).setResourceType("p").setRegion(new Region().setName("nzl").setSlug("jfm").setAvailable(false))));
        model = BinaryData.fromObject(model).toObject(Components1Fz7Dw2ResponsesActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1419244382, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("wtnhxbnjbiksqr", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T11:42:15Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-27T09:59:40Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1437691312, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("p", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("nzl", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("jfm", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }
}
