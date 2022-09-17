package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema;
import com.digitalocean.api.models.SshKeys;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"ssh_key\":{\"id\":956745772,\"fingerprint\":\"xj\",\"public_key\":\"prozvcputegjvwmf\",\"name\":\"atscmd\"}}")
                        .toObject(Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema.class);
        Assertions.assertEquals("prozvcputegjvwmf", model.getSshKey().getPublicKey());
        Assertions.assertEquals("atscmd", model.getSshKey().getName());
    }

    @Test
    public void testSerialize() {
        Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema model =
                new Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema()
                        .setSshKey(new SshKeys().setPublicKey("prozvcputegjvwmf").setName("atscmd"));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema.class);
        Assertions.assertEquals("prozvcputegjvwmf", model.getSshKey().getPublicKey());
        Assertions.assertEquals("atscmd", model.getSshKey().getName());
    }
}
