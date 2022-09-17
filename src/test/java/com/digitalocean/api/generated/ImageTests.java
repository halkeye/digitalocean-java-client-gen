package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.RegionSlug;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageTests {
    @Test
    public void testDeserialize() {
        Image model =
                BinaryData.fromString(
                                "{\"id\":449104692,\"name\":\"wnf\",\"type\":\"backup\",\"distribution\":\"Unknown\",\"slug\":\"zsinqbdnddb\",\"public\":true,\"regions\":[\"sfo2\",\"tor1\"],\"created_at\":\"2021-06-11T00:23Z\",\"min_disk_size\":1283788447,\"size_gigabytes\":12.315691,\"description\":\"rchwudlxeei\",\"tags\":[\"mnoejhqlfmsib\",\"oyrfgxk\",\"dpmypgfqvmtywh\"],\"status\":\"NEW\",\"error_message\":\"p\"}")
                        .toObject(Image.class);
        Assertions.assertEquals("wnf", model.getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getType());
        Assertions.assertEquals(Distribution.UNKNOWN, model.getDistribution());
        Assertions.assertEquals("zsinqbdnddb", model.getSlug());
        Assertions.assertEquals(true, model.isPublicProperty());
        Assertions.assertEquals(RegionSlug.SFO2, model.getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T00:23Z"), model.getCreatedAt());
        Assertions.assertEquals(1283788447, model.getMinDiskSize());
        Assertions.assertEquals(12.315691F, model.getSizeGigabytes());
        Assertions.assertEquals("rchwudlxeei", model.getDescription());
        Assertions.assertEquals("mnoejhqlfmsib", model.getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getStatus());
        Assertions.assertEquals("p", model.getErrorMessage());
    }

    @Test
    public void testSerialize() {
        Image model =
                new Image()
                        .setName("wnf")
                        .setType(ImageType.BACKUP)
                        .setDistribution(Distribution.UNKNOWN)
                        .setSlug("zsinqbdnddb")
                        .setPublicProperty(true)
                        .setRegions(Arrays.asList(RegionSlug.SFO2, RegionSlug.TOR1))
                        .setCreatedAt(OffsetDateTime.parse("2021-06-11T00:23Z"))
                        .setMinDiskSize(1283788447)
                        .setSizeGigabytes(12.315691F)
                        .setDescription("rchwudlxeei")
                        .setTags(Arrays.asList("mnoejhqlfmsib", "oyrfgxk", "dpmypgfqvmtywh"))
                        .setStatus(ImageStatus.NEW)
                        .setErrorMessage("p");
        model = BinaryData.fromObject(model).toObject(Image.class);
        Assertions.assertEquals("wnf", model.getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getType());
        Assertions.assertEquals(Distribution.UNKNOWN, model.getDistribution());
        Assertions.assertEquals("zsinqbdnddb", model.getSlug());
        Assertions.assertEquals(true, model.isPublicProperty());
        Assertions.assertEquals(RegionSlug.SFO2, model.getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T00:23Z"), model.getCreatedAt());
        Assertions.assertEquals(1283788447, model.getMinDiskSize());
        Assertions.assertEquals(12.315691F, model.getSizeGigabytes());
        Assertions.assertEquals("rchwudlxeei", model.getDescription());
        Assertions.assertEquals("mnoejhqlfmsib", model.getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getStatus());
        Assertions.assertEquals("p", model.getErrorMessage());
    }
}
