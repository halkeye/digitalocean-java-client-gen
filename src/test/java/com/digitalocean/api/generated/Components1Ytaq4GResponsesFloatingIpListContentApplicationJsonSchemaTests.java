package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema;
import com.digitalocean.api.models.Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.FloatingIp;
import com.digitalocean.api.models.FloatingIpRegion;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":235719823},\"floating_ips\":[{\"ip\":\"rsbgailjqovqmxq\",\"region\":{\"name\":\"ofx\",\"slug\":\"nkiu\",\"available\":true},\"locked\":true},{\"ip\":\"xooi\",\"region\":{\"name\":\"hiebruptls\",\"slug\":\"vqzgaqsosrnj\",\"available\":false},\"locked\":false}]}").toObject(Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema.class);
        Assertions.assertEquals("rsbgailjqovqmxq", model.getFloatingIps().get(0).getIp());
        Assertions.assertEquals("ofx", model.getFloatingIps().get(0).getRegion().getName());
        Assertions.assertEquals("nkiu", model.getFloatingIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getFloatingIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIps().get(0).isLocked());
        Assertions.assertEquals(235719823, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema model = new Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema().setFloatingIps(Arrays.asList(new FloatingIp().setIp("rsbgailjqovqmxq").setRegion(new FloatingIpRegion().setName("ofx").setSlug("nkiu").setAvailable(true)).setLocked(true), new FloatingIp().setIp("xooi").setRegion(new FloatingIpRegion().setName("hiebruptls").setSlug("vqzgaqsosrnj").setAvailable(false)).setLocked(false))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(235719823));
        model = BinaryData.fromObject(model).toObject(Components1Ytaq4GResponsesFloatingIpListContentApplicationJsonSchema.class);
        Assertions.assertEquals("rsbgailjqovqmxq", model.getFloatingIps().get(0).getIp());
        Assertions.assertEquals("ofx", model.getFloatingIps().get(0).getRegion().getName());
        Assertions.assertEquals("nkiu", model.getFloatingIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getFloatingIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIps().get(0).isLocked());
        Assertions.assertEquals(235719823, model.getMeta().getTotal());
    }
}
