package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * The VolumeWriteFileSystemType model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "filesystem_type", defaultImpl = VolumeWriteFileSystemType.class)
@JsonTypeName("VolumeWriteFileSystemType")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "EXT4", value = VolumesExt4.class),
    @JsonSubTypes.Type(name = "XFS", value = VolumesXfs.class)
})
@Immutable
public class VolumeWriteFileSystemType {
}
