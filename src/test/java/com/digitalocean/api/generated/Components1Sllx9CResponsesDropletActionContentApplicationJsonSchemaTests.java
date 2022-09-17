package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Sllx9CResponsesDropletActionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"action\":{\"id\":1538590267,\"status\":\"in-progress\",\"type\":\"alec\",\"started_at\":\"2021-05-06T22:18:11Z\",\"completed_at\":\"2021-10-21T08:11:03Z\",\"resource_id\":1713496688,\"resource_type\":\"degyxsbfpzvo\",\"region\":{\"name\":\"vntw\",\"slug\":\"zfzwush\",\"available\":true}}}")
                        .toObject(Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(1538590267, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("alec", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T22:18:11Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T08:11:03Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1713496688, model.getAction().getResourceId());
        Assertions.assertEquals("degyxsbfpzvo", model.getAction().getResourceType());
        Assertions.assertEquals("vntw", model.getAction().getRegion().getName());
        Assertions.assertEquals("zfzwush", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema model =
                new Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema()
                        .setAction(
                                new Action()
                                        .setId(1538590267)
                                        .setStatus(ActionStatus.IN_PROGRESS)
                                        .setType("alec")
                                        .setStartedAt(OffsetDateTime.parse("2021-05-06T22:18:11Z"))
                                        .setCompletedAt(OffsetDateTime.parse("2021-10-21T08:11:03Z"))
                                        .setResourceId(1713496688)
                                        .setResourceType("degyxsbfpzvo")
                                        .setRegion(new Region().setName("vntw").setSlug("zfzwush").setAvailable(true)));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(1538590267, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("alec", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T22:18:11Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T08:11:03Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1713496688, model.getAction().getResourceId());
        Assertions.assertEquals("degyxsbfpzvo", model.getAction().getResourceType());
        Assertions.assertEquals("vntw", model.getAction().getRegion().getName());
        Assertions.assertEquals("zfzwush", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }
}
