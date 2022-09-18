package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertProgressStepReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertProgressStepReasonTests {
    @Test
    public void testDeserialize() {
        AppAlertProgressStepReason model = BinaryData.fromString("{\"code\":\"wtbbaedorvvmqf\",\"message\":\"ygbdgwumgxdgdhpa\"}").toObject(AppAlertProgressStepReason.class);
        Assertions.assertEquals("wtbbaedorvvmqf", model.getCode());
        Assertions.assertEquals("ygbdgwumgxdgdhpa", model.getMessage());
    }

    @Test
    public void testSerialize() {
        AppAlertProgressStepReason model = new AppAlertProgressStepReason().setCode("wtbbaedorvvmqf").setMessage("ygbdgwumgxdgdhpa");
        model = BinaryData.fromObject(model).toObject(AppAlertProgressStepReason.class);
        Assertions.assertEquals("wtbbaedorvvmqf", model.getCode());
        Assertions.assertEquals("ygbdgwumgxdgdhpa", model.getMessage());
    }
}
