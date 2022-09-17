package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"node_pools\":[{\"name\":\"xsqcowscuyfqlam\",\"count\":578004367,\"tags\":[\"u\",\"k\",\"fu\",\"pn\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":487218261,\"max_nodes\":1859577844,\"nodes\":[],\"size\":\"rbrct\"},{\"name\":\"oocqsazmzlpc\",\"count\":415205509,\"tags\":[\"xxr\",\"ic\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":1959146131,\"max_nodes\":1679768391,\"nodes\":[],\"size\":\"e\"},{\"name\":\"finmp\",\"count\":976296889,\"tags\":[\"kjr\",\"fwkyluobdxw\",\"qdcclcv\",\"srupayl\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":1758659043,\"max_nodes\":270029055,\"nodes\":[],\"size\":\"jxlpiy\"}]}")
                        .toObject(ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema.class);
        Assertions.assertEquals("rbrct", model.getNodePools().get(0).getSize());
        Assertions.assertEquals("xsqcowscuyfqlam", model.getNodePools().get(0).getName());
        Assertions.assertEquals(578004367, model.getNodePools().get(0).getCount());
        Assertions.assertEquals("u", model.getNodePools().get(0).getTags().get(0));
        Assertions.assertEquals(false, model.getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(487218261, model.getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1859577844, model.getNodePools().get(0).getMaxNodes());
    }

    @Test
    public void testSerialize() {
        ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema model =
                new ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema()
                        .setNodePools(
                                Arrays.asList(
                                        new KubernetesNodePool()
                                                .setSize("rbrct")
                                                .setName("xsqcowscuyfqlam")
                                                .setCount(578004367)
                                                .setTags(Arrays.asList("u", "k", "fu", "pn"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(487218261)
                                                .setMaxNodes(1859577844),
                                        new KubernetesNodePool()
                                                .setSize("e")
                                                .setName("oocqsazmzlpc")
                                                .setCount(415205509)
                                                .setTags(Arrays.asList("xxr", "ic"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(1959146131)
                                                .setMaxNodes(1679768391),
                                        new KubernetesNodePool()
                                                .setSize("jxlpiy")
                                                .setName("finmp")
                                                .setCount(976296889)
                                                .setTags(Arrays.asList("kjr", "fwkyluobdxw", "qdcclcv", "srupayl"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(1758659043)
                                                .setMaxNodes(270029055)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsN4Czx7ResponsesAllNodePoolsContentApplicationJsonSchema.class);
        Assertions.assertEquals("rbrct", model.getNodePools().get(0).getSize());
        Assertions.assertEquals("xsqcowscuyfqlam", model.getNodePools().get(0).getName());
        Assertions.assertEquals(578004367, model.getNodePools().get(0).getCount());
        Assertions.assertEquals("u", model.getNodePools().get(0).getTags().get(0));
        Assertions.assertEquals(false, model.getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(487218261, model.getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1859577844, model.getNodePools().get(0).getMaxNodes());
    }
}
