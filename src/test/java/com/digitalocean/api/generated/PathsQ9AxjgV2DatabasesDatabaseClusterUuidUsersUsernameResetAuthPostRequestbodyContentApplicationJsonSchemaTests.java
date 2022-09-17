package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MysqlSettings;
import com.digitalocean.api.models.MysqlSettingsAuthPlugin;
import com.digitalocean.api.models.PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final
class PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                model =
                        BinaryData.fromString("{\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}}")
                                .toObject(
                                        PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                                                .class);
        Assertions.assertEquals(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getMysqlSettings().getAuthPlugin());
    }

    @Test
    public void testSerialize() {
        PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                model =
                        new PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema()
                                .setMysqlSettings(
                                        new MysqlSettings()
                                                .setAuthPlugin(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getMysqlSettings().getAuthPlugin());
    }
}
