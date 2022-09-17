package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RepositoryBlob;
import com.digitalocean.api.models.RepositoryManifest;
import com.digitalocean.api.models.RepositoryV2;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RepositoryV2Tests {
    @Test
    public void testDeserialize() {
        RepositoryV2 model =
                BinaryData.fromString(
                                "{\"registry_name\":\"zcsla\",\"name\":\"rkqoyimxpg\",\"latest_manifest\":{\"registry_name\":\"teagbgac\",\"repository\":\"pjuytvu\",\"digest\":\"ylpbybki\",\"compressed_size_bytes\":898349819,\"size_bytes\":1330737112,\"updated_at\":\"2021-06-11T04:56:34Z\",\"tags\":[\"pwdj\",\"au\",\"fshznu\"],\"blobs\":[{\"digest\":\"haaaxxdcdjm\",\"compressed_size_bytes\":972935361},{\"digest\":\"xfrmbecxstowag\",\"compressed_size_bytes\":2039605634},{\"digest\":\"ihwe\",\"compressed_size_bytes\":1755943107},{\"digest\":\"aqgblkkncyp\",\"compressed_size_bytes\":51713703}]},\"tag_count\":1720955047,\"manifest_count\":288667891}")
                        .toObject(RepositoryV2.class);
        Assertions.assertEquals("zcsla", model.getRegistryName());
        Assertions.assertEquals("rkqoyimxpg", model.getName());
        Assertions.assertEquals("teagbgac", model.getLatestManifest().getRegistryName());
        Assertions.assertEquals("pjuytvu", model.getLatestManifest().getRepository());
        Assertions.assertEquals("ylpbybki", model.getLatestManifest().getDigest());
        Assertions.assertEquals(898349819, model.getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(1330737112, model.getLatestManifest().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T04:56:34Z"), model.getLatestManifest().getUpdatedAt());
        Assertions.assertEquals("pwdj", model.getLatestManifest().getTags().get(0));
        Assertions.assertEquals("haaaxxdcdjm", model.getLatestManifest().getBlobs().get(0).getDigest());
        Assertions.assertEquals(972935361, model.getLatestManifest().getBlobs().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1720955047, model.getTagCount());
        Assertions.assertEquals(288667891, model.getManifestCount());
    }

    @Test
    public void testSerialize() {
        RepositoryV2 model =
                new RepositoryV2()
                        .setRegistryName("zcsla")
                        .setName("rkqoyimxpg")
                        .setLatestManifest(
                                new RepositoryManifest()
                                        .setRegistryName("teagbgac")
                                        .setRepository("pjuytvu")
                                        .setDigest("ylpbybki")
                                        .setCompressedSizeBytes(898349819)
                                        .setSizeBytes(1330737112)
                                        .setUpdatedAt(OffsetDateTime.parse("2021-06-11T04:56:34Z"))
                                        .setTags(Arrays.asList("pwdj", "au", "fshznu"))
                                        .setBlobs(
                                                Arrays.asList(
                                                        new RepositoryBlob()
                                                                .setDigest("haaaxxdcdjm")
                                                                .setCompressedSizeBytes(972935361),
                                                        new RepositoryBlob()
                                                                .setDigest("xfrmbecxstowag")
                                                                .setCompressedSizeBytes(2039605634),
                                                        new RepositoryBlob()
                                                                .setDigest("ihwe")
                                                                .setCompressedSizeBytes(1755943107),
                                                        new RepositoryBlob()
                                                                .setDigest("aqgblkkncyp")
                                                                .setCompressedSizeBytes(51713703))))
                        .setTagCount(1720955047)
                        .setManifestCount(288667891);
        model = BinaryData.fromObject(model).toObject(RepositoryV2.class);
        Assertions.assertEquals("zcsla", model.getRegistryName());
        Assertions.assertEquals("rkqoyimxpg", model.getName());
        Assertions.assertEquals("teagbgac", model.getLatestManifest().getRegistryName());
        Assertions.assertEquals("pjuytvu", model.getLatestManifest().getRepository());
        Assertions.assertEquals("ylpbybki", model.getLatestManifest().getDigest());
        Assertions.assertEquals(898349819, model.getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(1330737112, model.getLatestManifest().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T04:56:34Z"), model.getLatestManifest().getUpdatedAt());
        Assertions.assertEquals("pwdj", model.getLatestManifest().getTags().get(0));
        Assertions.assertEquals("haaaxxdcdjm", model.getLatestManifest().getBlobs().get(0).getDigest());
        Assertions.assertEquals(972935361, model.getLatestManifest().getBlobs().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1720955047, model.getTagCount());
        Assertions.assertEquals(288667891, model.getManifestCount());
    }
}
