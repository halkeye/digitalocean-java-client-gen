package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The PurgeCache model.
 */
@Fluent
public final class PurgeCache {
    /*
     * An array of strings containing the path to the content to be purged from the CDN cache.
     */
    @JsonProperty(value = "files", required = true)
    private List<String> files;

    /**
     * Get the files property: An array of strings containing the path to the content to be purged from the CDN cache.
     * 
     * @return the files value.
     */
    public List<String> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: An array of strings containing the path to the content to be purged from the CDN cache.
     * 
     * @param files the files value to set.
     * @return the PurgeCache object itself.
     */
    public PurgeCache setFiles(List<String> files) {
        this.files = files;
        return this;
    }
}
