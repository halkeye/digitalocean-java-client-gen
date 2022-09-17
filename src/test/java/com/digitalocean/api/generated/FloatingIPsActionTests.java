package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIPsAction;
import org.junit.jupiter.api.Test;

public final class FloatingIPsActionTests {
    @Test
    public void testDeserialize() {
        FloatingIPsAction model =
                BinaryData.fromString("{\"type\":\"FloatingIPsAction\"}").toObject(FloatingIPsAction.class);
    }

    @Test
    public void testSerialize() {
        FloatingIPsAction model = new FloatingIPsAction();
        model = BinaryData.fromObject(model).toObject(FloatingIPsAction.class);
    }
}
