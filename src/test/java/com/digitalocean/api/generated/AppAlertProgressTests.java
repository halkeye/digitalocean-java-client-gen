package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertProgress;
import com.digitalocean.api.models.AppAlertProgressStep;
import com.digitalocean.api.models.AppAlertProgressStepReason;
import com.digitalocean.api.models.AppAlertProgressStepStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertProgressTests {
    @Test
    public void testDeserialize() {
        AppAlertProgress model =
                BinaryData.fromString(
                                "{\"steps\":[{\"name\":\"pldqqct\",\"status\":\"UNKNOWN\",\"started_at\":\"2021-11-28T20:48:06Z\",\"ended_at\":\"2021-01-13T21:15:49Z\",\"reason\":{\"code\":\"jqvq\",\"message\":\"wehtaemxh\"}},{\"name\":\"ysev\",\"status\":\"UNKNOWN\",\"started_at\":\"2021-05-26T10:14:06Z\",\"ended_at\":\"2021-12-06T00:37:01Z\",\"reason\":{\"code\":\"yveimipsk\",\"message\":\"zatvfuzka\"}}]}")
                        .toObject(AppAlertProgress.class);
        Assertions.assertEquals("pldqqct", model.getSteps().get(0).getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.UNKNOWN, model.getSteps().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T20:48:06Z"), model.getSteps().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T21:15:49Z"), model.getSteps().get(0).getEndedAt());
        Assertions.assertEquals("jqvq", model.getSteps().get(0).getReason().getCode());
        Assertions.assertEquals("wehtaemxh", model.getSteps().get(0).getReason().getMessage());
    }

    @Test
    public void testSerialize() {
        AppAlertProgress model =
                new AppAlertProgress()
                        .setSteps(
                                Arrays.asList(
                                        new AppAlertProgressStep()
                                                .setName("pldqqct")
                                                .setStatus(AppAlertProgressStepStatus.UNKNOWN)
                                                .setStartedAt(OffsetDateTime.parse("2021-11-28T20:48:06Z"))
                                                .setEndedAt(OffsetDateTime.parse("2021-01-13T21:15:49Z"))
                                                .setReason(
                                                        new AppAlertProgressStepReason()
                                                                .setCode("jqvq")
                                                                .setMessage("wehtaemxh")),
                                        new AppAlertProgressStep()
                                                .setName("ysev")
                                                .setStatus(AppAlertProgressStepStatus.UNKNOWN)
                                                .setStartedAt(OffsetDateTime.parse("2021-05-26T10:14:06Z"))
                                                .setEndedAt(OffsetDateTime.parse("2021-12-06T00:37:01Z"))
                                                .setReason(
                                                        new AppAlertProgressStepReason()
                                                                .setCode("yveimipsk")
                                                                .setMessage("zatvfuzka"))));
        model = BinaryData.fromObject(model).toObject(AppAlertProgress.class);
        Assertions.assertEquals("pldqqct", model.getSteps().get(0).getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.UNKNOWN, model.getSteps().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T20:48:06Z"), model.getSteps().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T21:15:49Z"), model.getSteps().get(0).getEndedAt());
        Assertions.assertEquals("jqvq", model.getSteps().get(0).getReason().getCode());
        Assertions.assertEquals("wehtaemxh", model.getSteps().get(0).getReason().getMessage());
    }
}
