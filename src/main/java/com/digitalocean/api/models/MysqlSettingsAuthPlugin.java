package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string specifying the authentication method to be used for connections to the MySQL user account. The valid values
 * are `mysql_native_password` or `caching_sha2_password`. If excluded when creating a new user, the default for the
 * version of MySQL in use will be used. As of MySQL 8.0, the default is `caching_sha2_password`.
 */
public final class MysqlSettingsAuthPlugin extends ExpandableStringEnum<MysqlSettingsAuthPlugin> {
    /** Static value mysql_native_password for MysqlSettingsAuthPlugin. */
    public static final MysqlSettingsAuthPlugin MYSQL_NATIVE_PASSWORD = fromString("mysql_native_password");

    /** Static value caching_sha2_password for MysqlSettingsAuthPlugin. */
    public static final MysqlSettingsAuthPlugin CACHING_SHA2PASSWORD = fromString("caching_sha2_password");

    /**
     * Creates or finds a MysqlSettingsAuthPlugin from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MysqlSettingsAuthPlugin.
     */
    @JsonCreator
    public static MysqlSettingsAuthPlugin fromString(String name) {
        return fromString(name, MysqlSettingsAuthPlugin.class);
    }

    /**
     * Gets known MysqlSettingsAuthPlugin values.
     *
     * @return known MysqlSettingsAuthPlugin values.
     */
    public static Collection<MysqlSettingsAuthPlugin> values() {
        return values(MysqlSettingsAuthPlugin.class);
    }
}
