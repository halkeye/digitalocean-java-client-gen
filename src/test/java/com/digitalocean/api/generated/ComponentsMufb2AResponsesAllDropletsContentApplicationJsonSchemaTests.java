package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Droplet;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.DropletNextBackupWindow;
import com.digitalocean.api.models.DropletStatus;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1746493890},\"droplets\":[{\"id\":1015304772,\"name\":\"zrfgmdqgnnbzrt\",\"memory\":1296175150,\"vcpus\":1417992874,\"disk\":1289892692,\"locked\":true,\"status\":\"archive\",\"kernel\":{\"id\":1680853411,\"name\":\"vgjs\",\"version\":\"tyjjvavdpwwobt\"},\"created_at\":\"2021-04-14T17:41:17Z\",\"features\":[\"titsf\",\"ofw\",\"nmhkscauwaz\"],\"backup_ids\":[1334343181],\"next_backup_window\":{\"start\":\"2021-07-10T16:34:07Z\",\"end\":\"2021-01-11T08:55:31Z\"},\"snapshot_ids\":[737740581,261934076],\"image\":{\"id\":2136673139,\"name\":\"ozokscvglli\",\"type\":\"base\",\"distribution\":\"CentOS\",\"slug\":\"gwewqkjvxprwpxso\",\"public\":true,\"regions\":[],\"created_at\":\"2021-08-22T02:15:27Z\",\"min_disk_size\":772603628,\"size_gigabytes\":47.7933,\"description\":\"e\",\"tags\":[],\"status\":\"retired\",\"error_message\":\"gzlf\"},\"volume_ids\":[\"rdcgu\",\"srtmdylperpiltt\",\"zgczfcmfpfbode\",\"resrgvtshuvft\"],\"size\":{\"slug\":\"ai\",\"memory\":1681980267,\"vcpus\":700985088,\"disk\":1799123236,\"transfer\":24.996494,\"price_monthly\":61.820297,\"price_hourly\":36.26089,\"regions\":[],\"available\":true,\"description\":\"gjypanhxmpdxxze\"},\"size_slug\":\"wwzjwotnxlkfhglh\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"x\",\"slug\":\"wecr\",\"available\":true},\"tags\":[\"pcs\",\"lqxov\",\"pqibukklv\"],\"vpc_uuid\":\"lrmlccmetjscz\"},{\"id\":1795418525,\"name\":\"fqbqnasd\",\"memory\":1023024040,\"vcpus\":770539013,\"disk\":679867225,\"locked\":true,\"status\":\"active\",\"kernel\":{\"id\":455918513,\"name\":\"cplhyvdgxlyzkxi\",\"version\":\"shezs\"},\"created_at\":\"2021-06-20T07:31:15Z\",\"features\":[\"lrupjovmo\",\"sayebra\",\"wzlpzbtz\"],\"backup_ids\":[1706448301,646015757],\"next_backup_window\":{\"start\":\"2021-10-13T16:35:18Z\",\"end\":\"2021-03-16T04:52:33Z\"},\"snapshot_ids\":[1771980481,1281718678],\"image\":{\"id\":1526147177,\"name\":\"noc\",\"type\":\"custom\",\"distribution\":\"Unknown\",\"slug\":\"fp\",\"public\":true,\"regions\":[],\"created_at\":\"2021-12-06T04:01:25Z\",\"min_disk_size\":903703732,\"size_gigabytes\":12.614525,\"description\":\"aaokctgkppgkqzkc\",\"tags\":[],\"status\":\"pending\",\"error_message\":\"ngdyfcixrhlcq\"},\"volume_ids\":[\"oejgoiutgwrmkah\"],\"size\":{\"slug\":\"qha\",\"memory\":339890226,\"vcpus\":1377509896,\"disk\":802896458,\"transfer\":5.250001,\"price_monthly\":24.10363,\"price_hourly\":26.211798,\"regions\":[],\"available\":true,\"description\":\"ncogmipnmliqmvlb\"},\"size_slug\":\"i\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"qgrvg\",\"slug\":\"omxp\",\"available\":true},\"tags\":[\"tsdfjyieso\",\"wiqbuoutm\"],\"vpc_uuid\":\"zgleofjsbg\"},{\"id\":1836943266,\"name\":\"wzvdajfwnncfm\",\"memory\":1997247021,\"vcpus\":749238965,\"disk\":1429350824,\"locked\":false,\"status\":\"off\",\"kernel\":{\"id\":121103407,\"name\":\"iqlwixvtbou\",\"version\":\"xtndopgjttbasua\"},\"created_at\":\"2021-01-29T03:34:47Z\",\"features\":[\"dl\",\"db\",\"aqbkixvvlwynpbbf\",\"vzfjm\"],\"backup_ids\":[163510782],\"next_backup_window\":{\"start\":\"2021-03-03T18:45:42Z\",\"end\":\"2021-07-18T15:46:05Z\"},\"snapshot_ids\":[48843252,1328529514],\"image\":{\"id\":1315722667,\"name\":\"phfky\",\"type\":\"backup\",\"distribution\":\"Ubuntu\",\"slug\":\"zmicuydoccnxsha\",\"public\":false,\"regions\":[],\"created_at\":\"2021-02-25T11:29:40Z\",\"min_disk_size\":2073215491,\"size_gigabytes\":32.40432,\"description\":\"ecaatsdohzniuc\",\"tags\":[],\"status\":\"available\",\"error_message\":\"b\"},\"volume_ids\":[\"injdllwktlepo\"],\"size\":{\"slug\":\"avv\",\"memory\":440177744,\"vcpus\":1055236958,\"disk\":1775715985,\"transfer\":18.88531,\"price_monthly\":0.62534213,\"price_hourly\":79.02721,\"regions\":[],\"available\":true,\"description\":\"wulynkgfcf\"},\"size_slug\":\"ruwsikxxtclh\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"ri\",\"slug\":\"byokvjgbzsxe\",\"available\":false},\"tags\":[\"lttfyhc\"],\"vpc_uuid\":\"wsuoardnagttpu\"},{\"id\":1923596622,\"name\":\"bpgnrholhujbf\",\"memory\":928126908,\"vcpus\":1778524043,\"disk\":1322957965,\"locked\":true,\"status\":\"off\",\"kernel\":{\"id\":411525724,\"name\":\"syjprxslwhdmcvh\",\"version\":\"bzjhfvhuwzb\"},\"created_at\":\"2021-04-24T20:34:23Z\",\"features\":[\"qzgihotjecohmx\",\"vlrrskapbxwieexu\",\"aderltfokyk\",\"yimyccgrvk\"],\"backup_ids\":[1678727382,1617701046],\"next_backup_window\":{\"start\":\"2021-07-17T23:41:57Z\",\"end\":\"2021-09-07T10:53:16Z\"},\"snapshot_ids\":[1659751922],\"image\":{\"id\":647083123,\"name\":\"jegprk\",\"type\":\"custom\",\"distribution\":\"RancherOS\",\"slug\":\"mwvvb\",\"public\":true,\"regions\":[],\"created_at\":\"2021-07-06T09:24:33Z\",\"min_disk_size\":2027705124,\"size_gigabytes\":24.070341,\"description\":\"qldekotjg\",\"tags\":[],\"status\":\"NEW\",\"error_message\":\"kyfh\"},\"volume_ids\":[\"vjaqu\",\"by\"],\"size\":{\"slug\":\"nvskpaj\",\"memory\":883857471,\"vcpus\":1759748665,\"disk\":471500576,\"transfer\":36.164825,\"price_monthly\":11.057722,\"price_hourly\":19.559849,\"regions\":[],\"available\":true,\"description\":\"mj\"},\"size_slug\":\"xcbccwkqmt\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"eqi\",\"slug\":\"crpilgftrq\",\"available\":true},\"tags\":[\"daahuqi\",\"ldahlfxlmu\",\"fmuad\",\"nfsncs\"],\"vpc_uuid\":\"ioshjgczetybn\"}]}")
                        .toObject(ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1015304772, model.getDroplets().get(0).getId());
        Assertions.assertEquals("zrfgmdqgnnbzrt", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1296175150, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(1417992874, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(1289892692, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(1680853411, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("vgjs", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("tyjjvavdpwwobt", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T17:41:17Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("titsf", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1334343181, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-10T16:34:07Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-11T08:55:31Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(737740581, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("ozokscvglli", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BASE, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.CENT_OS, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("gwewqkjvxprwpxso", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-22T02:15:27Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(772603628, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(47.7933F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("e", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.RETIRED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("gzlf", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("rdcgu", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("ai", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(1681980267, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(700985088, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1799123236, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(24.996494f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(61.820297f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(36.26089f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("gjypanhxmpdxxze", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("wwzjwotnxlkfhglh", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("x", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("wecr", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("pcs", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("lrmlccmetjscz", model.getDroplets().get(0).getVpcUuid());
        Assertions.assertEquals(1746493890, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema model =
                new ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema()
                        .setDroplets(
                                Arrays.asList(
                                        new Droplet()
                                                .setId(1015304772)
                                                .setName("zrfgmdqgnnbzrt")
                                                .setMemory(1296175150)
                                                .setVcpus(1417992874)
                                                .setDisk(1289892692)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.ARCHIVE)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1680853411)
                                                                .setName("vgjs")
                                                                .setVersion("tyjjvavdpwwobt"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-04-14T17:41:17Z"))
                                                .setFeatures(Arrays.asList("titsf", "ofw", "nmhkscauwaz"))
                                                .setBackupIds(Arrays.asList(1334343181))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-07-10T16:34:07Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-01-11T08:55:31Z")))
                                                .setSnapshotIds(Arrays.asList(737740581, 261934076))
                                                .setImage(
                                                        new Image()
                                                                .setName("ozokscvglli")
                                                                .setType(ImageType.BASE)
                                                                .setDistribution(Distribution.CENT_OS)
                                                                .setSlug("gwewqkjvxprwpxso")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-08-22T02:15:27Z"))
                                                                .setMinDiskSize(772603628)
                                                                .setSizeGigabytes(47.7933F)
                                                                .setDescription("e")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.RETIRED)
                                                                .setErrorMessage("gzlf"))
                                                .setVolumeIds(
                                                        Arrays.asList(
                                                                "rdcgu",
                                                                "srtmdylperpiltt",
                                                                "zgczfcmfpfbode",
                                                                "resrgvtshuvft"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("ai")
                                                                .setMemory(1681980267)
                                                                .setVcpus(700985088)
                                                                .setDisk(1799123236)
                                                                .setTransfer(24.996494f)
                                                                .setPriceMonthly(61.820297f)
                                                                .setPriceHourly(36.26089f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("gjypanhxmpdxxze"))
                                                .setSizeSlug("wwzjwotnxlkfhglh")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(new Region().setName("x").setSlug("wecr").setAvailable(true))
                                                .setTags(Arrays.asList("pcs", "lqxov", "pqibukklv"))
                                                .setVpcUuid("lrmlccmetjscz"),
                                        new Droplet()
                                                .setId(1795418525)
                                                .setName("fqbqnasd")
                                                .setMemory(1023024040)
                                                .setVcpus(770539013)
                                                .setDisk(679867225)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.ACTIVE)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(455918513)
                                                                .setName("cplhyvdgxlyzkxi")
                                                                .setVersion("shezs"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-06-20T07:31:15Z"))
                                                .setFeatures(Arrays.asList("lrupjovmo", "sayebra", "wzlpzbtz"))
                                                .setBackupIds(Arrays.asList(1706448301, 646015757))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-10-13T16:35:18Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-03-16T04:52:33Z")))
                                                .setSnapshotIds(Arrays.asList(1771980481, 1281718678))
                                                .setImage(
                                                        new Image()
                                                                .setName("noc")
                                                                .setType(ImageType.CUSTOM)
                                                                .setDistribution(Distribution.UNKNOWN)
                                                                .setSlug("fp")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-12-06T04:01:25Z"))
                                                                .setMinDiskSize(903703732)
                                                                .setSizeGigabytes(12.614525F)
                                                                .setDescription("aaokctgkppgkqzkc")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.PENDING)
                                                                .setErrorMessage("ngdyfcixrhlcq"))
                                                .setVolumeIds(Arrays.asList("oejgoiutgwrmkah"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("qha")
                                                                .setMemory(339890226)
                                                                .setVcpus(1377509896)
                                                                .setDisk(802896458)
                                                                .setTransfer(5.250001f)
                                                                .setPriceMonthly(24.10363f)
                                                                .setPriceHourly(26.211798f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("ncogmipnmliqmvlb"))
                                                .setSizeSlug("i")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("qgrvg")
                                                                .setSlug("omxp")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("tsdfjyieso", "wiqbuoutm"))
                                                .setVpcUuid("zgleofjsbg"),
                                        new Droplet()
                                                .setId(1836943266)
                                                .setName("wzvdajfwnncfm")
                                                .setMemory(1997247021)
                                                .setVcpus(749238965)
                                                .setDisk(1429350824)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(121103407)
                                                                .setName("iqlwixvtbou")
                                                                .setVersion("xtndopgjttbasua"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-01-29T03:34:47Z"))
                                                .setFeatures(Arrays.asList("dl", "db", "aqbkixvvlwynpbbf", "vzfjm"))
                                                .setBackupIds(Arrays.asList(163510782))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-03-03T18:45:42Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-07-18T15:46:05Z")))
                                                .setSnapshotIds(Arrays.asList(48843252, 1328529514))
                                                .setImage(
                                                        new Image()
                                                                .setName("phfky")
                                                                .setType(ImageType.BACKUP)
                                                                .setDistribution(Distribution.UBUNTU)
                                                                .setSlug("zmicuydoccnxsha")
                                                                .setPublicProperty(false)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-02-25T11:29:40Z"))
                                                                .setMinDiskSize(2073215491)
                                                                .setSizeGigabytes(32.40432F)
                                                                .setDescription("ecaatsdohzniuc")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.AVAILABLE)
                                                                .setErrorMessage("b"))
                                                .setVolumeIds(Arrays.asList("injdllwktlepo"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("avv")
                                                                .setMemory(440177744)
                                                                .setVcpus(1055236958)
                                                                .setDisk(1775715985)
                                                                .setTransfer(18.88531f)
                                                                .setPriceMonthly(0.62534213f)
                                                                .setPriceHourly(79.02721f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("wulynkgfcf"))
                                                .setSizeSlug("ruwsikxxtclh")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("ri")
                                                                .setSlug("byokvjgbzsxe")
                                                                .setAvailable(false))
                                                .setTags(Arrays.asList("lttfyhc"))
                                                .setVpcUuid("wsuoardnagttpu"),
                                        new Droplet()
                                                .setId(1923596622)
                                                .setName("bpgnrholhujbf")
                                                .setMemory(928126908)
                                                .setVcpus(1778524043)
                                                .setDisk(1322957965)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(411525724)
                                                                .setName("syjprxslwhdmcvh")
                                                                .setVersion("bzjhfvhuwzb"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-04-24T20:34:23Z"))
                                                .setFeatures(
                                                        Arrays.asList(
                                                                "qzgihotjecohmx",
                                                                "vlrrskapbxwieexu",
                                                                "aderltfokyk",
                                                                "yimyccgrvk"))
                                                .setBackupIds(Arrays.asList(1678727382, 1617701046))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-07-17T23:41:57Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-09-07T10:53:16Z")))
                                                .setSnapshotIds(Arrays.asList(1659751922))
                                                .setImage(
                                                        new Image()
                                                                .setName("jegprk")
                                                                .setType(ImageType.CUSTOM)
                                                                .setDistribution(Distribution.RANCHER_OS)
                                                                .setSlug("mwvvb")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-07-06T09:24:33Z"))
                                                                .setMinDiskSize(2027705124)
                                                                .setSizeGigabytes(24.070341F)
                                                                .setDescription("qldekotjg")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.NEW)
                                                                .setErrorMessage("kyfh"))
                                                .setVolumeIds(Arrays.asList("vjaqu", "by"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("nvskpaj")
                                                                .setMemory(883857471)
                                                                .setVcpus(1759748665)
                                                                .setDisk(471500576)
                                                                .setTransfer(36.164825f)
                                                                .setPriceMonthly(11.057722f)
                                                                .setPriceHourly(19.559849f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(true)
                                                                .setDescription("mj"))
                                                .setSizeSlug("xcbccwkqmt")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("eqi")
                                                                .setSlug("crpilgftrq")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("daahuqi", "ldahlfxlmu", "fmuad", "nfsncs"))
                                                .setVpcUuid("ioshjgczetybn")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1746493890));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsMufb2AResponsesAllDropletsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1015304772, model.getDroplets().get(0).getId());
        Assertions.assertEquals("zrfgmdqgnnbzrt", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1296175150, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(1417992874, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(1289892692, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(true, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(1680853411, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("vgjs", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("tyjjvavdpwwobt", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T17:41:17Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("titsf", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(1334343181, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-10T16:34:07Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-11T08:55:31Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(737740581, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("ozokscvglli", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.BASE, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.CENT_OS, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("gwewqkjvxprwpxso", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-22T02:15:27Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(772603628, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(47.7933F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("e", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.RETIRED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("gzlf", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("rdcgu", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("ai", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(1681980267, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(700985088, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(1799123236, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(24.996494f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(61.820297f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(36.26089f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(true, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("gjypanhxmpdxxze", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("wwzjwotnxlkfhglh", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("x", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("wecr", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("pcs", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("lrmlccmetjscz", model.getDroplets().get(0).getVpcUuid());
        Assertions.assertEquals(1746493890, model.getMeta().getTotal());
    }
}
