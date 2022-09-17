package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema;
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
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.Size;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"droplet\":{\"id\":2107685565,\"name\":\"mmazdnckid\",\"memory\":667214082,\"vcpus\":1692252451,\"disk\":1584900231,\"locked\":true,\"status\":\"archive\",\"kernel\":{\"id\":1535611981,\"name\":\"zbawkikcdgfh\",\"version\":\"sd\"},\"created_at\":\"2021-09-30T20:27:29Z\",\"features\":[\"yoqxdedecfiwhag\"],\"backup_ids\":[1051970725,906905341,2026838902,1433872344],\"next_backup_window\":{\"start\":\"2021-10-17T22:17:54Z\",\"end\":\"2021-04-03T03:14:42Z\"},\"snapshot_ids\":[58048223,1535444038,164034055,953722289],\"image\":{\"id\":422310667,\"name\":\"xiqqzjkoxdupna\",\"type\":\"snapshot\",\"distribution\":\"Fedora\",\"slug\":\"i\",\"public\":true,\"regions\":[\"nyc1\"],\"created_at\":\"2021-04-14T19:09:21Z\",\"min_disk_size\":1944632599,\"size_gigabytes\":76.16409,\"description\":\"qigdydkghpcvr\",\"tags\":[\"rvtktyhhmv\"],\"status\":\"retired\",\"error_message\":\"pjajodmkrrwe\"},\"volume_ids\":[\"qvqokql\",\"jqgir\",\"bwlyvxc\"],\"size\":{\"slug\":\"pqvctsfaeuhwwsk\",\"memory\":1249173279,\"vcpus\":474429241,\"disk\":1395373527,\"transfer\":48.17364,\"price_monthly\":88.572296,\"price_hourly\":97.64631,\"regions\":[\"asupmlppdpg\",\"vzqazvbkarkptg\",\"ngru\",\"tsyiys\"],\"available\":false,\"description\":\"henigbeqngubab\"},\"size_slug\":\"jdeayscse\",\"networks\":{\"v4\":[],\"v6\":[]},\"region\":{\"name\":\"mexmnvk\",\"slug\":\"muwrx\",\"available\":false},\"tags\":[\"wmcpmrrdlhvdvm\"],\"vpc_uuid\":\"hbeae\"}}")
                        .toObject(Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema.class);
        Assertions.assertEquals(2107685565, model.getDroplet().getId());
        Assertions.assertEquals("mmazdnckid", model.getDroplet().getName());
        Assertions.assertEquals(667214082, model.getDroplet().getMemory());
        Assertions.assertEquals(1692252451, model.getDroplet().getVcpus());
        Assertions.assertEquals(1584900231, model.getDroplet().getDisk());
        Assertions.assertEquals(true, model.getDroplet().isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplet().getStatus());
        Assertions.assertEquals(1535611981, model.getDroplet().getKernel().getId());
        Assertions.assertEquals("zbawkikcdgfh", model.getDroplet().getKernel().getName());
        Assertions.assertEquals("sd", model.getDroplet().getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T20:27:29Z"), model.getDroplet().getCreatedAt());
        Assertions.assertEquals("yoqxdedecfiwhag", model.getDroplet().getFeatures().get(0));
        Assertions.assertEquals(1051970725, model.getDroplet().getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-17T22:17:54Z"), model.getDroplet().getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-03T03:14:42Z"), model.getDroplet().getNextBackupWindow().getEnd());
        Assertions.assertEquals(58048223, model.getDroplet().getSnapshotIds().get(0));
        Assertions.assertEquals("xiqqzjkoxdupna", model.getDroplet().getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplet().getImage().getType());
        Assertions.assertEquals(Distribution.FEDORA, model.getDroplet().getImage().getDistribution());
        Assertions.assertEquals("i", model.getDroplet().getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC1, model.getDroplet().getImage().getRegions().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T19:09:21Z"), model.getDroplet().getImage().getCreatedAt());
        Assertions.assertEquals(1944632599, model.getDroplet().getImage().getMinDiskSize());
        Assertions.assertEquals(76.16409F, model.getDroplet().getImage().getSizeGigabytes());
        Assertions.assertEquals("qigdydkghpcvr", model.getDroplet().getImage().getDescription());
        Assertions.assertEquals("rvtktyhhmv", model.getDroplet().getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.RETIRED, model.getDroplet().getImage().getStatus());
        Assertions.assertEquals("pjajodmkrrwe", model.getDroplet().getImage().getErrorMessage());
        Assertions.assertEquals("qvqokql", model.getDroplet().getVolumeIds().get(0));
        Assertions.assertEquals("pqvctsfaeuhwwsk", model.getDroplet().getSize().getSlug());
        Assertions.assertEquals(1249173279, model.getDroplet().getSize().getMemory());
        Assertions.assertEquals(474429241, model.getDroplet().getSize().getVcpus());
        Assertions.assertEquals(1395373527, model.getDroplet().getSize().getDisk());
        Assertions.assertEquals(48.17364f, model.getDroplet().getSize().getTransfer());
        Assertions.assertEquals(88.572296f, model.getDroplet().getSize().getPriceMonthly());
        Assertions.assertEquals(97.64631f, model.getDroplet().getSize().getPriceHourly());
        Assertions.assertEquals("asupmlppdpg", model.getDroplet().getSize().getRegions().get(0));
        Assertions.assertEquals(false, model.getDroplet().getSize().isAvailable());
        Assertions.assertEquals("henigbeqngubab", model.getDroplet().getSize().getDescription());
        Assertions.assertEquals("jdeayscse", model.getDroplet().getSizeSlug());
        Assertions.assertEquals("mexmnvk", model.getDroplet().getRegion().getName());
        Assertions.assertEquals("muwrx", model.getDroplet().getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplet().getRegion().isAvailable());
        Assertions.assertEquals("wmcpmrrdlhvdvm", model.getDroplet().getTags().get(0));
        Assertions.assertEquals("hbeae", model.getDroplet().getVpcUuid());
    }

    @Test
    public void testSerialize() {
        Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema model =
                new Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema()
                        .setDroplet(
                                new Droplet()
                                        .setId(2107685565)
                                        .setName("mmazdnckid")
                                        .setMemory(667214082)
                                        .setVcpus(1692252451)
                                        .setDisk(1584900231)
                                        .setLocked(true)
                                        .setStatus(DropletStatus.ARCHIVE)
                                        .setKernel(
                                                new Kernel().setId(1535611981).setName("zbawkikcdgfh").setVersion("sd"))
                                        .setCreatedAt(OffsetDateTime.parse("2021-09-30T20:27:29Z"))
                                        .setFeatures(Arrays.asList("yoqxdedecfiwhag"))
                                        .setBackupIds(Arrays.asList(1051970725, 906905341, 2026838902, 1433872344))
                                        .setNextBackupWindow(
                                                new DropletNextBackupWindow()
                                                        .setStart(OffsetDateTime.parse("2021-10-17T22:17:54Z"))
                                                        .setEnd(OffsetDateTime.parse("2021-04-03T03:14:42Z")))
                                        .setSnapshotIds(Arrays.asList(58048223, 1535444038, 164034055, 953722289))
                                        .setImage(
                                                new Image()
                                                        .setName("xiqqzjkoxdupna")
                                                        .setType(ImageType.SNAPSHOT)
                                                        .setDistribution(Distribution.FEDORA)
                                                        .setSlug("i")
                                                        .setPublicProperty(true)
                                                        .setRegions(Arrays.asList(RegionSlug.NYC1))
                                                        .setCreatedAt(OffsetDateTime.parse("2021-04-14T19:09:21Z"))
                                                        .setMinDiskSize(1944632599)
                                                        .setSizeGigabytes(76.16409F)
                                                        .setDescription("qigdydkghpcvr")
                                                        .setTags(Arrays.asList("rvtktyhhmv"))
                                                        .setStatus(ImageStatus.RETIRED)
                                                        .setErrorMessage("pjajodmkrrwe"))
                                        .setVolumeIds(Arrays.asList("qvqokql", "jqgir", "bwlyvxc"))
                                        .setSize(
                                                new Size()
                                                        .setSlug("pqvctsfaeuhwwsk")
                                                        .setMemory(1249173279)
                                                        .setVcpus(474429241)
                                                        .setDisk(1395373527)
                                                        .setTransfer(48.17364f)
                                                        .setPriceMonthly(88.572296f)
                                                        .setPriceHourly(97.64631f)
                                                        .setRegions(
                                                                Arrays.asList(
                                                                        "asupmlppdpg",
                                                                        "vzqazvbkarkptg",
                                                                        "ngru",
                                                                        "tsyiys"))
                                                        .setAvailable(false)
                                                        .setDescription("henigbeqngubab"))
                                        .setSizeSlug("jdeayscse")
                                        .setNetworks(
                                                new DropletNetworks().setV4(Arrays.asList()).setV6(Arrays.asList()))
                                        .setRegion(new Region().setName("mexmnvk").setSlug("muwrx").setAvailable(false))
                                        .setTags(Arrays.asList("wmcpmrrdlhvdvm"))
                                        .setVpcUuid("hbeae"));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema.class);
        Assertions.assertEquals(2107685565, model.getDroplet().getId());
        Assertions.assertEquals("mmazdnckid", model.getDroplet().getName());
        Assertions.assertEquals(667214082, model.getDroplet().getMemory());
        Assertions.assertEquals(1692252451, model.getDroplet().getVcpus());
        Assertions.assertEquals(1584900231, model.getDroplet().getDisk());
        Assertions.assertEquals(true, model.getDroplet().isLocked());
        Assertions.assertEquals(DropletStatus.ARCHIVE, model.getDroplet().getStatus());
        Assertions.assertEquals(1535611981, model.getDroplet().getKernel().getId());
        Assertions.assertEquals("zbawkikcdgfh", model.getDroplet().getKernel().getName());
        Assertions.assertEquals("sd", model.getDroplet().getKernel().getVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T20:27:29Z"), model.getDroplet().getCreatedAt());
        Assertions.assertEquals("yoqxdedecfiwhag", model.getDroplet().getFeatures().get(0));
        Assertions.assertEquals(1051970725, model.getDroplet().getBackupIds().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-17T22:17:54Z"), model.getDroplet().getNextBackupWindow().getStart());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-03T03:14:42Z"), model.getDroplet().getNextBackupWindow().getEnd());
        Assertions.assertEquals(58048223, model.getDroplet().getSnapshotIds().get(0));
        Assertions.assertEquals("xiqqzjkoxdupna", model.getDroplet().getImage().getName());
        Assertions.assertEquals(ImageType.SNAPSHOT, model.getDroplet().getImage().getType());
        Assertions.assertEquals(Distribution.FEDORA, model.getDroplet().getImage().getDistribution());
        Assertions.assertEquals("i", model.getDroplet().getImage().getSlug());
        Assertions.assertEquals(true, model.getDroplet().getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC1, model.getDroplet().getImage().getRegions().get(0));
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T19:09:21Z"), model.getDroplet().getImage().getCreatedAt());
        Assertions.assertEquals(1944632599, model.getDroplet().getImage().getMinDiskSize());
        Assertions.assertEquals(76.16409F, model.getDroplet().getImage().getSizeGigabytes());
        Assertions.assertEquals("qigdydkghpcvr", model.getDroplet().getImage().getDescription());
        Assertions.assertEquals("rvtktyhhmv", model.getDroplet().getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.RETIRED, model.getDroplet().getImage().getStatus());
        Assertions.assertEquals("pjajodmkrrwe", model.getDroplet().getImage().getErrorMessage());
        Assertions.assertEquals("qvqokql", model.getDroplet().getVolumeIds().get(0));
        Assertions.assertEquals("pqvctsfaeuhwwsk", model.getDroplet().getSize().getSlug());
        Assertions.assertEquals(1249173279, model.getDroplet().getSize().getMemory());
        Assertions.assertEquals(474429241, model.getDroplet().getSize().getVcpus());
        Assertions.assertEquals(1395373527, model.getDroplet().getSize().getDisk());
        Assertions.assertEquals(48.17364f, model.getDroplet().getSize().getTransfer());
        Assertions.assertEquals(88.572296f, model.getDroplet().getSize().getPriceMonthly());
        Assertions.assertEquals(97.64631f, model.getDroplet().getSize().getPriceHourly());
        Assertions.assertEquals("asupmlppdpg", model.getDroplet().getSize().getRegions().get(0));
        Assertions.assertEquals(false, model.getDroplet().getSize().isAvailable());
        Assertions.assertEquals("henigbeqngubab", model.getDroplet().getSize().getDescription());
        Assertions.assertEquals("jdeayscse", model.getDroplet().getSizeSlug());
        Assertions.assertEquals("mexmnvk", model.getDroplet().getRegion().getName());
        Assertions.assertEquals("muwrx", model.getDroplet().getRegion().getSlug());
        Assertions.assertEquals(false, model.getDroplet().getRegion().isAvailable());
        Assertions.assertEquals("wmcpmrrdlhvdvm", model.getDroplet().getTags().get(0));
        Assertions.assertEquals("hbeae", model.getDroplet().getVpcUuid());
    }
}
