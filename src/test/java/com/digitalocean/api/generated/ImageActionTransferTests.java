package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ImageActionBase;
import com.digitalocean.api.models.ImageActionBaseType;
import com.digitalocean.api.models.ImageActionTransfer;
import com.digitalocean.api.models.RegionSlug;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageActionTransferTests {
    @Test
    public void testDeserialize() {
        ImageActionTransfer model = BinaryData.fromString("{\"region\":\"nyc2\",\"type\":\"convert\"}").toObject(ImageActionTransfer.class);
        Assertions.assertEquals(ImageActionBaseType.CONVERT, model.getType());
        Assertions.assertEquals(RegionSlug.NYC2, model.getRegion());
    }

    @Test
    public void testSerialize() {
        ImageActionTransfer model = new ImageActionTransfer().setType(ImageActionBaseType.CONVERT).setRegion(RegionSlug.NYC2);
        model = BinaryData.fromObject(model).toObject(ImageActionTransfer.class);
        Assertions.assertEquals(ImageActionBaseType.CONVERT, model.getType());
        Assertions.assertEquals(RegionSlug.NYC2, model.getRegion());
    }
}
