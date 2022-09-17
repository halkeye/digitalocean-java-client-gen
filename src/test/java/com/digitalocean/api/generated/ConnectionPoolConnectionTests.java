package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ConnectionPoolConnection;
import org.junit.jupiter.api.Test;

public final class ConnectionPoolConnectionTests {
    @Test
    public void testDeserialize() {
        ConnectionPoolConnection model =
                BinaryData.fromString(
                                "{\"uri\":\"jpceeznzan\",\"database\":\"rbf\",\"host\":\"yxzlbciphmse\",\"port\":2058050811,\"user\":\"rndktx\",\"password\":\"onfeeqgp\",\"ssl\":false}")
                        .toObject(ConnectionPoolConnection.class);
    }

    @Test
    public void testSerialize() {
        ConnectionPoolConnection model = new ConnectionPoolConnection();
        model = BinaryData.fromObject(model).toObject(ConnectionPoolConnection.class);
    }
}
