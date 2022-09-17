package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema;
import com.digitalocean.api.models.DropletSnapshot;
import com.digitalocean.api.models.DropletSnapshotType;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":848956552},\"snapshots\":[{\"type\":\"snapshot\",\"name\":\"uensn\",\"created_at\":\"2020-12-26T02:06:50Z\",\"regions\":[\"phmpoejnglpwsada\",\"jsumxpezcoio\",\"jrmfqzwqd\",\"xkeedcnwmy\"],\"min_disk_size\":688479552,\"size_gigabytes\":72.602455},{\"type\":\"backup\",\"name\":\"zkvemy\",\"created_at\":\"2021-10-18T18:08:37Z\",\"regions\":[\"czaqpqifdbmpt\",\"wtxzuisam\",\"natnizexroqsqjg\"],\"min_disk_size\":508548602,\"size_gigabytes\":30.026335}]}")
                        .toObject(ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("uensn", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-26T02:06:50Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("phmpoejnglpwsada", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(688479552, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(72.602455f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getSnapshots().get(0).getType());
        Assertions.assertEquals(848956552, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema model =
                new ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema()
                        .setSnapshots(
                                Arrays.asList(
                                        new DropletSnapshot()
                                                .setName("uensn")
                                                .setCreatedAt(OffsetDateTime.parse("2020-12-26T02:06:50Z"))
                                                .setRegions(
                                                        Arrays.asList(
                                                                "phmpoejnglpwsada",
                                                                "jsumxpezcoio",
                                                                "jrmfqzwqd",
                                                                "xkeedcnwmy"))
                                                .setMinDiskSize(688479552)
                                                .setSizeGigabytes(72.602455f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("zkvemy")
                                                .setCreatedAt(OffsetDateTime.parse("2021-10-18T18:08:37Z"))
                                                .setRegions(
                                                        Arrays.asList("czaqpqifdbmpt", "wtxzuisam", "natnizexroqsqjg"))
                                                .setMinDiskSize(508548602)
                                                .setSizeGigabytes(30.026335f)
                                                .setType(DropletSnapshotType.BACKUP)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(848956552));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsAa1O1RResponsesAllDropletSnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("uensn", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-26T02:06:50Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("phmpoejnglpwsada", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(688479552, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(72.602455f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getSnapshots().get(0).getType());
        Assertions.assertEquals(848956552, model.getMeta().getTotal());
    }
}
