package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.DropletSnapshot;
import com.digitalocean.api.models.DropletSnapshotType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"snapshots\":[{\"type\":\"backup\",\"name\":\"plwsttxsrgxfqp\",\"created_at\":\"2021-01-01T16:01:44Z\",\"regions\":[\"ceov\",\"gzwhsxyrujmtik\",\"s\"],\"min_disk_size\":270314690,\"size_gigabytes\":39.205517},{\"type\":\"snapshot\",\"name\":\"ohzixyqhfnkvycqq\",\"created_at\":\"2021-06-25T19:57:32Z\",\"regions\":[\"eipnquwzx\"],\"min_disk_size\":1106455286,\"size_gigabytes\":71.067764},{\"type\":\"backup\",\"name\":\"yodlhkfktltddsob\",\"created_at\":\"2021-06-18T10:09:13Z\",\"regions\":[\"nouhbqezkq\",\"saluzyi\",\"fcvcewbwq\"],\"min_disk_size\":1630433911,\"size_gigabytes\":24.819178},{\"type\":\"snapshot\",\"name\":\"jsatm\",\"created_at\":\"2021-12-06T02:35:21Z\",\"regions\":[\"mazdfsqxh\"],\"min_disk_size\":594666797,\"size_gigabytes\":72.870384}]}")
                        .toObject(ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("plwsttxsrgxfqp", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-01T16:01:44Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ceov", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(270314690, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(39.205517f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.BACKUP, model.getSnapshots().get(0).getType());
    }

    @Test
    public void testSerialize() {
        ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 model =
                new ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0()
                        .setSnapshots(
                                Arrays.asList(
                                        new DropletSnapshot()
                                                .setName("plwsttxsrgxfqp")
                                                .setCreatedAt(OffsetDateTime.parse("2021-01-01T16:01:44Z"))
                                                .setRegions(Arrays.asList("ceov", "gzwhsxyrujmtik", "s"))
                                                .setMinDiskSize(270314690)
                                                .setSizeGigabytes(39.205517f)
                                                .setType(DropletSnapshotType.BACKUP),
                                        new DropletSnapshot()
                                                .setName("ohzixyqhfnkvycqq")
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-25T19:57:32Z"))
                                                .setRegions(Arrays.asList("eipnquwzx"))
                                                .setMinDiskSize(1106455286)
                                                .setSizeGigabytes(71.067764f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("yodlhkfktltddsob")
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-18T10:09:13Z"))
                                                .setRegions(Arrays.asList("nouhbqezkq", "saluzyi", "fcvcewbwq"))
                                                .setMinDiskSize(1630433911)
                                                .setSizeGigabytes(24.819178f)
                                                .setType(DropletSnapshotType.BACKUP),
                                        new DropletSnapshot()
                                                .setName("jsatm")
                                                .setCreatedAt(OffsetDateTime.parse("2021-12-06T02:35:21Z"))
                                                .setRegions(Arrays.asList("mazdfsqxh"))
                                                .setMinDiskSize(594666797)
                                                .setSizeGigabytes(72.870384f)
                                                .setType(DropletSnapshotType.SNAPSHOT)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("plwsttxsrgxfqp", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-01T16:01:44Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ceov", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(270314690, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(39.205517f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.BACKUP, model.getSnapshots().get(0).getType());
    }
}
