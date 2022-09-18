package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Single Droplet Response.
 */
@Fluent
public final class SingleDropletResponse {
    /*
     * The droplet property.
     */
    @JsonProperty(value = "droplet", required = true)
    private Droplet droplet;

    /*
     * The links property.
     */
    @JsonProperty(value = "links", required = true)
    private DropletCreateApplicationJsonOneOfProperties links;

    /**
     * Get the droplet property: The droplet property.
     * 
     * @return the droplet value.
     */
    public Droplet getDroplet() {
        return this.droplet;
    }

    /**
     * Set the droplet property: The droplet property.
     * 
     * @param droplet the droplet value to set.
     * @return the SingleDropletResponse object itself.
     */
    public SingleDropletResponse setDroplet(Droplet droplet) {
        this.droplet = droplet;
        return this;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    public DropletCreateApplicationJsonOneOfProperties getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     * 
     * @param links the links value to set.
     * @return the SingleDropletResponse object itself.
     */
    public SingleDropletResponse setLinks(DropletCreateApplicationJsonOneOfProperties links) {
        this.links = links;
        return this;
    }
}
