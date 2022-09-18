package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedKubernetesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociatedKubernetesResourceTests {
    @Test
    public void testDeserialize() {
        AssociatedKubernetesResource model = BinaryData.fromString("{\"id\":\"jwyuveox\",\"name\":\"z\"}").toObject(AssociatedKubernetesResource.class);
        Assertions.assertEquals("jwyuveox", model.getId());
        Assertions.assertEquals("z", model.getName());
    }

    @Test
    public void testSerialize() {
        AssociatedKubernetesResource model = new AssociatedKubernetesResource().setId("jwyuveox").setName("z");
        model = BinaryData.fromObject(model).toObject(AssociatedKubernetesResource.class);
        Assertions.assertEquals("jwyuveox", model.getId());
        Assertions.assertEquals("z", model.getName());
    }
}
