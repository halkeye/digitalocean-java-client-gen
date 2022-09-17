package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema;
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

public final class Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"droplets\":[{\"id\":938597681,\"name\":\"qt\",\"memory\":1559890704,\"vcpus\":387389231,\"disk\":978063951,\"locked\":true,\"status\":\"off\",\"kernel\":{\"id\":843584162,\"name\":\"z\",\"version\":\"gjjnxkbylhyyx\"},\"created_at\":\"2021-12-08T03:33:14Z\",\"features\":[\"klvqzrwtrdgscn\",\"q\",\"on\"],\"backup_ids\":[1449590493,1518003214],\"next_backup_window\":{\"start\":\"2021-05-14T19:38:29Z\",\"end\":\"2021-10-24T18:27:58Z\"},\"snapshot_ids\":[92638660,1689763711,871570489,93906493],\"image\":{\"id\":535353178,\"name\":\"hceopvkvtwf\",\"type\":\"snapshot\",\"distribution\":\"CentOS\",\"slug\":\"bokhmmlcdyarng\",\"public\":false,\"regions\":[],\"created_at\":\"2021-08-27T22:31:02Z\",\"min_disk_size\":791599974,\"size_gigabytes\":15.296566,\"description\":\"asmcolmugpyvaos\",\"tags\":[],\"status\":\"deleted\",\"error_message\":\"zxeygzvtye\"},\"volume_ids\":[\"hubnobgu\",\"isqsqkpdmioy\"],\"size\":{\"slug\":\"pnml\",\"memory\":798038402,\"vcpus\":1433905892,\"disk\":1874709053,\"transfer\":66.91512,\"price_monthly\":24.245823,\"price_hourly\":8.715129,\"regions\":[],\"available\":true,\"description\":\"m\"},\"size_slug\":\"vqdvrdmvxyrxdhg\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"jbxaotcgbz\",\"slug\":\"mbtple\",\"available\":true},\"tags\":[\"oyidoxznvgvdtmuu\",\"dawsxmrsz\",\"knimxlp\"],\"vpc_uuid\":\"rxrzutylcur\"},{\"id\":1065261627,\"name\":\"q\",\"memory\":1995997768,\"vcpus\":194389286,\"disk\":1758210690,\"locked\":false,\"status\":\"active\",\"kernel\":{\"id\":1446036635,\"name\":\"bjmbnvynfaooeac\",\"version\":\"dcglskakddid\"},\"created_at\":\"2021-04-14T05:06:40Z\",\"features\":[\"llrqmtlpbyxro\"],\"backup_ids\":[1165750931,14836576],\"next_backup_window\":{\"start\":\"2021-06-22T19:22:18Z\",\"end\":\"2021-11-21T11:44:27Z\"},\"snapshot_ids\":[300227654,1616913608,1715184199],\"image\":{\"id\":312405356,\"name\":\"sudyh\",\"type\":\"admin\",\"distribution\":\"RancherOS\",\"slug\":\"lxrdsjrholuqwgus\",\"public\":false,\"regions\":[],\"created_at\":\"2021-09-18T01:09:28Z\",\"min_disk_size\":1332959375,\"size_gigabytes\":75.67378,\"description\":\"lvtbdmvsbyida\",\"tags\":[],\"status\":\"retired\",\"error_message\":\"ekmkwjfbotlo\"},\"volume_ids\":[\"dusxurs\",\"ivuxcjkcoqwczs\"],\"size\":{\"slug\":\"iqrizfwihvaan\",\"memory\":1933197772,\"vcpus\":384790753,\"disk\":127276359,\"transfer\":84.9266,\"price_monthly\":9.311456,\"price_hourly\":80.931404,\"regions\":[],\"available\":true,\"description\":\"dmfdvbbaexxjfwtg\"},\"size_slug\":\"fkkauigvmua\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"zfedyuepsvplti\",\"slug\":\"ajjvywe\",\"available\":true},\"tags\":[\"kumcfjxokyelsy\",\"svfnkwm\",\"gjjekrkn\"],\"vpc_uuid\":\"rugjqyckgtx\"},{\"id\":2004306613,\"name\":\"dtu\",\"memory\":1638431859,\"vcpus\":220047989,\"disk\":893862667,\"locked\":false,\"status\":\"off\",\"kernel\":{\"id\":1239922031,\"name\":\"csubmzoonsvobc\",\"version\":\"xfpwhd\"},\"created_at\":\"2021-06-18T11:36:06Z\",\"features\":[\"bklg\"],\"backup_ids\":[296294465,1023166846,1358057379],\"next_backup_window\":{\"start\":\"2021-11-27T09:35:46Z\",\"end\":\"2021-04-04T16:18:16Z\"},\"snapshot_ids\":[947558176,1312945049,162876263],\"image\":{\"id\":1501835760,\"name\":\"ridttbsaqjmkg\",\"type\":\"snapshot\",\"distribution\":\"Debian\",\"slug\":\"uuylztpz\",\"public\":true,\"regions\":[],\"created_at\":\"2021-03-06T20:05:51Z\",\"min_disk_size\":161382568,\"size_gigabytes\":40.006626,\"description\":\"ezefkhkqtwqlepjj\",\"tags\":[],\"status\":\"NEW\",\"error_message\":\"fwzcntogffjwaj\"},\"volume_ids\":[\"tw\",\"vaqkifmxawost\",\"zkn\",\"rkmjqncfvdscnhe\"],\"size\":{\"slug\":\"vwfnqqwypvn\",\"memory\":229587339,\"vcpus\":872646331,\"disk\":55620701,\"transfer\":44.021713,\"price_monthly\":6.7182007,\"price_hourly\":49.08756,\"regions\":[],\"available\":false,\"description\":\"ggrssgwjfkain\"},\"size_slug\":\"muymvec\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"scbgmu\",\"slug\":\"aictdscnkzzohn\",\"available\":true},\"tags\":[\"clzeq\"],\"vpc_uuid\":\"rehlbzqixbnj\"}]}")
                        .toObject(Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema.class);
        Assertions.assertEquals(938597681, model.getDroplets().get(0).getId());
        Assertions.assertEquals("qt", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1559890704, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(387389231, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(978063951, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.OFF, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(843584162, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("z", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("gjjnxkbylhyyx", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-08T03:33:14Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("klvqzrwtrdgscn", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1449590493, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-14T19:38:29Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-24T18:27:58Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(92638660, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("hceopvkvtwf", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.CENT_OS, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("bokhmmlcdyarng", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-27T22:31:02Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(791599974, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(15.296566F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("asmcolmugpyvaos", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("zxeygzvtye", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("hubnobgu", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("pnml", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(798038402, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(1433905892, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1874709053, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(66.91512f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(24.245823f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(8.715129f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("m", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("vqdvrdmvxyrxdhg", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("jbxaotcgbz", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mbtple", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("oyidoxznvgvdtmuu", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("rxrzutylcur", model.getDroplets().get(0).getVpcUuid());
    }

    @Test
    public void testSerialize() {
        Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema model =
                new Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema()
                        .setDroplets(
                                Arrays.asList(
                                        new Droplet()
                                                .setId(938597681)
                                                .setName("qt")
                                                .setMemory(1559890704)
                                                .setVcpus(387389231)
                                                .setDisk(978063951)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(843584162)
                                                                .setName("z")
                                                                .setVersion("gjjnxkbylhyyx"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-12-08T03:33:14Z"))
                                                .setFeatures(Arrays.asList("klvqzrwtrdgscn", "q", "on"))
                                                .setBackupIds(Arrays.asList(1449590493, 1518003214))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-05-14T19:38:29Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-10-24T18:27:58Z")))
                                                .setSnapshotIds(
                                                        Arrays.asList(92638660, 1689763711, 871570489, 93906493))
                                                .setImage(
                                                        new Image()
                                                                .setName("hceopvkvtwf")
                                                                .setType(ImageType.SNAPSHOT)
                                                                .setDistribution(Distribution.CENT_OS)
                                                                .setSlug("bokhmmlcdyarng")
                                                                .setPublicProperty(false)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-08-27T22:31:02Z"))
                                                                .setMinDiskSize(791599974)
                                                                .setSizeGigabytes(15.296566F)
                                                                .setDescription("asmcolmugpyvaos")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.DELETED)
                                                                .setErrorMessage("zxeygzvtye"))
                                                .setVolumeIds(Arrays.asList("hubnobgu", "isqsqkpdmioy"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("pnml")
                                                                .setMemory(798038402)
                                                                .setVcpus(1433905892)
                                                                .setDisk(1874709053)
                                                                .setTransfer(66.91512f)
                                                                .setPriceMonthly(24.245823f)
                                                                .setPriceHourly(8.715129f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("m"))
                                                .setSizeSlug("vqdvrdmvxyrxdhg")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("jbxaotcgbz")
                                                                .setSlug("mbtple")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("oyidoxznvgvdtmuu", "dawsxmrsz", "knimxlp"))
                                                .setVpcUuid("rxrzutylcur"),
                                        new Droplet()
                                                .setId(1065261627)
                                                .setName("q")
                                                .setMemory(1995997768)
                                                .setVcpus(194389286)
                                                .setDisk(1758210690)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.ACTIVE)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1446036635)
                                                                .setName("bjmbnvynfaooeac")
                                                                .setVersion("dcglskakddid"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-04-14T05:06:40Z"))
                                                .setFeatures(Arrays.asList("llrqmtlpbyxro"))
                                                .setBackupIds(Arrays.asList(1165750931, 14836576))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-06-22T19:22:18Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-11-21T11:44:27Z")))
                                                .setSnapshotIds(Arrays.asList(300227654, 1616913608, 1715184199))
                                                .setImage(
                                                        new Image()
                                                                .setName("sudyh")
                                                                .setType(ImageType.ADMIN)
                                                                .setDistribution(Distribution.RANCHER_OS)
                                                                .setSlug("lxrdsjrholuqwgus")
                                                                .setPublicProperty(false)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-09-18T01:09:28Z"))
                                                                .setMinDiskSize(1332959375)
                                                                .setSizeGigabytes(75.67378F)
                                                                .setDescription("lvtbdmvsbyida")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.RETIRED)
                                                                .setErrorMessage("ekmkwjfbotlo"))
                                                .setVolumeIds(Arrays.asList("dusxurs", "ivuxcjkcoqwczs"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("iqrizfwihvaan")
                                                                .setMemory(1933197772)
                                                                .setVcpus(384790753)
                                                                .setDisk(127276359)
                                                                .setTransfer(84.9266f)
                                                                .setPriceMonthly(9.311456f)
                                                                .setPriceHourly(80.931404f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("dmfdvbbaexxjfwtg"))
                                                .setSizeSlug("fkkauigvmua")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("zfedyuepsvplti")
                                                                .setSlug("ajjvywe")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("kumcfjxokyelsy", "svfnkwm", "gjjekrkn"))
                                                .setVpcUuid("rugjqyckgtx"),
                                        new Droplet()
                                                .setId(2004306613)
                                                .setName("dtu")
                                                .setMemory(1638431859)
                                                .setVcpus(220047989)
                                                .setDisk(893862667)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1239922031)
                                                                .setName("csubmzoonsvobc")
                                                                .setVersion("xfpwhd"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-18T11:36:06Z"))
                                                .setFeatures(Arrays.asList("bklg"))
                                                .setBackupIds(Arrays.asList(296294465, 1023166846, 1358057379))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-11-27T09:35:46Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-04-04T16:18:16Z")))
                                                .setSnapshotIds(Arrays.asList(947558176, 1312945049, 162876263))
                                                .setImage(
                                                        new Image()
                                                                .setName("ridttbsaqjmkg")
                                                                .setType(ImageType.SNAPSHOT)
                                                                .setDistribution(Distribution.DEBIAN)
                                                                .setSlug("uuylztpz")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-03-06T20:05:51Z"))
                                                                .setMinDiskSize(161382568)
                                                                .setSizeGigabytes(40.006626F)
                                                                .setDescription("ezefkhkqtwqlepjj")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.NEW)
                                                                .setErrorMessage("fwzcntogffjwaj"))
                                                .setVolumeIds(
                                                        Arrays.asList("tw", "vaqkifmxawost", "zkn", "rkmjqncfvdscnhe"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("vwfnqqwypvn")
                                                                .setMemory(229587339)
                                                                .setVcpus(872646331)
                                                                .setDisk(55620701)
                                                                .setTransfer(44.021713f)
                                                                .setPriceMonthly(6.7182007f)
                                                                .setPriceHourly(49.08756f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(false)
                                                                .setDescription("ggrssgwjfkain"))
                                                .setSizeSlug("muymvec")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("scbgmu")
                                                                .setSlug("aictdscnkzzohn")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("clzeq"))
                                                .setVpcUuid("rehlbzqixbnj")));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema.class);
        Assertions.assertEquals(938597681, model.getDroplets().get(0).getId());
        Assertions.assertEquals("qt", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1559890704, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(387389231, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(978063951, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.OFF, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(843584162, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("z", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("gjjnxkbylhyyx", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-08T03:33:14Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("klvqzrwtrdgscn", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1449590493, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-14T19:38:29Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-24T18:27:58Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(92638660, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("hceopvkvtwf", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.CENT_OS, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("bokhmmlcdyarng", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-27T22:31:02Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(791599974, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(15.296566F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("asmcolmugpyvaos", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("zxeygzvtye", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("hubnobgu", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("pnml", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(798038402, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(1433905892, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1874709053, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(66.91512f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(24.245823f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(8.715129f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("m", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("vqdvrdmvxyrxdhg", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("jbxaotcgbz", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mbtple", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("oyidoxznvgvdtmuu", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("rxrzutylcur", model.getDroplets().get(0).getVpcUuid());
    }
}
