package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Droplet;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.DropletNextBackupWindow;
import com.digitalocean.api.models.DropletStatus;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"droplets\":[{\"id\":407529894,\"name\":\"yuexozonyn\",\"memory\":816878510,\"vcpus\":328227016,\"disk\":1430886000,\"locked\":true,\"status\":\"archive\",\"kernel\":{\"id\":901284153,\"name\":\"reu\",\"version\":\"osgyj\"},\"created_at\":\"2021-02-23T21:53:29Z\",\"features\":[\"vasormrexzvdubew\",\"zygba\",\"uvecovsd\",\"hzrtd\"],\"backup_ids\":[1151434648,1210824832,181548547,1613749927],\"next_backup_window\":{\"start\":\"2021-07-10T04:03:54Z\",\"end\":\"2021-07-05T00:13:25Z\"},\"snapshot_ids\":[2062036422,199565891,1914963020,414377585],\"image\":{\"id\":922587497,\"name\":\"jmcl\",\"type\":\"backup\",\"distribution\":\"FreeBSD\",\"slug\":\"rkombcdtaj\",\"public\":true,\"regions\":[],\"created_at\":\"2021-07-29T19:55:40Z\",\"min_disk_size\":477930163,\"size_gigabytes\":73.272316,\"description\":\"trotpvclpofyrl\",\"tags\":[],\"status\":\"deleted\",\"error_message\":\"skwxj\"},\"volume_ids\":[\"hxccbmkakmko\",\"kbputmgvmuyak\",\"lwk\",\"fowzkroyr\"],\"size\":{\"slug\":\"urxf\",\"memory\":1330188882,\"vcpus\":2115587942,\"disk\":237082725,\"transfer\":56.95733,\"price_monthly\":3.0088663,\"price_hourly\":53.38506,\"regions\":[],\"available\":false,\"description\":\"tgz\"},\"size_slug\":\"xxlfejlzuql\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"yayyziv\",\"slug\":\"mit\",\"available\":false},\"tags\":[\"lhchwhrktjleif\",\"bfi\",\"lhxfnsmycj\",\"wlyeyz\"],\"vpc_uuid\":\"dsqcmhnxl\"},{\"id\":841361482,\"name\":\"uwod\",\"memory\":356193108,\"vcpus\":204453652,\"disk\":1255231956,\"locked\":true,\"status\":\"archive\",\"kernel\":{\"id\":1070107714,\"name\":\"bjrmvgo\",\"version\":\"lehmum\"},\"created_at\":\"2021-09-03T00:57:50Z\",\"features\":[\"llcz\"],\"backup_ids\":[1504603106,1552279386,1169768488,694137030],\"next_backup_window\":{\"start\":\"2021-07-23T03:37:10Z\",\"end\":\"2021-10-06T16:03:22Z\"},\"snapshot_ids\":[1468422188,534072216],\"image\":{\"id\":2031516068,\"name\":\"civrakfrrynjcwmh\",\"type\":\"backup\",\"distribution\":\"FreeBSD\",\"slug\":\"kxrkemjpeq\",\"public\":false,\"regions\":[],\"created_at\":\"2021-07-03T18:52:43Z\",\"min_disk_size\":119215269,\"size_gigabytes\":98.07761,\"description\":\"f\",\"tags\":[],\"status\":\"deleted\",\"error_message\":\"kucddwnhczbutouc\"},\"volume_ids\":[\"tirjwayh\",\"cqqwwvgwkslvlize\",\"vbia\",\"v\"],\"size\":{\"slug\":\"srgekzyqxadyfhb\",\"memory\":1735784544,\"vcpus\":939271028,\"disk\":1153555776,\"transfer\":49.925144,\"price_monthly\":54.06655,\"price_hourly\":73.969246,\"regions\":[],\"available\":false,\"description\":\"tbspvkhglaqjs\"},\"size_slug\":\"yzstujrzxrkns\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"lduyehiiittugyuq\",\"slug\":\"rldaxurfqa\",\"available\":false},\"tags\":[\"ozjv\",\"dzciggb\",\"vt\",\"o\"],\"vpc_uuid\":\"alzyxwhoeamo\"}]}")
                        .toObject(Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(407529894, model.getDroplets().get(0).getId());
        Assertions.assertEquals("yuexozonyn", model.getDroplets().get(0).getName());
        Assertions.assertEquals(816878510, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(328227016, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(1430886000, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(901284153, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("reu", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("osgyj", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-23T21:53:29Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("vasormrexzvdubew", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1151434648, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-10T04:03:54Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-05T00:13:25Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(2062036422, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("jmcl", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.FREE_BSD, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("rkombcdtaj", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-29T19:55:40Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(477930163, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(73.272316F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("trotpvclpofyrl", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("skwxj", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("hxccbmkakmko", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("urxf", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(1330188882, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(2115587942, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(237082725, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(56.95733f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(3.0088663f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(53.38506f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(false, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("tgz", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("xxlfejlzuql", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("yayyziv", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mit", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("lhchwhrktjleif", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("dsqcmhnxl", model.getDroplets().get(0).getVpcUuid());
    }

    @Test
    public void testSerialize() {
        Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 model =
                new Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0()
                        .setDroplets(
                                Arrays.asList(
                                        new Droplet()
                                                .setId(407529894)
                                                .setName("yuexozonyn")
                                                .setMemory(816878510)
                                                .setVcpus(328227016)
                                                .setDisk(1430886000)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.ARCHIVE)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(901284153)
                                                                .setName("reu")
                                                                .setVersion("osgyj"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-02-23T21:53:29Z"))
                                                .setFeatures(
                                                        Arrays.asList("vasormrexzvdubew", "zygba", "uvecovsd", "hzrtd"))
                                                .setBackupIds(
                                                        Arrays.asList(1151434648, 1210824832, 181548547, 1613749927))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-07-10T04:03:54Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-07-05T00:13:25Z")))
                                                .setSnapshotIds(
                                                        Arrays.asList(2062036422, 199565891, 1914963020, 414377585))
                                                .setImage(
                                                        new Image()
                                                                .setName("jmcl")
                                                                .setType(ImageType.BACKUP)
                                                                .setDistribution(Distribution.FREE_BSD)
                                                                .setSlug("rkombcdtaj")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-07-29T19:55:40Z"))
                                                                .setMinDiskSize(477930163)
                                                                .setSizeGigabytes(73.272316F)
                                                                .setDescription("trotpvclpofyrl")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.DELETED)
                                                                .setErrorMessage("skwxj"))
                                                .setVolumeIds(
                                                        Arrays.asList(
                                                                "hxccbmkakmko", "kbputmgvmuyak", "lwk", "fowzkroyr"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("urxf")
                                                                .setMemory(1330188882)
                                                                .setVcpus(2115587942)
                                                                .setDisk(237082725)
                                                                .setTransfer(56.95733f)
                                                                .setPriceMonthly(3.0088663f)
                                                                .setPriceHourly(53.38506f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(false)
                                                                .setDescription("tgz"))
                                                .setSizeSlug("xxlfejlzuql")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("yayyziv")
                                                                .setSlug("mit")
                                                                .setAvailable(false))
                                                .setTags(Arrays.asList("lhchwhrktjleif", "bfi", "lhxfnsmycj", "wlyeyz"))
                                                .setVpcUuid("dsqcmhnxl"),
                                        new Droplet()
                                                .setId(841361482)
                                                .setName("uwod")
                                                .setMemory(356193108)
                                                .setVcpus(204453652)
                                                .setDisk(1255231956)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.ARCHIVE)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1070107714)
                                                                .setName("bjrmvgo")
                                                                .setVersion("lehmum"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-09-03T00:57:50Z"))
                                                .setFeatures(Arrays.asList("llcz"))
                                                .setBackupIds(
                                                        Arrays.asList(1504603106, 1552279386, 1169768488, 694137030))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-07-23T03:37:10Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-10-06T16:03:22Z")))
                                                .setSnapshotIds(Arrays.asList(1468422188, 534072216))
                                                .setImage(
                                                        new Image()
                                                                .setName("civrakfrrynjcwmh")
                                                                .setType(ImageType.BACKUP)
                                                                .setDistribution(Distribution.FREE_BSD)
                                                                .setSlug("kxrkemjpeq")
                                                                .setPublicProperty(false)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-07-03T18:52:43Z"))
                                                                .setMinDiskSize(119215269)
                                                                .setSizeGigabytes(98.07761F)
                                                                .setDescription("f")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.DELETED)
                                                                .setErrorMessage("kucddwnhczbutouc"))
                                                .setVolumeIds(
                                                        Arrays.asList("tirjwayh", "cqqwwvgwkslvlize", "vbia", "v"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("srgekzyqxadyfhb")
                                                                .setMemory(1735784544)
                                                                .setVcpus(939271028)
                                                                .setDisk(1153555776)
                                                                .setTransfer(49.925144f)
                                                                .setPriceMonthly(54.06655f)
                                                                .setPriceHourly(73.969246f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(false)
                                                                .setDescription("tbspvkhglaqjs"))
                                                .setSizeSlug("yzstujrzxrkns")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("lduyehiiittugyuq")
                                                                .setSlug("rldaxurfqa")
                                                                .setAvailable(false))
                                                .setTags(Arrays.asList("ozjv", "dzciggb", "vt", "o"))
                                                .setVpcUuid("alzyxwhoeamo")));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(407529894, model.getDroplets().get(0).getId());
        Assertions.assertEquals("yuexozonyn", model.getDroplets().get(0).getName());
        Assertions.assertEquals(816878510, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(328227016, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(1430886000, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(901284153, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("reu", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("osgyj", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-23T21:53:29Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("vasormrexzvdubew", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1151434648, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-10T04:03:54Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-05T00:13:25Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(2062036422, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("jmcl", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.FREE_BSD, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("rkombcdtaj", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-29T19:55:40Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(477930163, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(73.272316F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("trotpvclpofyrl", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("skwxj", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("hxccbmkakmko", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("urxf", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(1330188882, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(2115587942, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(237082725, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(56.95733f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(3.0088663f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(53.38506f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(false, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("tgz", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("xxlfejlzuql", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("yayyziv", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mit", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("lhchwhrktjleif", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("dsqcmhnxl", model.getDroplets().get(0).getVpcUuid());
    }
}
