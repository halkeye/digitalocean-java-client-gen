package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The DropletActionResize model.
 */
@Fluent
public final class DropletActionResize extends DropletAction {
    /*
     * When `true`, the Droplet's disk will be resized in addition to its RAM and CPU. This is a permanent change and
     * cannot be reversed as a Droplet's disk size cannot be decreased.
     */
    @JsonProperty(value = "disk")
    private Boolean disk;

    /*
     * The slug identifier for the size to which you wish to resize the Droplet.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Get the disk property: When `true`, the Droplet's disk will be resized in addition to its RAM and CPU. This is a
     * permanent change and cannot be reversed as a Droplet's disk size cannot be decreased.
     * 
     * @return the disk value.
     */
    public Boolean isDisk() {
        return this.disk;
    }

    /**
     * Set the disk property: When `true`, the Droplet's disk will be resized in addition to its RAM and CPU. This is a
     * permanent change and cannot be reversed as a Droplet's disk size cannot be decreased.
     * 
     * @param disk the disk value to set.
     * @return the DropletActionResize object itself.
     */
    public DropletActionResize setDisk(Boolean disk) {
        this.disk = disk;
        return this;
    }

    /**
     * Get the size property: The slug identifier for the size to which you wish to resize the Droplet.
     * 
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: The slug identifier for the size to which you wish to resize the Droplet.
     * 
     * @param size the size value to set.
     * @return the DropletActionResize object itself.
     */
    public DropletActionResize setSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletActionResize setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
