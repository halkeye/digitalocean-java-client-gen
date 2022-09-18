package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DatabaseConnection model.
 */
@Immutable
public class DatabaseConnection {
    /*
     * A connection string in the format accepted by the `psql` command. This is provided as a convenience and should
     * be able to be constructed by the other attributes.
     */
    @JsonProperty(value = "uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * The name of the default database.
     */
    @JsonProperty(value = "database", access = JsonProperty.Access.WRITE_ONLY)
    private String database;

    /*
     * The FQDN pointing to the database cluster's current primary node.
     */
    @JsonProperty(value = "host", access = JsonProperty.Access.WRITE_ONLY)
    private String host;

    /*
     * The port on which the database cluster is listening.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /*
     * The default user for the database.
     */
    @JsonProperty(value = "user", access = JsonProperty.Access.WRITE_ONLY)
    private String user;

    /*
     * The randomly generated password for the default user.
     */
    @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /*
     * A boolean value indicating if the connection should be made over SSL.
     */
    @JsonProperty(value = "ssl", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean ssl;

    /**
     * Get the uri property: A connection string in the format accepted by the `psql` command. This is provided as a
     * convenience and should be able to be constructed by the other attributes.
     * 
     * @return the uri value.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Get the database property: The name of the default database.
     * 
     * @return the database value.
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * Get the host property: The FQDN pointing to the database cluster's current primary node.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Get the port property: The port on which the database cluster is listening.
     * 
     * @return the port value.
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Get the user property: The default user for the database.
     * 
     * @return the user value.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Get the password property: The randomly generated password for the default user.
     * 
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Get the ssl property: A boolean value indicating if the connection should be made over SSL.
     * 
     * @return the ssl value.
     */
    public Boolean isSsl() {
        return this.ssl;
    }
}
