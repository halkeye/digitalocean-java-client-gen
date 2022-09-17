package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RepositoryBlob;
import com.digitalocean.api.models.RepositoryManifest;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RepositoryManifestTests {
    @Test
    public void testDeserialize() {
        RepositoryManifest model =
                BinaryData.fromString(
                                "{\"registry_name\":\"ne\",\"repository\":\"aerpiobn\",\"digest\":\"fbrjokjwqdmraqni\",\"compressed_size_bytes\":1840913522,\"size_bytes\":1780658860,\"updated_at\":\"2021-07-04T17:21:26Z\",\"tags\":[\"zwfwlrfdjwlzseod\",\"qfdrs\",\"zy\",\"qxse\"],\"blobs\":[{\"digest\":\"uhytjwgetfi\",\"compressed_size_bytes\":199718993},{\"digest\":\"qjxzi\",\"compressed_size_bytes\":882309464},{\"digest\":\"rah\",\"compressed_size_bytes\":1139828254},{\"digest\":\"ubwggxzsshxliqm\",\"compressed_size_bytes\":2104880472}]}")
                        .toObject(RepositoryManifest.class);
        Assertions.assertEquals("ne", model.getRegistryName());
        Assertions.assertEquals("aerpiobn", model.getRepository());
        Assertions.assertEquals("fbrjokjwqdmraqni", model.getDigest());
        Assertions.assertEquals(1840913522, model.getCompressedSizeBytes());
        Assertions.assertEquals(1780658860, model.getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T17:21:26Z"), model.getUpdatedAt());
        Assertions.assertEquals("zwfwlrfdjwlzseod", model.getTags().get(0));
        Assertions.assertEquals("uhytjwgetfi", model.getBlobs().get(0).getDigest());
        Assertions.assertEquals(199718993, model.getBlobs().get(0).getCompressedSizeBytes());
    }

    @Test
    public void testSerialize() {
        RepositoryManifest model =
                new RepositoryManifest()
                        .setRegistryName("ne")
                        .setRepository("aerpiobn")
                        .setDigest("fbrjokjwqdmraqni")
                        .setCompressedSizeBytes(1840913522)
                        .setSizeBytes(1780658860)
                        .setUpdatedAt(OffsetDateTime.parse("2021-07-04T17:21:26Z"))
                        .setTags(Arrays.asList("zwfwlrfdjwlzseod", "qfdrs", "zy", "qxse"))
                        .setBlobs(
                                Arrays.asList(
                                        new RepositoryBlob().setDigest("uhytjwgetfi").setCompressedSizeBytes(199718993),
                                        new RepositoryBlob().setDigest("qjxzi").setCompressedSizeBytes(882309464),
                                        new RepositoryBlob().setDigest("rah").setCompressedSizeBytes(1139828254),
                                        new RepositoryBlob()
                                                .setDigest("ubwggxzsshxliqm")
                                                .setCompressedSizeBytes(2104880472)));
        model = BinaryData.fromObject(model).toObject(RepositoryManifest.class);
        Assertions.assertEquals("ne", model.getRegistryName());
        Assertions.assertEquals("aerpiobn", model.getRepository());
        Assertions.assertEquals("fbrjokjwqdmraqni", model.getDigest());
        Assertions.assertEquals(1840913522, model.getCompressedSizeBytes());
        Assertions.assertEquals(1780658860, model.getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T17:21:26Z"), model.getUpdatedAt());
        Assertions.assertEquals("zwfwlrfdjwlzseod", model.getTags().get(0));
        Assertions.assertEquals("uhytjwgetfi", model.getBlobs().get(0).getDigest());
        Assertions.assertEquals(199718993, model.getBlobs().get(0).getCompressedSizeBytes());
    }
}
