package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ProjectAssignment model.
 */
@Fluent
public final class ProjectAssignment {
    /*
     * A list of uniform resource names (URNs) to be added to a project.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * Get the resources property: A list of uniform resource names (URNs) to be added to a project.
     * 
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: A list of uniform resource names (URNs) to be added to a project.
     * 
     * @param resources the resources value to set.
     * @return the ProjectAssignment object itself.
     */
    public ProjectAssignment setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }
}
