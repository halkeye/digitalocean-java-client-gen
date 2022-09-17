package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema {
    /*
     * The resources property.
     */
    @JsonProperty(value = "resources")
    private List<Resource> resources;

    /**
     * Get the resources property: The resources property.
     *
     * @return the resources value.
     */
    public List<Resource> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources property.
     *
     * @param resources the resources value to set.
     * @return the ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema object itself.
     */
    public ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema setResources(
            List<Resource> resources) {
        this.resources = resources;
        return this;
    }
}
