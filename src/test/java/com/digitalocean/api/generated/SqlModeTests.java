package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SqlMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlModeTests {
    @Test
    public void testDeserialize() {
        SqlMode model = BinaryData.fromString("{\"sql_mode\":\"vbtbrekqhsqhtf\"}").toObject(SqlMode.class);
        Assertions.assertEquals("vbtbrekqhsqhtf", model.getSqlMode());
    }

    @Test
    public void testSerialize() {
        SqlMode model = new SqlMode().setSqlMode("vbtbrekqhsqhtf");
        model = BinaryData.fromObject(model).toObject(SqlMode.class);
        Assertions.assertEquals("vbtbrekqhsqhtf", model.getSqlMode());
    }
}
