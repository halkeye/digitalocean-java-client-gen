package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"snapshots\":[{\"resource_id\":\"syzzdcrolr\",\"resource_type\":\"droplet\",\"tags\":[\"bo\"],\"name\":\"phzkymu\",\"created_at\":\"2021-08-19T00:26:45Z\",\"regions\":[\"ivt\",\"uszbdjrdfeuj\"],\"min_disk_size\":1818376556,\"size_gigabytes\":54.37473},{\"resource_id\":\"alis\",\"resource_type\":\"droplet\",\"tags\":[\"n\",\"caydzinlooulp\"],\"name\":\"zmdahyclxrs\",\"created_at\":\"2021-03-01T09:16:06Z\",\"regions\":[\"ebldpo\",\"affjkrtnh\"],\"min_disk_size\":400844142,\"size_gigabytes\":81.19376}]}")
                        .toObject(Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("phzkymu", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-19T00:26:45Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ivt", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(1818376556, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(54.37473f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("syzzdcrolr", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("bo", model.getSnapshots().get(0).getTags().get(0));
    }

    @Test
    public void testSerialize() {
        Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 model =
                new Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0()
                        .setSnapshots(
                                Arrays.asList(
                                        new Snapshots()
                                                .setName("phzkymu")
                                                .setCreatedAt(OffsetDateTime.parse("2021-08-19T00:26:45Z"))
                                                .setRegions(Arrays.asList("ivt", "uszbdjrdfeuj"))
                                                .setMinDiskSize(1818376556)
                                                .setSizeGigabytes(54.37473f)
                                                .setResourceId("syzzdcrolr")
                                                .setResourceType(SnapshotsResourceType.DROPLET)
                                                .setTags(Arrays.asList("bo")),
                                        new Snapshots()
                                                .setName("zmdahyclxrs")
                                                .setCreatedAt(OffsetDateTime.parse("2021-03-01T09:16:06Z"))
                                                .setRegions(Arrays.asList("ebldpo", "affjkrtnh"))
                                                .setMinDiskSize(400844142)
                                                .setSizeGigabytes(81.19376f)
                                                .setResourceId("alis")
                                                .setResourceType(SnapshotsResourceType.DROPLET)
                                                .setTags(Arrays.asList("n", "caydzinlooulp"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("phzkymu", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-19T00:26:45Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ivt", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(1818376556, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(54.37473f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("syzzdcrolr", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("bo", model.getSnapshots().get(0).getTags().get(0));
    }
}
