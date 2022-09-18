package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Multiple Droplet Response.
 */
@Fluent
public final class MultipleDropletResponse {
    /*
     * The droplets property.
     */
    @JsonProperty(value = "droplets", required = true)
    private List<Droplet> droplets;

    /*
     * The links property.
     */
    @JsonProperty(value = "links", required = true)
    private Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks links;

    /**
     * Get the droplets property: The droplets property.
     * 
     * @return the droplets value.
     */
    public List<Droplet> getDroplets() {
        return this.droplets;
    }

    /**
     * Set the droplets property: The droplets property.
     * 
     * @param droplets the droplets value to set.
     * @return the MultipleDropletResponse object itself.
     */
    public MultipleDropletResponse setDroplets(List<Droplet> droplets) {
        this.droplets = droplets;
        return this;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    public Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     * 
     * @param links the links value to set.
     * @return the MultipleDropletResponse object itself.
     */
    public MultipleDropletResponse setLinks(Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks links) {
        this.links = links;
        return this;
    }
}
