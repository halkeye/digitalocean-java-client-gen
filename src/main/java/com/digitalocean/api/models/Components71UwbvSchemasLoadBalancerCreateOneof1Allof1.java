package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 model. */
@Fluent
public class Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 {
    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region")
    private RegionSlug region;

    /**
     * Get the region property: The slug identifier for the region where the resource will initially be available.
     *
     * @return the region value.
     */
    public RegionSlug getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the resource will initially be available.
     *
     * @param region the region value to set.
     * @return the Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 object itself.
     */
    public Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 setRegion(RegionSlug region) {
        this.region = region;
        return this;
    }
}
