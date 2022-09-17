package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema {
    /*
     * The db property.
     */
    @JsonProperty(value = "db", required = true)
    private Database db;

    /**
     * Get the db property: The db property.
     *
     * @return the db value.
     */
    public Database getDb() {
        return this.db;
    }

    /**
     * Set the db property: The db property.
     *
     * @param db the db value to set.
     * @return the ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema object itself.
     */
    public ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema setDb(Database db) {
        this.db = db;
        return this;
    }
}
