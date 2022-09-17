package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing a `state` attribute whose value is set to a string indicating the current status of the node.
 */
@Fluent
public final class NodeStatus {
    /*
     * A string indicating the current status of the node.
     */
    @JsonProperty(value = "state")
    private NodeStatusState state;

    /**
     * Get the state property: A string indicating the current status of the node.
     *
     * @return the state value.
     */
    public NodeStatusState getState() {
        return this.state;
    }

    /**
     * Set the state property: A string indicating the current status of the node.
     *
     * @param state the state value to set.
     * @return the NodeStatus object itself.
     */
    public NodeStatus setState(NodeStatusState state) {
        this.state = state;
        return this;
    }
}
