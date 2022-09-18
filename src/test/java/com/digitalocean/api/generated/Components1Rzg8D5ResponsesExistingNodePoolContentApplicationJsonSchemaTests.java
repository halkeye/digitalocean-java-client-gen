package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema model = BinaryData.fromString("{\"node_pool\":{\"name\":\"hqld\",\"count\":650212115,\"tags\":[\"sw\"],\"taints\":[{\"key\":\"wqnghxnimvyuj\",\"value\":\"gunnqgypuqt\",\"effect\":\"PreferNoSchedule\"},{\"key\":\"uevqmvyumgmm\",\"value\":\"bsnznwgsqufm\",\"effect\":\"NoSchedule\"},{\"key\":\"oseqcazisvb\",\"value\":\"gcyjpgawepk\",\"effect\":\"NoSchedule\"}],\"auto_scale\":true,\"min_nodes\":392400610,\"max_nodes\":962734151,\"nodes\":[{\"name\":\"gblxbu\",\"droplet_id\":\"vjztaflvsmfj\",\"created_at\":\"2021-11-30T20:45:17Z\",\"updated_at\":\"2021-05-29T06:42:35Z\"},{\"name\":\"rttjfuqmm\",\"droplet_id\":\"wfeqbavd\",\"created_at\":\"2021-10-27T14:58:30Z\",\"updated_at\":\"2020-12-22T07:29:10Z\"},{\"name\":\"fm\",\"droplet_id\":\"vxgwz\",\"created_at\":\"2021-03-29T14:56:34Z\",\"updated_at\":\"2021-09-15T16:42:25Z\"}],\"size\":\"cjgpvcqzvzrb\"}}").toObject(Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjgpvcqzvzrb", model.getNodePool().getSize());
        Assertions.assertEquals("hqld", model.getNodePool().getName());
        Assertions.assertEquals(650212115, model.getNodePool().getCount());
        Assertions.assertEquals("sw", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("wqnghxnimvyuj", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("gunnqgypuqt", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(true, model.getNodePool().isAutoScale());
        Assertions.assertEquals(392400610, model.getNodePool().getMinNodes());
        Assertions.assertEquals(962734151, model.getNodePool().getMaxNodes());
    }

    @Test
    public void testSerialize() {
        Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema model = new Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema().setNodePool(new KubernetesNodePool().setSize("cjgpvcqzvzrb").setName("hqld").setCount(650212115).setTags(Arrays.asList("sw")).setTaints(Arrays.asList(new KubernetesNodePoolTaint().setKey("wqnghxnimvyuj").setValue("gunnqgypuqt").setEffect(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE), new KubernetesNodePoolTaint().setKey("uevqmvyumgmm").setValue("bsnznwgsqufm").setEffect(KubernetesNodePoolTaintEffect.NO_SCHEDULE), new KubernetesNodePoolTaint().setKey("oseqcazisvb").setValue("gcyjpgawepk").setEffect(KubernetesNodePoolTaintEffect.NO_SCHEDULE))).setAutoScale(true).setMinNodes(392400610).setMaxNodes(962734151));
        model = BinaryData.fromObject(model).toObject(Components1Rzg8D5ResponsesExistingNodePoolContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjgpvcqzvzrb", model.getNodePool().getSize());
        Assertions.assertEquals("hqld", model.getNodePool().getName());
        Assertions.assertEquals(650212115, model.getNodePool().getCount());
        Assertions.assertEquals("sw", model.getNodePool().getTags().get(0));
        Assertions.assertEquals("wqnghxnimvyuj", model.getNodePool().getTaints().get(0).getKey());
        Assertions.assertEquals("gunnqgypuqt", model.getNodePool().getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getNodePool().getTaints().get(0).getEffect());
        Assertions.assertEquals(true, model.getNodePool().isAutoScale());
        Assertions.assertEquals(392400610, model.getNodePool().getMinNodes());
        Assertions.assertEquals(962734151, model.getNodePool().getMaxNodes());
    }
}
