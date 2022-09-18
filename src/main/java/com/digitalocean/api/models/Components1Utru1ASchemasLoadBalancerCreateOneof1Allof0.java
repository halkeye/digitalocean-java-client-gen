package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 model.
 */
@Fluent
public class Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 {
    /*
     * The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the tag property: The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     * 
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     * 
     * @param tag the tag value to set.
     * @return the Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 object itself.
     */
    public Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 setTag(String tag) {
        this.tag = tag;
        return this;
    }
}
