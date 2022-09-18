package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIpActionUnassign;
import com.digitalocean.api.models.FloatingIPsAction;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIpActionUnassignTests {
    @Test
    public void testDeserialize() {
        FloatingIpActionUnassign model = BinaryData.fromString("{\"type\":\"unassign\"}").toObject(FloatingIpActionUnassign.class);
    }

    @Test
    public void testSerialize() {
        FloatingIpActionUnassign model = new FloatingIpActionUnassign();
        model = BinaryData.fromObject(model).toObject(FloatingIpActionUnassign.class);
    }
}
