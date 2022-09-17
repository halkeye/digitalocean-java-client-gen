package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.Image;
import com.digitalocean.api.models.ImageStatus;
import com.digitalocean.api.models.ImageType;
import com.digitalocean.api.models.RegionSlug;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"image\":{\"id\":788500253,\"name\":\"jmxptueipuugk\",\"type\":\"admin\",\"distribution\":\"Debian\",\"slug\":\"pahu\",\"public\":true,\"regions\":[\"fra1\",\"nyc1\",\"nyc2\",\"ams1\"],\"created_at\":\"2021-06-16T17:24:14Z\",\"min_disk_size\":1297064297,\"size_gigabytes\":51.41658,\"description\":\"xjoegcjojlleuidp\",\"tags\":[\"nvhgnhtmeplh\",\"pjbap\",\"ummmkvavucgji\"],\"status\":\"retired\",\"error_message\":\"pmn\"}}")
                        .toObject(Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("jmxptueipuugk", model.getImage().getName());
        Assertions.assertEquals(ImageType.ADMIN, model.getImage().getType());
        Assertions.assertEquals(Distribution.DEBIAN, model.getImage().getDistribution());
        Assertions.assertEquals("pahu", model.getImage().getSlug());
        Assertions.assertEquals(true, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.FRA1, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T17:24:14Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(1297064297, model.getImage().getMinDiskSize());
        Assertions.assertEquals(51.41658F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("xjoegcjojlleuidp", model.getImage().getDescription());
        Assertions.assertEquals("nvhgnhtmeplh", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.RETIRED, model.getImage().getStatus());
        Assertions.assertEquals("pmn", model.getImage().getErrorMessage());
    }

    @Test
    public void testSerialize() {
        Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema model =
                new Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema()
                        .setImage(
                                new Image()
                                        .setName("jmxptueipuugk")
                                        .setType(ImageType.ADMIN)
                                        .setDistribution(Distribution.DEBIAN)
                                        .setSlug("pahu")
                                        .setPublicProperty(true)
                                        .setRegions(
                                                Arrays.asList(
                                                        RegionSlug.FRA1,
                                                        RegionSlug.NYC1,
                                                        RegionSlug.NYC2,
                                                        RegionSlug.AMS1))
                                        .setCreatedAt(OffsetDateTime.parse("2021-06-16T17:24:14Z"))
                                        .setMinDiskSize(1297064297)
                                        .setSizeGigabytes(51.41658F)
                                        .setDescription("xjoegcjojlleuidp")
                                        .setTags(Arrays.asList("nvhgnhtmeplh", "pjbap", "ummmkvavucgji"))
                                        .setStatus(ImageStatus.RETIRED)
                                        .setErrorMessage("pmn"));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Ef5H32ResponsesNewCustomImageContentApplicationJsonSchema.class);
        Assertions.assertEquals("jmxptueipuugk", model.getImage().getName());
        Assertions.assertEquals(ImageType.ADMIN, model.getImage().getType());
        Assertions.assertEquals(Distribution.DEBIAN, model.getImage().getDistribution());
        Assertions.assertEquals("pahu", model.getImage().getSlug());
        Assertions.assertEquals(true, model.getImage().isPublicProperty());
        Assertions.assertEquals(RegionSlug.FRA1, model.getImage().getRegions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T17:24:14Z"), model.getImage().getCreatedAt());
        Assertions.assertEquals(1297064297, model.getImage().getMinDiskSize());
        Assertions.assertEquals(51.41658F, model.getImage().getSizeGigabytes());
        Assertions.assertEquals("xjoegcjojlleuidp", model.getImage().getDescription());
        Assertions.assertEquals("nvhgnhtmeplh", model.getImage().getTags().get(0));
        Assertions.assertEquals(ImageStatus.RETIRED, model.getImage().getStatus());
        Assertions.assertEquals("pmn", model.getImage().getErrorMessage());
    }
}
