package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The VolumeActionPostBase model.
 */
@Fluent
public class VolumeActionPostBase {
    /*
     * The volume action to initiate.
     */
    @JsonProperty(value = "type", required = true)
    private VolumeActionPostBaseType type;

    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region")
    private RegionSlug region;

    /**
     * Get the type property: The volume action to initiate.
     * 
     * @return the type value.
     */
    public VolumeActionPostBaseType getType() {
        return this.type;
    }

    /**
     * Set the type property: The volume action to initiate.
     * 
     * @param type the type value to set.
     * @return the VolumeActionPostBase object itself.
     */
    public VolumeActionPostBase setType(VolumeActionPostBaseType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @return the region value.
     */
    public RegionSlug getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @param region the region value to set.
     * @return the VolumeActionPostBase object itself.
     */
    public VolumeActionPostBase setRegion(RegionSlug region) {
        this.region = region;
        return this;
    }
}
