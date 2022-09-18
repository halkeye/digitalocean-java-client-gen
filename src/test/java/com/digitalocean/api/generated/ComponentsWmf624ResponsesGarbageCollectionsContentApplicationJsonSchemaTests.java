package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema;
import com.digitalocean.api.models.GarbageCollection;
import com.digitalocean.api.models.GarbageCollectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema model = BinaryData.fromString("{\"garbage_collections\":[{\"uuid\":\"amnsbqoitwhmucj\",\"registry_name\":\"hcxyvehy\",\"status\":\"failed\",\"created_at\":\"2021-10-21T07:01:41Z\",\"updated_at\":\"2021-08-05T08:18Z\",\"blobs_deleted\":47279327,\"freed_bytes\":825679069}]}").toObject(ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema.class);
        Assertions.assertEquals("amnsbqoitwhmucj", model.getGarbageCollections().get(0).getUuid());
        Assertions.assertEquals("hcxyvehy", model.getGarbageCollections().get(0).getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.FAILED, model.getGarbageCollections().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T07:01:41Z"), model.getGarbageCollections().get(0).getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T08:18Z"), model.getGarbageCollections().get(0).getUpdatedAt());
        Assertions.assertEquals(47279327, model.getGarbageCollections().get(0).getBlobsDeleted());
        Assertions.assertEquals(825679069, model.getGarbageCollections().get(0).getFreedBytes());
    }

    @Test
    public void testSerialize() {
        ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema model = new ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema().setGarbageCollections(Arrays.asList(new GarbageCollection().setUuid("amnsbqoitwhmucj").setRegistryName("hcxyvehy").setStatus(GarbageCollectionStatus.FAILED).setCreatedAt(OffsetDateTime.parse("2021-10-21T07:01:41Z")).setUpdatedAt(OffsetDateTime.parse("2021-08-05T08:18Z")).setBlobsDeleted(47279327).setFreedBytes(825679069)));
        model = BinaryData.fromObject(model).toObject(ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema.class);
        Assertions.assertEquals("amnsbqoitwhmucj", model.getGarbageCollections().get(0).getUuid());
        Assertions.assertEquals("hcxyvehy", model.getGarbageCollections().get(0).getRegistryName());
        Assertions.assertEquals(GarbageCollectionStatus.FAILED, model.getGarbageCollections().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T07:01:41Z"), model.getGarbageCollections().get(0).getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T08:18Z"), model.getGarbageCollections().get(0).getUpdatedAt());
        Assertions.assertEquals(47279327, model.getGarbageCollections().get(0).getBlobsDeleted());
        Assertions.assertEquals(825679069, model.getGarbageCollections().get(0).getFreedBytes());
    }
}
