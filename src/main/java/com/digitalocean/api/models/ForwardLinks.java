package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ForwardLinks model.
 */
@Fluent
public final class ForwardLinks extends LinkToLastPage {
    /*
     * URI of the next page of the results.
     */
    @JsonProperty(value = "next")
    private String next;

    /**
     * Get the next property: URI of the next page of the results.
     * 
     * @return the next value.
     */
    public String getNext() {
        return this.next;
    }

    /**
     * Set the next property: URI of the next page of the results.
     * 
     * @param next the next value to set.
     * @return the ForwardLinks object itself.
     */
    public ForwardLinks setNext(String next) {
        this.next = next;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForwardLinks setLast(String last) {
        super.setLast(last);
        return this;
    }
}
