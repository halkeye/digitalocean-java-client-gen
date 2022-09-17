package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final
class Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
                model =
                        BinaryData.fromString("{\"nodes\":[\"po\",\"lhscmyh\",\"hjvszfq\",\"okndwpppqwojoevz\"]}")
                                .toObject(
                                        Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
                                                .class);
        Assertions.assertEquals("po", model.getNodes().get(0));
    }

    @Test
    public void testSerialize() {
        Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
                model =
                        new Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema()
                                .setNodes(Arrays.asList("po", "lhscmyh", "hjvszfq", "okndwpppqwojoevz"));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("po", model.getNodes().get(0));
    }
}
