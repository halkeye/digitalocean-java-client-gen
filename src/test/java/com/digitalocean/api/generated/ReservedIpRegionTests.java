package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.ReservedIpRegion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReservedIpRegionTests {
    @Test
    public void testDeserialize() {
        ReservedIpRegion model = BinaryData.fromString("{\"name\":\"icttr\",\"slug\":\"lvvjm\",\"available\":true}").toObject(ReservedIpRegion.class);
        Assertions.assertEquals("icttr", model.getName());
        Assertions.assertEquals("lvvjm", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }

    @Test
    public void testSerialize() {
        ReservedIpRegion model = new ReservedIpRegion().setName("icttr").setSlug("lvvjm").setAvailable(true);
        model = BinaryData.fromObject(model).toObject(ReservedIpRegion.class);
        Assertions.assertEquals("icttr", model.getName());
        Assertions.assertEquals("lvvjm", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }
}
