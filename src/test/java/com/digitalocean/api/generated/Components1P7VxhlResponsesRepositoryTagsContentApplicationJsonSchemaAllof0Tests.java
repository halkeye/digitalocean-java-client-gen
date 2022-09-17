package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.RepositoryTag;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"tags\":[{\"registry_name\":\"hjjidodnvltc\",\"repository\":\"ahpuwkupbbnhic\",\"tag\":\"yzhrcqdfwbifnn\",\"manifest_digest\":\"sforsimtfcqmmyn\",\"compressed_size_bytes\":1818751594,\"size_bytes\":1698107848,\"updated_at\":\"2021-03-08T09:14:41Z\"},{\"registry_name\":\"jt\",\"repository\":\"gxmpesza\",\"tag\":\"dlerzin\",\"manifest_digest\":\"ivczktllxswtdap\",\"compressed_size_bytes\":733480853,\"size_bytes\":614534815,\"updated_at\":\"2021-02-24T19:16:39Z\"},{\"registry_name\":\"jefmrtwxcevds\",\"repository\":\"hgffmwtblgm\",\"tag\":\"kqoikxiefwln\",\"manifest_digest\":\"kffcnuestbsl\",\"compressed_size_bytes\":2003601660,\"size_bytes\":2027634602,\"updated_at\":\"2021-01-03T21:36:28Z\"}]}")
                        .toObject(Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("hjjidodnvltc", model.getTags().get(0).getRegistryName());
        Assertions.assertEquals("ahpuwkupbbnhic", model.getTags().get(0).getRepository());
        Assertions.assertEquals("yzhrcqdfwbifnn", model.getTags().get(0).getTag());
        Assertions.assertEquals("sforsimtfcqmmyn", model.getTags().get(0).getManifestDigest());
        Assertions.assertEquals(1818751594, model.getTags().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1698107848, model.getTags().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-08T09:14:41Z"), model.getTags().get(0).getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 model =
                new Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0()
                        .setTags(
                                Arrays.asList(
                                        new RepositoryTag()
                                                .setRegistryName("hjjidodnvltc")
                                                .setRepository("ahpuwkupbbnhic")
                                                .setTag("yzhrcqdfwbifnn")
                                                .setManifestDigest("sforsimtfcqmmyn")
                                                .setCompressedSizeBytes(1818751594)
                                                .setSizeBytes(1698107848)
                                                .setUpdatedAt(OffsetDateTime.parse("2021-03-08T09:14:41Z")),
                                        new RepositoryTag()
                                                .setRegistryName("jt")
                                                .setRepository("gxmpesza")
                                                .setTag("dlerzin")
                                                .setManifestDigest("ivczktllxswtdap")
                                                .setCompressedSizeBytes(733480853)
                                                .setSizeBytes(614534815)
                                                .setUpdatedAt(OffsetDateTime.parse("2021-02-24T19:16:39Z")),
                                        new RepositoryTag()
                                                .setRegistryName("jefmrtwxcevds")
                                                .setRepository("hgffmwtblgm")
                                                .setTag("kqoikxiefwln")
                                                .setManifestDigest("kffcnuestbsl")
                                                .setCompressedSizeBytes(2003601660)
                                                .setSizeBytes(2027634602)
                                                .setUpdatedAt(OffsetDateTime.parse("2021-01-03T21:36:28Z"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("hjjidodnvltc", model.getTags().get(0).getRegistryName());
        Assertions.assertEquals("ahpuwkupbbnhic", model.getTags().get(0).getRepository());
        Assertions.assertEquals("yzhrcqdfwbifnn", model.getTags().get(0).getTag());
        Assertions.assertEquals("sforsimtfcqmmyn", model.getTags().get(0).getManifestDigest());
        Assertions.assertEquals(1818751594, model.getTags().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1698107848, model.getTags().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-08T09:14:41Z"), model.getTags().get(0).getUpdatedAt());
    }
}
