package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesNodePoolBase;
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

public final class KubernetesNodePoolBaseTests {
    @Test
    public void testDeserialize() {
        KubernetesNodePoolBase model = BinaryData.fromString("{\"name\":\"caz\",\"count\":166681185,\"tags\":[\"zffzjwztsmp\",\"hggryelgf\",\"atig\",\"gfrrkdknczgoryw\"],\"taints\":[{\"key\":\"vmd\",\"value\":\"dlhqvbkarbpyhssr\",\"effect\":\"PreferNoSchedule\"}],\"auto_scale\":false,\"min_nodes\":308889962,\"max_nodes\":1950662560,\"nodes\":[{\"name\":\"ebxxopyic\",\"status\":{\"state\":\"running\"},\"droplet_id\":\"slhwyy\",\"created_at\":\"2021-11-09T19:03:16Z\",\"updated_at\":\"2021-11-27T19:09:11Z\"}]}").toObject(KubernetesNodePoolBase.class);
        Assertions.assertEquals("caz", model.getName());
        Assertions.assertEquals(166681185, model.getCount());
        Assertions.assertEquals("zffzjwztsmp", model.getTags().get(0));
        Assertions.assertEquals("vmd", model.getTaints().get(0).getKey());
        Assertions.assertEquals("dlhqvbkarbpyhssr", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(308889962, model.getMinNodes());
        Assertions.assertEquals(1950662560, model.getMaxNodes());
    }

    @Test
    public void testSerialize() {
        KubernetesNodePoolBase model = new KubernetesNodePoolBase().setName("caz").setCount(166681185).setTags(Arrays.asList("zffzjwztsmp", "hggryelgf", "atig", "gfrrkdknczgoryw")).setTaints(Arrays.asList(new KubernetesNodePoolTaint().setKey("vmd").setValue("dlhqvbkarbpyhssr").setEffect(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE))).setAutoScale(false).setMinNodes(308889962).setMaxNodes(1950662560);
        model = BinaryData.fromObject(model).toObject(KubernetesNodePoolBase.class);
        Assertions.assertEquals("caz", model.getName());
        Assertions.assertEquals(166681185, model.getCount());
        Assertions.assertEquals("zffzjwztsmp", model.getTags().get(0));
        Assertions.assertEquals("vmd", model.getTaints().get(0).getKey());
        Assertions.assertEquals("dlhqvbkarbpyhssr", model.getTaints().get(0).getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getTaints().get(0).getEffect());
        Assertions.assertEquals(false, model.isAutoScale());
        Assertions.assertEquals(308889962, model.getMinNodes());
        Assertions.assertEquals(1950662560, model.getMaxNodes());
    }
}
