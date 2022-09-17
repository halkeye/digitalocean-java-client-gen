package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"node_pool\":{\"name\":\"fydrfbgcnyxb\",\"count\":2035344474,\"tags\":[\"mq\",\"ncgaull\",\"styygjq\",\"ulmwqgmhmqmiwx\"],\"taints\":[{\"key\":\"ucqfgufjnbxwbm\",\"value\":\"ukin\",\"effect\":\"PreferNoSchedule\"},{\"key\":\"gde\",\"value\":\"kzou\",\"effect\":\"NoSchedule\"},{\"key\":\"wpzrdwcgl\",\"value\":\"hgcand\",\"effect\":\"NoExecute\"}],\"auto_scale\":true,\"min_nodes\":134000347,\"max_nodes\":1131383097,\"nodes\":[{\"name\":\"nnckkpljdshv\",\"droplet_id\":\"dxccyijj\",\"created_at\":\"2021-03-14T03:29:54Z\",\"updated_at\":\"2021-11-01T13:19:38Z\"}],\"size\":\"rqnjxmvvsduydwnw\"}}")
                        .toObject(ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("rqnjxmvvsduydwnw", model.getNodePool().getSize());
        Assertions.assertEquals("fydrfbgcnyxb", model.getNodePool().getName());
        Assertions.assertEquals(2035344474, model.getNodePool().getCount());
        Assertions.assertEquals("mq", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("ucqfgufjnbxwbm", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("ukin", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(
                KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(true, model.getNodePool().isAutoScale());
        Assertions.assertEquals(134000347, model.getNodePool().getMinNodes());
        Assertions.assertEquals(1131383097, model.getNodePool().getMaxNodes());
    }

    @Test
    public void testSerialize() {
        ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema model =
                new ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema()
                        .setNodePool(
                                new KubernetesNodePool()
                                        .setSize("rqnjxmvvsduydwnw")
                                        .setName("fydrfbgcnyxb")
                                        .setCount(2035344474)
                                        .setTags(Arrays.asList("mq", "ncgaull", "styygjq", "ulmwqgmhmqmiwx"))
                                        .setTaints(
                                                Arrays.asList(
                                                        new KubernetesNodePoolTaint()
                                                                .setKey("ucqfgufjnbxwbm")
                                                                .setValue("ukin")
                                                                .setEffect(
                                                                        KubernetesNodePoolTaintEffect
                                                                                .PREFER_NO_SCHEDULE),
                                                        new KubernetesNodePoolTaint()
                                                                .setKey("gde")
                                                                .setValue("kzou")
                                                                .setEffect(KubernetesNodePoolTaintEffect.NO_SCHEDULE),
                                                        new KubernetesNodePoolTaint()
                                                                .setKey("wpzrdwcgl")
                                                                .setValue("hgcand")
                                                                .setEffect(KubernetesNodePoolTaintEffect.NO_EXECUTE)))
                                        .setAutoScale(true)
                                        .setMinNodes(134000347)
                                        .setMaxNodes(1131383097));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsQapjoxResponsesNodePoolCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("rqnjxmvvsduydwnw", model.getNodePool().getSize());
        Assertions.assertEquals("fydrfbgcnyxb", model.getNodePool().getName());
        Assertions.assertEquals(2035344474, model.getNodePool().getCount());
        Assertions.assertEquals("mq", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("ucqfgufjnbxwbm", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("ukin", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(
                KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(true, model.getNodePool().isAutoScale());
        Assertions.assertEquals(134000347, model.getNodePool().getMinNodes());
        Assertions.assertEquals(1131383097, model.getNodePool().getMaxNodes());
    }
}
