package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Repository;
import com.digitalocean.api.models.RepositoryTag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":404924727},\"repositories\":[{\"registry_name\":\"fsvpzxg\",\"name\":\"wxuymlfjymg\",\"latest_tag\":{\"registry_name\":\"szcfyzqpeqreg\",\"repository\":\"rdpagknxmaovr\",\"tag\":\"hlnzffew\",\"manifest_digest\":\"kycjcg\",\"compressed_size_bytes\":1608962177,\"size_bytes\":1908779140,\"updated_at\":\"2021-10-29T17:27:49Z\"},\"tag_count\":1628148711},{\"registry_name\":\"fwtyd\",\"name\":\"mabhgc\",\"latest_tag\":{\"registry_name\":\"qzhpvhxpbad\",\"repository\":\"eullgfyog\",\"tag\":\"scjpvqe\",\"manifest_digest\":\"xkomwdzpzlhcue\",\"compressed_size_bytes\":2005686175,\"size_bytes\":2138095366,\"updated_at\":\"2021-08-09T06:33:48Z\"},\"tag_count\":1663750320}]}").toObject(Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema.class);
        Assertions.assertEquals("fsvpzxg", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("wxuymlfjymg", model.getRepositories().get(0).getName());
        Assertions.assertEquals("szcfyzqpeqreg", model.getRepositories().get(0).getLatestTag().getRegistryName());
        Assertions.assertEquals("rdpagknxmaovr", model.getRepositories().get(0).getLatestTag().getRepository());
        Assertions.assertEquals("hlnzffew", model.getRepositories().get(0).getLatestTag().getTag());
        Assertions.assertEquals("kycjcg", model.getRepositories().get(0).getLatestTag().getManifestDigest());
        Assertions.assertEquals(1608962177, model.getRepositories().get(0).getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(1908779140, model.getRepositories().get(0).getLatestTag().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-29T17:27:49Z"), model.getRepositories().get(0).getLatestTag().getUpdatedAt());
        Assertions.assertEquals(1628148711, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(404924727, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema model = new Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema().setRepositories(Arrays.asList(new Repository().setRegistryName("fsvpzxg").setName("wxuymlfjymg").setLatestTag(new RepositoryTag().setRegistryName("szcfyzqpeqreg").setRepository("rdpagknxmaovr").setTag("hlnzffew").setManifestDigest("kycjcg").setCompressedSizeBytes(1608962177).setSizeBytes(1908779140).setUpdatedAt(OffsetDateTime.parse("2021-10-29T17:27:49Z"))).setTagCount(1628148711), new Repository().setRegistryName("fwtyd").setName("mabhgc").setLatestTag(new RepositoryTag().setRegistryName("qzhpvhxpbad").setRepository("eullgfyog").setTag("scjpvqe").setManifestDigest("xkomwdzpzlhcue").setCompressedSizeBytes(2005686175).setSizeBytes(2138095366).setUpdatedAt(OffsetDateTime.parse("2021-08-09T06:33:48Z"))).setTagCount(1663750320))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(404924727));
        model = BinaryData.fromObject(model).toObject(Components1Ariq5GResponsesAllRepositoriesContentApplicationJsonSchema.class);
        Assertions.assertEquals("fsvpzxg", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("wxuymlfjymg", model.getRepositories().get(0).getName());
        Assertions.assertEquals("szcfyzqpeqreg", model.getRepositories().get(0).getLatestTag().getRegistryName());
        Assertions.assertEquals("rdpagknxmaovr", model.getRepositories().get(0).getLatestTag().getRepository());
        Assertions.assertEquals("hlnzffew", model.getRepositories().get(0).getLatestTag().getTag());
        Assertions.assertEquals("kycjcg", model.getRepositories().get(0).getLatestTag().getManifestDigest());
        Assertions.assertEquals(1608962177, model.getRepositories().get(0).getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(1908779140, model.getRepositories().get(0).getLatestTag().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-29T17:27:49Z"), model.getRepositories().get(0).getLatestTag().getUpdatedAt());
        Assertions.assertEquals(1628148711, model.getRepositories().get(0).getTagCount());
        Assertions.assertEquals(404924727, model.getMeta().getTotal());
    }
}
