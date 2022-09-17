package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema {
    /*
     * A human-readable display name for this key, used to easily identify the SSH keys when they are displayed.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: A human-readable display name for this key, used to easily identify the SSH keys when they
     * are displayed.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable display name for this key, used to easily identify the SSH keys when they
     * are displayed.
     *
     * @param name the name value to set.
     * @return the PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema setName(String name) {
        this.name = name;
        return this;
    }
}
