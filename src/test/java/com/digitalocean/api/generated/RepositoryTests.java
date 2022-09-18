package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Repository;
import com.digitalocean.api.models.RepositoryTag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RepositoryTests {
    @Test
    public void testDeserialize() {
        Repository model = BinaryData.fromString("{\"registry_name\":\"ifqnff\",\"name\":\"xsqtzngxbs\",\"latest_tag\":{\"registry_name\":\"wguxcmmhipbvskci\",\"repository\":\"y\",\"tag\":\"wfsaa\",\"manifest_digest\":\"fgb\",\"compressed_size_bytes\":274077860,\"size_bytes\":1717985540,\"updated_at\":\"2021-09-23T02:59:20Z\"},\"tag_count\":1605492433}").toObject(Repository.class);
        Assertions.assertEquals("ifqnff", model.getRegistryName());
        Assertions.assertEquals("xsqtzngxbs", model.getName());
        Assertions.assertEquals("wguxcmmhipbvskci", model.getLatestTag().getRegistryName());
        Assertions.assertEquals("y", model.getLatestTag().getRepository());
        Assertions.assertEquals("wfsaa", model.getLatestTag().getTag());
        Assertions.assertEquals("fgb", model.getLatestTag().getManifestDigest());
        Assertions.assertEquals(274077860, model.getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(1717985540, model.getLatestTag().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-23T02:59:20Z"), model.getLatestTag().getUpdatedAt());
        Assertions.assertEquals(1605492433, model.getTagCount());
    }

    @Test
    public void testSerialize() {
        Repository model = new Repository().setRegistryName("ifqnff").setName("xsqtzngxbs").setLatestTag(new RepositoryTag().setRegistryName("wguxcmmhipbvskci").setRepository("y").setTag("wfsaa").setManifestDigest("fgb").setCompressedSizeBytes(274077860).setSizeBytes(1717985540).setUpdatedAt(OffsetDateTime.parse("2021-09-23T02:59:20Z"))).setTagCount(1605492433);
        model = BinaryData.fromObject(model).toObject(Repository.class);
        Assertions.assertEquals("ifqnff", model.getRegistryName());
        Assertions.assertEquals("xsqtzngxbs", model.getName());
        Assertions.assertEquals("wguxcmmhipbvskci", model.getLatestTag().getRegistryName());
        Assertions.assertEquals("y", model.getLatestTag().getRepository());
        Assertions.assertEquals("wfsaa", model.getLatestTag().getTag());
        Assertions.assertEquals("fgb", model.getLatestTag().getManifestDigest());
        Assertions.assertEquals(274077860, model.getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(1717985540, model.getLatestTag().getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-23T02:59:20Z"), model.getLatestTag().getUpdatedAt());
        Assertions.assertEquals(1605492433, model.getTagCount());
    }
}
