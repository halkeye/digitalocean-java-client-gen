package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of traffic to be allowed. This may be one of `tcp`, `udp`, or `icmp`.
 */
public final class FirewallRuleBaseProtocol extends ExpandableStringEnum<FirewallRuleBaseProtocol> {
    /**
     * Static value tcp for FirewallRuleBaseProtocol.
     */
    public static final FirewallRuleBaseProtocol TCP = fromString("tcp");

    /**
     * Static value udp for FirewallRuleBaseProtocol.
     */
    public static final FirewallRuleBaseProtocol UDP = fromString("udp");

    /**
     * Static value icmp for FirewallRuleBaseProtocol.
     */
    public static final FirewallRuleBaseProtocol ICMP = fromString("icmp");

    /**
     * Creates or finds a FirewallRuleBaseProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallRuleBaseProtocol.
     */
    @JsonCreator
    public static FirewallRuleBaseProtocol fromString(String name) {
        return fromString(name, FirewallRuleBaseProtocol.class);
    }

    /**
     * Gets known FirewallRuleBaseProtocol values.
     * 
     * @return known FirewallRuleBaseProtocol values.
     */
    public static Collection<FirewallRuleBaseProtocol> values() {
        return values(FirewallRuleBaseProtocol.class);
    }
}
