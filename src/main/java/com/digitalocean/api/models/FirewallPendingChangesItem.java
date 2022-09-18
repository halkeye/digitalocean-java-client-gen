package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The FirewallPendingChangesItem model.
 */
@Fluent
public final class FirewallPendingChangesItem {
    /*
     * The droplet_id property.
     */
    @JsonProperty(value = "droplet_id")
    private Integer dropletId;

    /*
     * The removing property.
     */
    @JsonProperty(value = "removing")
    private Boolean removing;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the dropletId property: The droplet_id property.
     * 
     * @return the dropletId value.
     */
    public Integer getDropletId() {
        return this.dropletId;
    }

    /**
     * Set the dropletId property: The droplet_id property.
     * 
     * @param dropletId the dropletId value to set.
     * @return the FirewallPendingChangesItem object itself.
     */
    public FirewallPendingChangesItem setDropletId(Integer dropletId) {
        this.dropletId = dropletId;
        return this;
    }

    /**
     * Get the removing property: The removing property.
     * 
     * @return the removing value.
     */
    public Boolean isRemoving() {
        return this.removing;
    }

    /**
     * Set the removing property: The removing property.
     * 
     * @param removing the removing value to set.
     * @return the FirewallPendingChangesItem object itself.
     */
    public FirewallPendingChangesItem setRemoving(Boolean removing) {
        this.removing = removing;
        return this;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     * 
     * @param status the status value to set.
     * @return the FirewallPendingChangesItem object itself.
     */
    public FirewallPendingChangesItem setStatus(String status) {
        this.status = status;
        return this;
    }
}
