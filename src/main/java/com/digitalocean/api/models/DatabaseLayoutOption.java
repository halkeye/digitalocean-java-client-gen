package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DatabaseLayoutOption model. */
@Fluent
public final class DatabaseLayoutOption {
    /*
     * The num_nodes property.
     */
    @JsonProperty(value = "num_nodes")
    private Integer numNodes;

    /*
     * An array of objects containing the slugs available with various node counts
     */
    @JsonProperty(value = "sizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> sizes;

    /**
     * Get the numNodes property: The num_nodes property.
     *
     * @return the numNodes value.
     */
    public Integer getNumNodes() {
        return this.numNodes;
    }

    /**
     * Set the numNodes property: The num_nodes property.
     *
     * @param numNodes the numNodes value to set.
     * @return the DatabaseLayoutOption object itself.
     */
    public DatabaseLayoutOption setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
        return this;
    }

    /**
     * Get the sizes property: An array of objects containing the slugs available with various node counts.
     *
     * @return the sizes value.
     */
    public List<String> getSizes() {
        return this.sizes;
    }
}
