package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.GarbageCollection;
import com.digitalocean.api.models.GarbageCollectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GarbageCollectionTests {
    @Test
    public void testDeserialize() {
        GarbageCollection model = BinaryData.fromString("{\"uuid\":\"xozqthkwxfugfziz\",\"registry_name\":\"duyjnqzbr\",\"status\":\"scanning manifests\",\"created_at\":\"2021-06-01T12:57:34Z\",\"updated_at\":\"2021-04-07T05:51:53Z\",\"blobs_deleted\":1874576933,\"freed_bytes\":214271972}").toObject(GarbageCollection.class);
        Assertions.assertEquals("xozqthkwxfugfziz", model.getUuid());
        Assertions.assertEquals("duyjnqzbr", model.getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.SCANNING_MANIFESTS, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-01T12:57:34Z"), model.getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-07T05:51:53Z"), model.getUpdatedAt());
        Assertions.assertEquals(1874576933, model.getBlobsDeleted());
        Assertions.assertEquals(214271972, model.getFreedBytes());
    }

    @Test
    public void testSerialize() {
        GarbageCollection model = new GarbageCollection().setUuid("xozqthkwxfugfziz").setRegistryName("duyjnqzbr").setStatus(GarbageCollectionStatus.SCANNING_MANIFESTS).setCreatedAt(OffsetDateTime.parse("2021-06-01T12:57:34Z")).setUpdatedAt(OffsetDateTime.parse("2021-04-07T05:51:53Z")).setBlobsDeleted(1874576933).setFreedBytes(214271972);
        model = BinaryData.fromObject(model).toObject(GarbageCollection.class);
        Assertions.assertEquals("xozqthkwxfugfziz", model.getUuid());
        Assertions.assertEquals("duyjnqzbr", model.getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.SCANNING_MANIFESTS, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-01T12:57:34Z"), model.getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-07T05:51:53Z"), model.getUpdatedAt());
        Assertions.assertEquals(1874576933, model.getBlobsDeleted());
        Assertions.assertEquals(214271972, model.getFreedBytes());
    }
}
