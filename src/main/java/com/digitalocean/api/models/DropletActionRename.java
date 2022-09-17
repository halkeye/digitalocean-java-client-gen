package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DropletActionRename model. */
@Fluent
public final class DropletActionRename extends DropletAction {
    /*
     * The new name for the Droplet.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The new name for the Droplet.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The new name for the Droplet.
     *
     * @param name the name value to set.
     * @return the DropletActionRename object itself.
     */
    public DropletActionRename setName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DropletActionRename setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
