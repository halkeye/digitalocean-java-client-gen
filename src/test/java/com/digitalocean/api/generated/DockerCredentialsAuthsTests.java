package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DockerCredentialsAuths;
import org.junit.jupiter.api.Test;

public final class DockerCredentialsAuthsTests {
    @Test
    public void testDeserialize() {
        DockerCredentialsAuths model =
                BinaryData.fromString("{\"registry.digitalocean.com\":{\"auth\":\"thkslgeuufkb\"}}")
                        .toObject(DockerCredentialsAuths.class);
    }

    @Test
    public void testSerialize() {
        DockerCredentialsAuths model = new DockerCredentialsAuths();
        model = BinaryData.fromObject(model).toObject(DockerCredentialsAuths.class);
    }
}
