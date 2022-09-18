package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DockerCredentials;
import com.digitalocean.api.models.DockerCredentialsAuths;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DockerCredentialsTests {
    @Test
    public void testDeserialize() {
        DockerCredentials model = BinaryData.fromString("{\"auths\":{\"registry.digitalocean.com\":{\"auth\":\"kugdlavs\"}}}").toObject(DockerCredentials.class);
    }

    @Test
    public void testSerialize() {
        DockerCredentials model = new DockerCredentials().setAuths(new DockerCredentialsAuths());
        model = BinaryData.fromObject(model).toObject(DockerCredentials.class);
    }
}
