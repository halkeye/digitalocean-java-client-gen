package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema {
    /*
     * The droplet property.
     */
    @JsonProperty(value = "droplet")
    private Droplet droplet;

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
     * @return the Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema object itself.
     */
    public Components1Fz6HvkResponsesExistingDropletContentApplicationJsonSchema setDroplet(Droplet droplet) {
        this.droplet = droplet;
        return this;
    }
}
