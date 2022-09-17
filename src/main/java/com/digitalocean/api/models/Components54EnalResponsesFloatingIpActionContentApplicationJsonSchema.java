package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema model. */
@Fluent
public final class Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema {
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
     * @return the Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema object itself.
     */
    public Components54EnalResponsesFloatingIpActionContentApplicationJsonSchema setAction(Action action) {
        this.action = action;
        return this;
    }
}
