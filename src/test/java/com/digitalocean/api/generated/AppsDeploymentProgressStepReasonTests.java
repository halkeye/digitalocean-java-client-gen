package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentProgressStepReason;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentProgressStepReasonTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentProgressStepReason model =
                BinaryData.fromString("{\"code\":\"as\",\"message\":\"haq\"}")
                        .toObject(AppsDeploymentProgressStepReason.class);
        Assertions.assertEquals("as", model.getCode());
        Assertions.assertEquals("haq", model.getMessage());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentProgressStepReason model = new AppsDeploymentProgressStepReason().setCode("as").setMessage("haq");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentProgressStepReason.class);
        Assertions.assertEquals("as", model.getCode());
        Assertions.assertEquals("haq", model.getMessage());
    }
}
