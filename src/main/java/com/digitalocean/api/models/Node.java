package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * The Node model.
 */
@Fluent
public final class Node {
    /*
     * A unique ID that can be used to identify and reference the node.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /*
     * An automatically generated, human-readable name for the node.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An object containing a `state` attribute whose value is set to a string indicating the current status of the
     * node.
     */
    @JsonProperty(value = "status")
    private NodeStatus status;

    /*
     * The ID of the Droplet used for the worker node.
     */
    @JsonProperty(value = "droplet_id")
    private String dropletId;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the node was created.
     */
    @JsonProperty(value = "created_at")
    private OffsetDateTime createdAt;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the node was last updated.
     */
    @JsonProperty(value = "updated_at")
    private OffsetDateTime updatedAt;

    /**
     * Get the id property: A unique ID that can be used to identify and reference the node.
     * 
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique ID that can be used to identify and reference the node.
     * 
     * @param id the id value to set.
     * @return the Node object itself.
     */
    public Node setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: An automatically generated, human-readable name for the node.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: An automatically generated, human-readable name for the node.
     * 
     * @param name the name value to set.
     * @return the Node object itself.
     */
    public Node setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: An object containing a `state` attribute whose value is set to a string indicating the
     * current status of the node.
     * 
     * @return the status value.
     */
    public NodeStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: An object containing a `state` attribute whose value is set to a string indicating the
     * current status of the node.
     * 
     * @param status the status value to set.
     * @return the Node object itself.
     */
    public Node setStatus(NodeStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the dropletId property: The ID of the Droplet used for the worker node.
     * 
     * @return the dropletId value.
     */
    public String getDropletId() {
        return this.dropletId;
    }

    /**
     * Set the dropletId property: The ID of the Droplet used for the worker node.
     * 
     * @param dropletId the dropletId value to set.
     * @return the Node object itself.
     */
    public Node setDropletId(String dropletId) {
        this.dropletId = dropletId;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * node was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * node was created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the Node object itself.
     */
    public Node setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * node was last updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * node was last updated.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the Node object itself.
     */
    public Node setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
