package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema;
import com.digitalocean.api.models.ReservedIp;
import com.digitalocean.api.models.ReservedIpCreatedApplicationJsonProperties;
import com.digitalocean.api.models.ReservedIpRegion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"reserved_ip\":{\"ip\":\"jrzvlc\",\"region\":{\"name\":\"qxd\",\"slug\":\"mklphxwww\",\"available\":false},\"locked\":false},\"links\":{\"droplets\":[{\"id\":986889647,\"rel\":\"jvfsu\",\"href\":\"ae\"}],\"actions\":[{\"id\":1961822942,\"rel\":\"zywywuah\",\"href\":\"orewcnnaaxqjfd\"}]}}")
                        .toObject(Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema.class);
        Assertions.assertEquals("jrzvlc", model.getReservedIp().getIp());
        Assertions.assertEquals("qxd", model.getReservedIp().getRegion().getName());
        Assertions.assertEquals("mklphxwww", model.getReservedIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIp().getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIp().isLocked());
        Assertions.assertEquals(986889647, model.getLinks().getDroplets().get(0).getId());
        Assertions.assertEquals("jvfsu", model.getLinks().getDroplets().get(0).getRel());
        Assertions.assertEquals("ae", model.getLinks().getDroplets().get(0).getHref());
        Assertions.assertEquals(1961822942, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("zywywuah", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("orewcnnaaxqjfd", model.getLinks().getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema model =
                new Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema()
                        .setReservedIp(
                                new ReservedIp()
                                        .setIp("jrzvlc")
                                        .setRegion(
                                                new ReservedIpRegion()
                                                        .setName("qxd")
                                                        .setSlug("mklphxwww")
                                                        .setAvailable(false))
                                        .setLocked(false))
                        .setLinks(
                                new ReservedIpCreatedApplicationJsonProperties()
                                        .setDroplets(
                                                Arrays.asList(
                                                        new ActionLink()
                                                                .setId(986889647)
                                                                .setRel("jvfsu")
                                                                .setHref("ae")))
                                        .setActions(
                                                Arrays.asList(
                                                        new ActionLink()
                                                                .setId(1961822942)
                                                                .setRel("zywywuah")
                                                                .setHref("orewcnnaaxqjfd"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema.class);
        Assertions.assertEquals("jrzvlc", model.getReservedIp().getIp());
        Assertions.assertEquals("qxd", model.getReservedIp().getRegion().getName());
        Assertions.assertEquals("mklphxwww", model.getReservedIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getReservedIp().getRegion().isAvailable());
        Assertions.assertEquals(false, model.getReservedIp().isLocked());
        Assertions.assertEquals(986889647, model.getLinks().getDroplets().get(0).getId());
        Assertions.assertEquals("jvfsu", model.getLinks().getDroplets().get(0).getRel());
        Assertions.assertEquals("ae", model.getLinks().getDroplets().get(0).getHref());
        Assertions.assertEquals(1961822942, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("zywywuah", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("orewcnnaaxqjfd", model.getLinks().getActions().get(0).getHref());
    }
}
