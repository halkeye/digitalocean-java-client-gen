package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema;
import com.digitalocean.api.models.FloatingIp;
import com.digitalocean.api.models.FloatingIpRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema model = BinaryData.fromString("{\"floating_ip\":{\"ip\":\"cjcd\",\"region\":{\"name\":\"zpf\",\"slug\":\"eortwwyjmgvr\",\"available\":true},\"locked\":true}}").toObject(Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjcd", model.getFloatingIp().getIp());
        Assertions.assertEquals("zpf", model.getFloatingIp().getRegion().getName());
        Assertions.assertEquals("eortwwyjmgvr", model.getFloatingIp().getRegion().getSlug());
        Assertions.assertEquals(true, model.getFloatingIp().getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIp().isLocked());
    }

    @Test
    public void testSerialize() {
        Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema model = new Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema().setFloatingIp(new FloatingIp().setIp("cjcd").setRegion(new FloatingIpRegion().setName("zpf").setSlug("eortwwyjmgvr").setAvailable(true)).setLocked(true));
        model = BinaryData.fromObject(model).toObject(Components1Pws2FuResponsesFloatingIpContentApplicationJsonSchema.class);
        Assertions.assertEquals("cjcd", model.getFloatingIp().getIp());
        Assertions.assertEquals("zpf", model.getFloatingIp().getRegion().getName());
        Assertions.assertEquals("eortwwyjmgvr", model.getFloatingIp().getRegion().getSlug());
        Assertions.assertEquals(true, model.getFloatingIp().getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIp().isLocked());
    }
}
