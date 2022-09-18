package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * An objects containing information about a resource associated with a Droplet.
 */
@Fluent
public final class AssociatedResource {
    /*
     * The unique identifier for the resource associated with the Droplet.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the resource associated with the Droplet.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The cost of the resource in USD per month if the resource is retained after the Droplet is destroyed.
     */
    @JsonProperty(value = "cost")
    private String cost;

    /**
     * Get the id property: The unique identifier for the resource associated with the Droplet.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The unique identifier for the resource associated with the Droplet.
     * 
     * @param id the id value to set.
     * @return the AssociatedResource object itself.
     */
    public AssociatedResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource associated with the Droplet.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource associated with the Droplet.
     * 
     * @param name the name value to set.
     * @return the AssociatedResource object itself.
     */
    public AssociatedResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cost property: The cost of the resource in USD per month if the resource is retained after the Droplet
     * is destroyed.
     * 
     * @return the cost value.
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * Set the cost property: The cost of the resource in USD per month if the resource is retained after the Droplet
     * is destroyed.
     * 
     * @param cost the cost value to set.
     * @return the AssociatedResource object itself.
     */
    public AssociatedResource setCost(String cost) {
        this.cost = cost;
        return this;
    }
}
