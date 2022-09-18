package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.RegionSlug;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"images\":[{\"id\":1860016569,\"name\":\"jlwyxedzn\",\"type\":\"custom\",\"distribution\":\"Fedora Atomic\",\"slug\":\"ckewvm\",\"public\":false,\"regions\":[\"nyc2\"],\"created_at\":\"2021-04-12T20:33:45Z\",\"min_disk_size\":1502139438,\"size_gigabytes\":86.85179,\"description\":\"z\",\"tags\":[\"xfptofh\"],\"status\":\"NEW\",\"error_message\":\"wezygvadgaaqw\"},{\"id\":1953123532,\"name\":\"pytpmpvdnogehlu\",\"type\":\"custom\",\"distribution\":\"Fedora\",\"slug\":\"nukkfaxzsvb\",\"public\":true,\"regions\":[\"ams1\",\"nyc1\"],\"created_at\":\"2021-04-20T08:59:54Z\",\"min_disk_size\":1058882971,\"size_gigabytes\":38.550133,\"description\":\"flioewyhxe\",\"tags\":[\"vrkdpsqeq\",\"bdxmd\"],\"status\":\"NEW\",\"error_message\":\"rujbjpppktlp\"},{\"id\":539846856,\"name\":\"mthieatnejrnmin\",\"type\":\"backup\",\"distribution\":\"Ubuntu\",\"slug\":\"kihonik\",\"public\":false,\"regions\":[\"ams2\"],\"created_at\":\"2021-07-05T05:36:23Z\",\"min_disk_size\":1008294812,\"size_gigabytes\":54.11325,\"description\":\"pntogkensckh\",\"tags\":[\"armoyf\",\"xkwyk\"],\"status\":\"NEW\",\"error_message\":\"dxlykhkggapvdgt\"}]}").toObject(ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("jlwyxedzn", model.getImages().get(0).getName());
        Assertions.assertEquals(ImageType.CUSTOM, model.getImages().get(0).getType());
        Assertions.assertEquals(Distribution.FEDORA_ATOMIC, model.getImages().get(0).getDistribution());
        Assertions.assertEquals("ckewvm", model.getImages().get(0).getSlug());
        Assertions.assertEquals(false, model.getImages().get(0).isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC2, model.getImages().get(0).getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T20:33:45Z"), model.getImages().get(0).getCreatedAt());
        Assertions.assertEquals(1502139438, model.getImages().get(0).getMinDiskSize());
        Assertions.assertEquals(86.85179F, model.getImages().get(0).getSizeGigabytes());
        Assertions.assertEquals("z", model.getImages().get(0).getDescription());
        Assertions.assertEquals("xfptofh", model.getImages().get(0).getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImages().get(0).getStatus());
        Assertions.assertEquals("wezygvadgaaqw", model.getImages().get(0).getErrorMessage());
    }

    @Test
    public void testSerialize() {
        ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 model = new ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0().setImages(Arrays.asList(new Image().setName("jlwyxedzn").setType(ImageType.CUSTOM).setDistribution(Distribution.FEDORA_ATOMIC).setSlug("ckewvm").setPublicProperty(false).setRegions(Arrays.asList(RegionSlug.NYC2)).setCreatedAt(OffsetDateTime.parse("2021-04-12T20:33:45Z")).setMinDiskSize(1502139438).setSizeGigabytes(86.85179F).setDescription("z").setTags(Arrays.asList("xfptofh")).setStatus(ImageStatus.NEW).setErrorMessage("wezygvadgaaqw"), new Image().setName("pytpmpvdnogehlu").setType(ImageType.CUSTOM).setDistribution(Distribution.FEDORA).setSlug("nukkfaxzsvb").setPublicProperty(true).setRegions(Arrays.asList(RegionSlug.AMS1, RegionSlug.NYC1)).setCreatedAt(OffsetDateTime.parse("2021-04-20T08:59:54Z")).setMinDiskSize(1058882971).setSizeGigabytes(38.550133F).setDescription("flioewyhxe").setTags(Arrays.asList("vrkdpsqeq", "bdxmd")).setStatus(ImageStatus.NEW).setErrorMessage("rujbjpppktlp"), new Image().setName("mthieatnejrnmin").setType(ImageType.BACKUP).setDistribution(Distribution.UBUNTU).setSlug("kihonik").setPublicProperty(false).setRegions(Arrays.asList(RegionSlug.AMS2)).setCreatedAt(OffsetDateTime.parse("2021-07-05T05:36:23Z")).setMinDiskSize(1008294812).setSizeGigabytes(54.11325F).setDescription("pntogkensckh").setTags(Arrays.asList("armoyf", "xkwyk")).setStatus(ImageStatus.NEW).setErrorMessage("dxlykhkggapvdgt")));
        model = BinaryData.fromObject(model).toObject(ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("jlwyxedzn", model.getImages().get(0).getName());
        Assertions.assertEquals(ImageType.CUSTOM, model.getImages().get(0).getType());
        Assertions.assertEquals(Distribution.FEDORA_ATOMIC, model.getImages().get(0).getDistribution());
        Assertions.assertEquals("ckewvm", model.getImages().get(0).getSlug());
        Assertions.assertEquals(false, model.getImages().get(0).isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC2, model.getImages().get(0).getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T20:33:45Z"), model.getImages().get(0).getCreatedAt());
        Assertions.assertEquals(1502139438, model.getImages().get(0).getMinDiskSize());
        Assertions.assertEquals(86.85179F, model.getImages().get(0).getSizeGigabytes());
        Assertions.assertEquals("z", model.getImages().get(0).getDescription());
        Assertions.assertEquals("xfptofh", model.getImages().get(0).getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImages().get(0).getStatus());
        Assertions.assertEquals("wezygvadgaaqw", model.getImages().get(0).getErrorMessage());
    }
}
