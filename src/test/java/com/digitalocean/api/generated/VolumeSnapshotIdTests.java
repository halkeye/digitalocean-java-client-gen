package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VolumeSnapshotId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeSnapshotIdTests {
    @Test
    public void testDeserialize() {
        VolumeSnapshotId model = BinaryData.fromString("{\"snapshot_id\":\"g\"}").toObject(VolumeSnapshotId.class);
        Assertions.assertEquals("g", model.getSnapshotId());
    }

    @Test
    public void testSerialize() {
        VolumeSnapshotId model = new VolumeSnapshotId().setSnapshotId("g");
        model = BinaryData.fromObject(model).toObject(VolumeSnapshotId.class);
        Assertions.assertEquals("g", model.getSnapshotId());
    }
}
