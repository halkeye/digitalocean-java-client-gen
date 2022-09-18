package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string indicating the current status of the cluster.
 */
public final class ClusterStatusState extends ExpandableStringEnum<ClusterStatusState> {
    /**
     * Static value running for ClusterStatusState.
     */
    public static final ClusterStatusState RUNNING = fromString("running");

    /**
     * Static value provisioning for ClusterStatusState.
     */
    public static final ClusterStatusState PROVISIONING = fromString("provisioning");

    /**
     * Static value degraded for ClusterStatusState.
     */
    public static final ClusterStatusState DEGRADED = fromString("degraded");

    /**
     * Static value error for ClusterStatusState.
     */
    public static final ClusterStatusState ERROR = fromString("error");

    /**
     * Static value deleted for ClusterStatusState.
     */
    public static final ClusterStatusState DELETED = fromString("deleted");

    /**
     * Static value upgrading for ClusterStatusState.
     */
    public static final ClusterStatusState UPGRADING = fromString("upgrading");

    /**
     * Static value deleting for ClusterStatusState.
     */
    public static final ClusterStatusState DELETING = fromString("deleting");

    /**
     * Creates or finds a ClusterStatusState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterStatusState.
     */
    @JsonCreator
    public static ClusterStatusState fromString(String name) {
        return fromString(name, ClusterStatusState.class);
    }

    /**
     * Gets known ClusterStatusState values.
     * 
     * @return known ClusterStatusState values.
     */
    public static Collection<ClusterStatusState> values() {
        return values(ClusterStatusState.class);
    }
}
