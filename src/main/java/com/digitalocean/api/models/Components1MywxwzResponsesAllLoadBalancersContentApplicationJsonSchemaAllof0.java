package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 {
    /*
     * The load_balancers property.
     */
    @JsonProperty(value = "load_balancers")
    private List<LoadBalancer> loadBalancers;

    /**
     * Get the loadBalancers property: The load_balancers property.
     *
     * @return the loadBalancers value.
     */
    public List<LoadBalancer> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * Set the loadBalancers property: The load_balancers property.
     *
     * @param loadBalancers the loadBalancers value to set.
     * @return the Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 setLoadBalancers(
            List<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
}
