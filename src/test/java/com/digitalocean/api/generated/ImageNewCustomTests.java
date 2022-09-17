package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Distribution;
import com.digitalocean.api.models.ImageNewCustom;
import com.digitalocean.api.models.RegionSlug;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageNewCustomTests {
    @Test
    public void testDeserialize() {
        ImageNewCustom model =
                BinaryData.fromString(
                                "{\"url\":\"peerscd\",\"region\":\"blr1\",\"tags\":[\"njrcuf\"],\"name\":\"gacnrgfdtncmsp\",\"distribution\":\"Arch Linux\",\"description\":\"ame\"}")
                        .toObject(ImageNewCustom.class);
        Assertions.assertEquals("gacnrgfdtncmsp", model.getName());
        Assertions.assertEquals(Distribution.ARCH_LINUX, model.getDistribution());
        Assertions.assertEquals("ame", model.getDescription());
        Assertions.assertEquals("peerscd", model.getUrl());
        Assertions.assertEquals(RegionSlug.BLR1, model.getRegion());
        Assertions.assertEquals("njrcuf", model.getTags().get(0));
    }

    @Test
    public void testSerialize() {
        ImageNewCustom model =
                new ImageNewCustom()
                        .setName("gacnrgfdtncmsp")
                        .setDistribution(Distribution.ARCH_LINUX)
                        .setDescription("ame")
                        .setUrl("peerscd")
                        .setRegion(RegionSlug.BLR1)
                        .setTags(Arrays.asList("njrcuf"));
        model = BinaryData.fromObject(model).toObject(ImageNewCustom.class);
        Assertions.assertEquals("gacnrgfdtncmsp", model.getName());
        Assertions.assertEquals(Distribution.ARCH_LINUX, model.getDistribution());
        Assertions.assertEquals("ame", model.getDescription());
        Assertions.assertEquals("peerscd", model.getUrl());
        Assertions.assertEquals(RegionSlug.BLR1, model.getRegion());
        Assertions.assertEquals("njrcuf", model.getTags().get(0));
    }
}
