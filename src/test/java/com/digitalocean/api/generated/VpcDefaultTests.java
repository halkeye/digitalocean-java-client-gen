package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcDefault;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcDefaultTests {
    @Test
    public void testDeserialize() {
        VpcDefault model = BinaryData.fromString("{\"default\":true}").toObject(VpcDefault.class);
        Assertions.assertEquals(true, model.isDefaultProperty());
    }

    @Test
    public void testSerialize() {
        VpcDefault model = new VpcDefault().setDefaultProperty(true);
        model = BinaryData.fromObject(model).toObject(VpcDefault.class);
        Assertions.assertEquals(true, model.isDefaultProperty());
    }
}
