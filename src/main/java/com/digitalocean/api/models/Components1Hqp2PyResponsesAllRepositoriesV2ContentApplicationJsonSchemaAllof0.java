package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 {
    /*
     * The repositories property.
     */
    @JsonProperty(value = "repositories")
    private List<RepositoryV2> repositories;

    /**
     * Get the repositories property: The repositories property.
     *
     * @return the repositories value.
     */
    public List<RepositoryV2> getRepositories() {
        return this.repositories;
    }

    /**
     * Set the repositories property: The repositories property.
     *
     * @param repositories the repositories value to set.
     * @return the Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 setRepositories(
            List<RepositoryV2> repositories) {
        this.repositories = repositories;
        return this;
    }
}
