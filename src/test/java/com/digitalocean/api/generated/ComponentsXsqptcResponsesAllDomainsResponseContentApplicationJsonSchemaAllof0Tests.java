package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Domain;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"domains\":[{\"name\":\"okmyr\",\"ip_address\":\"ialzbnobrqlp\",\"ttl\":43231949,\"zone_file\":\"rpzuyudivbx\"},{\"name\":\"sqeaeonqelwg\",\"ip_address\":\"uruzy\",\"ttl\":571839035,\"zone_file\":\"ogatmoljiy\"},{\"name\":\"pinm\",\"ip_address\":\"fkneerzztrkn\",\"ttl\":2048723918,\"zone_file\":\"ugdybnhrxlel\"}]}")
                        .toObject(ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("okmyr", model.getDomains().get(0).getName());
        Assertions.assertEquals("ialzbnobrqlp", model.getDomains().get(0).getIpAddress());
    }

    @Test
    public void testSerialize() {
        ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 model =
                new ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0()
                        .setDomains(
                                Arrays.asList(
                                        new Domain().setName("okmyr").setIpAddress("ialzbnobrqlp"),
                                        new Domain().setName("sqeaeonqelwg").setIpAddress("uruzy"),
                                        new Domain().setName("pinm").setIpAddress("fkneerzztrkn")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("okmyr", model.getDomains().get(0).getName());
        Assertions.assertEquals("ialzbnobrqlp", model.getDomains().get(0).getIpAddress());
    }
}
