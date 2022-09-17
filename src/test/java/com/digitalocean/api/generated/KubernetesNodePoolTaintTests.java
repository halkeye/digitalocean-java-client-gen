package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesNodePoolTaint;
import com.digitalocean.api.models.KubernetesNodePoolTaintEffect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesNodePoolTaintTests {
    @Test
    public void testDeserialize() {
        KubernetesNodePoolTaint model =
                BinaryData.fromString("{\"key\":\"pumdd\",\"value\":\"ajk\",\"effect\":\"PreferNoSchedule\"}")
                        .toObject(KubernetesNodePoolTaint.class);
        Assertions.assertEquals("pumdd", model.getKey());
        Assertions.assertEquals("ajk", model.getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getEffect());
    }

    @Test
    public void testSerialize() {
        KubernetesNodePoolTaint model =
                new KubernetesNodePoolTaint()
                        .setKey("pumdd")
                        .setValue("ajk")
                        .setEffect(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE);
        model = BinaryData.fromObject(model).toObject(KubernetesNodePoolTaint.class);
        Assertions.assertEquals("pumdd", model.getKey());
        Assertions.assertEquals("ajk", model.getValue());
        Assertions.assertEquals(KubernetesNodePoolTaintEffect.PREFER_NO_SCHEDULE, model.getEffect());
    }
}
