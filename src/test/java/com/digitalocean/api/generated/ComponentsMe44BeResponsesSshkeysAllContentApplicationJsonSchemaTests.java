package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.SshKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1983903346},\"ssh_keys\":[{\"id\":857832438,\"fingerprint\":\"arcryuanzwuxzdxt\",\"public_key\":\"yrlhmwhfpmrqobm\",\"name\":\"u\"}]}").toObject(ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("yrlhmwhfpmrqobm", model.getSshKeys().get(0).getPublicKey());
        Assertions.assertEquals("u", model.getSshKeys().get(0).getName());
        Assertions.assertEquals(1983903346, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema model = new ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema().setSshKeys(Arrays.asList(new SshKeys().setPublicKey("yrlhmwhfpmrqobm").setName("u"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1983903346));
        model = BinaryData.fromObject(model).toObject(ComponentsMe44BeResponsesSshkeysAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("yrlhmwhfpmrqobm", model.getSshKeys().get(0).getPublicKey());
        Assertions.assertEquals("u", model.getSshKeys().get(0).getName());
        Assertions.assertEquals(1983903346, model.getMeta().getTotal());
    }
}
