package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The VpcUpdatable model.
 */
@Fluent
public class VpcUpdatable {
    /*
     * The name of the VPC. Must be unique and may only contain alphanumeric characters, dashes, and periods.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A free-form text field for describing the VPC's purpose. It may be a maximum of 255 characters.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name property: The name of the VPC. Must be unique and may only contain alphanumeric characters, dashes,
     * and periods.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the VPC. Must be unique and may only contain alphanumeric characters, dashes,
     * and periods.
     * 
     * @param name the name value to set.
     * @return the VpcUpdatable object itself.
     */
    public VpcUpdatable setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: A free-form text field for describing the VPC's purpose. It may be a maximum of
     * 255 characters.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A free-form text field for describing the VPC's purpose. It may be a maximum of
     * 255 characters.
     * 
     * @param description the description value to set.
     * @return the VpcUpdatable object itself.
     */
    public VpcUpdatable setDescription(String description) {
        this.description = description;
        return this;
    }
}
