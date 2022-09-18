package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.RepositoryManifest;
import com.digitalocean.api.models.RepositoryV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"repositories\":[{\"registry_name\":\"rmdtacntjnaffhv\",\"name\":\"ia\",\"latest_manifest\":{\"registry_name\":\"ws\",\"repository\":\"fku\",\"digest\":\"kmxhhqsx\",\"compressed_size_bytes\":1837408279,\"size_bytes\":360005173,\"updated_at\":\"2021-10-26T16:13:24Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":1123699666,\"manifest_count\":45686585},{\"registry_name\":\"efeclflxcj\",\"name\":\"zwncvdefxonz\",\"latest_manifest\":{\"registry_name\":\"jptnnt\",\"repository\":\"cjqpzjvnpjr\",\"digest\":\"pgsjbioagwviqehm\",\"compressed_size_bytes\":1720561500,\"size_bytes\":1313379393,\"updated_at\":\"2021-11-25T22:30:45Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":1340180227,\"manifest_count\":1547198289},{\"registry_name\":\"k\",\"name\":\"imbr\",\"latest_manifest\":{\"registry_name\":\"phtjnh\",\"repository\":\"jl\",\"digest\":\"dcyzhimmydtd\",\"compressed_size_bytes\":2024787866,\"size_bytes\":1520186432,\"updated_at\":\"2021-09-24T08:39:55Z\",\"tags\":[],\"blobs\":[]},\"tag_count\":661540187,\"manifest_count\":978084338}]}").toObject(Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rmdtacntjnaffhv", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("ia", model.getRepositories().get(0).getName());
        Assertions.assertEquals("ws", model.getRepositories().get(0).getLatestManifest().getRegistryName());
        Assertions.assertEquals("fku", model.getRepositories().get(0).getLatestManifest().getRepository());
        Assertions.assertEquals("kmxhhqsx", model.getRepositories().get(0).getLatestManifest().getDigest());
        Assertions.assertEquals(1837408279, model.getRepositories().get(0).getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(360005173, model.getRepositories().get(0).getLatestManifest().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T16:13:24Z"), model.getRepositories().get(0).getLatestManifest().getUpdatedAt());
        Assertions.assertEquals(1123699666, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(45686585, model.getRepositories().get(0).getManifestCount());
    }

    @Test
    public void testSerialize() {
        Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 model = new Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0().setRepositories(Arrays.asList(new RepositoryV2().setRegistryName("rmdtacntjnaffhv").setName("ia").setLatestManifest(new RepositoryManifest().setRegistryName("ws").setRepository("fku").setDigest("kmxhhqsx").setCompressedSizeBytes(1837408279).setSizeBytes(360005173).setUpdatedAt(OffsetDateTime.parse("2021-10-26T16:13:24Z")).setTags(Arrays.asList()).setBlobs(Arrays.asList())).setTagCount(1123699666).setManifestCount(45686585), new RepositoryV2().setRegistryName("efeclflxcj").setName("zwncvdefxonz").setLatestManifest(new RepositoryManifest().setRegistryName("jptnnt").setRepository("cjqpzjvnpjr").setDigest("pgsjbioagwviqehm").setCompressedSizeBytes(1720561500).setSizeBytes(1313379393).setUpdatedAt(OffsetDateTime.parse("2021-11-25T22:30:45Z")).setTags(Arrays.asList()).setBlobs(Arrays.asList())).setTagCount(1340180227).setManifestCount(1547198289), new RepositoryV2().setRegistryName("k").setName("imbr").setLatestManifest(new RepositoryManifest().setRegistryName("phtjnh").setRepository("jl").setDigest("dcyzhimmydtd").setCompressedSizeBytes(2024787866).setSizeBytes(1520186432).setUpdatedAt(OffsetDateTime.parse("2021-09-24T08:39:55Z")).setTags(Arrays.asList()).setBlobs(Arrays.asList())).setTagCount(661540187).setManifestCount(978084338)));
        model = BinaryData.fromObject(model).toObject(Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rmdtacntjnaffhv", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("ia", model.getRepositories().get(0).getName());
        Assertions.assertEquals("ws", model.getRepositories().get(0).getLatestManifest().getRegistryName());
        Assertions.assertEquals("fku", model.getRepositories().get(0).getLatestManifest().getRepository());
        Assertions.assertEquals("kmxhhqsx", model.getRepositories().get(0).getLatestManifest().getDigest());
        Assertions.assertEquals(1837408279, model.getRepositories().get(0).getLatestManifest().getCompressedSizeBytes());
        Assertions.assertEquals(360005173, model.getRepositories().get(0).getLatestManifest().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T16:13:24Z"), model.getRepositories().get(0).getLatestManifest().getUpdatedAt());
        Assertions.assertEquals(1123699666, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(45686585, model.getRepositories().get(0).getManifestCount());
    }
}
