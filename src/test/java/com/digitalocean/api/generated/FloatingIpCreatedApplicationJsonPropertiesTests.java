package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.FloatingIpCreatedApplicationJsonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIpCreatedApplicationJsonPropertiesTests {
    @Test
    public void testDeserialize() {
        FloatingIpCreatedApplicationJsonProperties model = BinaryData.fromString("{\"droplets\":[{\"id\":1118769120,\"rel\":\"lvvkswurx\",\"href\":\"hvhauimnntfkqp\"},{\"id\":1796542988,\"rel\":\"bnwivlqcwyzhn\",\"href\":\"kzstzpzecdlc\"},{\"id\":170340264,\"rel\":\"aht\",\"href\":\"cimtcaumviud\"},{\"id\":990093995,\"rel\":\"qrmlujmtunl\",\"href\":\"wuzebfqvm\"}],\"actions\":[{\"id\":78518066,\"rel\":\"enfspetxeu\",\"href\":\"khdlckd\"}]}").toObject(FloatingIpCreatedApplicationJsonProperties.class);
        Assertions.assertEquals(1118769120, model.getDroplets().get(0).getId());
        Assertions.assertEquals("lvvkswurx", model.getDroplets().get(0).getRel());
        Assertions.assertEquals("hvhauimnntfkqp", model.getDroplets().get(0).getHref());
        Assertions.assertEquals(78518066, model.getActions().get(0).getId());
        Assertions.assertEquals("enfspetxeu", model.getActions().get(0).getRel());
        Assertions.assertEquals("khdlckd", model.getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        FloatingIpCreatedApplicationJsonProperties model = new FloatingIpCreatedApplicationJsonProperties().setDroplets(Arrays.asList(new ActionLink().setId(1118769120).setRel("lvvkswurx").setHref("hvhauimnntfkqp"), new ActionLink().setId(1796542988).setRel("bnwivlqcwyzhn").setHref("kzstzpzecdlc"), new ActionLink().setId(170340264).setRel("aht").setHref("cimtcaumviud"), new ActionLink().setId(990093995).setRel("qrmlujmtunl").setHref("wuzebfqvm"))).setActions(Arrays.asList(new ActionLink().setId(78518066).setRel("enfspetxeu").setHref("khdlckd")));
        model = BinaryData.fromObject(model).toObject(FloatingIpCreatedApplicationJsonProperties.class);
        Assertions.assertEquals(1118769120, model.getDroplets().get(0).getId());
        Assertions.assertEquals("lvvkswurx", model.getDroplets().get(0).getRel());
        Assertions.assertEquals("hvhauimnntfkqp", model.getDroplets().get(0).getHref());
        Assertions.assertEquals(78518066, model.getActions().get(0).getId());
        Assertions.assertEquals("enfspetxeu", model.getActions().get(0).getRel());
        Assertions.assertEquals("khdlckd", model.getActions().get(0).getHref());
    }
}
