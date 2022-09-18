package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseConnection;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseConnectionTests {
    @Test
    public void testDeserialize() {
        DatabaseConnection model = BinaryData.fromString("{\"uri\":\"imiymqruqgu\",\"database\":\"upet\",\"host\":\"vvoqsbpkf\",\"port\":2045416492,\"user\":\"k\",\"password\":\"syaowuzowp\",\"ssl\":false}").toObject(DatabaseConnection.class);
    }

    @Test
    public void testSerialize() {
        DatabaseConnection model = new DatabaseConnection();
        model = BinaryData.fromObject(model).toObject(DatabaseConnection.class);
    }
}
