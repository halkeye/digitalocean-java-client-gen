package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 {
    /*
     * The repositories property.
     */
    @JsonProperty(value = "repositories")
    private List<Repository> repositories;

    /**
     * Get the repositories property: The repositories property.
     * 
     * @return the repositories value.
     */
    public List<Repository> getRepositories() {
        return this.repositories;
    }

    /**
     * Set the repositories property: The repositories property.
     * 
     * @param repositories the repositories value to set.
     * @return the ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
        return this;
    }
}
