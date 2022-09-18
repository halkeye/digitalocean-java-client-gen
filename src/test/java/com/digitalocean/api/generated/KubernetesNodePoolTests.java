package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.KubernetesNodePoolSize;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import com.digitalocean.api.models.Node;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesNodePoolTests {
    @Test
    public void testDeserialize() {
        KubernetesNodePool model = BinaryData.fromString("{\"name\":\"wnghojo\",\"count\":916967136,\"tags\":[\"micjixxfsf\",\"crtnuguefxxi\"],\"taints\":[{\"key\":\"veywetkrhlolmcn\",\"value\":\"pfgsvbbvaqdljnp\",\"effect\":\"PreferNoSchedule\"},{\"key\":\"n\",\"value\":\"etawevx\",\"effect\":\"PreferNoSchedule\"},{\"key\":\"kdxl\",\"value\":\"vdovbrb\",\"effect\":\"NoExecute\"}],\"auto_scale\":false,\"min_nodes\":1265726343,\"max_nodes\":220876789,\"nodes\":[{\"name\":\"cbnygd\",\"status\":{\"state\":\"draining\"},\"droplet_id\":\"bpwyykd\",\"created_at\":\"2020-12-22T08:32:32Z\",\"updated_at\":\"2021-02-03T07:20:15Z\"}],\"size\":\"zndasdnidmj\"}").toObject(KubernetesNodePool.class);
        Assertions.assertEquals("zndasdnidmj", model.getSize());
        Assertions.assertEquals("wnghojo", model.getName());
        Assertions.assertEquals(916967136, model.getCount());
        Assertions.assertEquals("micjixxfsf", model.getTags().get(0));
        Assertions.assertEquals("veywetkrhlolmcn", model.getTaints().get(0).getKey());
        Assertions.assertEquals("pfgsvbbvaqdljnp", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(1265726343, model.getMinNodes());
        Assertions.assertEquals(220876789, model.getMaxNodes());
    }

    @Test
    public void testSerialize() {
        KubernetesNodePool model = new KubernetesNodePool().setSize("zndasdnidmj").setName("wnghojo").setCount(916967136).setTags(Arrays.asList("micjixxfsf", "crtnuguefxxi")).setTaints(Arrays.asList(new KubernetesNodePoolTaint().setKey("veywetkrhlolmcn").setValue("pfgsvbbvaqdljnp").setEffect(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE), new KubernetesNodePoolTaint().setKey("n").setValue("etawevx").setEffect(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE), new KubernetesNodePoolTaint().setKey("kdxl").setValue("vdovbrb").setEffect(KubernetesNodePoolTaintEffect.NO_EXECUTE))).setAutoScale(false).setMinNodes(1265726343).setMaxNodes(220876789);
        model = BinaryData.fromObject(model).toObject(KubernetesNodePool.class);
        Assertions.assertEquals("zndasdnidmj", model.getSize());
        Assertions.assertEquals("wnghojo", model.getName());
        Assertions.assertEquals(916967136, model.getCount());
        Assertions.assertEquals("micjixxfsf", model.getTags().get(0));
        Assertions.assertEquals("veywetkrhlolmcn", model.getTaints().get(0).getKey());
        Assertions.assertEquals("pfgsvbbvaqdljnp", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(1265726343, model.getMinNodes());
        Assertions.assertEquals(220876789, model.getMaxNodes());
    }
}
