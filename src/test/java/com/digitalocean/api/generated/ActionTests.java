package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ActionTests {
    @Test
    public void testDeserialize() {
        Action model =
                BinaryData.fromString(
                                "{\"id\":2010421384,\"status\":\"errored\",\"type\":\"xsabkyqdu\",\"started_at\":\"2021-07-17T19:18:59Z\",\"completed_at\":\"2021-09-28T15:07:41Z\",\"resource_id\":1447556622,\"resource_type\":\"dzevndhkrw\",\"region\":{\"name\":\"appd\",\"slug\":\"bdkvwrwjf\",\"available\":false}}")
                        .toObject(Action.class);
        Assertions.assertEquals(2010421384, model.getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getStatus());
        Assertions.assertEquals("xsabkyqdu", model.getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T19:18:59Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-28T15:07:41Z"), model.getCompletedAt());
        Assertions.assertEquals(1447556622, model.getResourceId());
        Assertions.assertEquals("dzevndhkrw", model.getResourceType());
        Assertions.assertEquals("appd", model.getRegion().getName());
        Assertions.assertEquals("bdkvwrwjf", model.getRegion().getSlug());
        Assertions.assertEquals(false, model.getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Action model =
                new Action()
                        .setId(2010421384)
                        .setStatus(ActionStatus.ERRORED)
                        .setType("xsabkyqdu")
                        .setStartedAt(OffsetDateTime.parse("2021-07-17T19:18:59Z"))
                        .setCompletedAt(OffsetDateTime.parse("2021-09-28T15:07:41Z"))
                        .setResourceId(1447556622)
                        .setResourceType("dzevndhkrw")
                        .setRegion(new Region().setName("appd").setSlug("bdkvwrwjf").setAvailable(false));
        model = BinaryData.fromObject(model).toObject(Action.class);
        Assertions.assertEquals(2010421384, model.getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getStatus());
        Assertions.assertEquals("xsabkyqdu", model.getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T19:18:59Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-28T15:07:41Z"), model.getCompletedAt());
        Assertions.assertEquals(1447556622, model.getResourceId());
        Assertions.assertEquals("dzevndhkrw", model.getResourceType());
        Assertions.assertEquals("appd", model.getRegion().getName());
        Assertions.assertEquals("bdkvwrwjf", model.getRegion().getSlug());
        Assertions.assertEquals(false, model.getRegion().isAvailable());
    }
}
