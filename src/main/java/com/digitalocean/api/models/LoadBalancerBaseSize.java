package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This field has been replaced by the `size_unit` field for all regions except in AMS2, NYC2, and SFO1. Each available
 * load balancer size now equates to the load balancer having a set number of nodes. * `lb-small` = 1 node * `lb-medium`
 * = 3 nodes * `lb-large` = 6 nodes
 *
 * <p>You can resize load balancers after creation up to once per hour. You cannot resize a load balancer within the
 * first hour of its creation.
 */
public final class LoadBalancerBaseSize extends ExpandableStringEnum<LoadBalancerBaseSize> {
    /** Static value lb-small for LoadBalancerBaseSize. */
    public static final LoadBalancerBaseSize LB_SMALL = fromString("lb-small");

    /** Static value lb-medium for LoadBalancerBaseSize. */
    public static final LoadBalancerBaseSize LB_MEDIUM = fromString("lb-medium");

    /** Static value lb-large for LoadBalancerBaseSize. */
    public static final LoadBalancerBaseSize LB_LARGE = fromString("lb-large");

    /**
     * Creates or finds a LoadBalancerBaseSize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerBaseSize.
     */
    @JsonCreator
    public static LoadBalancerBaseSize fromString(String name) {
        return fromString(name, LoadBalancerBaseSize.class);
    }

    /**
     * Gets known LoadBalancerBaseSize values.
     *
     * @return known LoadBalancerBaseSize values.
     */
    public static Collection<LoadBalancerBaseSize> values() {
        return values(LoadBalancerBaseSize.class);
    }
}
