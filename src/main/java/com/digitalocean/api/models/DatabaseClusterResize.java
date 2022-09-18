package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DatabaseClusterResize model.
 */
@Fluent
public final class DatabaseClusterResize {
    /*
     * A slug identifier representing desired the size of the nodes in the database cluster.
     */
    @JsonProperty(value = "size", required = true)
    private String size;

    /*
     * The number of nodes in the database cluster. Valid values are are 1-3. In addition to the primary node, up to
     * two standby nodes may be added for highly available configurations.
     */
    @JsonProperty(value = "num_nodes", required = true)
    private int numNodes;

    /**
     * Get the size property: A slug identifier representing desired the size of the nodes in the database cluster.
     * 
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: A slug identifier representing desired the size of the nodes in the database cluster.
     * 
     * @param size the size value to set.
     * @return the DatabaseClusterResize object itself.
     */
    public DatabaseClusterResize setSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the numNodes property: The number of nodes in the database cluster. Valid values are are 1-3. In addition to
     * the primary node, up to two standby nodes may be added for highly available configurations.
     * 
     * @return the numNodes value.
     */
    public int getNumNodes() {
        return this.numNodes;
    }

    /**
     * Set the numNodes property: The number of nodes in the database cluster. Valid values are are 1-3. In addition to
     * the primary node, up to two standby nodes may be added for highly available configurations.
     * 
     * @param numNodes the numNodes value to set.
     * @return the DatabaseClusterResize object itself.
     */
    public DatabaseClusterResize setNumNodes(int numNodes) {
        this.numNodes = numNodes;
        return this;
    }
}
