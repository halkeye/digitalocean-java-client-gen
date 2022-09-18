package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema;
import com.digitalocean.api.models.Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.RepositoryTag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":223194888},\"tags\":[{\"registry_name\":\"xcacrmvjfmrsuydl\",\"repository\":\"relsxfkzrz\",\"tag\":\"rjvqxvwkiocxoer\",\"manifest_digest\":\"buocq\",\"compressed_size_bytes\":1078776215,\"size_bytes\":1999602750,\"updated_at\":\"2021-05-02T13:39:25Z\"},{\"registry_name\":\"xbc\",\"repository\":\"tezyozdb\",\"tag\":\"qnl\",\"manifest_digest\":\"xc\",\"compressed_size_bytes\":448718328,\"size_bytes\":1806399393,\"updated_at\":\"2021-08-27T12:56:56Z\"}]}").toObject(Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema.class);
        Assertions.assertEquals("xcacrmvjfmrsuydl", model.getTags().get(0).getRegistryName());
        Assertions.assertEquals("relsxfkzrz", model.getTags().get(0).getRepository());
        Assertions.assertEquals("rjvqxvwkiocxoer", model.getTags().get(0).getTag());
        Assertions.assertEquals("buocq", model.getTags().get(0).getManifestDigest());
        Assertions.assertEquals(1078776215, model.getTags().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1999602750, model.getTags().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-02T13:39:25Z"), model.getTags().get(0).getUpdatedAt());
        Assertions.assertEquals(223194888, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema model = new Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema().setTags(Arrays.asList(new RepositoryTag().setRegistryName("xcacrmvjfmrsuydl").setRepository("relsxfkzrz").setTag("rjvqxvwkiocxoer").setManifestDigest("buocq").setCompressedSizeBytes(1078776215).setSizeBytes(1999602750).setUpdatedAt(OffsetDateTime.parse("2021-05-02T13:39:25Z")), new RepositoryTag().setRegistryName("xbc").setRepository("tezyozdb").setTag("qnl").setManifestDigest("xc").setCompressedSizeBytes(448718328).setSizeBytes(1806399393).setUpdatedAt(OffsetDateTime.parse("2021-08-27T12:56:56Z")))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(223194888));
        model = BinaryData.fromObject(model).toObject(Components10JgxsbResponsesRepositoryTagsContentApplicationJsonSchema.class);
        Assertions.assertEquals("xcacrmvjfmrsuydl", model.getTags().get(0).getRegistryName());
        Assertions.assertEquals("relsxfkzrz", model.getTags().get(0).getRepository());
        Assertions.assertEquals("rjvqxvwkiocxoer", model.getTags().get(0).getTag());
        Assertions.assertEquals("buocq", model.getTags().get(0).getManifestDigest());
        Assertions.assertEquals(1078776215, model.getTags().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1999602750, model.getTags().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-02T13:39:25Z"), model.getTags().get(0).getUpdatedAt());
        Assertions.assertEquals(223194888, model.getMeta().getTotal());
    }
}
