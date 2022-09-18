package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsCreateDeploymentRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsCreateDeploymentRequestTests {
    @Test
    public void testDeserialize() {
        AppsCreateDeploymentRequest model = BinaryData.fromString("{\"force_build\":false}").toObject(AppsCreateDeploymentRequest.class);
        Assertions.assertEquals(false, model.isForceBuild());
    }

    @Test
    public void testSerialize() {
        AppsCreateDeploymentRequest model = new AppsCreateDeploymentRequest().setForceBuild(false);
        model = BinaryData.fromObject(model).toObject(AppsCreateDeploymentRequest.class);
        Assertions.assertEquals(false, model.isForceBuild());
    }
}
