package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ConnectionPool model.
 */
@Fluent
public final class ConnectionPool {
    /*
     * A unique name for the connection pool. Must be between 3 and 60 characters.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and
     * statement.
     */
    @JsonProperty(value = "mode", required = true)
    private String mode;

    /*
     * The desired size of the PGBouncer connection pool. The maximum allowed size is determined by the size of the
     * cluster's primary node. 25 backend server connections are allowed for every 1GB of RAM. Three are reserved for
     * maintenance. For example, a primary node with 1 GB of RAM allows for a maximum of 22 backend server connections
     * while one with 4 GB would allow for 97. Note that these are shared across all connection pools in a cluster.
     */
    @JsonProperty(value = "size", required = true)
    private int size;

    /*
     * The database for use with the connection pool.
     */
    @JsonProperty(value = "db", required = true)
    private String db;

    /*
     * The name of the user for use with the connection pool. When excluded, all sessions connect to the database as
     * the inbound user.
     */
    @JsonProperty(value = "user")
    private String user;

    /*
     * The connection property.
     */
    @JsonProperty(value = "connection")
    private ConnectionPoolConnection connection;

    /*
     * The private_connection property.
     */
    @JsonProperty(value = "private_connection")
    private ConnectionPoolPrivateConnection privateConnection;

    /**
     * Get the name property: A unique name for the connection pool. Must be between 3 and 60 characters.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A unique name for the connection pool. Must be between 3 and 60 characters.
     * 
     * @param name the name value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the mode property: The PGBouncer transaction mode for the connection pool. The allowed values are session,
     * transaction, and statement.
     * 
     * @return the mode value.
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: The PGBouncer transaction mode for the connection pool. The allowed values are session,
     * transaction, and statement.
     * 
     * @param mode the mode value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the size property: The desired size of the PGBouncer connection pool. The maximum allowed size is determined
     * by the size of the cluster's primary node. 25 backend server connections are allowed for every 1GB of RAM. Three
     * are reserved for maintenance. For example, a primary node with 1 GB of RAM allows for a maximum of 22 backend
     * server connections while one with 4 GB would allow for 97. Note that these are shared across all connection
     * pools in a cluster.
     * 
     * @return the size value.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Set the size property: The desired size of the PGBouncer connection pool. The maximum allowed size is determined
     * by the size of the cluster's primary node. 25 backend server connections are allowed for every 1GB of RAM. Three
     * are reserved for maintenance. For example, a primary node with 1 GB of RAM allows for a maximum of 22 backend
     * server connections while one with 4 GB would allow for 97. Note that these are shared across all connection
     * pools in a cluster.
     * 
     * @param size the size value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setSize(int size) {
        this.size = size;
        return this;
    }

    /**
     * Get the db property: The database for use with the connection pool.
     * 
     * @return the db value.
     */
    public String getDb() {
        return this.db;
    }

    /**
     * Set the db property: The database for use with the connection pool.
     * 
     * @param db the db value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * Get the user property: The name of the user for use with the connection pool. When excluded, all sessions
     * connect to the database as the inbound user.
     * 
     * @return the user value.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: The name of the user for use with the connection pool. When excluded, all sessions
     * connect to the database as the inbound user.
     * 
     * @param user the user value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the connection property: The connection property.
     * 
     * @return the connection value.
     */
    public ConnectionPoolConnection getConnection() {
        return this.connection;
    }

    /**
     * Set the connection property: The connection property.
     * 
     * @param connection the connection value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setConnection(ConnectionPoolConnection connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get the privateConnection property: The private_connection property.
     * 
     * @return the privateConnection value.
     */
    public ConnectionPoolPrivateConnection getPrivateConnection() {
        return this.privateConnection;
    }

    /**
     * Set the privateConnection property: The private_connection property.
     * 
     * @param privateConnection the privateConnection value to set.
     * @return the ConnectionPool object itself.
     */
    public ConnectionPool setPrivateConnection(ConnectionPoolPrivateConnection privateConnection) {
        this.privateConnection = privateConnection;
        return this;
    }
}
