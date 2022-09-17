package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Pagination model. */
@Fluent
public class Pagination {
    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private PageLinks links;

    /**
     * Get the links property: The links property.
     *
     * @return the links value.
     */
    public PageLinks getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     *
     * @param links the links value to set.
     * @return the Pagination object itself.
     */
    public Pagination setLinks(PageLinks links) {
        this.links = links;
        return this;
    }
}
