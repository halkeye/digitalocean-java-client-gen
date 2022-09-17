package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 {
    /*
     * The projects property.
     */
    @JsonProperty(value = "projects")
    private List<Project> projects;

    /**
     * Get the projects property: The projects property.
     *
     * @return the projects value.
     */
    public List<Project> getProjects() {
        return this.projects;
    }

    /**
     * Set the projects property: The projects property.
     *
     * @param projects the projects value to set.
     * @return the Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1IxwwnaResponsesProjectsListContentApplicationJsonSchemaAllof0 setProjects(
            List<Project> projects) {
        this.projects = projects;
        return this;
    }
}
