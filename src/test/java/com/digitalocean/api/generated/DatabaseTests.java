package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseTests {
    @Test
    public void testDeserialize() {
        Database model = BinaryData.fromString("{\"name\":\"nkkiiwvmtumxpy\"}").toObject(Database.class);
        Assertions.assertEquals("nkkiiwvmtumxpy", model.getName());
    }

    @Test
    public void testSerialize() {
        Database model = new Database().setName("nkkiiwvmtumxpy");
        model = BinaryData.fromObject(model).toObject(Database.class);
        Assertions.assertEquals("nkkiiwvmtumxpy", model.getName());
    }
}
