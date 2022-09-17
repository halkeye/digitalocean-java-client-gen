package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsH7SbeiResponsesUserContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseUser;
import com.digitalocean.api.models.MysqlSettings;
import com.digitalocean.api.models.MysqlSettingsAuthPlugin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsH7SbeiResponsesUserContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsH7SbeiResponsesUserContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"user\":{\"name\":\"tbxxniuisd\",\"role\":\"primary\",\"password\":\"d\",\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}}}")
                        .toObject(ComponentsH7SbeiResponsesUserContentApplicationJsonSchema.class);
        Assertions.assertEquals("tbxxniuisd", model.getUser().getName());
        Assertions.assertEquals(
                MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getUser().getMysqlSettings().getAuthPlugin());
    }

    @Test
    public void testSerialize() {
        ComponentsH7SbeiResponsesUserContentApplicationJsonSchema model =
                new ComponentsH7SbeiResponsesUserContentApplicationJsonSchema()
                        .setUser(
                                new DatabaseUser()
                                        .setName("tbxxniuisd")
                                        .setMysqlSettings(
                                                new MysqlSettings()
                                                        .setAuthPlugin(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD)));
        model = BinaryData.fromObject(model).toObject(ComponentsH7SbeiResponsesUserContentApplicationJsonSchema.class);
        Assertions.assertEquals("tbxxniuisd", model.getUser().getName());
        Assertions.assertEquals(
                MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getUser().getMysqlSettings().getAuthPlugin());
    }
}
