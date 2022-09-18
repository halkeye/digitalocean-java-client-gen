package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string indicating the current status of the node.
 */
public final class NodeStatusState extends ExpandableStringEnum<NodeStatusState> {
    /**
     * Static value provisioning for NodeStatusState.
     */
    public static final NodeStatusState PROVISIONING = fromString("provisioning");

    /**
     * Static value running for NodeStatusState.
     */
    public static final NodeStatusState RUNNING = fromString("running");

    /**
     * Static value draining for NodeStatusState.
     */
    public static final NodeStatusState DRAINING = fromString("draining");

    /**
     * Static value deleting for NodeStatusState.
     */
    public static final NodeStatusState DELETING = fromString("deleting");

    /**
     * Creates or finds a NodeStatusState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NodeStatusState.
     */
    @JsonCreator
    public static NodeStatusState fromString(String name) {
        return fromString(name, NodeStatusState.class);
    }

    /**
     * Gets known NodeStatusState values.
     * 
     * @return known NodeStatusState values.
     */
    public static Collection<NodeStatusState> values() {
        return values(NodeStatusState.class);
    }
}
