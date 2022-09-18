package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DropletCreateApplicationJsonOneOfProperties model.
 */
@Fluent
public final class DropletCreateApplicationJsonOneOfProperties {
    /*
     * The actions property.
     */
    @JsonProperty(value = "actions")
    private List<ActionLink> actions;

    /**
     * Get the actions property: The actions property.
     * 
     * @return the actions value.
     */
    public List<ActionLink> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions property.
     * 
     * @param actions the actions value to set.
     * @return the DropletCreateApplicationJsonOneOfProperties object itself.
     */
    public DropletCreateApplicationJsonOneOfProperties setActions(List<ActionLink> actions) {
        this.actions = actions;
        return this;
    }
}
