package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components12R29VResponsesExistingDomainContentApplicationJsonSchema;
import com.digitalocean.api.models.Domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components12R29VResponsesExistingDomainContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components12R29VResponsesExistingDomainContentApplicationJsonSchema model = BinaryData.fromString("{\"domain\":{\"name\":\"lohewjjmajnkdflq\",\"ip_address\":\"ns\",\"ttl\":422661668,\"zone_file\":\"kzfzqxjosho\"}}").toObject(Components12R29VResponsesExistingDomainContentApplicationJsonSchema.class);
        Assertions.assertEquals("lohewjjmajnkdflq", model.getDomain().getName());
        Assertions.assertEquals("ns", model.getDomain().getIpAddress());
    }

    @Test
    public void testSerialize() {
        Components12R29VResponsesExistingDomainContentApplicationJsonSchema model = new Components12R29VResponsesExistingDomainContentApplicationJsonSchema().setDomain(new Domain().setName("lohewjjmajnkdflq").setIpAddress("ns"));
        model = BinaryData.fromObject(model).toObject(Components12R29VResponsesExistingDomainContentApplicationJsonSchema.class);
        Assertions.assertEquals("lohewjjmajnkdflq", model.getDomain().getName());
        Assertions.assertEquals("ns", model.getDomain().getIpAddress());
    }
}
