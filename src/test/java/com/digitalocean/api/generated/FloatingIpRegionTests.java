package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIpRegion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIpRegionTests {
    @Test
    public void testDeserialize() {
        FloatingIpRegion model =
                BinaryData.fromString("{\"name\":\"dnyciwzk\",\"slug\":\"lykqadfge\",\"available\":true}")
                        .toObject(FloatingIpRegion.class);
        Assertions.assertEquals("dnyciwzk", model.getName());
        Assertions.assertEquals("lykqadfge", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }

    @Test
    public void testSerialize() {
        FloatingIpRegion model = new FloatingIpRegion().setName("dnyciwzk").setSlug("lykqadfge").setAvailable(true);
        model = BinaryData.fromObject(model).toObject(FloatingIpRegion.class);
        Assertions.assertEquals("dnyciwzk", model.getName());
        Assertions.assertEquals("lykqadfge", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }
}
