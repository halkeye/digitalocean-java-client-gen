package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.ReservedIp;
import com.digitalocean.api.models.ReservedIpRegion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":477910299},\"reserved_ips\":[{\"ip\":\"iobnirgoextqdnwt\",\"region\":{\"name\":\"timznupbmt\",\"slug\":\"setk\",\"available\":true},\"locked\":false},{\"ip\":\"edaakghcrzmm\",\"region\":{\"name\":\"yvdhdgdiwmlg\",\"slug\":\"tmfetqjisjmolzca\",\"available\":true},\"locked\":false}]}")
                        .toObject(Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema.class);
        Assertions.assertEquals("iobnirgoextqdnwt", model.getReservedIps().get(0).getIp());
        Assertions.assertEquals("timznupbmt", model.getReservedIps().get(0).getRegion().getName());
        Assertions.assertEquals("setk", model.getReservedIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getReservedIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIps().get(0).isLocked());
        Assertions.assertEquals(477910299, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema model =
                new Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema()
                        .setReservedIps(
                                Arrays.asList(
                                        new ReservedIp()
                                                .setIp("iobnirgoextqdnwt")
                                                .setRegion(
                                                        new ReservedIpRegion()
                                                                .setName("timznupbmt")
                                                                .setSlug("setk")
                                                                .setAvailable(true))
                                                .setLocked(false),
                                        new ReservedIp()
                                                .setIp("edaakghcrzmm")
                                                .setRegion(
                                                        new ReservedIpRegion()
                                                                .setName("yvdhdgdiwmlg")
                                                                .setSlug("tmfetqjisjmolzca")
                                                                .setAvailable(true))
                                                .setLocked(false)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(477910299));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Hz7IsyResponsesReservedIpListContentApplicationJsonSchema.class);
        Assertions.assertEquals("iobnirgoextqdnwt", model.getReservedIps().get(0).getIp());
        Assertions.assertEquals("timznupbmt", model.getReservedIps().get(0).getRegion().getName());
        Assertions.assertEquals("setk", model.getReservedIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getReservedIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIps().get(0).isLocked());
        Assertions.assertEquals(477910299, model.getMeta().getTotal());
    }
}
