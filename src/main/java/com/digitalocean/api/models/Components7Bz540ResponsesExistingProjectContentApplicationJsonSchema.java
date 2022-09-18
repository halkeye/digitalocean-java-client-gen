package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema model.
 */
@Fluent
public final class Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema {
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
     * @return the Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema object itself.
     */
    public Components7Bz540ResponsesExistingProjectContentApplicationJsonSchema setProject(Project project) {
        this.project = project;
        return this;
    }
}
