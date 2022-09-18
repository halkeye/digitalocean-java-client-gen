package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The VolumeFull model.
 */
@Fluent
public final class VolumeFull extends VolumeBase {
    /*
     * The region property.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private VolumeFullRegion region;

    /*
     * The type of filesystem currently in-use on the volume.
     */
    @JsonProperty(value = "filesystem_type")
    private String filesystemType;

    /*
     * The label currently applied to the filesystem.
     */
    @JsonProperty(value = "filesystem_label")
    private String filesystemLabel;

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    public VolumeFullRegion getRegion() {
        return this.region;
    }

    /**
     * Get the filesystemType property: The type of filesystem currently in-use on the volume.
     * 
     * @return the filesystemType value.
     */
    public String getFilesystemType() {
        return this.filesystemType;
    }

    /**
     * Set the filesystemType property: The type of filesystem currently in-use on the volume.
     * 
     * @param filesystemType the filesystemType value to set.
     * @return the VolumeFull object itself.
     */
    public VolumeFull setFilesystemType(String filesystemType) {
        this.filesystemType = filesystemType;
        return this;
    }

    /**
     * Get the filesystemLabel property: The label currently applied to the filesystem.
     * 
     * @return the filesystemLabel value.
     */
    public String getFilesystemLabel() {
        return this.filesystemLabel;
    }

    /**
     * Set the filesystemLabel property: The label currently applied to the filesystem.
     * 
     * @param filesystemLabel the filesystemLabel value to set.
     * @return the VolumeFull object itself.
     */
    public VolumeFull setFilesystemLabel(String filesystemLabel) {
        this.filesystemLabel = filesystemLabel;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFull setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFull setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFull setSizeGigabytes(Integer sizeGigabytes) {
        super.setSizeGigabytes(sizeGigabytes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFull setTags(List<String> tags) {
        super.setTags(tags);
        return this;
    }
}
