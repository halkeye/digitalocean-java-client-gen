package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The TagsCreateHeaders model. */
@Fluent
public final class TagsCreateHeaders {
    /*
     * The x-request-id property.
     */
    @JsonProperty(value = "x-request-id")
    private UUID xRequestId;

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
     * Creates an instance of TagsCreateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public TagsCreateHeaders(HttpHeaders rawHeaders) {
        String xRequestId = rawHeaders.getValue("x-request-id");
        if (xRequestId != null) {
            this.xRequestId = UUID.fromString(xRequestId);
        }
        this.ratelimitLimit = Integer.parseInt(rawHeaders.getValue("ratelimit-limit"));
        this.ratelimitRemaining = Integer.parseInt(rawHeaders.getValue("ratelimit-remaining"));
        this.ratelimitReset = Integer.parseInt(rawHeaders.getValue("ratelimit-reset"));
    }

    /**
     * Get the xRequestId property: The x-request-id property.
     *
     * @return the xRequestId value.
     */
    public UUID getXRequestId() {
        return this.xRequestId;
    }

    /**
     * Set the xRequestId property: The x-request-id property.
     *
     * @param xRequestId the xRequestId value to set.
     * @return the TagsCreateHeaders object itself.
     */
    public TagsCreateHeaders setXRequestId(UUID xRequestId) {
        this.xRequestId = xRequestId;
        return this;
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
     * @return the TagsCreateHeaders object itself.
     */
    public TagsCreateHeaders setRatelimitLimit(Integer ratelimitLimit) {
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
     * @return the TagsCreateHeaders object itself.
     */
    public TagsCreateHeaders setRatelimitRemaining(Integer ratelimitRemaining) {
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
     * @return the TagsCreateHeaders object itself.
     */
    public TagsCreateHeaders setRatelimitReset(Integer ratelimitReset) {
        this.ratelimitReset = ratelimitReset;
        return this;
    }
}
