package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VolumesExt4;
import com.digitalocean.api.models.VolumesXfs;
import com.digitalocean.api.models.VolumeWriteFileSystemType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeWriteFileSystemTypeTests {
    @Test
    public void testDeserialize() {
        VolumeWriteFileSystemType model = BinaryData.fromString("{\"filesystem_type\":\"VolumeWriteFileSystemType\"}").toObject(VolumeWriteFileSystemType.class);
    }

    @Test
    public void testSerialize() {
        VolumeWriteFileSystemType model = new VolumeWriteFileSystemType();
        model = BinaryData.fromObject(model).toObject(VolumeWriteFileSystemType.class);
    }
}
