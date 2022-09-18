package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of resource that the firewall rule allows to access the database cluster.
 */
public final class FirewallRuleType extends ExpandableStringEnum<FirewallRuleType> {
    /**
     * Static value droplet for FirewallRuleType.
     */
    public static final FirewallRuleType DROPLET = fromString("droplet");

    /**
     * Static value k8s for FirewallRuleType.
     */
    public static final FirewallRuleType K8S = fromString("k8s");

    /**
     * Static value ip_addr for FirewallRuleType.
     */
    public static final FirewallRuleType IP_ADDR = fromString("ip_addr");

    /**
     * Static value tag for FirewallRuleType.
     */
    public static final FirewallRuleType TAG = fromString("tag");

    /**
     * Static value app for FirewallRuleType.
     */
    public static final FirewallRuleType APP = fromString("app");

    /**
     * Creates or finds a FirewallRuleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallRuleType.
     */
    @JsonCreator
    public static FirewallRuleType fromString(String name) {
        return fromString(name, FirewallRuleType.class);
    }

    /**
     * Gets known FirewallRuleType values.
     * 
     * @return known FirewallRuleType values.
     */
    public static Collection<FirewallRuleType> values() {
        return values(FirewallRuleType.class);
    }
}
