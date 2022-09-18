package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The details of the network that are configured for the Droplet instance.  This is an object that contains keys for
 * IPv4 and IPv6.  The value of each of these is an array that contains objects describing an individual IP resource
 * allocated to the Droplet.  These will define attributes like the IP address, netmask, and gateway of the specific
 * network depending on the type of network it is.
 */
@Fluent
public final class DropletNetworks {
    /*
     * The v4 property.
     */
    @JsonProperty(value = "v4")
    private List<NetworkV4> v4;

    /*
     * The v6 property.
     */
    @JsonProperty(value = "v6")
    private List<NetworkV6> v6;

    /**
     * Get the v4 property: The v4 property.
     * 
     * @return the v4 value.
     */
    public List<NetworkV4> getV4() {
        return this.v4;
    }

    /**
     * Set the v4 property: The v4 property.
     * 
     * @param v4 the v4 value to set.
     * @return the DropletNetworks object itself.
     */
    public DropletNetworks setV4(List<NetworkV4> v4) {
        this.v4 = v4;
        return this;
    }

    /**
     * Get the v6 property: The v6 property.
     * 
     * @return the v6 value.
     */
    public List<NetworkV6> getV6() {
        return this.v6;
    }

    /**
     * Set the v6 property: The v6 property.
     * 
     * @param v6 the v6 value to set.
     * @return the DropletNetworks object itself.
     */
    public DropletNetworks setV6(List<NetworkV6> v6) {
        this.v6 = v6;
        return this;
    }
}
