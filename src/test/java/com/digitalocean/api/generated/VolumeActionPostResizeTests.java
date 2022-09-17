package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumeActionPostBaseType;
import com.digitalocean.api.models.VolumeActionPostResize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeActionPostResizeTests {
    @Test
    public void testDeserialize() {
        VolumeActionPostResize model =
                BinaryData.fromString("{\"size_gigabytes\":886528539,\"type\":\"attach\",\"region\":\"sfo1\"}")
                        .toObject(VolumeActionPostResize.class);
        Assertions.assertEquals(VolumeActionPostBaseType.ATTACH, model.getType());
        Assertions.assertEquals(RegionSlug.SFO1, model.getRegion());
        Assertions.assertEquals(886528539, model.getSizeGigabytes());
    }

    @Test
    public void testSerialize() {
        VolumeActionPostResize model =
                new VolumeActionPostResize()
                        .setType(VolumeActionPostBaseType.ATTACH)
                        .setRegion(RegionSlug.SFO1)
                        .setSizeGigabytes(886528539);
        model = BinaryData.fromObject(model).toObject(VolumeActionPostResize.class);
        Assertions.assertEquals(VolumeActionPostBaseType.ATTACH, model.getType());
        Assertions.assertEquals(RegionSlug.SFO1, model.getRegion());
        Assertions.assertEquals(886528539, model.getSizeGigabytes());
    }
}
