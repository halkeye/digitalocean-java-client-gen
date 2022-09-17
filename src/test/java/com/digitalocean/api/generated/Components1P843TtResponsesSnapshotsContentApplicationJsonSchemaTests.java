package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1P843TtResponsesSnapshotsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1P843TtResponsesSnapshotsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1P843TtResponsesSnapshotsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1846904308},\"snapshots\":[{\"resource_id\":\"hruetcnxriqzzd\",\"resource_type\":\"droplet\",\"tags\":[\"sqdrrjsurn\"],\"name\":\"wobwxrxm\",\"created_at\":\"2021-09-05T12:03:26Z\",\"regions\":[\"ohlsfjf\",\"uqjpzh\",\"ahuvkqxqkvadmjh\"],\"min_disk_size\":539618453,\"size_gigabytes\":39.15313},{\"resource_id\":\"djmaajz\",\"resource_type\":\"volume\",\"tags\":[\"hs\",\"rmclyqwwu\",\"yqkaaptb\",\"svkb\"],\"name\":\"bptw\",\"created_at\":\"2021-02-10T08:28:04Z\",\"regions\":[\"oc\",\"u\",\"plxzbnsshvqnpszb\"],\"min_disk_size\":849767240,\"size_gigabytes\":83.29395},{\"resource_id\":\"butcdzj\",\"resource_type\":\"droplet\",\"tags\":[\"vpeyxdyuxurxr\",\"tqmmijgpqfkwna\",\"ikczscymqfv\",\"g\"],\"name\":\"pqnyumzapdok\",\"created_at\":\"2021-10-14T13:20:22Z\",\"regions\":[\"pe\",\"knfzqnzbflbqmhb\",\"yxxvwedhagqbbse\",\"ea\"],\"min_disk_size\":788783316,\"size_gigabytes\":30.259932}]}")
                        .toObject(Components1P843TtResponsesSnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("wobwxrxm", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-05T12:03:26Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ohlsfjf", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(539618453, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(39.15313f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("hruetcnxriqzzd", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("sqdrrjsurn", model.getSnapshots().get(0).getTags().get(0));
        Assertions.assertEquals(1846904308, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1P843TtResponsesSnapshotsContentApplicationJsonSchema model =
                new Components1P843TtResponsesSnapshotsContentApplicationJsonSchema()
                        .setSnapshots(
                                Arrays.asList(
                                        new Snapshots()
                                                .setName("wobwxrxm")
                                                .setCreatedAt(OffsetDateTime.parse("2021-09-05T12:03:26Z"))
                                                .setRegions(Arrays.asList("ohlsfjf", "uqjpzh", "ahuvkqxqkvadmjh"))
                                                .setMinDiskSize(539618453)
                                                .setSizeGigabytes(39.15313f)
                                                .setResourceId("hruetcnxriqzzd")
                                                .setResourceType(SnapshotsResourceType.DROPLET)
                                                .setTags(Arrays.asList("sqdrrjsurn")),
                                        new Snapshots()
                                                .setName("bptw")
                                                .setCreatedAt(OffsetDateTime.parse("2021-02-10T08:28:04Z"))
                                                .setRegions(Arrays.asList("oc", "u", "plxzbnsshvqnpszb"))
                                                .setMinDiskSize(849767240)
                                                .setSizeGigabytes(83.29395f)
                                                .setResourceId("djmaajz")
                                                .setResourceType(SnapshotsResourceType.VOLUME)
                                                .setTags(Arrays.asList("hs", "rmclyqwwu", "yqkaaptb", "svkb")),
                                        new Snapshots()
                                                .setName("pqnyumzapdok")
                                                .setCreatedAt(OffsetDateTime.parse("2021-10-14T13:20:22Z"))
                                                .setRegions(
                                                        Arrays.asList("pe", "knfzqnzbflbqmhb", "yxxvwedhagqbbse", "ea"))
                                                .setMinDiskSize(788783316)
                                                .setSizeGigabytes(30.259932f)
                                                .setResourceId("butcdzj")
                                                .setResourceType(SnapshotsResourceType.DROPLET)
                                                .setTags(
                                                        Arrays.asList(
                                                                "vpeyxdyuxurxr",
                                                                "tqmmijgpqfkwna",
                                                                "ikczscymqfv",
                                                                "g"))))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1846904308));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1P843TtResponsesSnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("wobwxrxm", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-05T12:03:26Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("ohlsfjf", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(539618453, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(39.15313f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("hruetcnxriqzzd", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.DROPLET, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("sqdrrjsurn", model.getSnapshots().get(0).getTags().get(0));
        Assertions.assertEquals(1846904308, model.getMeta().getTotal());
    }
}
