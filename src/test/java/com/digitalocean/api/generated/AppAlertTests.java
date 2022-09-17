package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlert;
import com.digitalocean.api.models.AppAlertPhase;
import com.digitalocean.api.models.AppAlertProgress;
import com.digitalocean.api.models.AppAlertProgressStep;
import com.digitalocean.api.models.AppAlertProgressStepStatus;
import com.digitalocean.api.models.AppAlertSlackWebhook;
import com.digitalocean.api.models.AppAlertSpec;
import com.digitalocean.api.models.AppAlertSpecOperator;
import com.digitalocean.api.models.AppAlertSpecRule;
import com.digitalocean.api.models.AppAlertSpecWindow;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertTests {
    @Test
    public void testDeserialize() {
        AppAlert model =
                BinaryData.fromString(
                                "{\"id\":\"oytehqpuvjm\",\"component_name\":\"mtdwcky\",\"spec\":{\"rule\":\"FUNCTIONS_ERROR_RATE_PER_MINUTE\",\"disabled\":false,\"operator\":\"LESS_THAN\",\"value\":35.76125,\"window\":\"THIRTY_MINUTES\"},\"emails\":[\"kb\",\"req\",\"n\"],\"slack_webhooks\":[{\"url\":\"sfaq\",\"channel\":\"pl\"},{\"url\":\"ysh\",\"channel\":\"d\"},{\"url\":\"bxgkqusy\",\"channel\":\"ptdacarvvl\"}],\"phase\":\"ERROR\",\"progress\":{\"steps\":[{\"name\":\"oiwenazerohzrsq\",\"status\":\"ERROR\",\"started_at\":\"2020-12-24T05:18:03Z\",\"ended_at\":\"2021-09-29T20:04:11Z\"}]}}")
                        .toObject(AppAlert.class);
        Assertions.assertEquals("mtdwcky", model.getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.FUNCTIONS_ERROR_RATE_PERMINUTE, model.getSpec().getRule());
        Assertions.assertEquals(false, model.getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.LESS_THAN, model.getSpec().getOperator());
        Assertions.assertEquals(35.76125F, model.getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.THIRTY_MINUTES, model.getSpec().getWindow());
        Assertions.assertEquals("kb", model.getEmails().get(0));
        Assertions.assertEquals("sfaq", model.getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("pl", model.getSlackWebhooks().get(0).getChannel());
        Assertions.assertEquals(AppAlertPhase.ERROR, model.getPhase());
        Assertions.assertEquals("oiwenazerohzrsq", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.ERROR, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-24T05:18:03Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-29T20:04:11Z"), model.getProgress().getSteps().get(0).getEndedAt());
    }

    @Test
    public void testSerialize() {
        AppAlert model =
                new AppAlert()
                        .setComponentName("mtdwcky")
                        .setSpec(
                                new AppAlertSpec()
                                        .setRule(AppAlertSpecRule.FUNCTIONS_ERROR_RATE_PERMINUTE)
                                        .setDisabled(false)
                                        .setOperator(AppAlertSpecOperator.LESS_THAN)
                                        .setValue(35.76125F)
                                        .setWindow(AppAlertSpecWindow.THIRTY_MINUTES))
                        .setEmails(Arrays.asList("kb", "req", "n"))
                        .setSlackWebhooks(
                                Arrays.asList(
                                        new AppAlertSlackWebhook().setUrl("sfaq").setChannel("pl"),
                                        new AppAlertSlackWebhook().setUrl("ysh").setChannel("d"),
                                        new AppAlertSlackWebhook().setUrl("bxgkqusy").setChannel("ptdacarvvl")))
                        .setPhase(AppAlertPhase.ERROR)
                        .setProgress(
                                new AppAlertProgress()
                                        .setSteps(
                                                Arrays.asList(
                                                        new AppAlertProgressStep()
                                                                .setName("oiwenazerohzrsq")
                                                                .setStatus(AppAlertProgressStepStatus.ERROR)
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2020-12-24T05:18:03Z"))
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse(
                                                                                "2021-09-29T20:04:11Z")))));
        model = BinaryData.fromObject(model).toObject(AppAlert.class);
        Assertions.assertEquals("mtdwcky", model.getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.FUNCTIONS_ERROR_RATE_PERMINUTE, model.getSpec().getRule());
        Assertions.assertEquals(false, model.getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.LESS_THAN, model.getSpec().getOperator());
        Assertions.assertEquals(35.76125F, model.getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.THIRTY_MINUTES, model.getSpec().getWindow());
        Assertions.assertEquals("kb", model.getEmails().get(0));
        Assertions.assertEquals("sfaq", model.getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("pl", model.getSlackWebhooks().get(0).getChannel());
        Assertions.assertEquals(AppAlertPhase.ERROR, model.getPhase());
        Assertions.assertEquals("oiwenazerohzrsq", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(AppAlertProgressStepStatus.ERROR, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-24T05:18:03Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-29T20:04:11Z"), model.getProgress().getSteps().get(0).getEndedAt());
    }
}
