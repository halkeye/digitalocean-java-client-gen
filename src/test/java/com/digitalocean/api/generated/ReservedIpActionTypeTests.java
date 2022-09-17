package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReservedIpActionType;
import org.junit.jupiter.api.Test;

public final class ReservedIpActionTypeTests {
    @Test
    public void testDeserialize() {
        ReservedIpActionType model =
                BinaryData.fromString("{\"type\":\"ReservedIpActionType\"}").toObject(ReservedIpActionType.class);
    }

    @Test
    public void testSerialize() {
        ReservedIpActionType model = new ReservedIpActionType();
        model = BinaryData.fromObject(model).toObject(ReservedIpActionType.class);
    }
}
