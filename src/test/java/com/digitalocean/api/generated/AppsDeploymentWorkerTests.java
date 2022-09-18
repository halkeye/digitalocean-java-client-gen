package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentWorker;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentWorkerTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentWorker model = BinaryData.fromString("{\"name\":\"eafidltugsresm\",\"source_commit_hash\":\"sjhoiftxfkfwegpr\"}").toObject(AppsDeploymentWorker.class);
        Assertions.assertEquals("eafidltugsresm", model.getName());
        Assertions.assertEquals("sjhoiftxfkfwegpr", model.getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentWorker model = new AppsDeploymentWorker().setName("eafidltugsresm").setSourceCommitHash("sjhoiftxfkfwegpr");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentWorker.class);
        Assertions.assertEquals("eafidltugsresm", model.getName());
        Assertions.assertEquals("sjhoiftxfkfwegpr", model.getSourceCommitHash());
    }
}
