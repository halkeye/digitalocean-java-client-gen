package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentFunctions;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentFunctionsTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentFunctions model = BinaryData.fromString("{\"name\":\"yhejhzisxgfp\",\"source_commit_hash\":\"olppvksrpqvujz\",\"namespace\":\"ehtwdwrft\"}").toObject(AppsDeploymentFunctions.class);
        Assertions.assertEquals("yhejhzisxgfp", model.getName());
        Assertions.assertEquals("olppvksrpqvujz", model.getSourceCommitHash());
        Assertions.assertEquals("ehtwdwrft", model.getNamespace());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentFunctions model = new AppsDeploymentFunctions().setName("yhejhzisxgfp").setSourceCommitHash("olppvksrpqvujz").setNamespace("ehtwdwrft");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentFunctions.class);
        Assertions.assertEquals("yhejhzisxgfp", model.getName());
        Assertions.assertEquals("olppvksrpqvujz", model.getSourceCommitHash());
        Assertions.assertEquals("ehtwdwrft", model.getNamespace());
    }
}
