package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema {
    /*
     * The replicas property.
     */
    @JsonProperty(value = "replicas")
    private List<DatabaseReplica> replicas;

    /**
     * Get the replicas property: The replicas property.
     *
     * @return the replicas value.
     */
    public List<DatabaseReplica> getReplicas() {
        return this.replicas;
    }

    /**
     * Set the replicas property: The replicas property.
     *
     * @param replicas the replicas value to set.
     * @return the ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema object itself.
     */
    public ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema setReplicas(
            List<DatabaseReplica> replicas) {
        this.replicas = replicas;
        return this;
    }
}
