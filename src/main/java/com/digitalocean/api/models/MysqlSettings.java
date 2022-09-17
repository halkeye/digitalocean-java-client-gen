package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MysqlSettings model. */
@Fluent
public final class MysqlSettings {
    /*
     * A string specifying the authentication method to be used for connections
     * to the MySQL user account. The valid values are `mysql_native_password`
     * or `caching_sha2_password`. If excluded when creating a new user, the
     * default for the version of MySQL in use will be used. As of MySQL 8.0, the
     * default is `caching_sha2_password`.
     *
     */
    @JsonProperty(value = "auth_plugin", required = true)
    private MysqlSettingsAuthPlugin authPlugin;

    /**
     * Get the authPlugin property: A string specifying the authentication method to be used for connections to the
     * MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password`. If excluded when
     * creating a new user, the default for the version of MySQL in use will be used. As of MySQL 8.0, the default is
     * `caching_sha2_password`.
     *
     * @return the authPlugin value.
     */
    public MysqlSettingsAuthPlugin getAuthPlugin() {
        return this.authPlugin;
    }

    /**
     * Set the authPlugin property: A string specifying the authentication method to be used for connections to the
     * MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password`. If excluded when
     * creating a new user, the default for the version of MySQL in use will be used. As of MySQL 8.0, the default is
     * `caching_sha2_password`.
     *
     * @param authPlugin the authPlugin value to set.
     * @return the MysqlSettings object itself.
     */
    public MysqlSettings setAuthPlugin(MysqlSettingsAuthPlugin authPlugin) {
        this.authPlugin = authPlugin;
        return this;
    }
}
