package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatabaseUser model. */
@Fluent
public final class DatabaseUser {
    /*
     * The name of a database user.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A string representing the database user's role. The value will be either
     * "primary" or "normal".
     *
     */
    @JsonProperty(value = "role", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseUserRole role;

    /*
     * A randomly generated password for the database user.
     */
    @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /*
     * The mysql_settings property.
     */
    @JsonProperty(value = "mysql_settings")
    private MysqlSettings mysqlSettings;

    /**
     * Get the name property: The name of a database user.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of a database user.
     *
     * @param name the name value to set.
     * @return the DatabaseUser object itself.
     */
    public DatabaseUser setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the role property: A string representing the database user's role. The value will be either "primary" or
     * "normal".
     *
     * @return the role value.
     */
    public DatabaseUserRole getRole() {
        return this.role;
    }

    /**
     * Get the password property: A randomly generated password for the database user.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Get the mysqlSettings property: The mysql_settings property.
     *
     * @return the mysqlSettings value.
     */
    public MysqlSettings getMysqlSettings() {
        return this.mysqlSettings;
    }

    /**
     * Set the mysqlSettings property: The mysql_settings property.
     *
     * @param mysqlSettings the mysqlSettings value to set.
     * @return the DatabaseUser object itself.
     */
    public DatabaseUser setMysqlSettings(MysqlSettings mysqlSettings) {
        this.mysqlSettings = mysqlSettings;
        return this;
    }
}
