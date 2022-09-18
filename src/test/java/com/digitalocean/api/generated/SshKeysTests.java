package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SshKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SshKeysTests {
    @Test
    public void testDeserialize() {
        SshKeys model = BinaryData.fromString("{\"id\":437058664,\"fingerprint\":\"xqhabi\",\"public_key\":\"pikxwczbyscnpqxu\",\"name\":\"ivyqniwbybrkxvd\"}").toObject(SshKeys.class);
        Assertions.assertEquals("pikxwczbyscnpqxu", model.getPublicKey());
        Assertions.assertEquals("ivyqniwbybrkxvd", model.getName());
    }

    @Test
    public void testSerialize() {
        SshKeys model = new SshKeys().setPublicKey("pikxwczbyscnpqxu").setName("ivyqniwbybrkxvd");
        model = BinaryData.fromObject(model).toObject(SshKeys.class);
        Assertions.assertEquals("pikxwczbyscnpqxu", model.getPublicKey());
        Assertions.assertEquals("ivyqniwbybrkxvd", model.getName());
    }
}
