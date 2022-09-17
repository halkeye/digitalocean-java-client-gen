package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentProgress;
import com.digitalocean.api.models.AppsDeploymentProgressStep;
import com.digitalocean.api.models.AppsDeploymentProgressStepReason;
import com.digitalocean.api.models.AppsDeploymentProgressStepStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentProgressTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentProgress model =
                BinaryData.fromString(
                                "{\"error_steps\":767551661,\"pending_steps\":1720208183,\"running_steps\":670463751,\"steps\":[{\"component_name\":\"h\",\"ended_at\":\"2021-05-15T13:33:35Z\",\"message_base\":\"p\",\"name\":\"cstwity\",\"reason\":{\"code\":\"vxccedcp\",\"message\":\"dyodnwzxltj\"},\"started_at\":\"2021-10-06T13:51:27Z\",\"status\":\"UNKNOWN\",\"steps\":[]}],\"success_steps\":841084025,\"summary_steps\":[{\"component_name\":\"avvwxqi\",\"ended_at\":\"2021-05-18T05:36:02Z\",\"message_base\":\"nyowxwlmdjrkvfg\",\"name\":\"fvpdbo\",\"reason\":{\"code\":\"izsjqlhkrr\",\"message\":\"deibqip\"},\"started_at\":\"2021-05-03T06:31:18Z\",\"status\":\"RUNNING\",\"steps\":[]},{\"component_name\":\"zwmk\",\"ended_at\":\"2021-01-17T19:32:36Z\",\"message_base\":\"jpjorwkqnyhgb\",\"name\":\"tjivfxzsjabib\",\"reason\":{\"code\":\"tawfsdjpvkvp\",\"message\":\"xbkzbzkdvncj\"},\"started_at\":\"2021-03-23T01:16:39Z\",\"status\":\"ERROR\",\"steps\":[]}],\"total_steps\":888866053}")
                        .toObject(AppsDeploymentProgress.class);
        Assertions.assertEquals(767551661, model.getErrorSteps());
        Assertions.assertEquals(1720208183, model.getPendingSteps());
        Assertions.assertEquals(670463751, model.getRunningSteps());
        Assertions.assertEquals("h", model.getSteps().get(0).getComponentName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T13:33:35Z"), model.getSteps().get(0).getEndedAt());
        Assertions.assertEquals("p", model.getSteps().get(0).getMessageBase());
        Assertions.assertEquals("cstwity", model.getSteps().get(0).getName());
        Assertions.assertEquals("vxccedcp", model.getSteps().get(0).getReason().getCode());
        Assertions.assertEquals("dyodnwzxltj", model.getSteps().get(0).getReason().getMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-06T13:51:27Z"), model.getSteps().get(0).getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.UNKNOWN, model.getSteps().get(0).getStatus());
        Assertions.assertEquals(841084025, model.getSuccessSteps());
        Assertions.assertEquals("avvwxqi", model.getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-18T05:36:02Z"), model.getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("nyowxwlmdjrkvfg", model.getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("fvpdbo", model.getSummarySteps().get(0).getName());
        Assertions.assertEquals("izsjqlhkrr", model.getSummarySteps().get(0).getReason().getCode());
        Assertions.assertEquals("deibqip", model.getSummarySteps().get(0).getReason().getMessage());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-03T06:31:18Z"), model.getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.RUNNING, model.getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(888866053, model.getTotalSteps());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentProgress model =
                new AppsDeploymentProgress()
                        .setErrorSteps(767551661)
                        .setPendingSteps(1720208183)
                        .setRunningSteps(670463751)
                        .setSteps(
                                Arrays.asList(
                                        new AppsDeploymentProgressStep()
                                                .setComponentName("h")
                                                .setEndedAt(OffsetDateTime.parse("2021-05-15T13:33:35Z"))
                                                .setMessageBase("p")
                                                .setName("cstwity")
                                                .setReason(
                                                        new AppsDeploymentProgressStepReason()
                                                                .setCode("vxccedcp")
                                                                .setMessage("dyodnwzxltj"))
                                                .setStartedAt(OffsetDateTime.parse("2021-10-06T13:51:27Z"))
                                                .setStatus(AppsDeploymentProgressStepStatus.UNKNOWN)
                                                .setSteps(Arrays.asList())))
                        .setSuccessSteps(841084025)
                        .setSummarySteps(
                                Arrays.asList(
                                        new AppsDeploymentProgressStep()
                                                .setComponentName("avvwxqi")
                                                .setEndedAt(OffsetDateTime.parse("2021-05-18T05:36:02Z"))
                                                .setMessageBase("nyowxwlmdjrkvfg")
                                                .setName("fvpdbo")
                                                .setReason(
                                                        new AppsDeploymentProgressStepReason()
                                                                .setCode("izsjqlhkrr")
                                                                .setMessage("deibqip"))
                                                .setStartedAt(OffsetDateTime.parse("2021-05-03T06:31:18Z"))
                                                .setStatus(AppsDeploymentProgressStepStatus.RUNNING)
                                                .setSteps(Arrays.asList()),
                                        new AppsDeploymentProgressStep()
                                                .setComponentName("zwmk")
                                                .setEndedAt(OffsetDateTime.parse("2021-01-17T19:32:36Z"))
                                                .setMessageBase("jpjorwkqnyhgb")
                                                .setName("tjivfxzsjabib")
                                                .setReason(
                                                        new AppsDeploymentProgressStepReason()
                                                                .setCode("tawfsdjpvkvp")
                                                                .setMessage("xbkzbzkdvncj"))
                                                .setStartedAt(OffsetDateTime.parse("2021-03-23T01:16:39Z"))
                                                .setStatus(AppsDeploymentProgressStepStatus.ERROR)
                                                .setSteps(Arrays.asList())))
                        .setTotalSteps(888866053);
        model = BinaryData.fromObject(model).toObject(AppsDeploymentProgress.class);
        Assertions.assertEquals(767551661, model.getErrorSteps());
        Assertions.assertEquals(1720208183, model.getPendingSteps());
        Assertions.assertEquals(670463751, model.getRunningSteps());
        Assertions.assertEquals("h", model.getSteps().get(0).getComponentName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T13:33:35Z"), model.getSteps().get(0).getEndedAt());
        Assertions.assertEquals("p", model.getSteps().get(0).getMessageBase());
        Assertions.assertEquals("cstwity", model.getSteps().get(0).getName());
        Assertions.assertEquals("vxccedcp", model.getSteps().get(0).getReason().getCode());
        Assertions.assertEquals("dyodnwzxltj", model.getSteps().get(0).getReason().getMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-06T13:51:27Z"), model.getSteps().get(0).getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.UNKNOWN, model.getSteps().get(0).getStatus());
        Assertions.assertEquals(841084025, model.getSuccessSteps());
        Assertions.assertEquals("avvwxqi", model.getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-18T05:36:02Z"), model.getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("nyowxwlmdjrkvfg", model.getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("fvpdbo", model.getSummarySteps().get(0).getName());
        Assertions.assertEquals("izsjqlhkrr", model.getSummarySteps().get(0).getReason().getCode());
        Assertions.assertEquals("deibqip", model.getSummarySteps().get(0).getReason().getMessage());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-03T06:31:18Z"), model.getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.RUNNING, model.getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(888866053, model.getTotalSteps());
    }
}
