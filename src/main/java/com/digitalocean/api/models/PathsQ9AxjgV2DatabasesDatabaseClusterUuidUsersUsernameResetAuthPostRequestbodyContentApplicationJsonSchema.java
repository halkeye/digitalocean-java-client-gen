package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
 * model.
 */
@Fluent
public final class PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema {
    /*
     * The mysql_settings property.
     */
    @JsonProperty(value = "mysql_settings")
    private MysqlSettings mysqlSettings;

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
     * @return the
     * PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
     * object itself.
     */
    public PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema setMysqlSettings(MysqlSettings mysqlSettings) {
        this.mysqlSettings = mysqlSettings;
        return this;
    }
}
