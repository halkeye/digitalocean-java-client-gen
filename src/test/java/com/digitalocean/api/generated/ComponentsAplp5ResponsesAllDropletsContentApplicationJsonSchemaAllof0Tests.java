package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0;
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

public final class ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"droplets\":[{\"id\":1478084634,\"name\":\"lcgctjchfjv\",\"memory\":1976746044,\"vcpus\":573789553,\"disk\":11816420,\"locked\":false,\"status\":\"off\",\"kernel\":{\"id\":269781052,\"name\":\"vlbefvwclj\",\"version\":\"pylrwoxzgwpsy\"},\"created_at\":\"2021-10-26T03:48:13Z\",\"features\":[\"jeypdvrbkerdk\",\"kgawqwjxil\",\"fkcefeygz\",\"pjois\"],\"backup_ids\":[214582888,1669352778,868542301,2068548608],\"next_backup_window\":{\"start\":\"2021-03-13T09:46:11Z\",\"end\":\"2021-09-30T19:08:33Z\"},\"snapshot_ids\":[1595603452,858331369,490885393,2021126302],\"image\":{\"id\":492871165,\"name\":\"tw\",\"type\":\"snapshot\",\"distribution\":\"Rocky Linux\",\"slug\":\"ulwivqtowlhlsy\",\"public\":true,\"regions\":[],\"created_at\":\"2021-05-10T15:05:44Z\",\"min_disk_size\":667027013,\"size_gigabytes\":35.856266,\"description\":\"fajcywhjqwm\",\"tags\":[],\"status\":\"deleted\",\"error_message\":\"tfxcpupuk\"},\"volume_ids\":[\"mjzpwdlvwtiwsm\",\"sa\",\"nhqnampp\",\"ltassaekewna\"],\"size\":{\"slug\":\"eajbkajlcyizyddc\",\"memory\":497254411,\"vcpus\":450716443,\"disk\":534444200,\"transfer\":70.845085,\"price_monthly\":73.6286,\"price_hourly\":31.178444,\"regions\":[],\"available\":false,\"description\":\"sxxb\"},\"size_slug\":\"desqlvg\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"wgoljtzx\",\"slug\":\"mxsdobygoog\",\"available\":false},\"tags\":[\"pjxvazyjf\",\"csa\",\"djnosdkvibf\",\"sgm\"],\"vpc_uuid\":\"rnzpducdaak\"},{\"id\":1573814203,\"name\":\"jktzboimyfpq\",\"memory\":683522354,\"vcpus\":1020650753,\"disk\":774305524,\"locked\":true,\"status\":\"new\",\"kernel\":{\"id\":1987908200,\"name\":\"tfvpctfjikff\",\"version\":\"g\"},\"created_at\":\"2021-05-20T19:51:44Z\",\"features\":[\"znwhvu\",\"dbkkejjkjigawgaz\",\"xjqifhujjsbc\"],\"backup_ids\":[2032053398,1525953234,630961760,855142861],\"next_backup_window\":{\"start\":\"2021-01-17T05:07:29Z\",\"end\":\"2021-04-15T18:23:21Z\"},\"snapshot_ids\":[648783991,605503525,658928456],\"image\":{\"id\":1240761388,\"name\":\"irhhmo\",\"type\":\"snapshot\",\"distribution\":\"Gentoo\",\"slug\":\"fjzc\",\"public\":true,\"regions\":[],\"created_at\":\"2021-07-20T02:06:46Z\",\"min_disk_size\":1269569576,\"size_gigabytes\":52.973156,\"description\":\"xw\",\"tags\":[],\"status\":\"retired\",\"error_message\":\"xkukm\"},\"volume_ids\":[\"zynuh\"],\"size\":{\"slug\":\"oq\",\"memory\":1712631448,\"vcpus\":260585009,\"disk\":1004791045,\"transfer\":28.053015,\"price_monthly\":10.554332,\"price_hourly\":92.77746,\"regions\":[],\"available\":false,\"description\":\"q\"},\"size_slug\":\"xyrqo\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"hbbnkgzuk\",\"slug\":\"drnzkjthf\",\"available\":true},\"tags\":[\"jncjmlfuyfjbp\",\"iddhlrufzc\"],\"vpc_uuid\":\"jmqrfuiocuselq\"}]}")
                        .toObject(ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1478084634, model.getDroplets().get(0).getId());
        Assertions.assertEquals("lcgctjchfjv", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1976746044, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(573789553, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(11816420, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(false, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.OFF, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(269781052, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("vlbefvwclj", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("pylrwoxzgwpsy", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-26T03:48:13Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("jeypdvrbkerdk", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(214582888, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-13T09:46:11Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-30T19:08:33Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(1595603452, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("tw", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.ROCKY_LINUX, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("ulwivqtowlhlsy", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-10T15:05:44Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(667027013, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(35.856266F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("fajcywhjqwm", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("tfxcpupuk", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("mjzpwdlvwtiwsm", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("eajbkajlcyizyddc", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(497254411, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(450716443, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(534444200, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(70.845085f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(73.6286f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(31.178444f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(false, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("sxxb", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("desqlvg", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("wgoljtzx", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mxsdobygoog", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("pjxvazyjf", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("rnzpducdaak", model.getDroplets().get(0).getVpcUuid());
    }

    @Test
    public void testSerialize() {
        ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 model =
                new ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0()
                        .setDroplets(
                                Arrays.asList(
                                        new Droplet()
                                                .setId(1478084634)
                                                .setName("lcgctjchfjv")
                                                .setMemory(1976746044)
                                                .setVcpus(573789553)
                                                .setDisk(11816420)
                                                .setLocked(false)
                                                .setStatus(DropletStatus.OFF)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(269781052)
                                                                .setName("vlbefvwclj")
                                                                .setVersion("pylrwoxzgwpsy"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-10-26T03:48:13Z"))
                                                .setFeatures(
                                                        Arrays.asList(
                                                                "jeypdvrbkerdk", "kgawqwjxil", "fkcefeygz", "pjois"))
                                                .setBackupIds(
                                                        Arrays.asList(214582888, 1669352778, 868542301, 2068548608))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-03-13T09:46:11Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-09-30T19:08:33Z")))
                                                .setSnapshotIds(
                                                        Arrays.asList(1595603452, 858331369, 490885393, 2021126302))
                                                .setImage(
                                                        new Image()
                                                                .setName("tw")
                                                                .setType(ImageType.SNAPSHOT)
                                                                .setDistribution(Distribution.ROCKY_LINUX)
                                                                .setSlug("ulwivqtowlhlsy")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-05-10T15:05:44Z"))
                                                                .setMinDiskSize(667027013)
                                                                .setSizeGigabytes(35.856266F)
                                                                .setDescription("fajcywhjqwm")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.DELETED)
                                                                .setErrorMessage("tfxcpupuk"))
                                                .setVolumeIds(
                                                        Arrays.asList(
                                                                "mjzpwdlvwtiwsm", "sa", "nhqnampp", "ltassaekewna"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("eajbkajlcyizyddc")
                                                                .setMemory(497254411)
                                                                .setVcpus(450716443)
                                                                .setDisk(534444200)
                                                                .setTransfer(70.845085f)
                                                                .setPriceMonthly(73.6286f)
                                                                .setPriceHourly(31.178444f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(false)
                                                                .setDescription("sxxb"))
                                                .setSizeSlug("desqlvg")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("wgoljtzx")
                                                                .setSlug("mxsdobygoog")
                                                                .setAvailable(false))
                                                .setTags(Arrays.asList("pjxvazyjf", "csa", "djnosdkvibf", "sgm"))
                                                .setVpcUuid("rnzpducdaak"),
                                        new Droplet()
                                                .setId(1573814203)
                                                .setName("jktzboimyfpq")
                                                .setMemory(683522354)
                                                .setVcpus(1020650753)
                                                .setDisk(774305524)
                                                .setLocked(true)
                                                .setStatus(DropletStatus.NEW)
                                                .setKernel(
                                                        new Kernel()
                                                                .setId(1987908200)
                                                                .setName("tfvpctfjikff")
                                                                .setVersion("g"))
                                                .setCreatedAt(OffsetDateTime.parse("2021-05-20T19:51:44Z"))
                                                .setFeatures(
                                                        Arrays.asList("znwhvu", "dbkkejjkjigawgaz", "xjqifhujjsbc"))
                                                .setBackupIds(
                                                        Arrays.asList(2032053398, 1525953234, 630961760, 855142861))
                                                .setNextBackupWindow(
                                                        new DropletNextBackupWindow()
                                                                .setStart(OffsetDateTime.parse("2021-01-17T05:07:29Z"))
                                                                .setEnd(OffsetDateTime.parse("2021-04-15T18:23:21Z")))
                                                .setSnapshotIds(Arrays.asList(648783991, 605503525, 658928456))
                                                .setImage(
                                                        new Image()
                                                                .setName("irhhmo")
                                                                .setType(ImageType.SNAPSHOT)
                                                                .setDistribution(Distribution.GENTOO)
                                                                .setSlug("fjzc")
                                                                .setPublicProperty(true)
                                                                .setRegions(Arrays.asList())
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-07-20T02:06:46Z"))
                                                                .setMinDiskSize(1269569576)
                                                                .setSizeGigabytes(52.973156F)
                                                                .setDescription("xw")
                                                                .setTags(Arrays.asList())
                                                                .setStatus(ImageStatus.RETIRED)
                                                                .setErrorMessage("xkukm"))
                                                .setVolumeIds(Arrays.asList("zynuh"))
                                                .setSize(
                                                        new Size()
                                                                .setSlug("oq")
                                                                .setMemory(1712631448)
                                                                .setVcpus(260585009)
                                                                .setDisk(1004791045)
                                                                .setTransfer(28.053015f)
                                                                .setPriceMonthly(10.554332f)
                                                                .setPriceHourly(92.77746f)
                                                                .setRegions(Arrays.asList())
                                                                .setAvailable(false)
                                                                .setDescription("q"))
                                                .setSizeSlug("xyrqo")
                                                .setNetworks(
                                                        new DropletNetworks()
                                                                .setV4(Arrays.asList())
                                                                .setV6(Arrays.asList()))
                                                .setRegion(
                                                        new Region()
                                                                .setName("hbbnkgzuk")
                                                                .setSlug("drnzkjthf")
                                                                .setAvailable(true))
                                                .setTags(Arrays.asList("jncjmlfuyfjbp", "iddhlrufzc"))
                                                .setVpcUuid("jmqrfuiocuselq")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1478084634, model.getDroplets().get(0).getId());
        Assertions.assertEquals("lcgctjchfjv", model.getDroplets().get(0).getName());
        Assertions.assertEquals(1976746044, model.getDroplets().get(0).getMemory());
        Assertions.assertEquals(573789553, model.getDroplets().get(0).getVcpus());
        Assertions.assertEquals(11816420, model.getDroplets().get(0).getDisk());
        Assertions.assertEquals(false, model.getDroplets().get(0).isLocked());
        Assertions.assertEquals(DropletStatus.OFF, model.getDroplets().get(0).getStatus());
        Assertions.assertEquals(269781052, model.getDroplets().get(0).getKernel().getId());
        Assertions.assertEquals("vlbefvwclj", model.getDroplets().get(0).getKernel().getName());
        Assertions.assertEquals("pylrwoxzgwpsy", model.getDroplets().get(0).getKernel().getVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-26T03:48:13Z"), model.getDroplets().get(0).getCreatedAt());
        Assertions.assertEquals("jeypdvrbkerdk", model.getDroplets().get(0).getFeatures().get(0));
        Assertions.assertEquals(214582888, model.getDroplets().get(0).getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-13T09:46:11Z"),
                model.getDroplets().get(0).getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-30T19:08:33Z"),
                model.getDroplets().get(0).getNextBackupWindow().getEnd());
        Assertions.assertEquals(1595603452, model.getDroplets().get(0).getSnapshotIds().get(0));
        Assertions.assertEquals("tw", model.getDroplets().get(0).getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplets().get(0).getImage().getType());
        Assertions.assertEquals(Distribution.ROCKY_LINUX, model.getDroplets().get(0).getImage().getDistribution());
        Assertions.assertEquals("ulwivqtowlhlsy", model.getDroplets().get(0).getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplets().get(0).getImage().isPublicProperty());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-10T15:05:44Z"), model.getDroplets().get(0).getImage().getCreatedAt());
        Assertions.assertEquals(667027013, model.getDroplets().get(0).getImage().getMinDiskSize());
        Assertions.assertEquals(35.856266F, model.getDroplets().get(0).getImage().getSizeGigabytes());
        Assertions.assertEquals("fajcywhjqwm", model.getDroplets().get(0).getImage().getDescription());
        Assertions.assertEquals(ImageStatus.DELETED, model.getDroplets().get(0).getImage().getStatus());
        Assertions.assertEquals("tfxcpupuk", model.getDroplets().get(0).getImage().getErrorMessage());
        Assertions.assertEquals("mjzpwdlvwtiwsm", model.getDroplets().get(0).getVolumeIds().get(0));
        Assertions.assertEquals("eajbkajlcyizyddc", model.getDroplets().get(0).getSize().getSlug());
        Assertions.assertEquals(497254411, model.getDroplets().get(0).getSize().getMemory());
        Assertions.assertEquals(450716443, model.getDroplets().get(0).getSize().getVcpus());
        Assertions.assertEquals(534444200, model.getDroplets().get(0).getSize().getDisk());
        Assertions.assertEquals(70.845085f, model.getDroplets().get(0).getSize().getTransfer());
        Assertions.assertEquals(73.6286f, model.getDroplets().get(0).getSize().getPriceMonthly());
        Assertions.assertEquals(31.178444f, model.getDroplets().get(0).getSize().getPriceHourly());
        Assertions.assertEquals(false, model.getDroplets().get(0).getSize().isAvailable());
        Assertions.assertEquals("sxxb", model.getDroplets().get(0).getSize().getDescription());
        Assertions.assertEquals("desqlvg", model.getDroplets().get(0).getSizeSlug());
        Assertions.assertEquals("wgoljtzx", model.getDroplets().get(0).getRegion().getName());
        Assertions.assertEquals("mxsdobygoog", model.getDroplets().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplets().get(0).getRegion().isAvailable());
        Assertions.assertEquals("pjxvazyjf", model.getDroplets().get(0).getTags().get(0));
        Assertions.assertEquals("rnzpducdaak", model.getDroplets().get(0).getVpcUuid());
    }
}
