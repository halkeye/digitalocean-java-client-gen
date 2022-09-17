package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 {
    /*
     * The actions property.
     */
    @JsonProperty(value = "actions")
    private List<VolumeAction> actions;

    /**
     * Get the actions property: The actions property.
     *
     * @return the actions value.
     */
    public List<VolumeAction> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions property.
     *
     * @param actions the actions value to set.
     * @return the Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Vb7Vl6ResponsesVolumeactionsContentApplicationJsonSchemaAllof0 setActions(
            List<VolumeAction> actions) {
        this.actions = actions;
        return this;
    }
}
