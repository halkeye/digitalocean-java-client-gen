package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 {
    /*
     * The droplets property.
     */
    @JsonProperty(value = "droplets")
    private List<Droplet> droplets;

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
     * @return the ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsAplp5ResponsesAllDropletsContentApplicationJsonSchemaAllof0 setDroplets(List<Droplet> droplets) {
        this.droplets = droplets;
        return this;
    }
}
