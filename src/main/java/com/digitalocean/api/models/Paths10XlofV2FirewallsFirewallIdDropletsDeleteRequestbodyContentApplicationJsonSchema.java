package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema {
    /*
     * An array containing the IDs of the Droplets to be removed from the firewall.
     */
    @JsonProperty(value = "droplet_ids", required = true)
    private List<Integer> dropletIds;

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets to be removed from the firewall.
     *
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Set the dropletIds property: An array containing the IDs of the Droplets to be removed from the firewall.
     *
     * @param dropletIds the dropletIds value to set.
     * @return the Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema setDropletIds(
            List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }
}
