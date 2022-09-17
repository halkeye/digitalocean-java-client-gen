package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FirewallRuleBase model. */
@Fluent
public class FirewallRuleBase {
    /*
     * The type of traffic to be allowed. This may be one of `tcp`, `udp`, or `icmp`.
     */
    @JsonProperty(value = "protocol", required = true)
    private FirewallRuleBaseProtocol protocol;

    /*
     * The ports on which traffic will be allowed specified as a string containing a single port, a range (e.g.
     * "8000-9000"), or "0" when all ports are open for a protocol. For ICMP rules this parameter will always return
     * "0".
     */
    @JsonProperty(value = "ports", required = true)
    private String ports;

    /**
     * Get the protocol property: The type of traffic to be allowed. This may be one of `tcp`, `udp`, or `icmp`.
     *
     * @return the protocol value.
     */
    public FirewallRuleBaseProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The type of traffic to be allowed. This may be one of `tcp`, `udp`, or `icmp`.
     *
     * @param protocol the protocol value to set.
     * @return the FirewallRuleBase object itself.
     */
    public FirewallRuleBase setProtocol(FirewallRuleBaseProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the ports property: The ports on which traffic will be allowed specified as a string containing a single
     * port, a range (e.g. "8000-9000"), or "0" when all ports are open for a protocol. For ICMP rules this parameter
     * will always return "0".
     *
     * @return the ports value.
     */
    public String getPorts() {
        return this.ports;
    }

    /**
     * Set the ports property: The ports on which traffic will be allowed specified as a string containing a single
     * port, a range (e.g. "8000-9000"), or "0" when all ports are open for a protocol. For ICMP rules this parameter
     * will always return "0".
     *
     * @param ports the ports value to set.
     * @return the FirewallRuleBase object itself.
     */
    public FirewallRuleBase setPorts(String ports) {
        this.ports = ports;
        return this;
    }
}
