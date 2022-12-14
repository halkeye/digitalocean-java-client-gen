package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ReservedIpCreatedApplicationJsonProperties model.
 */
@Fluent
public final class ReservedIpCreatedApplicationJsonProperties {
    /*
     * The droplets property.
     */
    @JsonProperty(value = "droplets")
    private List<ActionLink> droplets;

    /*
     * The actions property.
     */
    @JsonProperty(value = "actions")
    private List<ActionLink> actions;

    /**
     * Get the droplets property: The droplets property.
     * 
     * @return the droplets value.
     */
    public List<ActionLink> getDroplets() {
        return this.droplets;
    }

    /**
     * Set the droplets property: The droplets property.
     * 
     * @param droplets the droplets value to set.
     * @return the ReservedIpCreatedApplicationJsonProperties object itself.
     */
    public ReservedIpCreatedApplicationJsonProperties setDroplets(List<ActionLink> droplets) {
        this.droplets = droplets;
        return this;
    }

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
     * @return the ReservedIpCreatedApplicationJsonProperties object itself.
     */
    public ReservedIpCreatedApplicationJsonProperties setActions(List<ActionLink> actions) {
        this.actions = actions;
        return this;
    }
}
