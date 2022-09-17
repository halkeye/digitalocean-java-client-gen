package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.RegionSlug;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"image\":{\"id\":1029640500,\"name\":\"uafixlxicwgp\",\"type\":\"backup\",\"distribution\":\"CoreOS\",\"slug\":\"fzcfasf\",\"public\":true,\"regions\":[\"lon1\",\"sgp1\"],\"created_at\":\"2021-08-14T07:16:23Z\",\"min_disk_size\":481798837,\"size_gigabytes\":89.90823,\"description\":\"skwgqr\",\"tags\":[\"umdrcjlvkrkegty\"],\"status\":\"available\",\"error_message\":\"piyxlzmiydd\"}}")
                        .toObject(Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("uafixlxicwgp", model.getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getImage().getType());
        Assertions.assertEquals(Distribution.CORE_OS, model.getImage().getDistribution());
        Assertions.assertEquals("fzcfasf", model.getImage().getSlug());
        Assertions.assertEquals(true, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.LON1, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-14T07:16:23Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(481798837, model.getImage().getMinDiskSize());
        Assertions.assertEquals(89.90823F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("skwgqr", model.getImage().getDescription());
        Assertions.assertEquals("umdrcjlvkrkegty", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.AVAILABLE, model.getImage().getStatus());
        Assertions.assertEquals("piyxlzmiydd", model.getImage().getErrorMessage());
    }

    @Test
    public void testSerialize() {
        Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema model =
                new Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema()
                        .setImage(
                                new Image()
                                        .setName("uafixlxicwgp")
                                        .setType(ImageType.BACKUP)
                                        .setDistribution(Distribution.CORE_OS)
                                        .setSlug("fzcfasf")
                                        .setPublicProperty(true)
                                        .setRegions(Arrays.asList(RegionSlug.LON1, RegionSlug.SGP1))
                                        .setCreatedAt(OffsetDateTime.parse("2021-08-14T07:16:23Z"))
                                        .setMinDiskSize(481798837)
                                        .setSizeGigabytes(89.90823F)
                                        .setDescription("skwgqr")
                                        .setTags(Arrays.asList("umdrcjlvkrkegty"))
                                        .setStatus(ImageStatus.AVAILABLE)
                                        .setErrorMessage("piyxlzmiydd"));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1WaekvrResponsesUpdatedImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("uafixlxicwgp", model.getImage().getName());
        Assertions.assertEquals(ImageType.BACKUP, model.getImage().getType());
        Assertions.assertEquals(Distribution.CORE_OS, model.getImage().getDistribution());
        Assertions.assertEquals("fzcfasf", model.getImage().getSlug());
        Assertions.assertEquals(true, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.LON1, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-14T07:16:23Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(481798837, model.getImage().getMinDiskSize());
        Assertions.assertEquals(89.90823F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("skwgqr", model.getImage().getDescription());
        Assertions.assertEquals("umdrcjlvkrkegty", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.AVAILABLE, model.getImage().getStatus());
        Assertions.assertEquals("piyxlzmiydd", model.getImage().getErrorMessage());
    }
}
