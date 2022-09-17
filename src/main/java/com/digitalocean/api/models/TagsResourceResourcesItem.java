package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagsResourceResourcesItem model. */
@Fluent
public final class TagsResourceResourcesItem {
    /*
     * The identifier of a resource.
     */
    @JsonProperty(value = "resource_id")
    private String resourceId;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "resource_type")
    private TagsResourceResourcesItemResourceType resourceType;

    /**
     * Get the resourceId property: The identifier of a resource.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The identifier of a resource.
     *
     * @param resourceId the resourceId value to set.
     * @return the TagsResourceResourcesItem object itself.
     */
    public TagsResourceResourcesItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: The type of the resource.
     *
     * @return the resourceType value.
     */
    public TagsResourceResourcesItemResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The type of the resource.
     *
     * @param resourceType the resourceType value to set.
     * @return the TagsResourceResourcesItem object itself.
     */
    public TagsResourceResourcesItem setResourceType(TagsResourceResourcesItemResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }
}
