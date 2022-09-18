package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema {
    /*
     * An array containing the IDs of the Droplets assigned to the load balancer.
     */
    @JsonProperty(value = "droplet_ids", required = true)
    private List<Integer> dropletIds;

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets assigned to the load balancer.
     * 
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Set the dropletIds property: An array containing the IDs of the Droplets assigned to the load balancer.
     * 
     * @param dropletIds the dropletIds value to set.
     * @return the PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }
}
