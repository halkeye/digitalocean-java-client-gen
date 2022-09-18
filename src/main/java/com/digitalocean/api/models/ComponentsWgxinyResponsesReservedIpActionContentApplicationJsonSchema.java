package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema {
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
     * @return the ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema object itself.
     */
    public ComponentsWgxinyResponsesReservedIpActionContentApplicationJsonSchema setAction(Action action) {
        this.action = action;
        return this;
    }
}
