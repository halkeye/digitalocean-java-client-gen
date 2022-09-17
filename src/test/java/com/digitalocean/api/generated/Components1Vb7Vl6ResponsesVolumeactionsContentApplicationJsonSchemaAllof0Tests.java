package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.VolumeAction;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"actions\":[{\"type\":\"ctsawvxcimpthjrm\",\"resource_id\":1196226015,\"id\":854999249,\"status\":\"in-progress\",\"started_at\":\"2021-10-12T09:59:23Z\",\"completed_at\":\"2021-06-27T21:46:48Z\",\"resource_type\":\"nkn\",\"region\":{\"name\":\"uysjhvrr\",\"slug\":\"lfswarmybwmro\",\"available\":true}},{\"type\":\"uvjucfjisosfzlnr\",\"resource_id\":1336583143,\"id\":733639010,\"status\":\"in-progress\",\"started_at\":\"2021-04-28T19:34:33Z\",\"completed_at\":\"2021-08-09T12:06:51Z\",\"resource_type\":\"ax\",\"region\":{\"name\":\"vjixgofqdqwsjm\",\"slug\":\"huvrqpbxdoicqp\",\"available\":true}}]}")
                        .toObject(Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(854999249, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-12T09:59:23Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-27T21:46:48Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals("nkn", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("uysjhvrr", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("lfswarmybwmro", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals("ctsawvxcimpthjrm", model.getActions().get(0).getType());
        Assertions.assertEquals(1196226015, model.getActions().get(0).getResourceId());
    }

    @Test
    public void testSerialize() {
        Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 model =
                new Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0()
                        .setActions(
                                Arrays.asList(
                                        new VolumeAction()
                                                .setId(854999249)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setStartedAt(OffsetDateTime.parse("2021-10-12T09:59:23Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-06-27T21:46:48Z"))
                                                .setResourceType("nkn")
                                                .setRegion(
                                                        new Region()
                                                                .setName("uysjhvrr")
                                                                .setSlug("lfswarmybwmro")
                                                                .setAvailable(true))
                                                .setType("ctsawvxcimpthjrm")
                                                .setResourceId(1196226015),
                                        new VolumeAction()
                                                .setId(733639010)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setStartedAt(OffsetDateTime.parse("2021-04-28T19:34:33Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-08-09T12:06:51Z"))
                                                .setResourceType("ax")
                                                .setRegion(
                                                        new Region()
                                                                .setName("vjixgofqdqwsjm")
                                                                .setSlug("huvrqpbxdoicqp")
                                                                .setAvailable(true))
                                                .setType("uvjucfjisosfzlnr")
                                                .setResourceId(1336583143)));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(854999249, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-12T09:59:23Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-27T21:46:48Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals("nkn", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("uysjhvrr", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("lfswarmybwmro", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals("ctsawvxcimpthjrm", model.getActions().get(0).getType());
        Assertions.assertEquals(1196226015, model.getActions().get(0).getResourceId());
    }
}
