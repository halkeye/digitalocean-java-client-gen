package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks model.
 */
@Fluent
public final class Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks {
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
     * @return the Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks object
     * itself.
     */
    public Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks setActions(List<ActionLink> actions) {
        this.actions = actions;
        return this;
    }
}
