package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * An object containing a `state` attribute whose value is set to a string indicating the current status of the
 * cluster.
 */
@Fluent
public final class ClusterStatus {
    /*
     * A string indicating the current status of the cluster.
     */
    @JsonProperty(value = "state")
    private ClusterStatusState state;

    /*
     * An optional message providing additional information about the current cluster state.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the state property: A string indicating the current status of the cluster.
     * 
     * @return the state value.
     */
    public ClusterStatusState getState() {
        return this.state;
    }

    /**
     * Set the state property: A string indicating the current status of the cluster.
     * 
     * @param state the state value to set.
     * @return the ClusterStatus object itself.
     */
    public ClusterStatus setState(ClusterStatusState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the message property: An optional message providing additional information about the current cluster state.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: An optional message providing additional information about the current cluster state.
     * 
     * @param message the message value to set.
     * @return the ClusterStatus object itself.
     */
    public ClusterStatus setMessage(String message) {
        this.message = message;
        return this;
    }
}
