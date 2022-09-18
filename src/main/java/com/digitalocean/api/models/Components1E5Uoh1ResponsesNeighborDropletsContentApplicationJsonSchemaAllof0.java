package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 {
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
     * @return the Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 setDroplets(List<Droplet> droplets) {
        this.droplets = droplets;
        return this;
    }
}
