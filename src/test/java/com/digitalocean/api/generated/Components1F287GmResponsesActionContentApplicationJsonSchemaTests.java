package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1F287GmResponsesActionContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1F287GmResponsesActionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1F287GmResponsesActionContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"action\":{\"id\":885062254,\"status\":\"in-progress\",\"type\":\"ti\",\"started_at\":\"2021-05-16T15:44:09Z\",\"completed_at\":\"2021-01-10T02:32:57Z\",\"resource_id\":1455747257,\"resource_type\":\"wyiftyhxhur\",\"region\":{\"name\":\"ftyxolniw\",\"slug\":\"wcukjfkgiawxk\",\"available\":true}}}")
                        .toObject(Components1F287GmResponsesActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(885062254, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("ti", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-16T15:44:09Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T02:32:57Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1455747257, model.getAction().getResourceId());
        Assertions.assertEquals("wyiftyhxhur", model.getAction().getResourceType());
        Assertions.assertEquals("ftyxolniw", model.getAction().getRegion().getName());
        Assertions.assertEquals("wcukjfkgiawxk", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1F287GmResponsesActionContentApplicationJsonSchema model =
                new Components1F287GmResponsesActionContentApplicationJsonSchema()
                        .setAction(
                                new Action()
                                        .setId(885062254)
                                        .setStatus(ActionStatus.IN_PROGRESS)
                                        .setType("ti")
                                        .setStartedAt(OffsetDateTime.parse("2021-05-16T15:44:09Z"))
                                        .setCompletedAt(OffsetDateTime.parse("2021-01-10T02:32:57Z"))
                                        .setResourceId(1455747257)
                                        .setResourceType("wyiftyhxhur")
                                        .setRegion(
                                                new Region()
                                                        .setName("ftyxolniw")
                                                        .setSlug("wcukjfkgiawxk")
                                                        .setAvailable(true)));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1F287GmResponsesActionContentApplicationJsonSchema.class);
        Assertions.assertEquals(885062254, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getAction().getStatus());
        Assertions.assertEquals("ti", model.getAction().getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-16T15:44:09Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T02:32:57Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals(1455747257, model.getAction().getResourceId());
        Assertions.assertEquals("wyiftyhxhur", model.getAction().getResourceType());
        Assertions.assertEquals("ftyxolniw", model.getAction().getRegion().getName());
        Assertions.assertEquals("wcukjfkgiawxk", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(true, model.getAction().getRegion().isAvailable());
    }
}
