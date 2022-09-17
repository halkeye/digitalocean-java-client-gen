package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentServiceTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentService model =
                BinaryData.fromString("{\"name\":\"ss\",\"source_commit_hash\":\"u\"}")
                        .toObject(AppsDeploymentService.class);
        Assertions.assertEquals("ss", model.getName());
        Assertions.assertEquals("u", model.getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentService model = new AppsDeploymentService().setName("ss").setSourceCommitHash("u");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentService.class);
        Assertions.assertEquals("ss", model.getName());
        Assertions.assertEquals("u", model.getSourceCommitHash());
    }
}
