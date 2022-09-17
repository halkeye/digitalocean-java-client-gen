package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Droplet;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.DropletNextBackupWindow;
import com.digitalocean.api.models.DropletStatus;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.NetworkV4;
import com.digitalocean.api.models.NetworkV4Type;
import com.digitalocean.api.models.NetworkV6;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletTests {
    @Test
    public void testDeserialize() {
        Droplet model =
                BinaryData.fromString(
                                "{\"id\":64246620,\"name\":\"sazrhxuddqmdtff\",\"memory\":1945177796,\"vcpus\":737599965,\"disk\":1971965910,\"locked\":true,\"status\":\"archive\",\"kernel\":{\"id\":395959630,\"name\":\"dmdlgyqixokw\",\"version\":\"awhva\"},\"created_at\":\"2021-10-25T10:11:10Z\",\"features\":[\"fqqdl\",\"vmyolcaym\",\"chtvsnvlaqd\",\"z\"],\"backup_ids\":[1530011782,1622025421,528226837,2099242028],\"next_backup_window\":{\"start\":\"2021-01-08T05:37:24Z\",\"end\":\"2021-01-23T19:40:50Z\"},\"snapshot_ids\":[279504165,1700053521,50005570,1368854348],\"image\":{\"id\":1910695360,\"name\":\"ymgobll\",\"type\":\"snapshot\",\"distribution\":\"RancherOS\",\"slug\":\"imaaneak\",\"public\":false,\"regions\":[\"nyc3\",\"nyc2\",\"sfo2\",\"nyc3\"],\"created_at\":\"2021-10-28T18:26:03Z\",\"min_disk_size\":330883602,\"size_gigabytes\":38.41582,\"description\":\"khgvoogxkfnao\",\"tags\":[\"mhcctopuowy\",\"nskby\",\"quhczygxvh\"],\"status\":\"deleted\",\"error_message\":\"e\"},\"volume_ids\":[\"qnwhscozawmvg\",\"smpknpwi\",\"fljfewxqouoxudnm\"],\"size\":{\"slug\":\"kaprhknqiijg\",\"memory\":336537069,\"vcpus\":1670345586,\"disk\":131543053,\"transfer\":1.2167215,\"price_monthly\":76.00524,\"price_hourly\":88.33554,\"regions\":[\"ueqihkkyowlt\",\"ouwhldxwhie\"],\"available\":true,\"description\":\"oqksmfxmcvpr\"},\"size_slug\":\"tvkitbfjtdy\",\"networks\":{\"v4\":[{\"ip_address\":\"lfa\",\"netmask\":\"occqrqxw\",\"gateway\":\"jtdrhutf\",\"type\":\"public\"},{\"ip_address\":\"txop\",\"netmask\":\"hpadkmdzg\",\"gateway\":\"zxvctkbbxuharls\",\"type\":\"private\"}],\"v6\":[{\"ip_address\":\"abvoyngsuxxcz\",\"netmask\":187800600,\"gateway\":\"joghdsa\"},{\"ip_address\":\"janormovdxxu\",\"netmask\":1685067411,\"gateway\":\"jmoilunwe\"}]},\"region\":{\"name\":\"hdeeljslkyozdsfz\",\"slug\":\"uegrh\",\"available\":true},\"tags\":[\"slejtvxj\"],\"vpc_uuid\":\"vgjbfio\"}")
                        .toObject(Droplet.class);
        Assertions.assertEquals(64246620, model.getId());
        Assertions.assertEquals("sazrhxuddqmdtff", model.getName());
        Assertions.assertEquals(1945177796, model.getMemory());
        Assertions.assertEquals(737599965, model.getVcpus());
        Assertions.assertEquals(1971965910, model.getDisk());
        Assertions.assertEquals(true, model.isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getStatus());
        Assertions.assertEquals(395959630, model.getKernel().getId());
        Assertions.assertEquals("dmdlgyqixokw", model.getKernel().getName());
        Assertions.assertEquals("awhva", model.getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T10:11:10Z"), model.getCreatedAt());
        Assertions.assertEquals("fqqdl", model.getFeatures().get(0));
        Assertions.assertEquals(1530011782, model.getBackupIds().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-08T05:37:24Z"), model.getNextBackupWindow().getStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-23T19:40:50Z"), model.getNextBackupWindow().getEnd());
        Assertions.assertEquals(279504165, model.getSnapshotIds().get(0));
        Assertions.assertEquals("ymgobll", model.getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getImage().getType());
        Assertions.assertEquals(Distribution.RANCHER_OS, model.getImage().getDistribution());
        Assertions.assertEquals("imaaneak", model.getImage().getSlug());
        Assertions.assertEquals(false, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC3, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-28T18:26:03Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(330883602, model.getImage().getMinDiskSize());
        Assertions.assertEquals(38.41582F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("khgvoogxkfnao", model.getImage().getDescription());
        Assertions.assertEquals("mhcctopuowy", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.DELETED, model.getImage().getStatus());
        Assertions.assertEquals("e", model.getImage().getErrorMessage());
        Assertions.assertEquals("qnwhscozawmvg", model.getVolumeIds().get(0));
        Assertions.assertEquals("kaprhknqiijg", model.getSize().getSlug());
        Assertions.assertEquals(336537069, model.getSize().getMemory());
        Assertions.assertEquals(1670345586, model.getSize().getVcpus());
        Assertions.assertEquals(131543053, model.getSize().getDisk());
        Assertions.assertEquals(1.2167215f, model.getSize().getTransfer());
        Assertions.assertEquals(76.00524f, model.getSize().getPriceMonthly());
        Assertions.assertEquals(88.33554f, model.getSize().getPriceHourly());
        Assertions.assertEquals("ueqihkkyowlt", model.getSize().getRegions().get(0));
        Assertions.assertEquals(true, model.getSize().isAvailable());
        Assertions.assertEquals("oqksmfxmcvpr", model.getSize().getDescription());
        Assertions.assertEquals("tvkitbfjtdy", model.getSizeSlug());
        Assertions.assertEquals("lfa", model.getNetworks().getV4().get(0).getIpAddress());
        Assertions.assertEquals("occqrqxw", model.getNetworks().getV4().get(0).getNetmask());
        Assertions.assertEquals("jtdrhutf", model.getNetworks().getV4().get(0).getGateway());
        Assertions.assertEquals(NetworkV4Type.PUBLIC, model.getNetworks().getV4().get(0).getType());
        Assertions.assertEquals("abvoyngsuxxcz", model.getNetworks().getV6().get(0).getIpAddress());
        Assertions.assertEquals(187800600, model.getNetworks().getV6().get(0).getNetmask());
        Assertions.assertEquals("joghdsa", model.getNetworks().getV6().get(0).getGateway());
        Assertions.assertEquals("hdeeljslkyozdsfz", model.getRegion().getName());
        Assertions.assertEquals("uegrh", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals("slejtvxj", model.getTags().get(0));
        Assertions.assertEquals("vgjbfio", model.getVpcUuid());
    }

    @Test
    public void testSerialize() {
        Droplet model =
                new Droplet()
                        .setId(64246620)
                        .setName("sazrhxuddqmdtff")
                        .setMemory(1945177796)
                        .setVcpus(737599965)
                        .setDisk(1971965910)
                        .setLocked(true)
                        .setStatus(DropletStatus.ARCHIVE)
                        .setKernel(new Kernel().setId(395959630).setName("dmdlgyqixokw").setVersion("awhva"))
                        .setCreatedAt(OffsetDateTime.parse("2021-10-25T10:11:10Z"))
                        .setFeatures(Arrays.asList("fqqdl", "vmyolcaym", "chtvsnvlaqd", "z"))
                        .setBackupIds(Arrays.asList(1530011782, 1622025421, 528226837, 2099242028))
                        .setNextBackupWindow(
                                new DropletNextBackupWindow()
                                        .setStart(OffsetDateTime.parse("2021-01-08T05:37:24Z"))
                                        .setEnd(OffsetDateTime.parse("2021-01-23T19:40:50Z")))
                        .setSnapshotIds(Arrays.asList(279504165, 1700053521, 50005570, 1368854348))
                        .setImage(
                                new Image()
                                        .setName("ymgobll")
                                        .setType(ImageType.SNAPSHOT)
                                        .setDistribution(Distribution.RANCHER_OS)
                                        .setSlug("imaaneak")
                                        .setPublicProperty(false)
                                        .setRegions(
                                                Arrays.asList(
                                                        RegionSlug.NYC3,
                                                        RegionSlug.NYC2,
                                                        RegionSlug.SFO2,
                                                        RegionSlug.NYC3))
                                        .setCreatedAt(OffsetDateTime.parse("2021-10-28T18:26:03Z"))
                                        .setMinDiskSize(330883602)
                                        .setSizeGigabytes(38.41582F)
                                        .setDescription("khgvoogxkfnao")
                                        .setTags(Arrays.asList("mhcctopuowy", "nskby", "quhczygxvh"))
                                        .setStatus(ImageStatus.DELETED)
                                        .setErrorMessage("e"))
                        .setVolumeIds(Arrays.asList("qnwhscozawmvg", "smpknpwi", "fljfewxqouoxudnm"))
                        .setSize(
                                new Size()
                                        .setSlug("kaprhknqiijg")
                                        .setMemory(336537069)
                                        .setVcpus(1670345586)
                                        .setDisk(131543053)
                                        .setTransfer(1.2167215f)
                                        .setPriceMonthly(76.00524f)
                                        .setPriceHourly(88.33554f)
                                        .setRegions(Arrays.asList("ueqihkkyowlt", "ouwhldxwhie"))
                                        .setAvailable(true)
                                        .setDescription("oqksmfxmcvpr"))
                        .setSizeSlug("tvkitbfjtdy")
                        .setNetworks(
                                new DropletNetworks()
                                        .setV4(
                                                Arrays.asList(
                                                        new NetworkV4()
                                                                .setIpAddress("lfa")
                                                                .setNetmask("occqrqxw")
                                                                .setGateway("jtdrhutf")
                                                                .setType(NetworkV4Type.PUBLIC),
                                                        new NetworkV4()
                                                                .setIpAddress("txop")
                                                                .setNetmask("hpadkmdzg")
                                                                .setGateway("zxvctkbbxuharls")
                                                                .setType(NetworkV4Type.PRIVATE)))
                                        .setV6(
                                                Arrays.asList(
                                                        new NetworkV6()
                                                                .setIpAddress("abvoyngsuxxcz")
                                                                .setNetmask(187800600)
                                                                .setGateway("joghdsa"),
                                                        new NetworkV6()
                                                                .setIpAddress("janormovdxxu")
                                                                .setNetmask(1685067411)
                                                                .setGateway("jmoilunwe"))))
                        .setRegion(new Region().setName("hdeeljslkyozdsfz").setSlug("uegrh").setAvailable(true))
                        .setTags(Arrays.asList("slejtvxj"))
                        .setVpcUuid("vgjbfio");
        model = BinaryData.fromObject(model).toObject(Droplet.class);
        Assertions.assertEquals(64246620, model.getId());
        Assertions.assertEquals("sazrhxuddqmdtff", model.getName());
        Assertions.assertEquals(1945177796, model.getMemory());
        Assertions.assertEquals(737599965, model.getVcpus());
        Assertions.assertEquals(1971965910, model.getDisk());
        Assertions.assertEquals(true, model.isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getStatus());
        Assertions.assertEquals(395959630, model.getKernel().getId());
        Assertions.assertEquals("dmdlgyqixokw", model.getKernel().getName());
        Assertions.assertEquals("awhva", model.getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T10:11:10Z"), model.getCreatedAt());
        Assertions.assertEquals("fqqdl", model.getFeatures().get(0));
        Assertions.assertEquals(1530011782, model.getBackupIds().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-08T05:37:24Z"), model.getNextBackupWindow().getStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-23T19:40:50Z"), model.getNextBackupWindow().getEnd());
        Assertions.assertEquals(279504165, model.getSnapshotIds().get(0));
        Assertions.assertEquals("ymgobll", model.getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getImage().getType());
        Assertions.assertEquals(Distribution.RANCHER_OS, model.getImage().getDistribution());
        Assertions.assertEquals("imaaneak", model.getImage().getSlug());
        Assertions.assertEquals(false, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC3, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-28T18:26:03Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(330883602, model.getImage().getMinDiskSize());
        Assertions.assertEquals(38.41582F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("khgvoogxkfnao", model.getImage().getDescription());
        Assertions.assertEquals("mhcctopuowy", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.DELETED, model.getImage().getStatus());
        Assertions.assertEquals("e", model.getImage().getErrorMessage());
        Assertions.assertEquals("qnwhscozawmvg", model.getVolumeIds().get(0));
        Assertions.assertEquals("kaprhknqiijg", model.getSize().getSlug());
        Assertions.assertEquals(336537069, model.getSize().getMemory());
        Assertions.assertEquals(1670345586, model.getSize().getVcpus());
        Assertions.assertEquals(131543053, model.getSize().getDisk());
        Assertions.assertEquals(1.2167215f, model.getSize().getTransfer());
        Assertions.assertEquals(76.00524f, model.getSize().getPriceMonthly());
        Assertions.assertEquals(88.33554f, model.getSize().getPriceHourly());
        Assertions.assertEquals("ueqihkkyowlt", model.getSize().getRegions().get(0));
        Assertions.assertEquals(true, model.getSize().isAvailable());
        Assertions.assertEquals("oqksmfxmcvpr", model.getSize().getDescription());
        Assertions.assertEquals("tvkitbfjtdy", model.getSizeSlug());
        Assertions.assertEquals("lfa", model.getNetworks().getV4().get(0).getIpAddress());
        Assertions.assertEquals("occqrqxw", model.getNetworks().getV4().get(0).getNetmask());
        Assertions.assertEquals("jtdrhutf", model.getNetworks().getV4().get(0).getGateway());
        Assertions.assertEquals(NetworkV4Type.PUBLIC, model.getNetworks().getV4().get(0).getType());
        Assertions.assertEquals("abvoyngsuxxcz", model.getNetworks().getV6().get(0).getIpAddress());
        Assertions.assertEquals(187800600, model.getNetworks().getV6().get(0).getNetmask());
        Assertions.assertEquals("joghdsa", model.getNetworks().getV6().get(0).getGateway());
        Assertions.assertEquals("hdeeljslkyozdsfz", model.getRegion().getName());
        Assertions.assertEquals("uegrh", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals("slejtvxj", model.getTags().get(0));
        Assertions.assertEquals("vgjbfio", model.getVpcUuid());
    }
}