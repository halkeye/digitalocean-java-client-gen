package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema {
    /*
     * The actions property.
     */
    @JsonProperty(value = "actions")
    private List<Action> actions;

    /**
     * Get the actions property: The actions property.
     * 
     * @return the actions value.
     */
    public List<Action> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions property.
     * 
     * @param actions the actions value to set.
     * @return the ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsCbli51ResponsesDropletActionsResponseContentApplicationJsonSchema setActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }
}
