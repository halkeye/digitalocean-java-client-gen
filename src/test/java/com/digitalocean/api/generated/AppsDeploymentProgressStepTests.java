package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentProgressStep;
import com.digitalocean.api.models.AppsDeploymentProgressStepReason;
import com.digitalocean.api.models.AppsDeploymentProgressStepStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentProgressStepTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentProgressStep model = BinaryData.fromString("{\"component_name\":\"mokzhjjklf\",\"ended_at\":\"2021-12-06T20:15:09Z\",\"message_base\":\"uwqlgzrfzeey\",\"name\":\"izikayuhq\",\"reason\":{\"code\":\"bs\",\"message\":\"bqwrvtldgm\"},\"started_at\":\"2021-08-05T07:24:51Z\",\"status\":\"PENDING\",\"steps\":[]}").toObject(AppsDeploymentProgressStep.class);
        Assertions.assertEquals("mokzhjjklf", model.getComponentName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-06T20:15:09Z"), model.getEndedAt());
        Assertions.assertEquals("uwqlgzrfzeey", model.getMessageBase());
        Assertions.assertEquals("izikayuhq", model.getName());
        Assertions.assertEquals("bs", model.getReason().getCode());
        Assertions.assertEquals("bqwrvtldgm", model.getReason().getMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T07:24:51Z"), model.getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.PENDING, model.getStatus());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentProgressStep model = new AppsDeploymentProgressStep().setComponentName("mokzhjjklf").setEndedAt(OffsetDateTime.parse("2021-12-06T20:15:09Z")).setMessageBase("uwqlgzrfzeey").setName("izikayuhq").setReason(new AppsDeploymentProgressStepReason().setCode("bs").setMessage("bqwrvtldgm")).setStartedAt(OffsetDateTime.parse("2021-08-05T07:24:51Z")).setStatus(AppsDeploymentProgressStepStatus.PENDING).setSteps(Arrays.asList());
        model = BinaryData.fromObject(model).toObject(AppsDeploymentProgressStep.class);
        Assertions.assertEquals("mokzhjjklf", model.getComponentName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-06T20:15:09Z"), model.getEndedAt());
        Assertions.assertEquals("uwqlgzrfzeey", model.getMessageBase());
        Assertions.assertEquals("izikayuhq", model.getName());
        Assertions.assertEquals("bs", model.getReason().getCode());
        Assertions.assertEquals("bqwrvtldgm", model.getReason().getMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T07:24:51Z"), model.getStartedAt());
        Assertions.assertEquals(AppsDeploymentProgressStepStatus.PENDING, model.getStatus());
    }
}
