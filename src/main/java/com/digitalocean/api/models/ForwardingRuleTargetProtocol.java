package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The protocol used for traffic from the load balancer to the backend Droplets. The possible values are: `http`,
 * `https`, `http2`, `tcp`, or `udp`. If you set the `target_protocol` to `upd`, the `entry_protocol` must be set to
 * `udp`. When using UDP, the load balancer requires that you set up a health check with a port that uses TCP, HTTP, or
 * HTTPS to work properly.
 */
public final class ForwardingRuleTargetProtocol extends ExpandableStringEnum<ForwardingRuleTargetProtocol> {
    /** Static value http for ForwardingRuleTargetProtocol. */
    public static final ForwardingRuleTargetProtocol HTTP = fromString("http");

    /** Static value https for ForwardingRuleTargetProtocol. */
    public static final ForwardingRuleTargetProtocol HTTPS = fromString("https");

    /** Static value http2 for ForwardingRuleTargetProtocol. */
    public static final ForwardingRuleTargetProtocol HTTP2 = fromString("http2");

    /** Static value tcp for ForwardingRuleTargetProtocol. */
    public static final ForwardingRuleTargetProtocol TCP = fromString("tcp");

    /** Static value udp for ForwardingRuleTargetProtocol. */
    public static final ForwardingRuleTargetProtocol UDP = fromString("udp");

    /**
     * Creates or finds a ForwardingRuleTargetProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForwardingRuleTargetProtocol.
     */
    @JsonCreator
    public static ForwardingRuleTargetProtocol fromString(String name) {
        return fromString(name, ForwardingRuleTargetProtocol.class);
    }

    /**
     * Gets known ForwardingRuleTargetProtocol values.
     *
     * @return known ForwardingRuleTargetProtocol values.
     */
    public static Collection<ForwardingRuleTargetProtocol> values() {
        return values(ForwardingRuleTargetProtocol.class);
    }
}
