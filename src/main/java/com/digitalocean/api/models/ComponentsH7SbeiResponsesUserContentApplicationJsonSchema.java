package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsH7SbeiResponsesUserContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsH7SbeiResponsesUserContentApplicationJsonSchema {
    /*
     * The user property.
     */
    @JsonProperty(value = "user", required = true)
    private DatabaseUser user;

    /**
     * Get the user property: The user property.
     * 
     * @return the user value.
     */
    public DatabaseUser getUser() {
        return this.user;
    }

    /**
     * Set the user property: The user property.
     * 
     * @param user the user value to set.
     * @return the ComponentsH7SbeiResponsesUserContentApplicationJsonSchema object itself.
     */
    public ComponentsH7SbeiResponsesUserContentApplicationJsonSchema setUser(DatabaseUser user) {
        this.user = user;
        return this;
    }
}
