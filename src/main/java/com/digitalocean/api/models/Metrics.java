package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Metrics model. */
@Fluent
public final class Metrics {
    /*
     * The data property.
     */
    @JsonProperty(value = "data", required = true)
    private MetricsData data;

    /*
     * The status property.
     */
    @JsonProperty(value = "status", required = true)
    private MetricsStatus status;

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public MetricsData getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the Metrics object itself.
     */
    public Metrics setData(MetricsData data) {
        this.data = data;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public MetricsStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the Metrics object itself.
     */
    public Metrics setStatus(MetricsStatus status) {
        this.status = status;
        return this;
    }
}
