package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ValidateRegistry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ValidateRegistryTests {
    @Test
    public void testDeserialize() {
        ValidateRegistry model = BinaryData.fromString("{\"name\":\"csbto\"}").toObject(ValidateRegistry.class);
        Assertions.assertEquals("csbto", model.getName());
    }

    @Test
    public void testSerialize() {
        ValidateRegistry model = new ValidateRegistry().setName("csbto");
        model = BinaryData.fromObject(model).toObject(ValidateRegistry.class);
        Assertions.assertEquals("csbto", model.getName());
    }
}
