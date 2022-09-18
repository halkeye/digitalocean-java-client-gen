package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema {
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
     * @return the ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema object itself.
     */
    public ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
}
