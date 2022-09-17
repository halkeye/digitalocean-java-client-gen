package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NeighborIds model. */
@Fluent
public final class NeighborIds {
    /*
     * An array of arrays. Each array will contain a set of Droplet IDs for Droplets that share a physical server.
     */
    @JsonProperty(value = "neighbor_ids")
    private List<List<Integer>> neighborIds;

    /**
     * Get the neighborIds property: An array of arrays. Each array will contain a set of Droplet IDs for Droplets that
     * share a physical server.
     *
     * @return the neighborIds value.
     */
    public List<List<Integer>> getNeighborIds() {
        return this.neighborIds;
    }

    /**
     * Set the neighborIds property: An array of arrays. Each array will contain a set of Droplet IDs for Droplets that
     * share a physical server.
     *
     * @param neighborIds the neighborIds value to set.
     * @return the NeighborIds object itself.
     */
    public NeighborIds setNeighborIds(List<List<Integer>> neighborIds) {
        this.neighborIds = neighborIds;
        return this;
    }
}
