package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsRollbackAppRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsRollbackAppRequestTests {
    @Test
    public void testDeserialize() {
        AppsRollbackAppRequest model = BinaryData.fromString("{\"deployment_id\":\"fsetz\",\"skip_pin\":true}").toObject(AppsRollbackAppRequest.class);
        Assertions.assertEquals("fsetz", model.getDeploymentId());
        Assertions.assertEquals(true, model.isSkipPin());
    }

    @Test
    public void testSerialize() {
        AppsRollbackAppRequest model = new AppsRollbackAppRequest().setDeploymentId("fsetz").setSkipPin(true);
        model = BinaryData.fromObject(model).toObject(AppsRollbackAppRequest.class);
        Assertions.assertEquals("fsetz", model.getDeploymentId());
        Assertions.assertEquals(true, model.isSkipPin());
    }
}
