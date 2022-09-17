package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SnapshotsTests {
    @Test
    public void testDeserialize() {
        Snapshots model =
                BinaryData.fromString(
                                "{\"resource_id\":\"imxm\",\"resource_type\":\"droplet\",\"tags\":[\"jppitygv\",\"wdsoqtbfkvuozbzc\",\"nqekwankl\"],\"name\":\"urlcydjhtkjs\",\"created_at\":\"2021-08-03T22:52:53Z\",\"regions\":[\"yn\",\"urdon\",\"gobxblrdolen\",\"swknpdrgn\"],\"min_disk_size\":1350765961,\"size_gigabytes\":62.87154}")
                        .toObject(Snapshots.class);
        Assertions.assertEquals("urlcydjhtkjs", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T22:52:53Z"), model.getCreatedAt());
        Assertions.assertEquals("yn", model.getRegions().get(0));
        Assertions.assertEquals(1350765961, model.getMinDiskSize());
        Assertions.assertEquals(62.87154f, model.getSizeGigabytes());
        Assertions.assertEquals("imxm", model.getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getResourceType());
        Assertions.assertEquals("jppitygv", model.getTags().get(0));
    }

    @Test
    public void testSerialize() {
        Snapshots model =
                new Snapshots()
                        .setName("urlcydjhtkjs")
                        .setCreatedAt(OffsetDateTime.parse("2021-08-03T22:52:53Z"))
                        .setRegions(Arrays.asList("yn", "urdon", "gobxblrdolen", "swknpdrgn"))
                        .setMinDiskSize(1350765961)
                        .setSizeGigabytes(62.87154f)
                        .setResourceId("imxm")
                        .setResourceType(SnapshotsResourceType.DROPLET)
                        .setTags(Arrays.asList("jppitygv", "wdsoqtbfkvuozbzc", "nqekwankl"));
        model = BinaryData.fromObject(model).toObject(Snapshots.class);
        Assertions.assertEquals("urlcydjhtkjs", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T22:52:53Z"), model.getCreatedAt());
        Assertions.assertEquals("yn", model.getRegions().get(0));
        Assertions.assertEquals(1350765961, model.getMinDiskSize());
        Assertions.assertEquals(62.87154f, model.getSizeGigabytes());
        Assertions.assertEquals("imxm", model.getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getResourceType());
        Assertions.assertEquals("jppitygv", model.getTags().get(0));
    }
}
