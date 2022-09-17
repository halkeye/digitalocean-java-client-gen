package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIpActionUnassign;
import org.junit.jupiter.api.Test;

public final class FloatingIpActionUnassignTests {
    @Test
    public void testDeserialize() {
        FloatingIpActionUnassign model =
                BinaryData.fromString("{\"type\":\"unassign\"}").toObject(FloatingIpActionUnassign.class);
    }

    @Test
    public void testSerialize() {
        FloatingIpActionUnassign model = new FloatingIpActionUnassign();
        model = BinaryData.fromObject(model).toObject(FloatingIpActionUnassign.class);
    }
}
