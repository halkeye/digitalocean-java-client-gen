package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ConnectionPoolConnection;
import com.digitalocean.api.models.DatabaseConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ConnectionPoolConnectionTests {
    @Test
    public void testDeserialize() {
        ConnectionPoolConnection model = BinaryData.fromString("{\"uri\":\"jpceeznzan\",\"database\":\"rbf\",\"host\":\"yxzlbciphmse\",\"port\":2058050811,\"user\":\"rndktx\",\"password\":\"onfeeqgp\",\"ssl\":false}").toObject(ConnectionPoolConnection.class);
    }

    @Test
    public void testSerialize() {
        ConnectionPoolConnection model = new ConnectionPoolConnection();
        model = BinaryData.fromObject(model).toObject(ConnectionPoolConnection.class);
    }
}
