package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DestroyAssociatedKubernetesResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DestroyAssociatedKubernetesResourcesTests {
    @Test
    public void testDeserialize() {
        DestroyAssociatedKubernetesResources model = BinaryData.fromString("{\"load_balancers\":[\"hd\"],\"volumes\":[\"haz\",\"kx\",\"ivz\"],\"volume_snapshots\":[\"mbrygmw\",\"bios\",\"qsykq\",\"dqwdrtxtfdaglmr\"]}").toObject(DestroyAssociatedKubernetesResources.class);
        Assertions.assertEquals("hd", model.getLoadBalancers().get(0));
        Assertions.assertEquals("haz", model.getVolumes().get(0));
        Assertions.assertEquals("mbrygmw", model.getVolumeSnapshots().get(0));
    }

    @Test
    public void testSerialize() {
        DestroyAssociatedKubernetesResources model = new DestroyAssociatedKubernetesResources().setLoadBalancers(Arrays.asList("hd")).setVolumes(Arrays.asList("haz", "kx", "ivz")).setVolumeSnapshots(Arrays.asList("mbrygmw", "bios", "qsykq", "dqwdrtxtfdaglmr"));
        model = BinaryData.fromObject(model).toObject(DestroyAssociatedKubernetesResources.class);
        Assertions.assertEquals("hd", model.getLoadBalancers().get(0));
        Assertions.assertEquals("haz", model.getVolumes().get(0));
        Assertions.assertEquals("mbrygmw", model.getVolumeSnapshots().get(0));
    }
}
