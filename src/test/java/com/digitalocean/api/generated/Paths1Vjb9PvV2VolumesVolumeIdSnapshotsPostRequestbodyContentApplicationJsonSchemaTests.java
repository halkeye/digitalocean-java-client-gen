package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"name\":\"df\",\"tags\":[\"tw\",\"dpsegivytabvbbk\"]}")
                        .toObject(
                                Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("df", model.getName());
        Assertions.assertEquals("tw", model.getTags().get(0));
    }

    @Test
    public void testSerialize() {
        Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema model =
                new Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema()
                        .setName("df")
                        .setTags(Arrays.asList("tw", "dpsegivytabvbbk"));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("df", model.getName());
        Assertions.assertEquals("tw", model.getTags().get(0));
    }
}
