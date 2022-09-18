package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.VolumeFullRegion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeFullRegionTests {
    @Test
    public void testDeserialize() {
        VolumeFullRegion model = BinaryData.fromString("{\"name\":\"nxfrppwwqclmd\",\"slug\":\"tfxxepzpxzxlcqz\",\"available\":false}").toObject(VolumeFullRegion.class);
        Assertions.assertEquals("nxfrppwwqclmd", model.getName());
        Assertions.assertEquals("tfxxepzpxzxlcqz", model.getSlug());
        Assertions.assertEquals(false, model.isAvailable());
    }

    @Test
    public void testSerialize() {
        VolumeFullRegion model = new VolumeFullRegion().setName("nxfrppwwqclmd").setSlug("tfxxepzpxzxlcqz").setAvailable(false);
        model = BinaryData.fromObject(model).toObject(VolumeFullRegion.class);
        Assertions.assertEquals("nxfrppwwqclmd", model.getName());
        Assertions.assertEquals("tfxxepzpxzxlcqz", model.getSlug());
        Assertions.assertEquals(false, model.isAvailable());
    }
}
