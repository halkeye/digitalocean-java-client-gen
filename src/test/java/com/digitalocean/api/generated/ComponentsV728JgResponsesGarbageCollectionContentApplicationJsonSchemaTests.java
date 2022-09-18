package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema;
import com.digitalocean.api.models.GarbageCollection;
import com.digitalocean.api.models.GarbageCollectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema model = BinaryData.fromString("{\"garbage_collection\":{\"uuid\":\"zipplxg\",\"registry_name\":\"um\",\"status\":\"deleting unreferenced blobs\",\"created_at\":\"2021-06-01T21:44:24Z\",\"updated_at\":\"2021-01-11T12:42:55Z\",\"blobs_deleted\":720315762,\"freed_bytes\":706923699}}").toObject(ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema.class);
        Assertions.assertEquals("zipplxg", model.getGarbageCollection().getUuid());
        Assertions.assertEquals("um", model.getGarbageCollection().getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.DELETING_UNREFERENCED_BLOBS, model.getGarbageCollection().getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-01T21:44:24Z"), model.getGarbageCollection().getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T12:42:55Z"), model.getGarbageCollection().getUpdatedAt());
        Assertions.assertEquals(720315762, model.getGarbageCollection().getBlobsDeleted());
        Assertions.assertEquals(706923699, model.getGarbageCollection().getFreedBytes());
    }

    @Test
    public void testSerialize() {
        ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema model = new ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema().setGarbageCollection(new GarbageCollection().setUuid("zipplxg").setRegistryName("um").setStatus(GarbageCollectionStatus.DELETING_UNREFERENCED_BLOBS).setCreatedAt(OffsetDateTime.parse("2021-06-01T21:44:24Z")).setUpdatedAt(OffsetDateTime.parse("2021-01-11T12:42:55Z")).setBlobsDeleted(720315762).setFreedBytes(706923699));
        model = BinaryData.fromObject(model).toObject(ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema.class);
        Assertions.assertEquals("zipplxg", model.getGarbageCollection().getUuid());
        Assertions.assertEquals("um", model.getGarbageCollection().getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.DELETING_UNREFERENCED_BLOBS, model.getGarbageCollection().getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-01T21:44:24Z"), model.getGarbageCollection().getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T12:42:55Z"), model.getGarbageCollection().getUpdatedAt());
        Assertions.assertEquals(720315762, model.getGarbageCollection().getBlobsDeleted());
        Assertions.assertEquals(706923699, model.getGarbageCollection().getFreedBytes());
    }
}
