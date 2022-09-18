package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema model.
 */
@Fluent
public final class Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema {
    /*
     * The databases property.
     */
    @JsonProperty(value = "databases")
    private List<DatabaseCluster> databases;

    /**
     * Get the databases property: The databases property.
     * 
     * @return the databases value.
     */
    public List<DatabaseCluster> getDatabases() {
        return this.databases;
    }

    /**
     * Set the databases property: The databases property.
     * 
     * @param databases the databases value to set.
     * @return the Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema object itself.
     */
    public Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema setDatabases(List<DatabaseCluster> databases) {
        this.databases = databases;
        return this;
    }
}
