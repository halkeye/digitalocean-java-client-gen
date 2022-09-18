package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * The FloatingIpActionAssign model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("assign")
@Fluent
public final class FloatingIpActionAssign extends FloatingIPsAction {
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
     * @return the FloatingIpActionAssign object itself.
     */
    public FloatingIpActionAssign setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
    }
}
