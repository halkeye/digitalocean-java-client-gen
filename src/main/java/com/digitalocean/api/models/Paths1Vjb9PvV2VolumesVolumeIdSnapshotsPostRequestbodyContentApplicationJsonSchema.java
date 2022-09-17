package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema {
    /*
     * A human-readable name for the volume snapshot.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A flat array of tag names as strings to be applied to the resource. Tag names may be for either existing or new
     * tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get the name property: A human-readable name for the volume snapshot.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for the volume snapshot.
     *
     * @param name the name value to set.
     * @return the Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     *
     * @param tags the tags value to set.
     * @return the Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema setTags(
            List<String> tags) {
        this.tags = tags;
        return this;
    }
}
