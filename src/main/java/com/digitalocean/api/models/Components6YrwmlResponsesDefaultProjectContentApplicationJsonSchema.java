package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema model. */
@Fluent
public final class Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema {
    /*
     * The project property.
     */
    @JsonProperty(value = "project")
    private Project project;

    /**
     * Get the project property: The project property.
     *
     * @return the project value.
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * Set the project property: The project property.
     *
     * @param project the project value to set.
     * @return the Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema object itself.
     */
    public Components6YrwmlResponsesDefaultProjectContentApplicationJsonSchema setProject(Project project) {
        this.project = project;
        return this;
    }
}
