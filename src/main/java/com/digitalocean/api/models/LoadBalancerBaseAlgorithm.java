package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This field has been deprecated. You can no longer specify an algorithm for load balancers. */
public final class LoadBalancerBaseAlgorithm extends ExpandableStringEnum<LoadBalancerBaseAlgorithm> {
    /** Static value round_robin for LoadBalancerBaseAlgorithm. */
    public static final LoadBalancerBaseAlgorithm ROUND_ROBIN = fromString("round_robin");

    /** Static value least_connections for LoadBalancerBaseAlgorithm. */
    public static final LoadBalancerBaseAlgorithm LEAST_CONNECTIONS = fromString("least_connections");

    /**
     * Creates or finds a LoadBalancerBaseAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerBaseAlgorithm.
     */
    @JsonCreator
    public static LoadBalancerBaseAlgorithm fromString(String name) {
        return fromString(name, LoadBalancerBaseAlgorithm.class);
    }

    /**
     * Gets known LoadBalancerBaseAlgorithm values.
     *
     * @return known LoadBalancerBaseAlgorithm values.
     */
    public static Collection<LoadBalancerBaseAlgorithm> values() {
        return values(LoadBalancerBaseAlgorithm.class);
    }
}
