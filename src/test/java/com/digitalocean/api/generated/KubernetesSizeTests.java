package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesSize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesSizeTests {
    @Test
    public void testDeserialize() {
        KubernetesSize model =
                BinaryData.fromString("{\"name\":\"e\",\"slug\":\"kmixwewzls\"}").toObject(KubernetesSize.class);
        Assertions.assertEquals("e", model.getName());
        Assertions.assertEquals("kmixwewzls", model.getSlug());
    }

    @Test
    public void testSerialize() {
        KubernetesSize model = new KubernetesSize().setName("e").setSlug("kmixwewzls");
        model = BinaryData.fromObject(model).toObject(KubernetesSize.class);
        Assertions.assertEquals("e", model.getName());
        Assertions.assertEquals("kmixwewzls", model.getSlug());
    }
}
