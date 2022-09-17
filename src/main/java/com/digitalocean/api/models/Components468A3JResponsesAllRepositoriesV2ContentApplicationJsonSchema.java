package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema model. */
@Fluent
public final class Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema
        extends Components1Hqp2PyResponsesAllRepositoriesV2ContentApplicationJsonSchemaAllof0 {
    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private PageLinks links;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaMeta meta;

    /**
     * Get the links property: The links property.
     *
     * @return the links value.
     */
    public PageLinks getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     *
     * @param links the links value to set.
     * @return the Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema object itself.
     */
    public Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema setLinks(PageLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public MetaMeta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema object itself.
     */
    public Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema setMeta(MetaMeta meta) {
        this.meta = meta;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Components468A3JResponsesAllRepositoriesV2ContentApplicationJsonSchema setRepositories(
            List<RepositoryV2> repositories) {
        super.setRepositories(repositories);
        return this;
    }
}
