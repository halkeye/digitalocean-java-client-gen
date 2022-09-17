package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DropletActionSnapshot model. */
@Fluent
public final class DropletActionSnapshot extends DropletAction {
    /*
     * The name to give the new snapshot of the Droplet.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The name to give the new snapshot of the Droplet.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name to give the new snapshot of the Droplet.
     *
     * @param name the name value to set.
     * @return the DropletActionSnapshot object itself.
     */
    public DropletActionSnapshot setName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DropletActionSnapshot setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
