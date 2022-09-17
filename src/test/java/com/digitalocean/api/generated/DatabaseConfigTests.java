package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseConfig;
import org.junit.jupiter.api.Test;

public final class DatabaseConfigTests {
    @Test
    public void testDeserialize() {
        DatabaseConfig model = BinaryData.fromString("{}").toObject(DatabaseConfig.class);
    }

    @Test
    public void testSerialize() {
        DatabaseConfig model = new DatabaseConfig();
        model = BinaryData.fromObject(model).toObject(DatabaseConfig.class);
    }
}
