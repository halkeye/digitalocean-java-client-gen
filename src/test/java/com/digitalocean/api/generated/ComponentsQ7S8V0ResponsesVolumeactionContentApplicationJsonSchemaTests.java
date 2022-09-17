package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.VolumeAction;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"action\":{\"type\":\"bjsarxsvmfpa\",\"resource_id\":1473186896,\"id\":479415217,\"status\":\"errored\",\"started_at\":\"2021-06-16T23:36:42Z\",\"completed_at\":\"2021-02-04T20:21:25Z\",\"resource_type\":\"qp\",\"region\":{\"name\":\"hgxg\",\"slug\":\"eabbfpxxavlo\",\"available\":false}}}")
                        .toObject(ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema.class);
        Assertions.assertEquals(479415217, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getAction().getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T23:36:42Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T20:21:25Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals("qp", model.getAction().getResourceType());
        Assertions.assertEquals("hgxg", model.getAction().getRegion().getName());
        Assertions.assertEquals("eabbfpxxavlo", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(false, model.getAction().getRegion().isAvailable());
        Assertions.assertEquals("bjsarxsvmfpa", model.getAction().getType());
        Assertions.assertEquals(1473186896, model.getAction().getResourceId());
    }

    @Test
    public void testSerialize() {
        ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema model =
                new ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema()
                        .setAction(
                                new VolumeAction()
                                        .setId(479415217)
                                        .setStatus(ActionStatus.ERRORED)
                                        .setStartedAt(OffsetDateTime.parse("2021-06-16T23:36:42Z"))
                                        .setCompletedAt(OffsetDateTime.parse("2021-02-04T20:21:25Z"))
                                        .setResourceType("qp")
                                        .setRegion(
                                                new Region()
                                                        .setName("hgxg")
                                                        .setSlug("eabbfpxxavlo")
                                                        .setAvailable(false))
                                        .setType("bjsarxsvmfpa")
                                        .setResourceId(1473186896));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsQ7S8V0ResponsesVolumeactionContentApplicationJsonSchema.class);
        Assertions.assertEquals(479415217, model.getAction().getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getAction().getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T23:36:42Z"), model.getAction().getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T20:21:25Z"), model.getAction().getCompletedAt());
        Assertions.assertEquals("qp", model.getAction().getResourceType());
        Assertions.assertEquals("hgxg", model.getAction().getRegion().getName());
        Assertions.assertEquals("eabbfpxxavlo", model.getAction().getRegion().getSlug());
        Assertions.assertEquals(false, model.getAction().getRegion().isAvailable());
        Assertions.assertEquals("bjsarxsvmfpa", model.getAction().getType());
        Assertions.assertEquals(1473186896, model.getAction().getResourceId());
    }
}
