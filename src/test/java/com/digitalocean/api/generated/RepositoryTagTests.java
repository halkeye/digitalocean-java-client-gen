package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RepositoryTag;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RepositoryTagTests {
    @Test
    public void testDeserialize() {
        RepositoryTag model =
                BinaryData.fromString(
                                "{\"registry_name\":\"uaj\",\"repository\":\"nacgdnx\",\"tag\":\"onmzrjjaojpzn\",\"manifest_digest\":\"rz\",\"compressed_size_bytes\":1361930532,\"size_bytes\":2099090141,\"updated_at\":\"2021-07-19T10:14:40Z\"}")
                        .toObject(RepositoryTag.class);
        Assertions.assertEquals("uaj", model.getRegistryName());
        Assertions.assertEquals("nacgdnx", model.getRepository());
        Assertions.assertEquals("onmzrjjaojpzn", model.getTag());
        Assertions.assertEquals("rz", model.getManifestDigest());
        Assertions.assertEquals(1361930532, model.getCompressedSizeBytes());
        Assertions.assertEquals(2099090141, model.getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T10:14:40Z"), model.getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        RepositoryTag model =
                new RepositoryTag()
                        .setRegistryName("uaj")
                        .setRepository("nacgdnx")
                        .setTag("onmzrjjaojpzn")
                        .setManifestDigest("rz")
                        .setCompressedSizeBytes(1361930532)
                        .setSizeBytes(2099090141)
                        .setUpdatedAt(OffsetDateTime.parse("2021-07-19T10:14:40Z"));
        model = BinaryData.fromObject(model).toObject(RepositoryTag.class);
        Assertions.assertEquals("uaj", model.getRegistryName());
        Assertions.assertEquals("nacgdnx", model.getRepository());
        Assertions.assertEquals("onmzrjjaojpzn", model.getTag());
        Assertions.assertEquals("rz", model.getManifestDigest());
        Assertions.assertEquals(1361930532, model.getCompressedSizeBytes());
        Assertions.assertEquals(2099090141, model.getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T10:14:40Z"), model.getUpdatedAt());
    }
}
