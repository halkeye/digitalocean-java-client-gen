package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumeActionPostBase;
import com.digitalocean.api.models.VolumeActionPostBaseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeActionPostBaseTests {
    @Test
    public void testDeserialize() {
        VolumeActionPostBase model =
                BinaryData.fromString("{\"type\":\"attach\",\"region\":\"fra1\"}").toObject(VolumeActionPostBase.class);
        Assertions.assertEquals(VolumeActionPostBaseType.ATTACH, model.getType());
        Assertions.assertEquals(RegionSlug.FRA1, model.getRegion());
    }

    @Test
    public void testSerialize() {
        VolumeActionPostBase model =
                new VolumeActionPostBase().setType(VolumeActionPostBaseType.ATTACH).setRegion(RegionSlug.FRA1);
        model = BinaryData.fromObject(model).toObject(VolumeActionPostBase.class);
        Assertions.assertEquals(VolumeActionPostBaseType.ATTACH, model.getType());
        Assertions.assertEquals(RegionSlug.FRA1, model.getRegion());
    }
}
