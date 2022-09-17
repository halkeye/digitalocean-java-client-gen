package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema model. */
@Fluent
public final class Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema {
    /*
     * The vpc property.
     */
    @JsonProperty(value = "vpc")
    private Vpc vpc;

    /**
     * Get the vpc property: The vpc property.
     *
     * @return the vpc value.
     */
    public Vpc getVpc() {
        return this.vpc;
    }

    /**
     * Set the vpc property: The vpc property.
     *
     * @param vpc the vpc value to set.
     * @return the Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema object itself.
     */
    public Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema setVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }
}
