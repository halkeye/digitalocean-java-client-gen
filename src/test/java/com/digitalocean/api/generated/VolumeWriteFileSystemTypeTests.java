package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VolumeWriteFileSystemType;
import org.junit.jupiter.api.Test;

public final class VolumeWriteFileSystemTypeTests {
    @Test
    public void testDeserialize() {
        VolumeWriteFileSystemType model =
                BinaryData.fromString("{\"filesystem_type\":\"VolumeWriteFileSystemType\"}")
                        .toObject(VolumeWriteFileSystemType.class);
    }

    @Test
    public void testSerialize() {
        VolumeWriteFileSystemType model = new VolumeWriteFileSystemType();
        model = BinaryData.fromObject(model).toObject(VolumeWriteFileSystemType.class);
    }
}
