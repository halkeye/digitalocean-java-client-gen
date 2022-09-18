package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes, Volume Snapshots, and
 * Database clusters) in order to better organize or facilitate the lookups and actions on it.
 * Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with information
 * about resources that have been tagged.
 */
@Fluent
public final class Tags {
    /*
     * The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores.
     * There is a limit of 255 characters per tag.
     * 
     * **Note:** Tag names are case stable, which means the capitalization you use when you first create a tag is
     * canonical.
     * 
     * When working with tags in the API, you must use the tag's canonical capitalization. For example, if you create a
     * tag named "PROD", the URL to add that tag to a resource would be
     * `https://api.digitalocean.com/v2/tags/PROD/resources` (not `/v2/tags/prod/resources`).
     * 
     * Tagged resources in the control panel will always display the canonical capitalization. For example, if you
     * create a tag named "PROD", you can tag resources in the control panel by entering "prod". The tag will still
     * display with its canonical capitalization, "PROD".
     * 
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An embedded object containing key value pairs of resource type and resource statistics. It also includes a count
     * of the total number of resources tagged with the current tag as well as a `last_tagged_uri` attribute set to the
     * last resource tagged with the current tag.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private TagsResources resources;

    /**
     * Get the name property: The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores.
     * There is a limit of 255 characters per tag.
     * 
     * **Note:** Tag names are case stable, which means the capitalization you use when you first create a tag is
     * canonical.
     * 
     * When working with tags in the API, you must use the tag's canonical capitalization. For example, if you create a
     * tag named "PROD", the URL to add that tag to a resource would be
     * `https://api.digitalocean.com/v2/tags/PROD/resources` (not `/v2/tags/prod/resources`).
     * 
     * Tagged resources in the control panel will always display the canonical capitalization. For example, if you
     * create a tag named "PROD", you can tag resources in the control panel by entering "prod". The tag will still
     * display with its canonical capitalization, "PROD".
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores.
     * There is a limit of 255 characters per tag.
     * 
     * **Note:** Tag names are case stable, which means the capitalization you use when you first create a tag is
     * canonical.
     * 
     * When working with tags in the API, you must use the tag's canonical capitalization. For example, if you create a
     * tag named "PROD", the URL to add that tag to a resource would be
     * `https://api.digitalocean.com/v2/tags/PROD/resources` (not `/v2/tags/prod/resources`).
     * 
     * Tagged resources in the control panel will always display the canonical capitalization. For example, if you
     * create a tag named "PROD", you can tag resources in the control panel by entering "prod". The tag will still
     * display with its canonical capitalization, "PROD".
     * 
     * @param name the name value to set.
     * @return the Tags object itself.
     */
    public Tags setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resources property: An embedded object containing key value pairs of resource type and resource
     * statistics. It also includes a count of the total number of resources tagged with the current tag as well as a
     * `last_tagged_uri` attribute set to the last resource tagged with the current tag.
     * 
     * @return the resources value.
     */
    public TagsResources getResources() {
        return this.resources;
    }
}
