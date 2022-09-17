package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseReplicaConnection;
import org.junit.jupiter.api.Test;

public final class DatabaseReplicaConnectionTests {
    @Test
    public void testDeserialize() {
        DatabaseReplicaConnection model =
                BinaryData.fromString(
                                "{\"uri\":\"wl\",\"database\":\"rcigtzjcvbxq\",\"host\":\"psnssovyxp\",\"port\":632493022,\"user\":\"nievwffc\",\"password\":\"yezslpu\",\"ssl\":true}")
                        .toObject(DatabaseReplicaConnection.class);
    }

    @Test
    public void testSerialize() {
        DatabaseReplicaConnection model = new DatabaseReplicaConnection();
        model = BinaryData.fromObject(model).toObject(DatabaseReplicaConnection.class);
    }
}
