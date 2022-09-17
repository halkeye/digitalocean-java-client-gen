package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"snapshot\":{\"resource_id\":\"froefq\",\"resource_type\":\"droplet\",\"tags\":[\"evyrejyoybkqftu\"],\"name\":\"dwmnrtvvbucnnr\",\"created_at\":\"2021-01-10T10:53:48Z\",\"regions\":[\"me\",\"xwsicvwqzocsfshe\",\"nmsg\",\"ywdibugvnrgalvw\"],\"min_disk_size\":633287339,\"size_gigabytes\":34.04274}}")
                        .toObject(ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("dwmnrtvvbucnnr", model.getSnapshot().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T10:53:48Z"), model.getSnapshot().getCreatedAt());
        Assertions.assertEquals("me", model.getSnapshot().getRegions().get(0));
        Assertions.assertEquals(633287339, model.getSnapshot().getMinDiskSize());
        Assertions.assertEquals(34.04274f, model.getSnapshot().getSizeGigabytes());
        Assertions.assertEquals("froefq", model.getSnapshot().getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshot().getResourceType());
        Assertions.assertEquals("evyrejyoybkqftu", model.getSnapshot().getTags().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema model =
                new ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema()
                        .setSnapshot(
                                new Snapshots()
                                        .setName("dwmnrtvvbucnnr")
                                        .setCreatedAt(OffsetDateTime.parse("2021-01-10T10:53:48Z"))
                                        .setRegions(Arrays.asList("me", "xwsicvwqzocsfshe", "nmsg", "ywdibugvnrgalvw"))
                                        .setMinDiskSize(633287339)
                                        .setSizeGigabytes(34.04274f)
                                        .setResourceId("froefq")
                                        .setResourceType(SnapshotsResourceType.DROPLET)
                                        .setTags(Arrays.asList("evyrejyoybkqftu")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("dwmnrtvvbucnnr", model.getSnapshot().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T10:53:48Z"), model.getSnapshot().getCreatedAt());
        Assertions.assertEquals("me", model.getSnapshot().getRegions().get(0));
        Assertions.assertEquals(633287339, model.getSnapshot().getMinDiskSize());
        Assertions.assertEquals(34.04274f, model.getSnapshot().getSizeGigabytes());
        Assertions.assertEquals("froefq", model.getSnapshot().getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshot().getResourceType());
        Assertions.assertEquals("evyrejyoybkqftu", model.getSnapshot().getTags().get(0));
    }
}
