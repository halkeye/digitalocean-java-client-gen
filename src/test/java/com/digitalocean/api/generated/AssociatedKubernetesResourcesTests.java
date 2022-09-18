package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedKubernetesResource;
import com.digitalocean.api.models.AssociatedKubernetesResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociatedKubernetesResourcesTests {
    @Test
    public void testDeserialize() {
        AssociatedKubernetesResources model = BinaryData.fromString("{\"load_balancers\":[{\"id\":\"hdoaqipmnx\",\"name\":\"frsbzrnmuvwvpu\"}],\"volumes\":[{\"id\":\"tb\",\"name\":\"ekjcnginxdvma\"},{\"id\":\"qxfvgyx\",\"name\":\"xynofxlttxoqxtd\"},{\"id\":\"ujsjirkrpskcj\",\"name\":\"mofbnivd\"},{\"id\":\"kykpaxnls\",\"name\":\"nyscaccpt\"}],\"volume_snapshots\":[{\"id\":\"x\",\"name\":\"xxicee\"}]}").toObject(AssociatedKubernetesResources.class);
        Assertions.assertEquals("hdoaqipmnx", model.getLoadBalancers().get(0).getId());
        Assertions.assertEquals("frsbzrnmuvwvpu", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals("tb", model.getVolumes().get(0).getId());
        Assertions.assertEquals("ekjcnginxdvma", model.getVolumes().get(0).getName());
        Assertions.assertEquals("x", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("xxicee", model.getVolumeSnapshots().get(0).getName());
    }

    @Test
    public void testSerialize() {
        AssociatedKubernetesResources model = new AssociatedKubernetesResources().setLoadBalancers(Arrays.asList(new AssociatedKubernetesResource().setId("hdoaqipmnx").setName("frsbzrnmuvwvpu"))).setVolumes(Arrays.asList(new AssociatedKubernetesResource().setId("tb").setName("ekjcnginxdvma"), new AssociatedKubernetesResource().setId("qxfvgyx").setName("xynofxlttxoqxtd"), new AssociatedKubernetesResource().setId("ujsjirkrpskcj").setName("mofbnivd"), new AssociatedKubernetesResource().setId("kykpaxnls").setName("nyscaccpt"))).setVolumeSnapshots(Arrays.asList(new AssociatedKubernetesResource().setId("x").setName("xxicee")));
        model = BinaryData.fromObject(model).toObject(AssociatedKubernetesResources.class);
        Assertions.assertEquals("hdoaqipmnx", model.getLoadBalancers().get(0).getId());
        Assertions.assertEquals("frsbzrnmuvwvpu", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals("tb", model.getVolumes().get(0).getId());
        Assertions.assertEquals("ekjcnginxdvma", model.getVolumes().get(0).getName());
        Assertions.assertEquals("x", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("xxicee", model.getVolumeSnapshots().get(0).getName());
    }
}
