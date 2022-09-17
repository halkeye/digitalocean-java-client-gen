package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseReplicaPrivateConnection;
import org.junit.jupiter.api.Test;

public final class DatabaseReplicaPrivateConnectionTests {
    @Test
    public void testDeserialize() {
        DatabaseReplicaPrivateConnection model =
                BinaryData.fromString(
                                "{\"uri\":\"dsvalpnptwtrkx\",\"database\":\"azwu\",\"host\":\"yqvnjobfe\",\"port\":758738595,\"user\":\"iuhzzgqlmfa\",\"password\":\"z\",\"ssl\":true}")
                        .toObject(DatabaseReplicaPrivateConnection.class);
    }

    @Test
    public void testSerialize() {
        DatabaseReplicaPrivateConnection model = new DatabaseReplicaPrivateConnection();
        model = BinaryData.fromObject(model).toObject(DatabaseReplicaPrivateConnection.class);
    }
}
