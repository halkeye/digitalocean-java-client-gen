package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema;
import com.digitalocean.api.models.SshKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema model = BinaryData.fromString("{\"ssh_key\":{\"id\":2111308623,\"fingerprint\":\"lsuuvmkjozkrwfnd\",\"public_key\":\"odjpslwejd\",\"name\":\"vwryoqpso\"}}").toObject(Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("odjpslwejd", model.getSshKey().getPublicKey());
        Assertions.assertEquals("vwryoqpso", model.getSshKey().getName());
    }

    @Test
    public void testSerialize() {
        Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema model = new Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema().setSshKey(new SshKeys().setPublicKey("odjpslwejd").setName("vwryoqpso"));
        model = BinaryData.fromObject(model).toObject(Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("odjpslwejd", model.getSshKey().getPublicKey());
        Assertions.assertEquals("vwryoqpso", model.getSshKey().getName());
    }
}
