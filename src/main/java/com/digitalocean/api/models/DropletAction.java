package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the action that will be taken on the Droplet. */
@Fluent
public class DropletAction {
    /*
     * The type of action to initiate for the Droplet.
     */
    @JsonProperty(value = "type", required = true)
    private DropletActionType type;

    /**
     * Get the type property: The type of action to initiate for the Droplet.
     *
     * @return the type value.
     */
    public DropletActionType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of action to initiate for the Droplet.
     *
     * @param type the type value to set.
     * @return the DropletAction object itself.
     */
    public DropletAction setType(DropletActionType type) {
        this.type = type;
        return this;
    }
}
