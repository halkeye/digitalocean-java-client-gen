package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ReservedIp;
import com.digitalocean.api.models.ReservedIpRegion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"reserved_ips\":[{\"ip\":\"rvty\",\"region\":{\"name\":\"vytvjejq\",\"slug\":\"wfusqp\",\"available\":false},\"locked\":true},{\"ip\":\"bdy\",\"region\":{\"name\":\"bimhjbozvo\",\"slug\":\"rtcl\",\"available\":false},\"locked\":true},{\"ip\":\"uzlybqs\",\"region\":{\"name\":\"bvylkvckcaf\",\"slug\":\"wqha\",\"available\":true},\"locked\":false}]}")
                        .toObject(ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rvty", model.getReservedIps().get(0).getIp());
        Assertions.assertEquals("vytvjejq", model.getReservedIps().get(0).getRegion().getName());
        Assertions.assertEquals("wfusqp", model.getReservedIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(true, model.getReservedIps().get(0).isLocked());
    }

    @Test
    public void testSerialize() {
        ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0 model =
                new ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0()
                        .setReservedIps(
                                Arrays.asList(
                                        new ReservedIp()
                                                .setIp("rvty")
                                                .setRegion(
                                                        new ReservedIpRegion()
                                                                .setName("vytvjejq")
                                                                .setSlug("wfusqp")
                                                                .setAvailable(false))
                                                .setLocked(true),
                                        new ReservedIp()
                                                .setIp("bdy")
                                                .setRegion(
                                                        new ReservedIpRegion()
                                                                .setName("bimhjbozvo")
                                                                .setSlug("rtcl")
                                                                .setAvailable(false))
                                                .setLocked(true),
                                        new ReservedIp()
                                                .setIp("uzlybqs")
                                                .setRegion(
                                                        new ReservedIpRegion()
                                                                .setName("bvylkvckcaf")
                                                                .setSlug("wqha")
                                                                .setAvailable(true))
                                                .setLocked(false)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsYsdmqhResponsesReservedIpListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rvty", model.getReservedIps().get(0).getIp());
        Assertions.assertEquals("vytvjejq", model.getReservedIps().get(0).getRegion().getName());
        Assertions.assertEquals("wfusqp", model.getReservedIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(true, model.getReservedIps().get(0).isLocked());
    }
}
