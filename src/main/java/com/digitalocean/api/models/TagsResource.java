package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The TagsResource model.
 */
@Fluent
public final class TagsResource {
    /*
     * An array of objects containing resource_id and resource_type  attributes.
     */
    @JsonProperty(value = "resources", required = true)
    private List<TagsResourceResourcesItem> resources;

    /**
     * Get the resources property: An array of objects containing resource_id and resource_type  attributes.
     * 
     * @return the resources value.
     */
    public List<TagsResourceResourcesItem> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: An array of objects containing resource_id and resource_type  attributes.
     * 
     * @param resources the resources value to set.
     * @return the TagsResource object itself.
     */
    public TagsResource setResources(List<TagsResourceResourcesItem> resources) {
        this.resources = resources;
        return this;
    }
}
