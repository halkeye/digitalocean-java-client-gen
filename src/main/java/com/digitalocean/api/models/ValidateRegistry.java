package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ValidateRegistry model.
 */
@Fluent
public final class ValidateRegistry {
    /*
     * A globally unique name for the container registry. Must be lowercase and be composed only of numbers, letters
     * and `-`, up to a limit of 63 characters.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @param name the name value to set.
     * @return the ValidateRegistry object itself.
     */
    public ValidateRegistry setName(String name) {
        this.name = name;
        return this;
    }
}
