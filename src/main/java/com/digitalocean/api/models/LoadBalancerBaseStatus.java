package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A status string indicating the current state of the load balancer. This can be `new`, `active`, or `errored`.
 */
public final class LoadBalancerBaseStatus extends ExpandableStringEnum<LoadBalancerBaseStatus> {
    /**
     * Static value new for LoadBalancerBaseStatus.
     */
    public static final LoadBalancerBaseStatus NEW = fromString("new");

    /**
     * Static value active for LoadBalancerBaseStatus.
     */
    public static final LoadBalancerBaseStatus ACTIVE = fromString("active");

    /**
     * Static value errored for LoadBalancerBaseStatus.
     */
    public static final LoadBalancerBaseStatus ERRORED = fromString("errored");

    /**
     * Creates or finds a LoadBalancerBaseStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LoadBalancerBaseStatus.
     */
    @JsonCreator
    public static LoadBalancerBaseStatus fromString(String name) {
        return fromString(name, LoadBalancerBaseStatus.class);
    }

    /**
     * Gets known LoadBalancerBaseStatus values.
     * 
     * @return known LoadBalancerBaseStatus values.
     */
    public static Collection<LoadBalancerBaseStatus> values() {
        return values(LoadBalancerBaseStatus.class);
    }
}
