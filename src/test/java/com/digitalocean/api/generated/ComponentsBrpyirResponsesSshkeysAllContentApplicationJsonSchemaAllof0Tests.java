package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.SshKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"ssh_keys\":[{\"id\":1306784267,\"fingerprint\":\"tihfx\",\"public_key\":\"ijbpzvgnwzsymgl\",\"name\":\"uf\"},{\"id\":504117688,\"fingerprint\":\"ohdbihanufh\",\"public_key\":\"cbjy\",\"name\":\"a\"}]}").toObject(ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.getSshKeys().get(0).getPublicKey());
        Assertions.assertEquals("uf", model.getSshKeys().get(0).getName());
    }

    @Test
    public void testSerialize() {
        ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 model = new ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0().setSshKeys(Arrays.asList(new SshKeys().setPublicKey("ijbpzvgnwzsymgl").setName("uf"), new SshKeys().setPublicKey("cbjy").setName("a")));
        model = BinaryData.fromObject(model).toObject(ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.getSshKeys().get(0).getPublicKey());
        Assertions.assertEquals("uf", model.getSshKeys().get(0).getName());
    }
}
