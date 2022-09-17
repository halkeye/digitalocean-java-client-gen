package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PageLinks model. */
@Fluent
public final class PageLinks {
    /*
     * The pages property.
     */
    @JsonProperty(value = "pages")
    private Object pages;

    /**
     * Get the pages property: The pages property.
     *
     * @return the pages value.
     */
    public Object getPages() {
        return this.pages;
    }

    /**
     * Set the pages property: The pages property.
     *
     * @param pages the pages value to set.
     * @return the PageLinks object itself.
     */
    public PageLinks setPages(Object pages) {
        this.pages = pages;
        return this;
    }
}
