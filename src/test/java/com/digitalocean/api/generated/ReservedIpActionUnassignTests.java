package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReservedIpActionUnassign;
import org.junit.jupiter.api.Test;

public final class ReservedIpActionUnassignTests {
    @Test
    public void testDeserialize() {
        ReservedIpActionUnassign model =
                BinaryData.fromString("{\"type\":\"unassign\"}").toObject(ReservedIpActionUnassign.class);
    }

    @Test
    public void testSerialize() {
        ReservedIpActionUnassign model = new ReservedIpActionUnassign();
        model = BinaryData.fromObject(model).toObject(ReservedIpActionUnassign.class);
    }
}
