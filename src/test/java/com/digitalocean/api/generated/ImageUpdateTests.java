package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.ImageUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageUpdateTests {
    @Test
    public void testDeserialize() {
        ImageUpdate model = BinaryData.fromString("{\"name\":\"kqiq\",\"distribution\":\"Ubuntu\",\"description\":\"hlq\"}").toObject(ImageUpdate.class);
        Assertions.assertEquals("kqiq", model.getName());
        Assertions.assertEquals(Distribution.UBUNTU, model.getDistribution());
        Assertions.assertEquals("hlq", model.getDescription());
    }

    @Test
    public void testSerialize() {
        ImageUpdate model = new ImageUpdate().setName("kqiq").setDistribution(Distribution.UBUNTU).setDescription("hlq");
        model = BinaryData.fromObject(model).toObject(ImageUpdate.class);
        Assertions.assertEquals("kqiq", model.getName());
        Assertions.assertEquals(Distribution.UBUNTU, model.getDistribution());
        Assertions.assertEquals("hlq", model.getDescription());
    }
}
