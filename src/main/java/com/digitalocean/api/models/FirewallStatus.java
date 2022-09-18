package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A status string indicating the current state of the firewall. This can be "waiting", "succeeded", or "failed".
 */
public final class FirewallStatus extends ExpandableStringEnum<FirewallStatus> {
    /**
     * Static value waiting for FirewallStatus.
     */
    public static final FirewallStatus WAITING = fromString("waiting");

    /**
     * Static value succeeded for FirewallStatus.
     */
    public static final FirewallStatus SUCCEEDED = fromString("succeeded");

    /**
     * Static value failed for FirewallStatus.
     */
    public static final FirewallStatus FAILED = fromString("failed");

    /**
     * Creates or finds a FirewallStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallStatus.
     */
    @JsonCreator
    public static FirewallStatus fromString(String name) {
        return fromString(name, FirewallStatus.class);
    }

    /**
     * Gets known FirewallStatus values.
     * 
     * @return known FirewallStatus values.
     */
    public static Collection<FirewallStatus> values() {
        return values(FirewallStatus.class);
    }
}
