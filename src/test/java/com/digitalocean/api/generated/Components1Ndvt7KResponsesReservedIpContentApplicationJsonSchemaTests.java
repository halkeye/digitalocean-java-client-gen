package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema;
import com.digitalocean.api.models.ReservedIp;
import com.digitalocean.api.models.ReservedIpRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema model = BinaryData.fromString("{\"reserved_ip\":{\"ip\":\"omxoalknuyapvi\",\"region\":{\"name\":\"icyv\",\"slug\":\"chcaptkhjxnrk\",\"available\":false},\"locked\":false}}").toObject(Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema.class);
        Assertions.assertEquals("omxoalknuyapvi", model.getReservedIp().getIp());
        Assertions.assertEquals("icyv", model.getReservedIp().getRegion().getName());
        Assertions.assertEquals("chcaptkhjxnrk", model.getReservedIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIp().getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIp().isLocked());
    }

    @Test
    public void testSerialize() {
        Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema model = new Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema().setReservedIp(new ReservedIp().setIp("omxoalknuyapvi").setRegion(new ReservedIpRegion().setName("icyv").setSlug("chcaptkhjxnrk").setAvailable(false)).setLocked(false));
        model = BinaryData.fromObject(model).toObject(Components1Ndvt7KResponsesReservedIpContentApplicationJsonSchema.class);
        Assertions.assertEquals("omxoalknuyapvi", model.getReservedIp().getIp());
        Assertions.assertEquals("icyv", model.getReservedIp().getRegion().getName());
        Assertions.assertEquals("chcaptkhjxnrk", model.getReservedIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIp().getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIp().isLocked());
    }
}
