package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema model. */
@Fluent
public final class Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema {
    /*
     * A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes, Volume Snapshots, and
     * Database clusters) in order to better organize or facilitate the lookups and actions on it.
     * Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with information
     * about resources that have been tagged.
     */
    @JsonProperty(value = "tag")
    private Tags tag;

    /**
     * Get the tag property: A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes,
     * Volume Snapshots, and Database clusters) in order to better organize or facilitate the lookups and actions on it.
     * Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with information
     * about resources that have been tagged.
     *
     * @return the tag value.
     */
    public Tags getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes,
     * Volume Snapshots, and Database clusters) in order to better organize or facilitate the lookups and actions on it.
     * Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with information
     * about resources that have been tagged.
     *
     * @param tag the tag value to set.
     * @return the Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema object itself.
     */
    public Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema setTag(Tags tag) {
        this.tag = tag;
        return this;
    }
}
