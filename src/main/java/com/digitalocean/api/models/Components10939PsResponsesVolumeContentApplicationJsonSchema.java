package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components10939PsResponsesVolumeContentApplicationJsonSchema model.
 */
@Fluent
public final class Components10939PsResponsesVolumeContentApplicationJsonSchema {
    /*
     * The volume property.
     */
    @JsonProperty(value = "volume")
    private VolumeFull volume;

    /**
     * Get the volume property: The volume property.
     * 
     * @return the volume value.
     */
    public VolumeFull getVolume() {
        return this.volume;
    }

    /**
     * Set the volume property: The volume property.
     * 
     * @param volume the volume value to set.
     * @return the Components10939PsResponsesVolumeContentApplicationJsonSchema object itself.
     */
    public Components10939PsResponsesVolumeContentApplicationJsonSchema setVolume(VolumeFull volume) {
        this.volume = volume;
        return this;
    }
}
