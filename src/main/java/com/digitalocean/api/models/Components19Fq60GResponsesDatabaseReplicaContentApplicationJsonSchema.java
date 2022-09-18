package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema model.
 */
@Fluent
public final class Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema {
    /*
     * The replica property.
     */
    @JsonProperty(value = "replica")
    private DatabaseReplica replica;

    /**
     * Get the replica property: The replica property.
     * 
     * @return the replica value.
     */
    public DatabaseReplica getReplica() {
        return this.replica;
    }

    /**
     * Set the replica property: The replica property.
     * 
     * @param replica the replica value to set.
     * @return the Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema object itself.
     */
    public Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema setReplica(DatabaseReplica replica) {
        this.replica = replica;
        return this;
    }
}
