package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Assign to Droplet. */
@Fluent
public final class AssignToDroplet {
    /*
     * The ID of the Droplet that the floating IP will be assigned to.
     */
    @JsonProperty(value = "droplet_id", required = true)
    private int dropletId;

    /**
     * Get the dropletId property: The ID of the Droplet that the floating IP will be assigned to.
     *
     * @return the dropletId value.
     */
    public int getDropletId() {
        return this.dropletId;
    }

    /**
     * Set the dropletId property: The ID of the Droplet that the floating IP will be assigned to.
     *
     * @param dropletId the dropletId value to set.
     * @return the AssignToDroplet object itself.
     */
    public AssignToDroplet setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
    }
}
