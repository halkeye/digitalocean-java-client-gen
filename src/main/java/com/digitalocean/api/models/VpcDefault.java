package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpcDefault model. */
@Fluent
public class VpcDefault {
    /*
     * A boolean value indicating whether or not the VPC is the default network for the region. All applicable
     * resources are placed into the default VPC network unless otherwise specified during their creation. The
     * `default` field cannot be unset from `true`. If you want to set a new default VPC network, update the `default`
     * field of another VPC network in the same region. The previous network's `default` field will be set to `false`
     * when a new default VPC has been defined.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Get the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field will
     * be set to `false` when a new default VPC has been defined.
     *
     * @return the defaultProperty value.
     */
    public Boolean isDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field will
     * be set to `false` when a new default VPC has been defined.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the VpcDefault object itself.
     */
    public VpcDefault setDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }
}
