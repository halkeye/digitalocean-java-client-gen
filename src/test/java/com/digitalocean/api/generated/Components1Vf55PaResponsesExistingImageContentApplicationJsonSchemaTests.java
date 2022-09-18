package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.RegionSlug;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Vf55PaResponsesExistingImageContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema model = BinaryData.fromString("{\"image\":{\"id\":1431651894,\"name\":\"rchxwwuzdmhvwl\",\"type\":\"backup\",\"distribution\":\"RancherOS\",\"slug\":\"mlitqdsj\",\"public\":false,\"regions\":[\"nyc3\",\"sfo2\"],\"created_at\":\"2021-02-28T22:25:44Z\",\"min_disk_size\":181599105,\"size_gigabytes\":38.409676,\"description\":\"ifefndslv\",\"tags\":[\"emwsieeailwdq\",\"qfy\"],\"status\":\"NEW\",\"error_message\":\"mfxlkdlgwgnamkuu\"}}").toObject(Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("rchxwwuzdmhvwl", model.getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getImage().getType());
        Assertions.assertEquals(Distribution.RANCHER_OS, model.getImage().getDistribution());
        Assertions.assertEquals("mlitqdsj", model.getImage().getSlug());
        Assertions.assertEquals(false, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC3, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-28T22:25:44Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(181599105, model.getImage().getMinDiskSize());
        Assertions.assertEquals(38.409676F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("ifefndslv", model.getImage().getDescription());
        Assertions.assertEquals("emwsieeailwdq", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImage().getStatus());
        Assertions.assertEquals("mfxlkdlgwgnamkuu", model.getImage().getErrorMessage());
    }

    @Test
    public void testSerialize() {
        Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema model = new Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema().setImage(new Image().setName("rchxwwuzdmhvwl").setType(ImageType.BACKUP).setDistribution(Distribution.RANCHER_OS).setSlug("mlitqdsj").setPublicProperty(false).setRegions(Arrays.asList(RegionSlug.NYC3, RegionSlug.SFO2)).setCreatedAt(OffsetDateTime.parse("2021-02-28T22:25:44Z")).setMinDiskSize(181599105).setSizeGigabytes(38.409676F).setDescription("ifefndslv").setTags(Arrays.asList("emwsieeailwdq", "qfy")).setStatus(ImageStatus.NEW).setErrorMessage("mfxlkdlgwgnamkuu"));
        model = BinaryData.fromObject(model).toObject(Components1Vf55PaResponsesExistingImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("rchxwwuzdmhvwl", model.getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getImage().getType());
        Assertions.assertEquals(Distribution.RANCHER_OS, model.getImage().getDistribution());
        Assertions.assertEquals("mlitqdsj", model.getImage().getSlug());
        Assertions.assertEquals(false, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.NYC3, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-28T22:25:44Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(181599105, model.getImage().getMinDiskSize());
        Assertions.assertEquals(38.409676F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("ifefndslv", model.getImage().getDescription());
        Assertions.assertEquals("emwsieeailwdq", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.NEW, model.getImage().getStatus());
        Assertions.assertEquals("mfxlkdlgwgnamkuu", model.getImage().getErrorMessage());
    }
}
