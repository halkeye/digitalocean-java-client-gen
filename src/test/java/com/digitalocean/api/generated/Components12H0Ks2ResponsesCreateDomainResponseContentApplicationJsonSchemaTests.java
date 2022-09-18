package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"domain\":{\"name\":\"hsurlgw\",\"ip_address\":\"pmmzps\",\"ttl\":94139241,\"zone_file\":\"lawiubmomsgvvjhv\"}}").toObject(Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("hsurlgw", model.getDomain().getName());
        Assertions.assertEquals("pmmzps", model.getDomain().getIpAddress());
    }

    @Test
    public void testSerialize() {
        Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema model = new Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema().setDomain(new Domain().setName("hsurlgw").setIpAddress("pmmzps"));
        model = BinaryData.fromObject(model).toObject(Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("hsurlgw", model.getDomain().getName());
        Assertions.assertEquals("pmmzps", model.getDomain().getIpAddress());
    }
}
