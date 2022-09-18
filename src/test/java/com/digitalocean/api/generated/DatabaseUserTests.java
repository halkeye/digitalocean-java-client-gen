package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseUser;
import com.digitalocean.api.models.DatabaseUserRole;
import com.digitalocean.api.models.MysqlSettings;
import com.digitalocean.api.models.MysqlSettingsAuthPlugin;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseUserTests {
    @Test
    public void testDeserialize() {
        DatabaseUser model = BinaryData.fromString("{\"name\":\"vqkxiuxqggvq\",\"role\":\"normal\",\"password\":\"hlwcjsqg\",\"mysql_settings\":{\"auth_plugin\":\"mysql_native_password\"}}").toObject(DatabaseUser.class);
        Assertions.assertEquals("vqkxiuxqggvq", model.getName());
        Assertions.assertEquals(MysqlSettingsAuthPlugin.MYSQL_NATIVE_PASSWORD, model.getMysqlSettings().getAuthPlugin());
    }

    @Test
    public void testSerialize() {
        DatabaseUser model = new DatabaseUser().setName("vqkxiuxqggvq").setMysqlSettings(new MysqlSettings().setAuthPlugin(MysqlSettingsAuthPlugin.MYSQL_NATIVE_PASSWORD));
        model = BinaryData.fromObject(model).toObject(DatabaseUser.class);
        Assertions.assertEquals("vqkxiuxqggvq", model.getName());
        Assertions.assertEquals(MysqlSettingsAuthPlugin.MYSQL_NATIVE_PASSWORD, model.getMysqlSettings().getAuthPlugin());
    }
}
