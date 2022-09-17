package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema model. */
@Fluent
public final class Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema {
    /*
     * The load_balancer property.
     */
    @JsonProperty(value = "load_balancer")
    private LoadBalancer loadBalancer;

    /**
     * Get the loadBalancer property: The load_balancer property.
     *
     * @return the loadBalancer value.
     */
    public LoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }

    /**
     * Set the loadBalancer property: The load_balancer property.
     *
     * @param loadBalancer the loadBalancer value to set.
     * @return the Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema object itself.
     */
    public Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema setLoadBalancer(
            LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
}
