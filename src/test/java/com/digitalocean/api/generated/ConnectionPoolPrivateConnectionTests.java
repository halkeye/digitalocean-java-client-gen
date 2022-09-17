package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ConnectionPoolPrivateConnection;
import org.junit.jupiter.api.Test;

public final class ConnectionPoolPrivateConnectionTests {
    @Test
    public void testDeserialize() {
        ConnectionPoolPrivateConnection model =
                BinaryData.fromString(
                                "{\"uri\":\"tbgnixxowwzkyfw\",\"database\":\"piw\",\"host\":\"ii\",\"port\":1587000231,\"user\":\"e\",\"password\":\"ldmaxxijvskwsdgk\",\"ssl\":true}")
                        .toObject(ConnectionPoolPrivateConnection.class);
    }

    @Test
    public void testSerialize() {
        ConnectionPoolPrivateConnection model = new ConnectionPoolPrivateConnection();
        model = BinaryData.fromObject(model).toObject(ConnectionPoolPrivateConnection.class);
    }
}
