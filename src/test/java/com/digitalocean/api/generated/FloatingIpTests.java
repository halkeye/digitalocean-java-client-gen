package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIp;
import com.digitalocean.api.models.FloatingIpRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIpTests {
    @Test
    public void testDeserialize() {
        FloatingIp model = BinaryData.fromString("{\"ip\":\"rifiozttcbiichg\",\"region\":{\"name\":\"dsozodwjcfqoyxry\",\"slug\":\"ycymzrlcfgdwzauz\",\"available\":true},\"locked\":true}").toObject(FloatingIp.class);
        Assertions.assertEquals("rifiozttcbiichg", model.getIp());
        Assertions.assertEquals("dsozodwjcfqoyxry", model.getRegion().getName());
        Assertions.assertEquals("ycymzrlcfgdwzauz", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals(true, model.isLocked());
    }

    @Test
    public void testSerialize() {
        FloatingIp model = new FloatingIp().setIp("rifiozttcbiichg").setRegion(new FloatingIpRegion().setName("dsozodwjcfqoyxry").setSlug("ycymzrlcfgdwzauz").setAvailable(true)).setLocked(true);
        model = BinaryData.fromObject(model).toObject(FloatingIp.class);
        Assertions.assertEquals("rifiozttcbiichg", model.getIp());
        Assertions.assertEquals("dsozodwjcfqoyxry", model.getRegion().getName());
        Assertions.assertEquals("ycymzrlcfgdwzauz", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals(true, model.isLocked());
    }
}
