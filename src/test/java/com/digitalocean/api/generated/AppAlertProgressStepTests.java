package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertProgressStep;
import com.digitalocean.api.models.AppAlertProgressStepReason;
import com.digitalocean.api.models.AppAlertProgressStepStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertProgressStepTests {
    @Test
    public void testDeserialize() {
        AppAlertProgressStep model =
                BinaryData.fromString(
                                "{\"name\":\"jvvruxwigsyei\",\"status\":\"UNKNOWN\",\"started_at\":\"2021-08-13T07:56:44Z\",\"ended_at\":\"2021-03-14T18:33:51Z\",\"reason\":{\"code\":\"qgdgkkile\",\"message\":\"kcsmk\"}}")
                        .toObject(AppAlertProgressStep.class);
        Assertions.assertEquals("jvvruxwigsyei", model.getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.UNKNOWN, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-13T07:56:44Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-14T18:33:51Z"), model.getEndedAt());
        Assertions.assertEquals("qgdgkkile", model.getReason().getCode());
        Assertions.assertEquals("kcsmk", model.getReason().getMessage());
    }

    @Test
    public void testSerialize() {
        AppAlertProgressStep model =
                new AppAlertProgressStep()
                        .setName("jvvruxwigsyei")
                        .setStatus(AppAlertProgressStepStatus.UNKNOWN)
                        .setStartedAt(OffsetDateTime.parse("2021-08-13T07:56:44Z"))
                        .setEndedAt(OffsetDateTime.parse("2021-03-14T18:33:51Z"))
                        .setReason(new AppAlertProgressStepReason().setCode("qgdgkkile").setMessage("kcsmk"));
        model = BinaryData.fromObject(model).toObject(AppAlertProgressStep.class);
        Assertions.assertEquals("jvvruxwigsyei", model.getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.UNKNOWN, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-13T07:56:44Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-14T18:33:51Z"), model.getEndedAt());
        Assertions.assertEquals("qgdgkkile", model.getReason().getCode());
        Assertions.assertEquals("kcsmk", model.getReason().getMessage());
    }
}
