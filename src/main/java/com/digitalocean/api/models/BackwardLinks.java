package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The BackwardLinks model.
 */
@Fluent
public final class BackwardLinks extends LinkToFirstPage {
    /*
     * URI of the previous page of the results.
     */
    @JsonProperty(value = "prev")
    private String prev;

    /**
     * Get the prev property: URI of the previous page of the results.
     * 
     * @return the prev value.
     */
    public String getPrev() {
        return this.prev;
    }

    /**
     * Set the prev property: URI of the previous page of the results.
     * 
     * @param prev the prev value to set.
     * @return the BackwardLinks object itself.
     */
    public BackwardLinks setPrev(String prev) {
        this.prev = prev;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackwardLinks setFirst(String first) {
        super.setFirst(first);
        return this;
    }
}
