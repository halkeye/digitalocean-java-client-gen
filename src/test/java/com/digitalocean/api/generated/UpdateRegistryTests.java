package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.UpdateRegistry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateRegistryTests {
    @Test
    public void testDeserialize() {
        UpdateRegistry model = BinaryData.fromString("{\"cancel\":true}").toObject(UpdateRegistry.class);
        Assertions.assertEquals(true, model.isCancel());
    }

    @Test
    public void testSerialize() {
        UpdateRegistry model = new UpdateRegistry().setCancel(true);
        model = BinaryData.fromObject(model).toObject(UpdateRegistry.class);
        Assertions.assertEquals(true, model.isCancel());
    }
}
