package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumeActionPostBaseType;
import com.digitalocean.api.models.VolumeActionPostDetach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeActionPostDetachTests {
    @Test
    public void testDeserialize() {
        VolumeActionPostDetach model =
                BinaryData.fromString("{\"droplet_id\":1430269552,\"type\":\"resize\",\"region\":\"ams2\"}")
                        .toObject(VolumeActionPostDetach.class);
        Assertions.assertEquals(VolumeActionPostBaseType.RESIZE, model.getType());
        Assertions.assertEquals(RegionSlug.AMS2, model.getRegion());
        Assertions.assertEquals(1430269552, model.getDropletId());
    }

    @Test
    public void testSerialize() {
        VolumeActionPostDetach model =
                new VolumeActionPostDetach()
                        .setType(VolumeActionPostBaseType.RESIZE)
                        .setRegion(RegionSlug.AMS2)
                        .setDropletId(1430269552);
        model = BinaryData.fromObject(model).toObject(VolumeActionPostDetach.class);
        Assertions.assertEquals(VolumeActionPostBaseType.RESIZE, model.getType());
        Assertions.assertEquals(RegionSlug.AMS2, model.getRegion());
        Assertions.assertEquals(1430269552, model.getDropletId());
    }
}
