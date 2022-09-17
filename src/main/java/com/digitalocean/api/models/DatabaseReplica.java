package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The DatabaseReplica model. */
@Fluent
public class DatabaseReplica {
    /*
     * A unique ID that can be used to identify and reference a database replica.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The name to give the read-only replicating
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A slug identifier for the region where the read-only replica will be located. If excluded, the replica will be
     * placed in the same region as the cluster.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * A slug identifier representing the size of the node for the read-only replica. The size of the replica must be
     * at least as large as the node size for the database cluster from which it is replicating.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * A string representing the current status of the database cluster.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseReplicaStatus status;

    /*
     * A flat array of tag names as strings to apply to the read-only replica after it is created. Tag names can either
     * be existing or new tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the database cluster was
     * created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * A string specifying the UUID of the VPC to which the read-only replica will be assigned. If excluded, the
     * replica will be assigned to your account's default VPC for the region.
     */
    @JsonProperty(value = "private_network_uuid")
    private String privateNetworkUuid;

    /*
     * The connection property.
     */
    @JsonProperty(value = "connection")
    private DatabaseReplicaConnection connection;

    /*
     * The private_connection property.
     */
    @JsonProperty(value = "private_connection")
    private DatabaseReplicaPrivateConnection privateConnection;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a database replica.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the name property: The name to give the read-only replicating.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name to give the read-only replicating.
     *
     * @param name the name value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the region property: A slug identifier for the region where the read-only replica will be located. If
     * excluded, the replica will be placed in the same region as the cluster.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: A slug identifier for the region where the read-only replica will be located. If
     * excluded, the replica will be placed in the same region as the cluster.
     *
     * @param region the region value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the size property: A slug identifier representing the size of the node for the read-only replica. The size of
     * the replica must be at least as large as the node size for the database cluster from which it is replicating.
     *
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: A slug identifier representing the size of the node for the read-only replica. The size of
     * the replica must be at least as large as the node size for the database cluster from which it is replicating.
     *
     * @param size the size value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the status property: A string representing the current status of the database cluster.
     *
     * @return the status value.
     */
    public DatabaseReplicaStatus getStatus() {
        return this.status;
    }

    /**
     * Get the tags property: A flat array of tag names as strings to apply to the read-only replica after it is
     * created. Tag names can either be existing or new tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A flat array of tag names as strings to apply to the read-only replica after it is
     * created. Tag names can either be existing or new tags.
     *
     * @param tags the tags value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * database cluster was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the privateNetworkUuid property: A string specifying the UUID of the VPC to which the read-only replica will
     * be assigned. If excluded, the replica will be assigned to your account's default VPC for the region.
     *
     * @return the privateNetworkUuid value.
     */
    public String getPrivateNetworkUuid() {
        return this.privateNetworkUuid;
    }

    /**
     * Set the privateNetworkUuid property: A string specifying the UUID of the VPC to which the read-only replica will
     * be assigned. If excluded, the replica will be assigned to your account's default VPC for the region.
     *
     * @param privateNetworkUuid the privateNetworkUuid value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setPrivateNetworkUuid(String privateNetworkUuid) {
        this.privateNetworkUuid = privateNetworkUuid;
        return this;
    }

    /**
     * Get the connection property: The connection property.
     *
     * @return the connection value.
     */
    public DatabaseReplicaConnection getConnection() {
        return this.connection;
    }

    /**
     * Set the connection property: The connection property.
     *
     * @param connection the connection value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setConnection(DatabaseReplicaConnection connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get the privateConnection property: The private_connection property.
     *
     * @return the privateConnection value.
     */
    public DatabaseReplicaPrivateConnection getPrivateConnection() {
        return this.privateConnection;
    }

    /**
     * Set the privateConnection property: The private_connection property.
     *
     * @param privateConnection the privateConnection value to set.
     * @return the DatabaseReplica object itself.
     */
    public DatabaseReplica setPrivateConnection(DatabaseReplicaPrivateConnection privateConnection) {
        this.privateConnection = privateConnection;
        return this;
    }
}
