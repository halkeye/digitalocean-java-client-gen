package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KubernetesNodePoolSize model. */
@Fluent
public class KubernetesNodePoolSize {
    /*
     * The slug identifier for the type of Droplet used as workers in the node pool.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Get the size property: The slug identifier for the type of Droplet used as workers in the node pool.
     *
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: The slug identifier for the type of Droplet used as workers in the node pool.
     *
     * @param size the size value to set.
     * @return the KubernetesNodePoolSize object itself.
     */
    public KubernetesNodePoolSize setSize(String size) {
        this.size = size;
        return this;
    }
}
