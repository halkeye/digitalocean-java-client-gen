package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema {
    /*
     * An array containing the IDs of the Droplets to be assigned to the firewall.
     */
    @JsonProperty(value = "droplet_ids", required = true)
    private List<Integer> dropletIds;

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets to be assigned to the firewall.
     * 
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Set the dropletIds property: An array containing the IDs of the Droplets to be assigned to the firewall.
     * 
     * @param dropletIds the dropletIds value to set.
     * @return the Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }
}
