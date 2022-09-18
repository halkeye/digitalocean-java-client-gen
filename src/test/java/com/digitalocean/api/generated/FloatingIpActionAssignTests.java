package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIpActionAssign;
import com.digitalocean.api.models.FloatingIPsAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIpActionAssignTests {
    @Test
    public void testDeserialize() {
        FloatingIpActionAssign model = BinaryData.fromString("{\"type\":\"assign\",\"droplet_id\":745411527}").toObject(FloatingIpActionAssign.class);
        Assertions.assertEquals(745411527, model.getDropletId());
    }

    @Test
    public void testSerialize() {
        FloatingIpActionAssign model = new FloatingIpActionAssign().setDropletId(745411527);
        model = BinaryData.fromObject(model).toObject(FloatingIpActionAssign.class);
        Assertions.assertEquals(745411527, model.getDropletId());
    }
}
