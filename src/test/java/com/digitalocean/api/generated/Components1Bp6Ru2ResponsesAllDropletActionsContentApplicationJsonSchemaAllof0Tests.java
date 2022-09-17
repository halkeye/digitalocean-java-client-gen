package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"actions\":[{\"id\":1738803308,\"status\":\"errored\",\"type\":\"xsoxi\",\"started_at\":\"2021-09-03T04:56:48Z\",\"completed_at\":\"2021-04-15T23:14:57Z\",\"resource_id\":93232202,\"resource_type\":\"rocqsxy\",\"region\":{\"name\":\"qtcmiwdwisv\",\"slug\":\"mey\",\"available\":false}}]}")
                        .toObject(Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1738803308, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("xsoxi", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T04:56:48Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-15T23:14:57Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(93232202, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("rocqsxy", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("qtcmiwdwisv", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("mey", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 model =
                new Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0()
                        .setActions(
                                Arrays.asList(
                                        new Action()
                                                .setId(1738803308)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("xsoxi")
                                                .setStartedAt(OffsetDateTime.parse("2021-09-03T04:56:48Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-04-15T23:14:57Z"))
                                                .setResourceId(93232202)
                                                .setResourceType("rocqsxy")
                                                .setRegion(
                                                        new Region()
                                                                .setName("qtcmiwdwisv")
                                                                .setSlug("mey")
                                                                .setAvailable(false))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1738803308, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("xsoxi", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T04:56:48Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-15T23:14:57Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(93232202, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("rocqsxy", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("qtcmiwdwisv", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("mey", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }
}
