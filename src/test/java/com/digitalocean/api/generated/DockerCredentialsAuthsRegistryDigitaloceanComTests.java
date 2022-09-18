package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DockerCredentialsAuthsRegistryDigitaloceanCom;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DockerCredentialsAuthsRegistryDigitaloceanComTests {
    @Test
    public void testDeserialize() {
        DockerCredentialsAuthsRegistryDigitaloceanCom model = BinaryData.fromString("{\"auth\":\"fbxjblajybdnb\"}").toObject(DockerCredentialsAuthsRegistryDigitaloceanCom.class);
        Assertions.assertEquals("fbxjblajybdnb", model.getAuth());
    }

    @Test
    public void testSerialize() {
        DockerCredentialsAuthsRegistryDigitaloceanCom model = new DockerCredentialsAuthsRegistryDigitaloceanCom().setAuth("fbxjblajybdnb");
        model = BinaryData.fromObject(model).toObject(DockerCredentialsAuthsRegistryDigitaloceanCom.class);
        Assertions.assertEquals("fbxjblajybdnb", model.getAuth());
    }
}
