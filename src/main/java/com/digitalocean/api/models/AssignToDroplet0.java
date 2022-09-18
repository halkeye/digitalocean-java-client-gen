package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Assign to Droplet.
 */
@Fluent
public final class AssignToDroplet0 {
    /*
     * The ID of the Droplet that the reserved IP will be assigned to.
     */
    @JsonProperty(value = "droplet_id", required = true)
    private int dropletId;

    /**
     * Get the dropletId property: The ID of the Droplet that the reserved IP will be assigned to.
     * 
     * @return the dropletId value.
     */
    public int getDropletId() {
        return this.dropletId;
    }

    /**
     * Set the dropletId property: The ID of the Droplet that the reserved IP will be assigned to.
     * 
     * @param dropletId the dropletId value to set.
     * @return the AssignToDroplet0 object itself.
     */
    public AssignToDroplet0 setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
    }
}
