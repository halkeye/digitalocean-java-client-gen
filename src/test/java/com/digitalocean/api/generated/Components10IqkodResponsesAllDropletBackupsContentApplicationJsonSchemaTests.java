package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema;
import com.digitalocean.api.models.DropletSnapshot;
import com.digitalocean.api.models.DropletSnapshotType;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1252912413},\"backups\":[{\"type\":\"snapshot\",\"name\":\"lacro\",\"created_at\":\"2021-06-05T02:07:08Z\",\"regions\":[\"munerkeluxz\",\"hxze\",\"bzuzu\"],\"min_disk_size\":2246511,\"size_gigabytes\":34.792336},{\"type\":\"snapshot\",\"name\":\"zskejcgwfsgqksty\",\"created_at\":\"2021-01-23T00:28:04Z\",\"regions\":[\"pyuijp\",\"rdavsjcfmazpzdq\"],\"min_disk_size\":1940454197,\"size_gigabytes\":51.981293},{\"type\":\"snapshot\",\"name\":\"cmcokxizekuv\",\"created_at\":\"2021-06-09T04:19:13Z\",\"regions\":[\"wucaonzvajbvb\",\"krdemdi\",\"ackzidgzw\"],\"min_disk_size\":2057738367,\"size_gigabytes\":64.340004},{\"type\":\"snapshot\",\"name\":\"misvpztd\",\"created_at\":\"2021-07-23T09:45:28Z\",\"regions\":[\"kpxkqejtpjfoj\",\"unrlshxu\",\"nsy\"],\"min_disk_size\":2081477628,\"size_gigabytes\":56.810875}]}")
                        .toObject(Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema.class);
        Assertions.assertEquals("lacro", model.getBackups().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T02:07:08Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals("munerkeluxz", model.getBackups().get(0).getRegions().get(0));
        Assertions.assertEquals(2246511, model.getBackups().get(0).getMinDiskSize());
        Assertions.assertEquals(34.792336f, model.getBackups().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getBackups().get(0).getType());
        Assertions.assertEquals(1252912413, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema model =
                new Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema()
                        .setBackups(
                                Arrays.asList(
                                        new DropletSnapshot()
                                                .setName("lacro")
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-05T02:07:08Z"))
                                                .setRegions(Arrays.asList("munerkeluxz", "hxze", "bzuzu"))
                                                .setMinDiskSize(2246511)
                                                .setSizeGigabytes(34.792336f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("zskejcgwfsgqksty")
                                                .setCreatedAt(OffsetDateTime.parse("2021-01-23T00:28:04Z"))
                                                .setRegions(Arrays.asList("pyuijp", "rdavsjcfmazpzdq"))
                                                .setMinDiskSize(1940454197)
                                                .setSizeGigabytes(51.981293f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("cmcokxizekuv")
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-09T04:19:13Z"))
                                                .setRegions(Arrays.asList("wucaonzvajbvb", "krdemdi", "ackzidgzw"))
                                                .setMinDiskSize(2057738367)
                                                .setSizeGigabytes(64.340004f)
                                                .setType(DropletSnapshotType.SNAPSHOT),
                                        new DropletSnapshot()
                                                .setName("misvpztd")
                                                .setCreatedAt(OffsetDateTime.parse("2021-07-23T09:45:28Z"))
                                                .setRegions(Arrays.asList("kpxkqejtpjfoj", "unrlshxu", "nsy"))
                                                .setMinDiskSize(2081477628)
                                                .setSizeGigabytes(56.810875f)
                                                .setType(DropletSnapshotType.SNAPSHOT)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1252912413));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components10IqkodResponsesAllDropletBackupsContentApplicationJsonSchema.class);
        Assertions.assertEquals("lacro", model.getBackups().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T02:07:08Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals("munerkeluxz", model.getBackups().get(0).getRegions().get(0));
        Assertions.assertEquals(2246511, model.getBackups().get(0).getMinDiskSize());
        Assertions.assertEquals(34.792336f, model.getBackups().get(0).getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.SNAPSHOT, model.getBackups().get(0).getType());
        Assertions.assertEquals(1252912413, model.getMeta().getTotal());
    }
}
