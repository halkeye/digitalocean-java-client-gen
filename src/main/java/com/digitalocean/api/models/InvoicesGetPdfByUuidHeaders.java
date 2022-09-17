package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvoicesGetPdfByUuidHeaders model. */
@Fluent
public final class InvoicesGetPdfByUuidHeaders {
    /*
     * The content-disposition property.
     */
    @JsonProperty(value = "content-disposition")
    private String contentDisposition;

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
     * Creates an instance of InvoicesGetPdfByUuidHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public InvoicesGetPdfByUuidHeaders(HttpHeaders rawHeaders) {
        this.contentDisposition = rawHeaders.getValue("content-disposition");
        this.ratelimitLimit = Integer.parseInt(rawHeaders.getValue("ratelimit-limit"));
        this.ratelimitRemaining = Integer.parseInt(rawHeaders.getValue("ratelimit-remaining"));
        this.ratelimitReset = Integer.parseInt(rawHeaders.getValue("ratelimit-reset"));
    }

    /**
     * Get the contentDisposition property: The content-disposition property.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The content-disposition property.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the InvoicesGetPdfByUuidHeaders object itself.
     */
    public InvoicesGetPdfByUuidHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
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
     * @return the InvoicesGetPdfByUuidHeaders object itself.
     */
    public InvoicesGetPdfByUuidHeaders setRatelimitLimit(Integer ratelimitLimit) {
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
     * @return the InvoicesGetPdfByUuidHeaders object itself.
     */
    public InvoicesGetPdfByUuidHeaders setRatelimitRemaining(Integer ratelimitRemaining) {
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
     * @return the InvoicesGetPdfByUuidHeaders object itself.
     */
    public InvoicesGetPdfByUuidHeaders setRatelimitReset(Integer ratelimitReset) {
        this.ratelimitReset = ratelimitReset;
        return this;
    }
}
