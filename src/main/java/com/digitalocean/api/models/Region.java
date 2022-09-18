package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Region model.
 */
@Fluent
public class Region {
    /*
     * The display name of the region.  This will be a full name that is used in the control panel and other
     * interfaces.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A human-readable string that is used as a unique identifier for each region.
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * This attribute is set to an array which contains features available in this region
     */
    @JsonProperty(value = "features", required = true)
    private Object features;

    /*
     * This is a boolean value that represents whether new Droplets can be created in this region.
     */
    @JsonProperty(value = "available", required = true)
    private boolean available;

    /*
     * This attribute is set to an array which contains the identifying slugs for the sizes available in this region.
     */
    @JsonProperty(value = "sizes", required = true)
    private Object sizes;

    /**
     * Get the name property: The display name of the region.  This will be a full name that is used in the control
     * panel and other interfaces.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The display name of the region.  This will be a full name that is used in the control
     * panel and other interfaces.
     * 
     * @param name the name value to set.
     * @return the Region object itself.
     */
    public Region setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: A human-readable string that is used as a unique identifier for each region.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: A human-readable string that is used as a unique identifier for each region.
     * 
     * @param slug the slug value to set.
     * @return the Region object itself.
     */
    public Region setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the features property: This attribute is set to an array which contains features available in this region.
     * 
     * @return the features value.
     */
    public Object getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: This attribute is set to an array which contains features available in this region.
     * 
     * @param features the features value to set.
     * @return the Region object itself.
     */
    public Region setFeatures(Object features) {
        this.features = features;
        return this;
    }

    /**
     * Get the available property: This is a boolean value that represents whether new Droplets can be created in this
     * region.
     * 
     * @return the available value.
     */
    public boolean isAvailable() {
        return this.available;
    }

    /**
     * Set the available property: This is a boolean value that represents whether new Droplets can be created in this
     * region.
     * 
     * @param available the available value to set.
     * @return the Region object itself.
     */
    public Region setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the sizes property: This attribute is set to an array which contains the identifying slugs for the sizes
     * available in this region.
     * 
     * @return the sizes value.
     */
    public Object getSizes() {
        return this.sizes;
    }

    /**
     * Set the sizes property: This attribute is set to an array which contains the identifying slugs for the sizes
     * available in this region.
     * 
     * @param sizes the sizes value to set.
     * @return the Region object itself.
     */
    public Region setSizes(Object sizes) {
        this.sizes = sizes;
        return this;
    }
}
