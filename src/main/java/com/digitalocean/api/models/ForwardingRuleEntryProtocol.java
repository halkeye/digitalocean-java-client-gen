package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The protocol used for traffic to the load balancer. The possible values are: `http`, `https`, `http2`, `tcp`, or `udp`. If you set the  `entry_protocol` to `upd`, the `target_protocol` must be set to `udp`.  When using UDP, the load balancer requires that you set up a health  check with a port that uses TCP, HTTP, or HTTPS to work properly.
 */
public final class ForwardingRuleEntryProtocol extends ExpandableStringEnum<ForwardingRuleEntryProtocol> {
    /**
     * Static value http for ForwardingRuleEntryProtocol.
     */
    public static final ForwardingRuleEntryProtocol HTTP = fromString("http");

    /**
     * Static value https for ForwardingRuleEntryProtocol.
     */
    public static final ForwardingRuleEntryProtocol HTTPS = fromString("https");

    /**
     * Static value http2 for ForwardingRuleEntryProtocol.
     */
    public static final ForwardingRuleEntryProtocol HTTP2 = fromString("http2");

    /**
     * Static value tcp for ForwardingRuleEntryProtocol.
     */
    public static final ForwardingRuleEntryProtocol TCP = fromString("tcp");

    /**
     * Static value udp for ForwardingRuleEntryProtocol.
     */
    public static final ForwardingRuleEntryProtocol UDP = fromString("udp");

    /**
     * Creates or finds a ForwardingRuleEntryProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ForwardingRuleEntryProtocol.
     */
    @JsonCreator
    public static ForwardingRuleEntryProtocol fromString(String name) {
        return fromString(name, ForwardingRuleEntryProtocol.class);
    }

    /**
     * Gets known ForwardingRuleEntryProtocol values.
     * 
     * @return known ForwardingRuleEntryProtocol values.
     */
    public static Collection<ForwardingRuleEntryProtocol> values() {
        return values(ForwardingRuleEntryProtocol.class);
    }
}
