package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.DropletSnapshot;
import com.digitalocean.api.models.DropletSnapshotType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"backups\":[{\"type\":\"snapshot\",\"name\":\"oancdrco\",\"created_at\":\"2021-09-04T00:29Z\",\"regions\":[\"xu\"],\"min_disk_size\":1989257474,\"size_gigabytes\":90.119415},{\"type\":\"backup\",\"name\":\"nck\",\"created_at\":\"2021-04-28T22:13:45Z\",\"regions\":[\"blfxlupibaqzi\",\"xz\",\"zweghlwwbogvg\",\"klqiyndveqel\"],\"min_disk_size\":149262604,\"size_gigabytes\":73.54809},{\"type\":\"snapshot\",\"name\":\"dstrkzxsgtz\",\"created_at\":\"2021-02-04T06:31:21Z\",\"regions\":[\"lr\",\"smovpi\",\"y\"],\"min_disk_size\":1003127919,\"size_gigabytes\":98.46606},{\"type\":\"backup\",\"name\":\"xaxnrq\",\"created_at\":\"2021-10-07T04:08:26Z\",\"regions\":[\"tnndxolousdvr\"],\"min_disk_size\":1176676529,\"size_gigabytes\":15.167838}]}")
                        .toObject(ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("oancdrco", model.getBackups().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-04T00:29Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals("xu", model.getBackups().get(0).getRegions().get(0));
        Assertions.assertEquals(1989257474, model.getBackups().get(0).getMinDiskSize());
        Assertions.assertEquals(90.119415f, model.getBackups().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getBackups().get(0).getType());
    }

    @Test
    public void testSerialize() {
        ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 model =
                new ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0()
                        .setBackups(
                                Arrays.asList(
                                        new DropletSnapshot()
                                                .setName("oancdrco")
                                                .setCreatedAt(OffsetDateTime.parse("2021-09-04T00:29Z"))
                                                .setRegions(Arrays.asList("xu"))
                                                .setMinDiskSize(1989257474)
                                                .setSizeGigabytes(90.119415f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("nck")
                                                .setCreatedAt(OffsetDateTime.parse("2021-04-28T22:13:45Z"))
                                                .setRegions(
                                                        Arrays.asList(
                                                                "blfxlupibaqzi", "xz", "zweghlwwbogvg", "klqiyndveqel"))
                                                .setMinDiskSize(149262604)
                                                .setSizeGigabytes(73.54809f)
                                                .setType(DropletSnapshotType.BACKUP),
                                        new DropletSnapshot()
                                                .setName("dstrkzxsgtz")
                                                .setCreatedAt(OffsetDateTime.parse("2021-02-04T06:31:21Z"))
                                                .setRegions(Arrays.asList("lr", "smovpi", "y"))
                                                .setMinDiskSize(1003127919)
                                                .setSizeGigabytes(98.46606f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("xaxnrq")
                                                .setCreatedAt(OffsetDateTime.parse("2021-10-07T04:08:26Z"))
                                                .setRegions(Arrays.asList("tnndxolousdvr"))
                                                .setMinDiskSize(1176676529)
                                                .setSizeGigabytes(15.167838f)
                                                .setType(DropletSnapshotType.BACKUP)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("oancdrco", model.getBackups().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-04T00:29Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals("xu", model.getBackups().get(0).getRegions().get(0));
        Assertions.assertEquals(1989257474, model.getBackups().get(0).getMinDiskSize());
        Assertions.assertEquals(90.119415f, model.getBackups().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getBackups().get(0).getType());
    }
}
