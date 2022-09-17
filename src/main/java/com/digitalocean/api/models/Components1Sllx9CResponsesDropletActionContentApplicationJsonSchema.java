package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema model. */
@Fluent
public final class Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema {
    /*
     * The action property.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Get the action property: The action property.
     *
     * @return the action value.
     */
    public Action getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action property.
     *
     * @param action the action value to set.
     * @return the Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema object itself.
     */
    public Components1Sllx9CResponsesDropletActionContentApplicationJsonSchema setAction(Action action) {
        this.action = action;
        return this;
    }
}
