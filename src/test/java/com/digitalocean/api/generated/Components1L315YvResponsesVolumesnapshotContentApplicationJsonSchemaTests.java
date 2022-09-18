package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema model = BinaryData.fromString("{\"snapshot\":{\"resource_id\":\"jgeecwtfmabvbmn\",\"resource_type\":\"volume\",\"tags\":[\"ofxfmhlvyqnslbq\",\"mlqkiekhj\",\"qqrugwespscvs\"],\"name\":\"spt\",\"created_at\":\"2021-04-03T01:19:25Z\",\"regions\":[\"ozfvza\",\"upcvq\"],\"min_disk_size\":50031632,\"size_gigabytes\":31.270206}}").toObject(Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema.class);
        Assertions.assertEquals("spt", model.getSnapshot().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-03T01:19:25Z"), model.getSnapshot().getCreatedAt());
        Assertions.assertEquals("ozfvza", model.getSnapshot().getRegions().get(0));
        Assertions.assertEquals(50031632, model.getSnapshot().getMinDiskSize());
        Assertions.assertEquals(31.270206f, model.getSnapshot().getSizeGigabytes());
        Assertions.assertEquals("jgeecwtfmabvbmn", model.getSnapshot().getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshot().getResourceType());
        Assertions.assertEquals("ofxfmhlvyqnslbq", model.getSnapshot().getTags().get(0));
    }

    @Test
    public void testSerialize() {
        Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema model = new Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema().setSnapshot(new Snapshots().setName("spt").setCreatedAt(OffsetDateTime.parse("2021-04-03T01:19:25Z")).setRegions(Arrays.asList("ozfvza", "upcvq")).setMinDiskSize(50031632).setSizeGigabytes(31.270206f).setResourceId("jgeecwtfmabvbmn").setResourceType(SnapshotsResourceType.VOLUME).setTags(Arrays.asList("ofxfmhlvyqnslbq", "mlqkiekhj", "qqrugwespscvs")));
        model = BinaryData.fromObject(model).toObject(Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema.class);
        Assertions.assertEquals("spt", model.getSnapshot().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-03T01:19:25Z"), model.getSnapshot().getCreatedAt());
        Assertions.assertEquals("ozfvza", model.getSnapshot().getRegions().get(0));
        Assertions.assertEquals(50031632, model.getSnapshot().getMinDiskSize());
        Assertions.assertEquals(31.270206f, model.getSnapshot().getSizeGigabytes());
        Assertions.assertEquals("jgeecwtfmabvbmn", model.getSnapshot().getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshot().getResourceType());
        Assertions.assertEquals("ofxfmhlvyqnslbq", model.getSnapshot().getTags().get(0));
    }
}
