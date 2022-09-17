package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MysqlSettings;
import com.digitalocean.api.models.MysqlSettingsAuthPlugin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MysqlSettingsTests {
    @Test
    public void testDeserialize() {
        MysqlSettings model =
                BinaryData.fromString("{\"auth_plugin\":\"caching_sha2_password\"}").toObject(MysqlSettings.class);
        Assertions.assertEquals(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getAuthPlugin());
    }

    @Test
    public void testSerialize() {
        MysqlSettings model = new MysqlSettings().setAuthPlugin(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD);
        model = BinaryData.fromObject(model).toObject(MysqlSettings.class);
        Assertions.assertEquals(MysqlSettingsAuthPlugin.CACHING_SHA2PASSWORD, model.getAuthPlugin());
    }
}
