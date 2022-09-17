package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.RegionSlug;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1956443482},\"images\":[{\"id\":1110235054,\"name\":\"asyntv\",\"type\":\"base\",\"distribution\":\"openSUSE\",\"slug\":\"bqrvvbqv\",\"public\":false,\"regions\":[\"nyc1\",\"fra1\",\"ams3\",\"ams2\"],\"created_at\":\"2021-03-31T02:39:34Z\",\"min_disk_size\":1717431509,\"size_gigabytes\":87.35843,\"description\":\"bn\",\"tags\":[\"tlpwqpjnxjkhtups\",\"yo\"],\"status\":\"NEW\",\"error_message\":\"iyxfwkztsmsfbevy\"},{\"id\":104163747,\"name\":\"fhkqytkzta\",\"type\":\"custom\",\"distribution\":\"FreeBSD\",\"slug\":\"dgjfc\",\"public\":false,\"regions\":[\"sfo3\"],\"created_at\":\"2021-05-10T22:19:32Z\",\"min_disk_size\":186442409,\"size_gigabytes\":47.283424,\"description\":\"kzju\",\"tags\":[\"ajquzxpixhyoi\",\"nfdbgsoscienezf\"],\"status\":\"retired\",\"error_message\":\"n\"},{\"id\":1930243338,\"name\":\"pjnrtekwwnthro\",\"type\":\"backup\",\"distribution\":\"Gentoo\",\"slug\":\"yiurztvktjh\",\"public\":false,\"regions\":[\"sfo2\"],\"created_at\":\"2021-11-10T06:53:54Z\",\"min_disk_size\":195067521,\"size_gigabytes\":57.997356,\"description\":\"gaghpuzxkpyehh\",\"tags\":[\"ldhg\",\"edzfzqiyuqhtdere\"],\"status\":\"retired\",\"error_message\":\"a\"}]}")
                        .toObject(ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema.class);
        Assertions.assertEquals("asyntv", model.getImages().get(0).getName());
        Assertions.assertEquals(ImageType.BASE, model.getImages().get(0).getType());
        Assertions.assertEquals(Distribution.OPEN_SUSE, model.getImages().get(0).getDistribution());
        Assertions.assertEquals("bqrvvbqv", model.getImages().get(0).getSlug());
        Assertions.assertEquals(false, model.getImages().get(0).isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC1, model.getImages().get(0).getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T02:39:34Z"), model.getImages().get(0).getCreatedAt());
        Assertions.assertEquals(1717431509, model.getImages().get(0).getMinDiskSize());
        Assertions.assertEquals(87.35843F, model.getImages().get(0).getSizeGigabytes());
        Assertions.assertEquals("bn", model.getImages().get(0).getDescription());
        Assertions.assertEquals("tlpwqpjnxjkhtups", model.getImages().get(0).getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImages().get(0).getStatus());
        Assertions.assertEquals("iyxfwkztsmsfbevy", model.getImages().get(0).getErrorMessage());
        Assertions.assertEquals(1956443482, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema model =
                new ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema()
                        .setImages(
                                Arrays.asList(
                                        new Image()
                                                .setName("asyntv")
                                                .setType(ImageType.BASE)
                                                .setDistribution(Distribution.OPEN_SUSE)
                                                .setSlug("bqrvvbqv")
                                                .setPublicProperty(false)
                                                .setRegions(
                                                        Arrays.asList(
                                                                RegionSlug.NYC1,
                                                                RegionSlug.FRA1,
                                                                RegionSlug.AMS3,
                                                                RegionSlug.AMS2))
                                                .setCreatedAt(OffsetDateTime.parse("2021-03-31T02:39:34Z"))
                                                .setMinDiskSize(1717431509)
                                                .setSizeGigabytes(87.35843F)
                                                .setDescription("bn")
                                                .setTags(Arrays.asList("tlpwqpjnxjkhtups", "yo"))
                                                .setStatus(ImageStatus.NEW)
                                                .setErrorMessage("iyxfwkztsmsfbevy"),
                                        new Image()
                                                .setName("fhkqytkzta")
                                                .setType(ImageType.CUSTOM)
                                                .setDistribution(Distribution.FREE_BSD)
                                                .setSlug("dgjfc")
                                                .setPublicProperty(false)
                                                .setRegions(Arrays.asList(RegionSlug.SFO3))
                                                .setCreatedAt(OffsetDateTime.parse("2021-05-10T22:19:32Z"))
                                                .setMinDiskSize(186442409)
                                                .setSizeGigabytes(47.283424F)
                                                .setDescription("kzju")
                                                .setTags(Arrays.asList("ajquzxpixhyoi", "nfdbgsoscienezf"))
                                                .setStatus(ImageStatus.RETIRED)
                                                .setErrorMessage("n"),
                                        new Image()
                                                .setName("pjnrtekwwnthro")
                                                .setType(ImageType.BACKUP)
                                                .setDistribution(Distribution.GENTOO)
                                                .setSlug("yiurztvktjh")
                                                .setPublicProperty(false)
                                                .setRegions(Arrays.asList(RegionSlug.SFO2))
                                                .setCreatedAt(OffsetDateTime.parse("2021-11-10T06:53:54Z"))
                                                .setMinDiskSize(195067521)
                                                .setSizeGigabytes(57.997356F)
                                                .setDescription("gaghpuzxkpyehh")
                                                .setTags(Arrays.asList("ldhg", "edzfzqiyuqhtdere"))
                                                .setStatus(ImageStatus.RETIRED)
                                                .setErrorMessage("a")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1956443482));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsC9IahpResponsesAllImagesContentApplicationJsonSchema.class);
        Assertions.assertEquals("asyntv", model.getImages().get(0).getName());
        Assertions.assertEquals(ImageType.BASE, model.getImages().get(0).getType());
        Assertions.assertEquals(Distribution.OPEN_SUSE, model.getImages().get(0).getDistribution());
        Assertions.assertEquals("bqrvvbqv", model.getImages().get(0).getSlug());
        Assertions.assertEquals(false, model.getImages().get(0).isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC1, model.getImages().get(0).getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T02:39:34Z"), model.getImages().get(0).getCreatedAt());
        Assertions.assertEquals(1717431509, model.getImages().get(0).getMinDiskSize());
        Assertions.assertEquals(87.35843F, model.getImages().get(0).getSizeGigabytes());
        Assertions.assertEquals("bn", model.getImages().get(0).getDescription());
        Assertions.assertEquals("tlpwqpjnxjkhtups", model.getImages().get(0).getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImages().get(0).getStatus());
        Assertions.assertEquals("iyxfwkztsmsfbevy", model.getImages().get(0).getErrorMessage());
        Assertions.assertEquals(1956443482, model.getMeta().getTotal());
    }
}
