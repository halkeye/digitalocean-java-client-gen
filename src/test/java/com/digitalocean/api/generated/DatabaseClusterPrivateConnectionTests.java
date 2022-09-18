package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseClusterPrivateConnection;
import com.digitalocean.api.models.DatabaseConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseClusterPrivateConnectionTests {
    @Test
    public void testDeserialize() {
        DatabaseClusterPrivateConnection model = BinaryData.fromString("{\"uri\":\"kc\",\"database\":\"gukxrztiochluti\",\"host\":\"qrudjizcbfzmcr\",\"port\":695678022,\"user\":\"iucnmfbc\",\"password\":\"qktkrumzuedkyzbf\",\"ssl\":false}").toObject(DatabaseClusterPrivateConnection.class);
    }

    @Test
    public void testSerialize() {
        DatabaseClusterPrivateConnection model = new DatabaseClusterPrivateConnection();
        model = BinaryData.fromObject(model).toObject(DatabaseClusterPrivateConnection.class);
    }
}
