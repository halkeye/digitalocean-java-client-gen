package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ImageActionBase;
import com.digitalocean.api.models.ImageActionBaseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageActionBaseTests {
    @Test
    public void testDeserialize() {
        ImageActionBase model = BinaryData.fromString("{\"type\":\"convert\"}").toObject(ImageActionBase.class);
        Assertions.assertEquals(ImageActionBaseType.CONVERT, model.getType());
    }

    @Test
    public void testSerialize() {
        ImageActionBase model = new ImageActionBase().setType(ImageActionBaseType.CONVERT);
        model = BinaryData.fromObject(model).toObject(ImageActionBase.class);
        Assertions.assertEquals(ImageActionBaseType.CONVERT, model.getType());
    }
}
