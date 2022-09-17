package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema;
import com.digitalocean.api.models.ConnectionPool;
import com.digitalocean.api.models.ConnectionPoolConnection;
import com.digitalocean.api.models.ConnectionPoolPrivateConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"pool\":{\"name\":\"acwras\",\"mode\":\"kwefc\",\"size\":152267430,\"db\":\"inwoqartwyxq\",\"user\":\"l\",\"connection\":{\"uri\":\"atdavuqmcbyms\",\"database\":\"bjlquv\",\"host\":\"zcjumvpsimioyoig\",\"port\":91577457,\"user\":\"q\",\"password\":\"nracli\",\"ssl\":true},\"private_connection\":{\"uri\":\"spkladydgnhau\",\"database\":\"ukexzgpm\",\"host\":\"abeddqilwgd\",\"port\":1041054591,\"user\":\"fpcvstclgqrvwerf\",\"password\":\"bsmtbljjehhc\",\"ssl\":false}}}")
                        .toObject(Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema.class);
        Assertions.assertEquals("acwras", model.getPool().getName());
        Assertions.assertEquals("kwefc", model.getPool().getMode());
        Assertions.assertEquals(152267430, model.getPool().getSize());
        Assertions.assertEquals("inwoqartwyxq", model.getPool().getDb());
        Assertions.assertEquals("l", model.getPool().getUser());
    }

    @Test
    public void testSerialize() {
        Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema model =
                new Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema()
                        .setPool(
                                new ConnectionPool()
                                        .setName("acwras")
                                        .setMode("kwefc")
                                        .setSize(152267430)
                                        .setDb("inwoqartwyxq")
                                        .setUser("l")
                                        .setConnection(new ConnectionPoolConnection())
                                        .setPrivateConnection(new ConnectionPoolPrivateConnection()));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema.class);
        Assertions.assertEquals("acwras", model.getPool().getName());
        Assertions.assertEquals("kwefc", model.getPool().getMode());
        Assertions.assertEquals(152267430, model.getPool().getSize());
        Assertions.assertEquals("inwoqartwyxq", model.getPool().getDb());
        Assertions.assertEquals("l", model.getPool().getUser());
    }
}
