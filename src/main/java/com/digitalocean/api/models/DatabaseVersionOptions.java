package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DatabaseVersionOptions model.
 */
@Immutable
public class DatabaseVersionOptions {
    /*
     * An array of strings containing the names of available regions
     */
    @JsonProperty(value = "versions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> versions;

    /**
     * Get the versions property: An array of strings containing the names of available regions.
     * 
     * @return the versions value.
     */
    public List<String> getVersions() {
        return this.versions;
    }
}
