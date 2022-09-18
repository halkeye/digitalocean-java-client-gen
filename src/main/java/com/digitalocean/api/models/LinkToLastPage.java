package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The LinkToLastPage model.
 */
@Fluent
public class LinkToLastPage {
    /*
     * URI of the last page of the results.
     */
    @JsonProperty(value = "last")
    private String last;

    /**
     * Get the last property: URI of the last page of the results.
     * 
     * @return the last value.
     */
    public String getLast() {
        return this.last;
    }

    /**
     * Set the last property: URI of the last page of the results.
     * 
     * @param last the last value to set.
     * @return the LinkToLastPage object itself.
     */
    public LinkToLastPage setLast(String last) {
        this.last = last;
        return this;
    }
}
