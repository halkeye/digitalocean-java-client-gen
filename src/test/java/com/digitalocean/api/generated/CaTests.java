package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Ca;
import org.junit.jupiter.api.Test;

public final class CaTests {
    @Test
    public void testDeserialize() {
        Ca model = BinaryData.fromString("{\"certificate\":\"ikpsimsfeypof\"}").toObject(Ca.class);
    }

    @Test
    public void testSerialize() {
        Ca model = new Ca();
        model = BinaryData.fromObject(model).toObject(Ca.class);
    }
}
