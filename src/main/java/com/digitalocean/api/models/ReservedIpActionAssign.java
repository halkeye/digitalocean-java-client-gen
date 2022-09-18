package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * The ReservedIpActionAssign model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("assign")
@Fluent
public final class ReservedIpActionAssign extends ReservedIpActionType {
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
     * @return the ReservedIpActionAssign object itself.
     */
    public ReservedIpActionAssign setDropletId(int dropletId) {
        this.dropletId = dropletId;
        return this;
    }
}
