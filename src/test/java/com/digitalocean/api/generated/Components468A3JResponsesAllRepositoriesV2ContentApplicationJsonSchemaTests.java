package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.RepositoryManifest;
import com.digitalocean.api.models.RepositoryV2;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1239712532},\"repositories\":[{\"registry_name\":\"khwqdmohheuyuu\",\"name\":\"myevyigdeipn\",\"latest_manifest\":{\"registry_name\":\"ejwli\",\"repository\":\"cndjzwhajo\",\"digest\":\"pqokhdyncra\",\"compressed_size_bytes\":1491222274,\"size_bytes\":42020637,\"updated_at\":\"2021-02-22T02:26:57Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":1991210767,\"manifest_count\":640565722},{\"registry_name\":\"nme\",\"name\":\"ksy\",\"latest_manifest\":{\"registry_name\":\"iclm\",\"repository\":\"nunkqvzlbbbajdex\",\"digest\":\"awexizb\",\"compressed_size_bytes\":1011761866,\"size_bytes\":1751949591,\"updated_at\":\"2021-09-12T13:56:48Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":1283529110,\"manifest_count\":167900023},{\"registry_name\":\"jvvyxtvvxnakzix\",\"name\":\"aybf\",\"latest_manifest\":{\"registry_name\":\"gfwhrmvlaknujmwx\",\"repository\":\"zblxna\",\"digest\":\"smfndcbsyhludzjk\",\"compressed_size_bytes\":94433668,\"size_bytes\":1558101093,\"updated_at\":\"2021-05-03T23:26:40Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":352831383,\"manifest_count\":922241690}]}")
                        .toObject(Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema.class);
        Assertions.assertEquals("khwqdmohheuyuu", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("myevyigdeipn", model.getRepositories().get(0).getName());
        Assertions.assertEquals("ejwli", model.getRepositories().get(0).getLatestManifest().getRegistryName());
        Assertions.assertEquals("cndjzwhajo", model.getRepositories().get(0).getLatestManifest().getRepository());
        Assertions.assertEquals("pqokhdyncra", model.getRepositories().get(0).getLatestManifest().getDigest());
        Assertions.assertEquals(
                1491222274, model.getRepositories().get(0).getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(42020637, model.getRepositories().get(0).getLatestManifest().getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-22T02:26:57Z"),
                model.getRepositories().get(0).getLatestManifest().getUpdatedAt());
        Assertions.assertEquals(1991210767, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(640565722, model.getRepositories().get(0).getManifestCount());
        Assertions.assertEquals(1239712532, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema model =
                new Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema()
                        .setRepositories(
                                Arrays.asList(
                                        new RepositoryV2()
                                                .setRegistryName("khwqdmohheuyuu")
                                                .setName("myevyigdeipn")
                                                .setLatestManifest(
                                                        new RepositoryManifest()
                                                                .setRegistryName("ejwli")
                                                                .setRepository("cndjzwhajo")
                                                                .setDigest("pqokhdyncra")
                                                                .setCompressedSizeBytes(1491222274)
                                                                .setSizeBytes(42020637)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-02-22T02:26:57Z"))
                                                                .setTags(Arrays.asList())
                                                                .setBlobs(Arrays.asList()))
                                                .setTagCount(1991210767)
                                                .setManifestCount(640565722),
                                        new RepositoryV2()
                                                .setRegistryName("nme")
                                                .setName("ksy")
                                                .setLatestManifest(
                                                        new RepositoryManifest()
                                                                .setRegistryName("iclm")
                                                                .setRepository("nunkqvzlbbbajdex")
                                                                .setDigest("awexizb")
                                                                .setCompressedSizeBytes(1011761866)
                                                                .setSizeBytes(1751949591)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-09-12T13:56:48Z"))
                                                                .setTags(Arrays.asList())
                                                                .setBlobs(Arrays.asList()))
                                                .setTagCount(1283529110)
                                                .setManifestCount(167900023),
                                        new RepositoryV2()
                                                .setRegistryName("jvvyxtvvxnakzix")
                                                .setName("aybf")
                                                .setLatestManifest(
                                                        new RepositoryManifest()
                                                                .setRegistryName("gfwhrmvlaknujmwx")
                                                                .setRepository("zblxna")
                                                                .setDigest("smfndcbsyhludzjk")
                                                                .setCompressedSizeBytes(94433668)
                                                                .setSizeBytes(1558101093)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-05-03T23:26:40Z"))
                                                                .setTags(Arrays.asList())
                                                                .setBlobs(Arrays.asList()))
                                                .setTagCount(352831383)
                                                .setManifestCount(922241690)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1239712532));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema.class);
        Assertions.assertEquals("khwqdmohheuyuu", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("myevyigdeipn", model.getRepositories().get(0).getName());
        Assertions.assertEquals("ejwli", model.getRepositories().get(0).getLatestManifest().getRegistryName());
        Assertions.assertEquals("cndjzwhajo", model.getRepositories().get(0).getLatestManifest().getRepository());
        Assertions.assertEquals("pqokhdyncra", model.getRepositories().get(0).getLatestManifest().getDigest());
        Assertions.assertEquals(
                1491222274, model.getRepositories().get(0).getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(42020637, model.getRepositories().get(0).getLatestManifest().getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-22T02:26:57Z"),
                model.getRepositories().get(0).getLatestManifest().getUpdatedAt());
        Assertions.assertEquals(1991210767, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(640565722, model.getRepositories().get(0).getManifestCount());
        Assertions.assertEquals(1239712532, model.getMeta().getTotal());
    }
}
