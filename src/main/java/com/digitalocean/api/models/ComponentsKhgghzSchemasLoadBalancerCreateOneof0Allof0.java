package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 model. */
@Fluent
public class ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 {
    /*
     * An array containing the IDs of the Droplets assigned to the load balancer.
     */
    @JsonProperty(value = "droplet_ids")
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
     * @return the ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 object itself.
     */
    public ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }
}
