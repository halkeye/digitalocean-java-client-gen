package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumesXfs;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumesXfsTests {
    @Test
    public void testDeserialize() {
        VolumesXfs model =
                BinaryData.fromString(
                                "{\"filesystem_type\":\"XFS\",\"region\":\"ams2\",\"id\":\"cqxmyvkxixy\",\"droplet_ids\":[889572935],\"name\":\"jczgohv\",\"description\":\"uw\",\"size_gigabytes\":1806390956,\"created_at\":\"xczbyfkoc\",\"tags\":[\"dctsnlwscrngt\"],\"snapshot_id\":\"xrolwvplksdksuta\"}")
                        .toObject(VolumesXfs.class);
        Assertions.assertEquals(RegionSlug.AMS2, model.getRegion());
        Assertions.assertEquals("jczgohv", model.getName());
        Assertions.assertEquals("uw", model.getDescription());
        Assertions.assertEquals(1806390956, model.getSizeGigabytes());
        Assertions.assertEquals("dctsnlwscrngt", model.getTags().get(0));
        Assertions.assertEquals("xrolwvplksdksuta", model.getSnapshotId());
    }

    @Test
    public void testSerialize() {
        VolumesXfs model =
                new VolumesXfs()
                        .setRegion(RegionSlug.AMS2)
                        .setName("jczgohv")
                        .setDescription("uw")
                        .setSizeGigabytes(1806390956)
                        .setTags(Arrays.asList("dctsnlwscrngt"))
                        .setSnapshotId("xrolwvplksdksuta");
        model = BinaryData.fromObject(model).toObject(VolumesXfs.class);
        Assertions.assertEquals(RegionSlug.AMS2, model.getRegion());
        Assertions.assertEquals("jczgohv", model.getName());
        Assertions.assertEquals("uw", model.getDescription());
        Assertions.assertEquals(1806390956, model.getSizeGigabytes());
        Assertions.assertEquals("dctsnlwscrngt", model.getTags().get(0));
        Assertions.assertEquals("xrolwvplksdksuta", model.getSnapshotId());
    }
}
