package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CdnsGetEndpointHeaders model. */
@Fluent
public final class CdnsGetEndpointHeaders {
    /*
     * The ratelimit-limit property.
     */
    @JsonProperty(value = "ratelimit-limit")
    private Integer ratelimitLimit;

    /*
     * The ratelimit-remaining property.
     */
    @JsonProperty(value = "ratelimit-remaining")
    private Integer ratelimitRemaining;

    /*
     * The ratelimit-reset property.
     */
    @JsonProperty(value = "ratelimit-reset")
    private Integer ratelimitReset;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of CdnsGetEndpointHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public CdnsGetEndpointHeaders(HttpHeaders rawHeaders) {
        this.ratelimitLimit = Integer.parseInt(rawHeaders.getValue("ratelimit-limit"));
        this.ratelimitRemaining = Integer.parseInt(rawHeaders.getValue("ratelimit-remaining"));
        this.ratelimitReset = Integer.parseInt(rawHeaders.getValue("ratelimit-reset"));
    }

    /**
     * Get the ratelimitLimit property: The ratelimit-limit property.
     *
     * @return the ratelimitLimit value.
     */
    public Integer getRatelimitLimit() {
        return this.ratelimitLimit;
    }

    /**
     * Set the ratelimitLimit property: The ratelimit-limit property.
     *
     * @param ratelimitLimit the ratelimitLimit value to set.
     * @return the CdnsGetEndpointHeaders object itself.
     */
    public CdnsGetEndpointHeaders setRatelimitLimit(Integer ratelimitLimit) {
        this.ratelimitLimit = ratelimitLimit;
        return this;
    }

    /**
     * Get the ratelimitRemaining property: The ratelimit-remaining property.
     *
     * @return the ratelimitRemaining value.
     */
    public Integer getRatelimitRemaining() {
        return this.ratelimitRemaining;
    }

    /**
     * Set the ratelimitRemaining property: The ratelimit-remaining property.
     *
     * @param ratelimitRemaining the ratelimitRemaining value to set.
     * @return the CdnsGetEndpointHeaders object itself.
     */
    public CdnsGetEndpointHeaders setRatelimitRemaining(Integer ratelimitRemaining) {
        this.ratelimitRemaining = ratelimitRemaining;
        return this;
    }

    /**
     * Get the ratelimitReset property: The ratelimit-reset property.
     *
     * @return the ratelimitReset value.
     */
    public Integer getRatelimitReset() {
        return this.ratelimitReset;
    }

    /**
     * Set the ratelimitReset property: The ratelimit-reset property.
     *
     * @param ratelimitReset the ratelimitReset value to set.
     * @return the CdnsGetEndpointHeaders object itself.
     */
    public CdnsGetEndpointHeaders setRatelimitReset(Integer ratelimitReset) {
        this.ratelimitReset = ratelimitReset;
        return this;
    }
}
