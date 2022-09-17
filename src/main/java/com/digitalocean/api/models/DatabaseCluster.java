package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The DatabaseCluster model. */
@Fluent
public class DatabaseCluster {
    /*
     * A unique ID that can be used to identify and reference a database cluster.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * A unique, human-readable name referring to a database cluster.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A slug representing the database engine used for the cluster. The possible values are: "pg" for PostgreSQL,
     * "mysql" for MySQL, "redis" for Redis, and "mongodb" for MongoDB.
     */
    @JsonProperty(value = "engine", required = true)
    private DatabaseClusterEngine engine;

    /*
     * A string representing the version of the database engine in use for the cluster.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The number of nodes in the database cluster.
     */
    @JsonProperty(value = "num_nodes", required = true)
    private int numNodes;

    /*
     * The slug identifier representing the size of the nodes in the database cluster.
     */
    @JsonProperty(value = "size", required = true)
    private String size;

    /*
     * The slug identifier for the region where the database cluster is located.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /*
     * A string representing the current status of the database cluster.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseClusterStatus status;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the database cluster was
     * created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * A string specifying the UUID of the VPC to which the database cluster will be assigned. If excluded, the cluster
     * when creating a new database cluster, it will be assigned to your account's default VPC for the region.
     */
    @JsonProperty(value = "private_network_uuid")
    private String privateNetworkUuid;

    /*
     * An array of tags that have been applied to the database cluster.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * An array of strings containing the names of databases created in the database cluster.
     */
    @JsonProperty(value = "db_names", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dbNames;

    /*
     * The connection property.
     */
    @JsonProperty(value = "connection")
    private DatabaseClusterConnection connection;

    /*
     * The private_connection property.
     */
    @JsonProperty(value = "private_connection")
    private DatabaseClusterPrivateConnection privateConnection;

    /*
     * The users property.
     */
    @JsonProperty(value = "users", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseUser> users;

    /*
     * The maintenance_window property.
     */
    @JsonProperty(value = "maintenance_window")
    private DatabaseClusterMaintenanceWindow maintenanceWindow;

    /*
     * The ID of the project that the database cluster is assigned to. If excluded when creating a new database
     * cluster, it will be assigned to your default project.
     */
    @JsonProperty(value = "project_id")
    private UUID projectId;

    /*
     * The rules property.
     */
    @JsonProperty(value = "rules")
    private List<FirewallRule> rules;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a database cluster.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the name property: A unique, human-readable name referring to a database cluster.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A unique, human-readable name referring to a database cluster.
     *
     * @param name the name value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the engine property: A slug representing the database engine used for the cluster. The possible values are:
     * "pg" for PostgreSQL, "mysql" for MySQL, "redis" for Redis, and "mongodb" for MongoDB.
     *
     * @return the engine value.
     */
    public DatabaseClusterEngine getEngine() {
        return this.engine;
    }

    /**
     * Set the engine property: A slug representing the database engine used for the cluster. The possible values are:
     * "pg" for PostgreSQL, "mysql" for MySQL, "redis" for Redis, and "mongodb" for MongoDB.
     *
     * @param engine the engine value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setEngine(DatabaseClusterEngine engine) {
        this.engine = engine;
        return this;
    }

    /**
     * Get the version property: A string representing the version of the database engine in use for the cluster.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: A string representing the version of the database engine in use for the cluster.
     *
     * @param version the version value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the numNodes property: The number of nodes in the database cluster.
     *
     * @return the numNodes value.
     */
    public int getNumNodes() {
        return this.numNodes;
    }

    /**
     * Set the numNodes property: The number of nodes in the database cluster.
     *
     * @param numNodes the numNodes value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setNumNodes(int numNodes) {
        this.numNodes = numNodes;
        return this;
    }

    /**
     * Get the size property: The slug identifier representing the size of the nodes in the database cluster.
     *
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: The slug identifier representing the size of the nodes in the database cluster.
     *
     * @param size the size value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the region property: The slug identifier for the region where the database cluster is located.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the database cluster is located.
     *
     * @param region the region value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the status property: A string representing the current status of the database cluster.
     *
     * @return the status value.
     */
    public DatabaseClusterStatus getStatus() {
        return this.status;
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
     * Get the privateNetworkUuid property: A string specifying the UUID of the VPC to which the database cluster will
     * be assigned. If excluded, the cluster when creating a new database cluster, it will be assigned to your account's
     * default VPC for the region.
     *
     * @return the privateNetworkUuid value.
     */
    public String getPrivateNetworkUuid() {
        return this.privateNetworkUuid;
    }

    /**
     * Set the privateNetworkUuid property: A string specifying the UUID of the VPC to which the database cluster will
     * be assigned. If excluded, the cluster when creating a new database cluster, it will be assigned to your account's
     * default VPC for the region.
     *
     * @param privateNetworkUuid the privateNetworkUuid value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setPrivateNetworkUuid(String privateNetworkUuid) {
        this.privateNetworkUuid = privateNetworkUuid;
        return this;
    }

    /**
     * Get the tags property: An array of tags that have been applied to the database cluster.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: An array of tags that have been applied to the database cluster.
     *
     * @param tags the tags value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the dbNames property: An array of strings containing the names of databases created in the database cluster.
     *
     * @return the dbNames value.
     */
    public List<String> getDbNames() {
        return this.dbNames;
    }

    /**
     * Get the connection property: The connection property.
     *
     * @return the connection value.
     */
    public DatabaseClusterConnection getConnection() {
        return this.connection;
    }

    /**
     * Set the connection property: The connection property.
     *
     * @param connection the connection value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setConnection(DatabaseClusterConnection connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get the privateConnection property: The private_connection property.
     *
     * @return the privateConnection value.
     */
    public DatabaseClusterPrivateConnection getPrivateConnection() {
        return this.privateConnection;
    }

    /**
     * Set the privateConnection property: The private_connection property.
     *
     * @param privateConnection the privateConnection value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setPrivateConnection(DatabaseClusterPrivateConnection privateConnection) {
        this.privateConnection = privateConnection;
        return this;
    }

    /**
     * Get the users property: The users property.
     *
     * @return the users value.
     */
    public List<DatabaseUser> getUsers() {
        return this.users;
    }

    /**
     * Get the maintenanceWindow property: The maintenance_window property.
     *
     * @return the maintenanceWindow value.
     */
    public DatabaseClusterMaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: The maintenance_window property.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setMaintenanceWindow(DatabaseClusterMaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the projectId property: The ID of the project that the database cluster is assigned to. If excluded when
     * creating a new database cluster, it will be assigned to your default project.
     *
     * @return the projectId value.
     */
    public UUID getProjectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: The ID of the project that the database cluster is assigned to. If excluded when
     * creating a new database cluster, it will be assigned to your default project.
     *
     * @param projectId the projectId value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the rules property: The rules property.
     *
     * @return the rules value.
     */
    public List<FirewallRule> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules property.
     *
     * @param rules the rules value to set.
     * @return the DatabaseCluster object itself.
     */
    public DatabaseCluster setRules(List<FirewallRule> rules) {
        this.rules = rules;
        return this;
    }
}
