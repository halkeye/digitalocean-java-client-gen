package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkToNextPage model. */
@Fluent
public class LinkToNextPage {
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
     * @return the LinkToNextPage object itself.
     */
    public LinkToNextPage setNext(String next) {
        this.next = next;
        return this;
    }
}
