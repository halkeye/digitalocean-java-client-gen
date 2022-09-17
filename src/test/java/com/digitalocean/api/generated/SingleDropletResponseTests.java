package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Droplet;
import com.digitalocean.api.models.DropletCreateApplicationJsonOneOfProperties;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.DropletNextBackupWindow;
import com.digitalocean.api.models.DropletStatus;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.SingleDropletResponse;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SingleDropletResponseTests {
    @Test
    public void testDeserialize() {
        SingleDropletResponse model =
                BinaryData.fromString(
                                "{\"droplet\":{\"id\":1070259185,\"name\":\"nfczmnniixyxvq\",\"memory\":1330888938,\"vcpus\":1663163400,\"disk\":514495514,\"locked\":true,\"status\":\"active\",\"kernel\":{\"id\":967639569,\"name\":\"nbg\",\"version\":\"m\"},\"created_at\":\"2021-08-11T21:04:11Z\",\"features\":[\"rgmyn\",\"twmp\",\"tmfoeajogsyxwet\",\"mfd\"],\"backup_ids\":[1835029542,1515138527,1936720238,2084793017],\"next_backup_window\":{\"start\":\"2021-09-28T10:26:23Z\",\"end\":\"2021-09-27T14:16:13Z\"},\"snapshot_ids\":[680048255,1695406450,442608357],\"image\":{\"id\":2070353408,\"name\":\"id\",\"type\":\"snapshot\",\"distribution\":\"Gentoo\",\"slug\":\"hmjedbiuc\",\"public\":true,\"regions\":[\"sfo2\",\"sfo2\",\"ams2\",\"sfo3\"],\"created_at\":\"2021-08-28T03:52:25Z\",\"min_disk_size\":1535648696,\"size_gigabytes\":62.11141,\"description\":\"qrrihufoihp\",\"tags\":[\"bxv\",\"nzuz\"],\"status\":\"NEW\",\"error_message\":\"zc\"},\"volume_ids\":[\"piuzvk\",\"nhdimjuktirz\"],\"size\":{\"slug\":\"a\",\"memory\":22940441,\"vcpus\":1780435084,\"disk\":136347046,\"transfer\":48.820377,\"price_monthly\":17.556555,\"price_hourly\":17.862976,\"regions\":[\"fq\"],\"available\":false,\"description\":\"wgofmhx\"},\"size_slug\":\"rjlvzklkvbgi\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"akvlbishj\",\"slug\":\"pzaptuosk\",\"available\":true},\"tags\":[\"zjixwfgcdiyk\",\"c\",\"wnujvqynvav\"],\"vpc_uuid\":\"mdmuqoh\"},\"links\":{\"actions\":[{\"id\":217041482,\"rel\":\"quddrwjclj\",\"href\":\"hlhpvzadb\"},{\"id\":821839104,\"rel\":\"inafhxrzfrm\",\"href\":\"tiucwv\"},{\"id\":1824245133,\"rel\":\"ukhk\",\"href\":\"qxgcbvzarmqcbpo\"},{\"id\":892282285,\"rel\":\"invagovjyhd\",\"href\":\"brdvce\"}]}}")
                        .toObject(SingleDropletResponse.class);
        Assertions.assertEquals(1070259185, model.getDroplet().getId());
        Assertions.assertEquals("nfczmnniixyxvq", model.getDroplet().getName());
        Assertions.assertEquals(1330888938, model.getDroplet().getMemory());
        Assertions.assertEquals(1663163400, model.getDroplet().getVcpus());
        Assertions.assertEquals(514495514, model.getDroplet().getDisk());
        Assertions.assertEquals(true, model.getDroplet().isLocked());
        Assertions.assertEquals(DropletStatus.ACTIVE, model.getDroplet().getStatus());
        Assertions.assertEquals(967639569, model.getDroplet().getKernel().getId());
        Assertions.assertEquals("nbg", model.getDroplet().getKernel().getName());
        Assertions.assertEquals("m", model.getDroplet().getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-11T21:04:11Z"), model.getDroplet().getCreatedAt());
        Assertions.assertEquals("rgmyn", model.getDroplet().getFeatures().get(0));
        Assertions.assertEquals(1835029542, model.getDroplet().getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-28T10:26:23Z"), model.getDroplet().getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-27T14:16:13Z"), model.getDroplet().getNextBackupWindow().getEnd());
        Assertions.assertEquals(680048255, model.getDroplet().getSnapshotIds().get(0));
        Assertions.assertEquals("id", model.getDroplet().getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplet().getImage().getType());
        Assertions.assertEquals(Distribution.GENTOO, model.getDroplet().getImage().getDistribution());
        Assertions.assertEquals("hmjedbiuc", model.getDroplet().getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.SFO2, model.getDroplet().getImage().getRegions().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-28T03:52:25Z"), model.getDroplet().getImage().getCreatedAt());
        Assertions.assertEquals(1535648696, model.getDroplet().getImage().getMinDiskSize());
        Assertions.assertEquals(62.11141F, model.getDroplet().getImage().getSizeGigabytes());
        Assertions.assertEquals("qrrihufoihp", model.getDroplet().getImage().getDescription());
        Assertions.assertEquals("bxv", model.getDroplet().getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getDroplet().getImage().getStatus());
        Assertions.assertEquals("zc", model.getDroplet().getImage().getErrorMessage());
        Assertions.assertEquals("piuzvk", model.getDroplet().getVolumeIds().get(0));
        Assertions.assertEquals("a", model.getDroplet().getSize().getSlug());
        Assertions.assertEquals(22940441, model.getDroplet().getSize().getMemory());
        Assertions.assertEquals(1780435084, model.getDroplet().getSize().getVcpus());
        Assertions.assertEquals(136347046, model.getDroplet().getSize().getDisk());
        Assertions.assertEquals(48.820377f, model.getDroplet().getSize().getTransfer());
        Assertions.assertEquals(17.556555f, model.getDroplet().getSize().getPriceMonthly());
        Assertions.assertEquals(17.862976f, model.getDroplet().getSize().getPriceHourly());
        Assertions.assertEquals("fq", model.getDroplet().getSize().getRegions().get(0));
        Assertions.assertEquals(false, model.getDroplet().getSize().isAvailable());
        Assertions.assertEquals("wgofmhx", model.getDroplet().getSize().getDescription());
        Assertions.assertEquals("rjlvzklkvbgi", model.getDroplet().getSizeSlug());
        Assertions.assertEquals("akvlbishj", model.getDroplet().getRegion().getName());
        Assertions.assertEquals("pzaptuosk", model.getDroplet().getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getRegion().isAvailable());
        Assertions.assertEquals("zjixwfgcdiyk", model.getDroplet().getTags().get(0));
        Assertions.assertEquals("mdmuqoh", model.getDroplet().getVpcUuid());
        Assertions.assertEquals(217041482, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("quddrwjclj", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("hlhpvzadb", model.getLinks().getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        SingleDropletResponse model =
                new SingleDropletResponse()
                        .setDroplet(
                                new Droplet()
                                        .setId(1070259185)
                                        .setName("nfczmnniixyxvq")
                                        .setMemory(1330888938)
                                        .setVcpus(1663163400)
                                        .setDisk(514495514)
                                        .setLocked(true)
                                        .setStatus(DropletStatus.ACTIVE)
                                        .setKernel(new Kernel().setId(967639569).setName("nbg").setVersion("m"))
                                        .setCreatedAt(OffsetDateTime.parse("2021-08-11T21:04:11Z"))
                                        .setFeatures(Arrays.asList("rgmyn", "twmp", "tmfoeajogsyxwet", "mfd"))
                                        .setBackupIds(Arrays.asList(1835029542, 1515138527, 1936720238, 2084793017))
                                        .setNextBackupWindow(
                                                new DropletNextBackupWindow()
                                                        .setStart(OffsetDateTime.parse("2021-09-28T10:26:23Z"))
                                                        .setEnd(OffsetDateTime.parse("2021-09-27T14:16:13Z")))
                                        .setSnapshotIds(Arrays.asList(680048255, 1695406450, 442608357))
                                        .setImage(
                                                new Image()
                                                        .setName("id")
                                                        .setType(ImageType.SNAPSHOT)
                                                        .setDistribution(Distribution.GENTOO)
                                                        .setSlug("hmjedbiuc")
                                                        .setPublicProperty(true)
                                                        .setRegions(
                                                                Arrays.asList(
                                                                        RegionSlug.SFO2,
                                                                        RegionSlug.SFO2,
                                                                        RegionSlug.AMS2,
                                                                        RegionSlug.SFO3))
                                                        .setCreatedAt(OffsetDateTime.parse("2021-08-28T03:52:25Z"))
                                                        .setMinDiskSize(1535648696)
                                                        .setSizeGigabytes(62.11141F)
                                                        .setDescription("qrrihufoihp")
                                                        .setTags(Arrays.asList("bxv", "nzuz"))
                                                        .setStatus(ImageStatus.NEW)
                                                        .setErrorMessage("zc"))
                                        .setVolumeIds(Arrays.asList("piuzvk", "nhdimjuktirz"))
                                        .setSize(
                                                new Size()
                                                        .setSlug("a")
                                                        .setMemory(22940441)
                                                        .setVcpus(1780435084)
                                                        .setDisk(136347046)
                                                        .setTransfer(48.820377f)
                                                        .setPriceMonthly(17.556555f)
                                                        .setPriceHourly(17.862976f)
                                                        .setRegions(Arrays.asList("fq"))
                                                        .setAvailable(false)
                                                        .setDescription("wgofmhx"))
                                        .setSizeSlug("rjlvzklkvbgi")
                                        .setNetworks(
                                                new DropletNetworks().setV4(Arrays.asList()).setV6(Arrays.asList()))
                                        .setRegion(
                                                new Region()
                                                        .setName("akvlbishj")
                                                        .setSlug("pzaptuosk")
                                                        .setAvailable(true))
                                        .setTags(Arrays.asList("zjixwfgcdiyk", "c", "wnujvqynvav"))
                                        .setVpcUuid("mdmuqoh"))
                        .setLinks(
                                new DropletCreateApplicationJsonOneOfProperties()
                                        .setActions(
                                                Arrays.asList(
                                                        new ActionLink()
                                                                .setId(217041482)
                                                                .setRel("quddrwjclj")
                                                                .setHref("hlhpvzadb"),
                                                        new ActionLink()
                                                                .setId(821839104)
                                                                .setRel("inafhxrzfrm")
                                                                .setHref("tiucwv"),
                                                        new ActionLink()
                                                                .setId(1824245133)
                                                                .setRel("ukhk")
                                                                .setHref("qxgcbvzarmqcbpo"),
                                                        new ActionLink()
                                                                .setId(892282285)
                                                                .setRel("invagovjyhd")
                                                                .setHref("brdvce"))));
        model = BinaryData.fromObject(model).toObject(SingleDropletResponse.class);
        Assertions.assertEquals(1070259185, model.getDroplet().getId());
        Assertions.assertEquals("nfczmnniixyxvq", model.getDroplet().getName());
        Assertions.assertEquals(1330888938, model.getDroplet().getMemory());
        Assertions.assertEquals(1663163400, model.getDroplet().getVcpus());
        Assertions.assertEquals(514495514, model.getDroplet().getDisk());
        Assertions.assertEquals(true, model.getDroplet().isLocked());
        Assertions.assertEquals(DropletStatus.ACTIVE, model.getDroplet().getStatus());
        Assertions.assertEquals(967639569, model.getDroplet().getKernel().getId());
        Assertions.assertEquals("nbg", model.getDroplet().getKernel().getName());
        Assertions.assertEquals("m", model.getDroplet().getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-11T21:04:11Z"), model.getDroplet().getCreatedAt());
        Assertions.assertEquals("rgmyn", model.getDroplet().getFeatures().get(0));
        Assertions.assertEquals(1835029542, model.getDroplet().getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-28T10:26:23Z"), model.getDroplet().getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-27T14:16:13Z"), model.getDroplet().getNextBackupWindow().getEnd());
        Assertions.assertEquals(680048255, model.getDroplet().getSnapshotIds().get(0));
        Assertions.assertEquals("id", model.getDroplet().getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplet().getImage().getType());
        Assertions.assertEquals(Distribution.GENTOO, model.getDroplet().getImage().getDistribution());
        Assertions.assertEquals("hmjedbiuc", model.getDroplet().getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.SFO2, model.getDroplet().getImage().getRegions().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-28T03:52:25Z"), model.getDroplet().getImage().getCreatedAt());
        Assertions.assertEquals(1535648696, model.getDroplet().getImage().getMinDiskSize());
        Assertions.assertEquals(62.11141F, model.getDroplet().getImage().getSizeGigabytes());
        Assertions.assertEquals("qrrihufoihp", model.getDroplet().getImage().getDescription());
        Assertions.assertEquals("bxv", model.getDroplet().getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getDroplet().getImage().getStatus());
        Assertions.assertEquals("zc", model.getDroplet().getImage().getErrorMessage());
        Assertions.assertEquals("piuzvk", model.getDroplet().getVolumeIds().get(0));
        Assertions.assertEquals("a", model.getDroplet().getSize().getSlug());
        Assertions.assertEquals(22940441, model.getDroplet().getSize().getMemory());
        Assertions.assertEquals(1780435084, model.getDroplet().getSize().getVcpus());
        Assertions.assertEquals(136347046, model.getDroplet().getSize().getDisk());
        Assertions.assertEquals(48.820377f, model.getDroplet().getSize().getTransfer());
        Assertions.assertEquals(17.556555f, model.getDroplet().getSize().getPriceMonthly());
        Assertions.assertEquals(17.862976f, model.getDroplet().getSize().getPriceHourly());
        Assertions.assertEquals("fq", model.getDroplet().getSize().getRegions().get(0));
        Assertions.assertEquals(false, model.getDroplet().getSize().isAvailable());
        Assertions.assertEquals("wgofmhx", model.getDroplet().getSize().getDescription());
        Assertions.assertEquals("rjlvzklkvbgi", model.getDroplet().getSizeSlug());
        Assertions.assertEquals("akvlbishj", model.getDroplet().getRegion().getName());
        Assertions.assertEquals("pzaptuosk", model.getDroplet().getRegion().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getRegion().isAvailable());
        Assertions.assertEquals("zjixwfgcdiyk", model.getDroplet().getTags().get(0));
        Assertions.assertEquals("mdmuqoh", model.getDroplet().getVpcUuid());
        Assertions.assertEquals(217041482, model.getLinks().getActions().get(0).getId());
        Assertions.assertEquals("quddrwjclj", model.getLinks().getActions().get(0).getRel());
        Assertions.assertEquals("hlhpvzadb", model.getLinks().getActions().get(0).getHref());
    }
}
