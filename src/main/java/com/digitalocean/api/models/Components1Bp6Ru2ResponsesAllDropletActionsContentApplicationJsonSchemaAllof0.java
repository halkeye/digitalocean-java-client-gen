package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 {
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
     * @return the Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Bp6Ru2ResponsesAllDropletActionsContentApplicationJsonSchemaAllof0 setActions(
            List<Action> actions) {
        this.actions = actions;
        return this;
    }
}
