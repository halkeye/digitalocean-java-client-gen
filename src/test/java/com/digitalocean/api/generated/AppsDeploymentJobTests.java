package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentJob;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentJobTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentJob model = BinaryData.fromString("{\"name\":\"ypbsfgytguslfead\",\"source_commit_hash\":\"gq\"}").toObject(AppsDeploymentJob.class);
        Assertions.assertEquals("ypbsfgytguslfead", model.getName());
        Assertions.assertEquals("gq", model.getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentJob model = new AppsDeploymentJob().setName("ypbsfgytguslfead").setSourceCommitHash("gq");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentJob.class);
        Assertions.assertEquals("ypbsfgytguslfead", model.getName());
        Assertions.assertEquals("gq", model.getSourceCommitHash());
    }
}
