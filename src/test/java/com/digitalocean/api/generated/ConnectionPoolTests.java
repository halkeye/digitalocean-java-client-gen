package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ConnectionPool;
import com.digitalocean.api.models.ConnectionPoolConnection;
import com.digitalocean.api.models.ConnectionPoolPrivateConnection;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ConnectionPoolTests {
    @Test
    public void testDeserialize() {
        ConnectionPool model = BinaryData.fromString("{\"name\":\"zg\",\"mode\":\"norbjgmnzjot\",\"size\":465871086,\"db\":\"rxkhlob\",\"user\":\"jbhvhdiqayflu\",\"connection\":{\"uri\":\"osnuudtelv\",\"database\":\"ibdrqrswhbuubpyr\",\"host\":\"tjoxztfw\",\"port\":1627091784,\"user\":\"vczevjn\",\"password\":\"tagfyvrtpqp\",\"ssl\":true},\"private_connection\":{\"uri\":\"gkrepdqhqyhw\",\"database\":\"e\",\"host\":\"xqabckmzeoxi\",\"port\":1529406778,\"user\":\"eoh\",\"password\":\"h\",\"ssl\":false}}").toObject(ConnectionPool.class);
        Assertions.assertEquals("zg", model.getName());
        Assertions.assertEquals("norbjgmnzjot", model.getMode());
        Assertions.assertEquals(465871086, model.getSize());
        Assertions.assertEquals("rxkhlob", model.getDb());
        Assertions.assertEquals("jbhvhdiqayflu", model.getUser());
    }

    @Test
    public void testSerialize() {
        ConnectionPool model = new ConnectionPool().setName("zg").setMode("norbjgmnzjot").setSize(465871086).setDb("rxkhlob").setUser("jbhvhdiqayflu").setConnection(new ConnectionPoolConnection()).setPrivateConnection(new ConnectionPoolPrivateConnection());
        model = BinaryData.fromObject(model).toObject(ConnectionPool.class);
        Assertions.assertEquals("zg", model.getName());
        Assertions.assertEquals("norbjgmnzjot", model.getMode());
        Assertions.assertEquals(465871086, model.getSize());
        Assertions.assertEquals("rxkhlob", model.getDb());
        Assertions.assertEquals("jbhvhdiqayflu", model.getUser());
    }
}
