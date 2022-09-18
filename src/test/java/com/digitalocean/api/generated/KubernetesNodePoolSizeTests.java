package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesNodePoolSize;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesNodePoolSizeTests {
    @Test
    public void testDeserialize() {
        KubernetesNodePoolSize model = BinaryData.fromString("{\"size\":\"vytgkiqlarhq\"}").toObject(KubernetesNodePoolSize.class);
        Assertions.assertEquals("vytgkiqlarhq", model.getSize());
    }

    @Test
    public void testSerialize() {
        KubernetesNodePoolSize model = new KubernetesNodePoolSize().setSize("vytgkiqlarhq");
        model = BinaryData.fromObject(model).toObject(KubernetesNodePoolSize.class);
        Assertions.assertEquals("vytgkiqlarhq", model.getSize());
    }
}
