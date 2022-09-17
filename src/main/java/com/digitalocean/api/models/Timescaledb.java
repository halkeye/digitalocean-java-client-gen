package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TimescaleDB extension configuration values. */
@Fluent
public final class Timescaledb {
    /*
     * The number of background workers for timescaledb operations.  Set to the sum of your number of databases and the
     * total number of concurrent background workers you want running at any given point in time.
     */
    @JsonProperty(value = "max_background_workers")
    private Integer maxBackgroundWorkers;

    /**
     * Get the maxBackgroundWorkers property: The number of background workers for timescaledb operations. Set to the
     * sum of your number of databases and the total number of concurrent background workers you want running at any
     * given point in time.
     *
     * @return the maxBackgroundWorkers value.
     */
    public Integer getMaxBackgroundWorkers() {
        return this.maxBackgroundWorkers;
    }

    /**
     * Set the maxBackgroundWorkers property: The number of background workers for timescaledb operations. Set to the
     * sum of your number of databases and the total number of concurrent background workers you want running at any
     * given point in time.
     *
     * @param maxBackgroundWorkers the maxBackgroundWorkers value to set.
     * @return the Timescaledb object itself.
     */
    public Timescaledb setMaxBackgroundWorkers(Integer maxBackgroundWorkers) {
        this.maxBackgroundWorkers = maxBackgroundWorkers;
        return this;
    }
}
