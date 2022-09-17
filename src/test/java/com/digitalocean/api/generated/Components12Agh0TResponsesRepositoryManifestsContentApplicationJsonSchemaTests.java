package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.RepositoryManifest;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1020588749},\"manifests\":[{\"registry_name\":\"iytehhxtzxqdwbym\",\"repository\":\"lngncrdorc\",\"digest\":\"s\",\"compressed_size_bytes\":623186360,\"size_bytes\":834743892,\"updated_at\":\"2021-05-25T00:32:15Z\",\"tags\":[\"yhqtzcvimmwcko\"],\"blobs\":[]},{\"registry_name\":\"ymtrts\",\"repository\":\"upqtzckj\",\"digest\":\"bkgnr\",\"compressed_size_bytes\":64118322,\"size_bytes\":777478557,\"updated_at\":\"2021-07-21T21:07:27Z\",\"tags\":[\"cqzahgtvbgdob\"],\"blobs\":[]}]}")
                        .toObject(Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema.class);
        Assertions.assertEquals("iytehhxtzxqdwbym", model.getManifests().get(0).getRegistryName());
        Assertions.assertEquals("lngncrdorc", model.getManifests().get(0).getRepository());
        Assertions.assertEquals("s", model.getManifests().get(0).getDigest());
        Assertions.assertEquals(623186360, model.getManifests().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(834743892, model.getManifests().get(0).getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-25T00:32:15Z"), model.getManifests().get(0).getUpdatedAt());
        Assertions.assertEquals("yhqtzcvimmwcko", model.getManifests().get(0).getTags().get(0));
        Assertions.assertEquals(1020588749, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema model =
                new Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema()
                        .setManifests(
                                Arrays.asList(
                                        new RepositoryManifest()
                                                .setRegistryName("iytehhxtzxqdwbym")
                                                .setRepository("lngncrdorc")
                                                .setDigest("s")
                                                .setCompressedSizeBytes(623186360)
                                                .setSizeBytes(834743892)
                                                .setUpdatedAt(OffsetDateTime.parse("2021-05-25T00:32:15Z"))
                                                .setTags(Arrays.asList("yhqtzcvimmwcko"))
                                                .setBlobs(Arrays.asList()),
                                        new RepositoryManifest()
                                                .setRegistryName("ymtrts")
                                                .setRepository("upqtzckj")
                                                .setDigest("bkgnr")
                                                .setCompressedSizeBytes(64118322)
                                                .setSizeBytes(777478557)
                                                .setUpdatedAt(OffsetDateTime.parse("2021-07-21T21:07:27Z"))
                                                .setTags(Arrays.asList("cqzahgtvbgdob"))
                                                .setBlobs(Arrays.asList())))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1020588749));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components12Agh0TResponsesRepositoryManifestsContentApplicationJsonSchema.class);
        Assertions.assertEquals("iytehhxtzxqdwbym", model.getManifests().get(0).getRegistryName());
        Assertions.assertEquals("lngncrdorc", model.getManifests().get(0).getRepository());
        Assertions.assertEquals("s", model.getManifests().get(0).getDigest());
        Assertions.assertEquals(623186360, model.getManifests().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(834743892, model.getManifests().get(0).getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-25T00:32:15Z"), model.getManifests().get(0).getUpdatedAt());
        Assertions.assertEquals("yhqtzcvimmwcko", model.getManifests().get(0).getTags().get(0));
        Assertions.assertEquals(1020588749, model.getMeta().getTotal());
    }
}
