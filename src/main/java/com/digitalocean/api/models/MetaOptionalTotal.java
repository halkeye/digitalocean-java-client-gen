package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetaOptionalTotal model. */
@Fluent
public class MetaOptionalTotal {
    /*
     * Information about the response itself.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaProperties meta;

    /**
     * Get the meta property: Information about the response itself.
     *
     * @return the meta value.
     */
    public MetaProperties getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: Information about the response itself.
     *
     * @param meta the meta value to set.
     * @return the MetaOptionalTotal object itself.
     */
    public MetaOptionalTotal setMeta(MetaProperties meta) {
        this.meta = meta;
        return this;
    }
}
