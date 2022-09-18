package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The OneClicks model.
 */
@Fluent
public final class OneClicks {
    /*
     * slug
     * 
     * The slug identifier for the 1-Click application.
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * type
     * 
     * The type of the 1-Click application.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the slug property: slug
     * 
     * The slug identifier for the 1-Click application.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: slug
     * 
     * The slug identifier for the 1-Click application.
     * 
     * @param slug the slug value to set.
     * @return the OneClicks object itself.
     */
    public OneClicks setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the type property: type
     * 
     * The type of the 1-Click application.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: type
     * 
     * The type of the 1-Click application.
     * 
     * @param type the type value to set.
     * @return the OneClicks object itself.
     */
    public OneClicks setType(String type) {
        this.type = type;
        return this;
    }
}
