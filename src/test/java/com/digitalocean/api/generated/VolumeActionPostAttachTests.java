package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumeActionPostAttach;
import com.digitalocean.api.models.VolumeActionPostBaseType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeActionPostAttachTests {
    @Test
    public void testDeserialize() {
        VolumeActionPostAttach model =
                BinaryData.fromString(
                                "{\"droplet_id\":907339794,\"tags\":[\"zf\"],\"type\":\"resize\",\"region\":\"nyc3\"}")
                        .toObject(VolumeActionPostAttach.class);
        Assertions.assertEquals(VolumeActionPostBaseType.RESIZE, model.getType());
        Assertions.assertEquals(RegionSlug.NYC3, model.getRegion());
        Assertions.assertEquals(907339794, model.getDropletId());
        Assertions.assertEquals("zf", model.getTags().get(0));
    }

    @Test
    public void testSerialize() {
        VolumeActionPostAttach model =
                new VolumeActionPostAttach()
                        .setType(VolumeActionPostBaseType.RESIZE)
                        .setRegion(RegionSlug.NYC3)
                        .setDropletId(907339794)
                        .setTags(Arrays.asList("zf"));
        model = BinaryData.fromObject(model).toObject(VolumeActionPostAttach.class);
        Assertions.assertEquals(VolumeActionPostBaseType.RESIZE, model.getType());
        Assertions.assertEquals(RegionSlug.NYC3, model.getRegion());
        Assertions.assertEquals(907339794, model.getDropletId());
        Assertions.assertEquals("zf", model.getTags().get(0));
    }
}
