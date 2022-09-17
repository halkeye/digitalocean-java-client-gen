package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkToPrevPage model. */
@Fluent
public class LinkToPrevPage {
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
     * @return the LinkToPrevPage object itself.
     */
    public LinkToPrevPage setPrev(String prev) {
        this.prev = prev;
        return this;
    }
}
