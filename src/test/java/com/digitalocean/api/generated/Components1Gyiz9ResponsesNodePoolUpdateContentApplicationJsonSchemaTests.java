package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"node_pool\":{\"name\":\"wy\",\"count\":1842021804,\"tags\":[\"qldqabn\"],\"taints\":[{\"key\":\"bqxfbb\",\"value\":\"cfddofxnfb\",\"effect\":\"PreferNoSchedule\"},{\"key\":\"rqaedwo\",\"value\":\"cytjgoea\",\"effect\":\"NoExecute\"}],\"auto_scale\":false,\"min_nodes\":768416570,\"max_nodes\":806704541,\"nodes\":[{\"name\":\"hedb\",\"droplet_id\":\"dczvothmkh\",\"created_at\":\"2021-02-09T15:46:42Z\",\"updated_at\":\"2021-02-09T16:46:53Z\"}],\"size\":\"wfcn\"}}")
                        .toObject(Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema.class);
        Assertions.assertEquals("wfcn", model.getNodePool().getSize());
        Assertions.assertEquals("wy", model.getNodePool().getName());
        Assertions.assertEquals(1842021804, model.getNodePool().getCount());
        Assertions.assertEquals("qldqabn", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("bqxfbb", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("cfddofxnfb", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(
                KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.getNodePool().isAutoScale());
        Assertions.assertEquals(768416570, model.getNodePool().getMinNodes());
        Assertions.assertEquals(806704541, model.getNodePool().getMaxNodes());
    }

    @Test
    public void testSerialize() {
        Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema model =
                new Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema()
                        .setNodePool(
                                new KubernetesNodePool()
                                        .setSize("wfcn")
                                        .setName("wy")
                                        .setCount(1842021804)
                                        .setTags(Arrays.asList("qldqabn"))
                                        .setTaints(
                                                Arrays.asList(
                                                        new KubernetesNodePoolTaint()
                                                                .setKey("bqxfbb")
                                                                .setValue("cfddofxnfb")
                                                                .setEffect(
                                                                        KubernetesNodePoolTaintEffect
                                                                                .PREFER_NO_SCHEDULE),
                                                        new KubernetesNodePoolTaint()
                                                                .setKey("rqaedwo")
                                                                .setValue("cytjgoea")
                                                                .setEffect(KubernetesNodePoolTaintEffect.NO_EXECUTE)))
                                        .setAutoScale(false)
                                        .setMinNodes(768416570)
                                        .setMaxNodes(806704541));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Gyiz9ResponsesNodePoolUpdateContentApplicationJsonSchema.class);
        Assertions.assertEquals("wfcn", model.getNodePool().getSize());
        Assertions.assertEquals("wy", model.getNodePool().getName());
        Assertions.assertEquals(1842021804, model.getNodePool().getCount());
        Assertions.assertEquals("qldqabn", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("bqxfbb", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("cfddofxnfb", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(
                KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.getNodePool().isAutoScale());
        Assertions.assertEquals(768416570, model.getNodePool().getMinNodes());
        Assertions.assertEquals(806704541, model.getNodePool().getMaxNodes());
    }
}
