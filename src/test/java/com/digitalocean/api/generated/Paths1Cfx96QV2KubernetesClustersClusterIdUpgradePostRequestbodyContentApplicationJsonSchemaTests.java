package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"version\":\"gmos\"}")
                        .toObject(
                                Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("gmos", model.getVersion());
    }

    @Test
    public void testSerialize() {
        Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema model =
                new Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema()
                        .setVersion("gmos");
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("gmos", model.getVersion());
    }
}
