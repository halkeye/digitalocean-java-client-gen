package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ConnectionPools;
import org.junit.jupiter.api.Test;

public final class ConnectionPoolsTests {
    @Test
    public void testDeserialize() {
        ConnectionPools model =
                BinaryData.fromString(
                                "{\"pools\":[{\"name\":\"roqvqpilrgu\",\"mode\":\"canlduwzorxs\",\"size\":12992231,\"db\":\"x\",\"user\":\"klxymxkqvfqepdxc\",\"connection\":{\"uri\":\"ubwyv\",\"database\":\"bowcpjqduqgi\",\"host\":\"xkydfbwlja\",\"port\":464618326,\"user\":\"rkjd\",\"password\":\"r\",\"ssl\":false},\"private_connection\":{\"uri\":\"ftcvbii\",\"database\":\"ksdwgdnk\",\"host\":\"gmwdh\",\"port\":1625904109,\"user\":\"vczld\",\"password\":\"lzoutbaaqgzekaj\",\"ssl\":true}}]}")
                        .toObject(ConnectionPools.class);
    }

    @Test
    public void testSerialize() {
        ConnectionPools model = new ConnectionPools();
        model = BinaryData.fromObject(model).toObject(ConnectionPools.class);
    }
}
