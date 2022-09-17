package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the response itself. */
@Fluent
public class MetaProperties {
    /*
     * Number of objects returned by the request.
     */
    @JsonProperty(value = "total")
    private Integer total;

    /**
     * Get the total property: Number of objects returned by the request.
     *
     * @return the total value.
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * Set the total property: Number of objects returned by the request.
     *
     * @param total the total value to set.
     * @return the MetaProperties object itself.
     */
    public MetaProperties setTotal(Integer total) {
        this.total = total;
        return this;
    }
}
