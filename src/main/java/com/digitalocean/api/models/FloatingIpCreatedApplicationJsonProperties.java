package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FloatingIpCreatedApplicationJsonProperties model. */
@Fluent
public final class FloatingIpCreatedApplicationJsonProperties {
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
     * @return the FloatingIpCreatedApplicationJsonProperties object itself.
     */
    public FloatingIpCreatedApplicationJsonProperties setDroplets(List<ActionLink> droplets) {
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
     * @return the FloatingIpCreatedApplicationJsonProperties object itself.
     */
    public FloatingIpCreatedApplicationJsonProperties setActions(List<ActionLink> actions) {
        this.actions = actions;
        return this;
    }
}
