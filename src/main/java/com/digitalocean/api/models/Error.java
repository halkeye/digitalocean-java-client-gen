package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Error model. */
@Fluent
public final class Error {
    /*
     * A short identifier corresponding to the HTTP status code returned. For  example, the ID for a response returning
     * a 404 status code would be "not_found."
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * A message providing additional information about the error, including  details to help resolve it when possible.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Optionally, some endpoints may include a request ID that should be  provided when reporting bugs or opening
     * support tickets to help  identify the issue.
     */
    @JsonProperty(value = "request_id")
    private String requestId;

    /**
     * Get the id property: A short identifier corresponding to the HTTP status code returned. For example, the ID for a
     * response returning a 404 status code would be "not_found.".
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: A short identifier corresponding to the HTTP status code returned. For example, the ID for a
     * response returning a 404 status code would be "not_found.".
     *
     * @param id the id value to set.
     * @return the Error object itself.
     */
    public Error setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the message property: A message providing additional information about the error, including details to help
     * resolve it when possible.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A message providing additional information about the error, including details to help
     * resolve it when possible.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the requestId property: Optionally, some endpoints may include a request ID that should be provided when
     * reporting bugs or opening support tickets to help identify the issue.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: Optionally, some endpoints may include a request ID that should be provided when
     * reporting bugs or opening support tickets to help identify the issue.
     *
     * @param requestId the requestId value to set.
     * @return the Error object itself.
     */
    public Error setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
}
