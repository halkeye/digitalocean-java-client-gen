package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema {
    /*
     * A message about the result of the request.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the message property: A message about the result of the request.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A message about the result of the request.
     *
     * @param message the message value to set.
     * @return the ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema object itself.
     */
    public ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema setMessage(String message) {
        this.message = message;
        return this;
    }
}
