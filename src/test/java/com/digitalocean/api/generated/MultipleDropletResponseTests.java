package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Droplet;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.DropletNextBackupWindow;
import com.digitalocean.api.models.DropletStatus;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.MultipleDropletResponse;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MultipleDropletResponseTests {
    @Test
    public void testDeserialize() {
        MultipleDropletResponse model =
                BinaryData.fromString(
                                "{\"droplets\":[{\"id\":86766502,\"name\":\"cngkegxcypxb\",\"memory\":1291178098,\"vcpus\":960544610,\"disk\":400268893,\"locked\":false,\"status\":\"active\",\"kernel\":{\"id\":971394241,\"name\":\"oxpdxq\",\"version\":\"r\"},\"created_at\":\"2021-05-05T22:15:12Z\",\"features\":[\"ow\",\"kiu\",\"jew\",\"ahwkxjjm\"],\"backup_ids\":[1492922483,271039239,785648055,1307109337],\"next_backup_window\":{\"start\":\"2021-08-27T10:11:36Z\",\"end\":\"2021-03-20T07:59:43Z\"},\"snapshot_ids\":[1027774384,1071691858,683789637],\"image\":{\"id\":1565887786,\"name\":\"yswcrptveajczx\",\"type\":\"backup\",\"distribution\":\"Fedora Atomic\",\"slug\":\"krfizrpyw\",\"public\":true,\"regions\":[],\"created_at\":\"2021-07-04T16:33:20Z\",\"min_disk_size\":1847694071,\"size_gigabytes\":8.067054,\"description\":\"skykpfuofix\",\"tags\":[],\"status\":\"pending\",\"error_message\":\"ykkpyycpa\"},\"volume_ids\":[\"pjprdpwr\",\"cfpcfjfwzlgz\"],\"size\":{\"slug\":\"wk\",\"memory\":650465257,\"vcpus\":264619884,\"disk\":1446786780,\"transfer\":19.62331,\"price_monthly\":78.2249,\"price_hourly\":30.47425,\"regions\":[],\"available\":true,\"description\":\"nnidmdiawpzxk\"},\"size_slug\":\"rntmkctdhu\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"wqpsqaz\",\"slug\":\"hqodv\",\"available\":true},\"tags\":[\"nb\",\"cbmjkztibniyntsx\"],\"vpc_uuid\":\"fmeftvhk\"},{\"id\":48892036,\"name\":\"ogjrhskbwgm\",\"memory\":146775166,\"vcpus\":2092147628,\"disk\":165219531,\"locked\":false,\"status\":\"off\",\"kernel\":{\"id\":1988101548,\"name\":\"hcxnwjtpfdzxco\",\"version\":\"fwofwakukzkdtz\"},\"created_at\":\"2021-08-25T23:54:47Z\",\"features\":[\"ednlwglihezo\",\"ucmqgisnione\",\"bzdrdpuenxkgt\",\"zlm\"],\"backup_ids\":[1471351682,212272318,169178227],\"next_backup_window\":{\"start\":\"2021-04-10T04:22:57Z\",\"end\":\"2021-11-03T18:18:17Z\"},\"snapshot_ids\":[1160452306,2009894505],\"image\":{\"id\":1564006055,\"name\":\"xlxmwtygeqzusi\",\"type\":\"custom\",\"distribution\":\"CoreOS\",\"slug\":\"fsgbjmlreesrf\",\"public\":true,\"regions\":[],\"created_at\":\"2020-12-26T17:04:35Z\",\"min_disk_size\":1234465237,\"size_gigabytes\":89.02015,\"description\":\"olntfx\",\"tags\":[],\"status\":\"deleted\",\"error_message\":\"ipfjwfoygizmshx\"},\"volume_ids\":[\"aizabu\",\"nvgskjtoxjd\",\"jsjznv\",\"xqqm\"],\"size\":{\"slug\":\"i\",\"memory\":1331358631,\"vcpus\":160628157,\"disk\":2013340237,\"transfer\":38.371353,\"price_monthly\":10.524559,\"price_hourly\":95.00202,\"regions\":[],\"available\":true,\"description\":\"ocxm\"},\"size_slug\":\"fshksnyzmspamwb\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"nlslcef\",\"slug\":\"qdktwtkvihlp\",\"available\":false},\"tags\":[\"woynguu\",\"hwvladpc\"],\"vpc_uuid\":\"jha\"}],\"links\":{\"actions\":[{\"id\":1474714310,\"rel\":\"kymffztsils\",\"href\":\"qs\"},{\"id\":492672269,\"rel\":\"hfym\",\"href\":\"uihyeseuugcig\"}]}}")
                        .toObject(MultipleDropletResponse.class);
        Assertions.assertEquals(86766502, model.getDroplets().get(0).getId());
        Assertions.assertEquals("cngkegxcypxb", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1291178098, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(960544610, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(400268893, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(false, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ACTIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(971394241, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("oxpdxq", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("r", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-05T22:15:12Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("ow", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1492922483, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-27T10:11:36Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-20T07:59:43Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(1027774384, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("yswcrptveajczx", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.FEDORA_ATOMIC, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("krfizrpyw", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-04T16:33:20Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(1847694071, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(8.067054F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("skykpfuofix", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.PENDING, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("ykkpyycpa", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("pjprdpwr", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("wk", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(650465257, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(264619884, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1446786780, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(19.62331f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(78.2249f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(30.47425f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("nnidmdiawpzxk", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("rntmkctdhu", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("wqpsqaz", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("hqodv", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("nb", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("fmeftvhk", model.getDroplets().get(0).getVpcUuid());
        Assertions.assertEquals(1474714310, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("kymffztsils", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("qs", model.getLinks().getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        MultipleDropletResponse model =
                new MultipleDropletResponse()
                        .setDroplets(
                                Arrays.asList(
                                        new Droplet()
                                                .setId(86766502)
                                                .setName("cngkegxcypxb")
                                                .setMemory(1291178098)
                                                .setVcpus(960544610)
                                                .setDisk(400268893)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.ACTIVE)
                                                .setKernel(
                                                        new Kernel().setId(971394241).setName("oxpdxq").setVersion("r"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-05-05T22:15:12Z"))
                                                .setFeatures(Arrays.asList("ow", "kiu", "jew", "ahwkxjjm"))
                                                .setBackupIds(
                                                        Arrays.asList(1492922483, 271039239, 785648055, 1307109337))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-08-27T10:11:36Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-03-20T07:59:43Z")))
                                                .setSnapshotIds(Arrays.asList(1027774384, 1071691858, 683789637))
                                                .setImage(
                                                        new Image()
                                                                .setName("yswcrptveajczx")
                                                                .setType(ImageType.BACKUP)
                                                                .setDistribution(Distribution.FEDORA_ATOMIC)
                                                                .setSlug("krfizrpyw")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-07-04T16:33:20Z"))
                                                                .setMinDiskSize(1847694071)
                                                                .setSizeGigabytes(8.067054F)
                                                                .setDescription("skykpfuofix")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.PENDING)
                                                                .setErrorMessage("ykkpyycpa"))
                                                .setVolumeIds(Arrays.asList("pjprdpwr", "cfpcfjfwzlgz"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("wk")
                                                                .setMemory(650465257)
                                                                .setVcpus(264619884)
                                                                .setDisk(1446786780)
                                                                .setTransfer(19.62331f)
                                                                .setPriceMonthly(78.2249f)
                                                                .setPriceHourly(30.47425f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("nnidmdiawpzxk"))
                                                .setSizeSlug("rntmkctdhu")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("wqpsqaz")
                                                                .setSlug("hqodv")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("nb", "cbmjkztibniyntsx"))
                                                .setVpcUuid("fmeftvhk"),
                                        new Droplet()
                                                .setId(48892036)
                                                .setName("ogjrhskbwgm")
                                                .setMemory(146775166)
                                                .setVcpus(2092147628)
                                                .setDisk(165219531)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1988101548)
                                                                .setName("hcxnwjtpfdzxco")
                                                                .setVersion("fwofwakukzkdtz"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-08-25T23:54:47Z"))
                                                .setFeatures(
                                                        Arrays.asList(
                                                                "ednlwglihezo", "ucmqgisnione", "bzdrdpuenxkgt", "zlm"))
                                                .setBackupIds(Arrays.asList(1471351682, 212272318, 169178227))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-04-10T04:22:57Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-11-03T18:18:17Z")))
                                                .setSnapshotIds(Arrays.asList(1160452306, 2009894505))
                                                .setImage(
                                                        new Image()
                                                                .setName("xlxmwtygeqzusi")
                                                                .setType(ImageType.CUSTOM)
                                                                .setDistribution(Distribution.CORE_OS)
                                                                .setSlug("fsgbjmlreesrf")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2020-12-26T17:04:35Z"))
                                                                .setMinDiskSize(1234465237)
                                                                .setSizeGigabytes(89.02015F)
                                                                .setDescription("olntfx")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.DELETED)
                                                                .setErrorMessage("ipfjwfoygizmshx"))
                                                .setVolumeIds(Arrays.asList("aizabu", "nvgskjtoxjd", "jsjznv", "xqqm"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("i")
                                                                .setMemory(1331358631)
                                                                .setVcpus(160628157)
                                                                .setDisk(2013340237)
                                                                .setTransfer(38.371353f)
                                                                .setPriceMonthly(10.524559f)
                                                                .setPriceHourly(95.00202f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("ocxm"))
                                                .setSizeSlug("fshksnyzmspamwb")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("nlslcef")
                                                                .setSlug("qdktwtkvihlp")
                                                                .setAvailable(false))
                                                .setTags(Arrays.asList("woynguu", "hwvladpc"))
                                                .setVpcUuid("jha")))
                        .setLinks(
                                new Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks()
                                        .setActions(
                                                Arrays.asList(
                                                        new ActionLink()
                                                                .setId(1474714310)
                                                                .setRel("kymffztsils")
                                                                .setHref("qs"),
                                                        new ActionLink()
                                                                .setId(492672269)
                                                                .setRel("hfym")
                                                                .setHref("uihyeseuugcig"))));
        model = BinaryData.fromObject(model).toObject(MultipleDropletResponse.class);
        Assertions.assertEquals(86766502, model.getDroplets().get(0).getId());
        Assertions.assertEquals("cngkegxcypxb", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1291178098, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(960544610, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(400268893, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(false, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ACTIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(971394241, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("oxpdxq", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("r", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-05T22:15:12Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("ow", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1492922483, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-27T10:11:36Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-20T07:59:43Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(1027774384, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("yswcrptveajczx", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.FEDORA_ATOMIC, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("krfizrpyw", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-04T16:33:20Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(1847694071, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(8.067054F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("skykpfuofix", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.PENDING, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("ykkpyycpa", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("pjprdpwr", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("wk", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(650465257, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(264619884, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1446786780, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(19.62331f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(78.2249f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(30.47425f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("nnidmdiawpzxk", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("rntmkctdhu", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("wqpsqaz", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("hqodv", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("nb", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("fmeftvhk", model.getDroplets().get(0).getVpcUuid());
        Assertions.assertEquals(1474714310, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("kymffztsils", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("qs", model.getLinks().getActions().get(0).getHref());
    }
}
