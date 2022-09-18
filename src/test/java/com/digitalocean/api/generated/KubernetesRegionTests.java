package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesRegionTests {
    @Test
    public void testDeserialize() {
        KubernetesRegion model = BinaryData.fromString("{\"name\":\"lgzubak\",\"slug\":\"kvggcmfns\"}").toObject(KubernetesRegion.class);
        Assertions.assertEquals("lgzubak", model.getName());
        Assertions.assertEquals("kvggcmfns", model.getSlug());
    }

    @Test
    public void testSerialize() {
        KubernetesRegion model = new KubernetesRegion().setName("lgzubak").setSlug("kvggcmfns");
        model = BinaryData.fromObject(model).toObject(KubernetesRegion.class);
        Assertions.assertEquals("lgzubak", model.getName());
        Assertions.assertEquals("kvggcmfns", model.getSlug());
    }
}
