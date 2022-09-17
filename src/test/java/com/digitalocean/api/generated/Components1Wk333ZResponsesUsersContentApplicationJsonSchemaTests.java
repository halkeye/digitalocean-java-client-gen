package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Wk333ZResponsesUsersContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseUser;
import com.digitalocean.api.models.MysqlSettings;
import com.digitalocean.api.models.MysqlSettingsAuthPlugin;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Wk333ZResponsesUsersContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Wk333ZResponsesUsersContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"users\":[{\"name\":\"jxnw\",\"role\":\"primary\",\"password\":\"p\",\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}},{\"name\":\"lehzlxpgfq\",\"role\":\"primary\",\"password\":\"w\",\"mysql_settings\":{\"auth_plugin\":\"mysql_native_password\"}},{\"name\":\"elwcerwkwb\",\"role\":\"normal\",\"password\":\"jtxb\",\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}}]}")
                        .toObject(Components1Wk333ZResponsesUsersContentApplicationJsonSchema.class);
        Assertions.assertEquals("jxnw", model.getUsers().get(0).getName());
        Assertions.assertEquals(
                MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD,
                model.getUsers().get(0).getMysqlSettings().getAuthPlugin());
    }

    @Test
    public void testSerialize() {
        Components1Wk333ZResponsesUsersContentApplicationJsonSchema model =
                new Components1Wk333ZResponsesUsersContentApplicationJsonSchema()
                        .setUsers(
                                Arrays.asList(
                                        new DatabaseUser()
                                                .setName("jxnw")
                                                .setMysqlSettings(
                                                        new MysqlSettings()
                                                                .setAuthPlugin(
                                                                        MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD)),
                                        new DatabaseUser()
                                                .setName("lehzlxpgfq")
                                                .setMysqlSettings(
                                                        new MysqlSettings()
                                                                .setAuthPlugin(
                                                                        MysqlSettingsAuthPlugin.MYSQL_NATIVE_PASSWORD)),
                                        new DatabaseUser()
                                                .setName("elwcerwkwb")
                                                .setMysqlSettings(
                                                        new MysqlSettings()
                                                                .setAuthPlugin(
                                                                        MysqlSettingsAuthPlugin
                                                                                .CACHING_SHA2PASSWORD))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Wk333ZResponsesUsersContentApplicationJsonSchema.class);
        Assertions.assertEquals("jxnw", model.getUsers().get(0).getName());
        Assertions.assertEquals(
                MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD,
                model.getUsers().get(0).getMysqlSettings().getAuthPlugin());
    }
}
