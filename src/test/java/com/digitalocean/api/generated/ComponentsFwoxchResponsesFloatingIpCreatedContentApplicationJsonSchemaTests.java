package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema;
import com.digitalocean.api.models.FloatingIp;
import com.digitalocean.api.models.FloatingIpCreatedApplicationJsonProperties;
import com.digitalocean.api.models.FloatingIpRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema model = BinaryData.fromString("{\"floating_ip\":{\"ip\":\"sesboynpytporr\",\"region\":{\"name\":\"xtfctanetinqxdhn\",\"slug\":\"jne\",\"available\":false},\"locked\":true},\"links\":{\"droplets\":[{\"id\":999286702,\"rel\":\"mrzwvwetqffux\",\"href\":\"huqhngqq\"},{\"id\":1440809986,\"rel\":\"o\",\"href\":\"clmr\"}],\"actions\":[{\"id\":2108091407,\"rel\":\"eatwxpxb\",\"href\":\"dhxbboceksramqc\"}]}}").toObject(ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema.class);
        Assertions.assertEquals("sesboynpytporr", model.getFloatingIp().getIp());
        Assertions.assertEquals("xtfctanetinqxdhn", model.getFloatingIp().getRegion().getName());
        Assertions.assertEquals("jne", model.getFloatingIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getFloatingIp().getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIp().isLocked());
        Assertions.assertEquals(999286702, model.getLinks().getDroplets().get(0).getId());
        Assertions.assertEquals("mrzwvwetqffux", model.getLinks().getDroplets().get(0).getRel());
        Assertions.assertEquals("huqhngqq", model.getLinks().getDroplets().get(0).getHref());
        Assertions.assertEquals(2108091407, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("eatwxpxb", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("dhxbboceksramqc", model.getLinks().getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema model = new ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema().setFloatingIp(new FloatingIp().setIp("sesboynpytporr").setRegion(new FloatingIpRegion().setName("xtfctanetinqxdhn").setSlug("jne").setAvailable(false)).setLocked(true)).setLinks(new FloatingIpCreatedApplicationJsonProperties().setDroplets(Arrays.asList(new ActionLink().setId(999286702).setRel("mrzwvwetqffux").setHref("huqhngqq"), new ActionLink().setId(1440809986).setRel("o").setHref("clmr"))).setActions(Arrays.asList(new ActionLink().setId(2108091407).setRel("eatwxpxb").setHref("dhxbboceksramqc"))));
        model = BinaryData.fromObject(model).toObject(ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema.class);
        Assertions.assertEquals("sesboynpytporr", model.getFloatingIp().getIp());
        Assertions.assertEquals("xtfctanetinqxdhn", model.getFloatingIp().getRegion().getName());
        Assertions.assertEquals("jne", model.getFloatingIp().getRegion().getSlug());
        Assertions.assertEquals(false, model.getFloatingIp().getRegion().isAvailable());
        Assertions.assertEquals(true, model.getFloatingIp().isLocked());
        Assertions.assertEquals(999286702, model.getLinks().getDroplets().get(0).getId());
        Assertions.assertEquals("mrzwvwetqffux", model.getLinks().getDroplets().get(0).getRel());
        Assertions.assertEquals("huqhngqq", model.getLinks().getDroplets().get(0).getHref());
        Assertions.assertEquals(2108091407, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("eatwxpxb", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("dhxbboceksramqc", model.getLinks().getActions().get(0).getHref());
    }
}
