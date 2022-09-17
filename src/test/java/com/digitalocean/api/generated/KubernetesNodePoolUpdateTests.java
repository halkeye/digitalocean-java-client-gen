package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import com.digitalocean.api.models.KubernetesNodePoolUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesNodePoolUpdateTests {
    @Test
    public void testDeserialize() {
        KubernetesNodePoolUpdate model =
                BinaryData.fromString(
                                "{\"name\":\"x\",\"count\":829231750,\"tags\":[\"xvmdr\",\"ynbgovazoymdvhhp\",\"khwwdkatve\",\"mgkcswzey\"],\"taints\":[{\"key\":\"r\",\"value\":\"p\",\"effect\":\"NoSchedule\"}],\"auto_scale\":false,\"min_nodes\":38657703,\"max_nodes\":539074796,\"nodes\":[{\"name\":\"lvhqpoilo\",\"status\":{\"state\":\"draining\"},\"droplet_id\":\"cez\",\"created_at\":\"2021-08-27T19:49:27Z\",\"updated_at\":\"2021-10-24T11:36:31Z\"},{\"name\":\"l\",\"status\":{\"state\":\"provisioning\"},\"droplet_id\":\"ghztmsmiwtpcfl\",\"created_at\":\"2021-08-18T09:23:36Z\",\"updated_at\":\"2021-04-21T02:35:40Z\"},{\"name\":\"wiftdjtvbfpfhr\",\"status\":{\"state\":\"deleting\"},\"droplet_id\":\"qcjnqsw\",\"created_at\":\"2021-02-03T20:11:41Z\",\"updated_at\":\"2021-08-17T10:45:54Z\"},{\"name\":\"qukr\",\"status\":{\"state\":\"deleting\"},\"droplet_id\":\"clqddnhfknebw\",\"created_at\":\"2021-08-14T10:23:19Z\",\"updated_at\":\"2021-04-15T15:02:51Z\"}]}")
                        .toObject(KubernetesNodePoolUpdate.class);
        Assertions.assertEquals("x", model.getName());
        Assertions.assertEquals(829231750, model.getCount());
        Assertions.assertEquals("xvmdr", model.getTags().get(0));
        Assertions.assertEquals("r", model.getTaints().get(0).getKey());
        Assertions.assertEquals("p", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(38657703, model.getMinNodes());
        Assertions.assertEquals(539074796, model.getMaxNodes());
    }

    @Test
    public void testSerialize() {
        KubernetesNodePoolUpdate model =
                new KubernetesNodePoolUpdate()
                        .setName("x")
                        .setCount(829231750)
                        .setTags(Arrays.asList("xvmdr", "ynbgovazoymdvhhp", "khwwdkatve", "mgkcswzey"))
                        .setTaints(
                                Arrays.asList(
                                        new KubernetesNodePoolTaint()
                                                .setKey("r")
                                                .setValue("p")
                                                .setEffect(KubernetesNodePoolTaintEffect.NO_SCHEDULE)))
                        .setAutoScale(false)
                        .setMinNodes(38657703)
                        .setMaxNodes(539074796);
        model = BinaryData.fromObject(model).toObject(KubernetesNodePoolUpdate.class);
        Assertions.assertEquals("x", model.getName());
        Assertions.assertEquals(829231750, model.getCount());
        Assertions.assertEquals("xvmdr", model.getTags().get(0));
        Assertions.assertEquals("r", model.getTaints().get(0).getKey());
        Assertions.assertEquals("p", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(38657703, model.getMinNodes());
        Assertions.assertEquals(539074796, model.getMaxNodes());
    }
}
