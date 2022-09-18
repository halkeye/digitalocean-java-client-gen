package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The LinkToFirstPage model.
 */
@Fluent
public class LinkToFirstPage {
    /*
     * URI of the first page of the results.
     */
    @JsonProperty(value = "first")
    private String first;

    /**
     * Get the first property: URI of the first page of the results.
     * 
     * @return the first value.
     */
    public String getFirst() {
        return this.first;
    }

    /**
     * Set the first property: URI of the first page of the results.
     * 
     * @param first the first value to set.
     * @return the LinkToFirstPage object itself.
     */
    public LinkToFirstPage setFirst(String first) {
        this.first = first;
        return this;
    }
}
