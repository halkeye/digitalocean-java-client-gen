package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.RepositoryManifest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"manifests\":[{\"registry_name\":\"lxosgiht\",\"repository\":\"ueqb\",\"digest\":\"qfgvznjqswshe\",\"compressed_size_bytes\":998249084,\"size_bytes\":1308999133,\"updated_at\":\"2021-07-24T04:38:36Z\",\"tags\":[\"xlngouf\",\"izp\",\"mfxzspf\"],\"blobs\":[]}]}").toObject(ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("lxosgiht", model.getManifests().get(0).getRegistryName());
        Assertions.assertEquals("ueqb", model.getManifests().get(0).getRepository());
        Assertions.assertEquals("qfgvznjqswshe", model.getManifests().get(0).getDigest());
        Assertions.assertEquals(998249084, model.getManifests().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1308999133, model.getManifests().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-24T04:38:36Z"), model.getManifests().get(0).getUpdatedAt());
        Assertions.assertEquals("xlngouf", model.getManifests().get(0).getTags().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 model = new ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0().setManifests(Arrays.asList(new RepositoryManifest().setRegistryName("lxosgiht").setRepository("ueqb").setDigest("qfgvznjqswshe").setCompressedSizeBytes(998249084).setSizeBytes(1308999133).setUpdatedAt(OffsetDateTime.parse("2021-07-24T04:38:36Z")).setTags(Arrays.asList("xlngouf", "izp", "mfxzspf")).setBlobs(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("lxosgiht", model.getManifests().get(0).getRegistryName());
        Assertions.assertEquals("ueqb", model.getManifests().get(0).getRepository());
        Assertions.assertEquals("qfgvznjqswshe", model.getManifests().get(0).getDigest());
        Assertions.assertEquals(998249084, model.getManifests().get(0).getCompressedSizeBytes());
        Assertions.assertEquals(1308999133, model.getManifests().get(0).getSizeBytes());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-24T04:38:36Z"), model.getManifests().get(0).getUpdatedAt());
        Assertions.assertEquals("xlngouf", model.getManifests().get(0).getTags().get(0));
    }
}
