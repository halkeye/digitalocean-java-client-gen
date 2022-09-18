package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema model.
 */
@Fluent
public final class Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema {
    /*
     * The database property.
     */
    @JsonProperty(value = "database", required = true)
    private DatabaseCluster database;

    /**
     * Get the database property: The database property.
     * 
     * @return the database value.
     */
    public DatabaseCluster getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The database property.
     * 
     * @param database the database value to set.
     * @return the Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema object itself.
     */
    public Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema setDatabase(DatabaseCluster database) {
        this.database = database;
        return this;
    }
}
