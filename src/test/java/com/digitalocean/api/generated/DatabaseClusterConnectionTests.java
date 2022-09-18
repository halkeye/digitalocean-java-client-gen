package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseClusterConnection;
import com.digitalocean.api.models.DatabaseConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseClusterConnectionTests {
    @Test
    public void testDeserialize() {
        DatabaseClusterConnection model = BinaryData.fromString("{\"uri\":\"jti\",\"database\":\"nzqgxxgfbbmtlpq\",\"host\":\"y\",\"port\":1273721232,\"user\":\"rnzcalinc\",\"password\":\"qxzxaqz\",\"ssl\":true}").toObject(DatabaseClusterConnection.class);
    }

    @Test
    public void testSerialize() {
        DatabaseClusterConnection model = new DatabaseClusterConnection();
        model = BinaryData.fromObject(model).toObject(DatabaseClusterConnection.class);
    }
}
