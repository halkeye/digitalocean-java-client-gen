package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseReplica;
import com.digitalocean.api.models.DatabaseReplicaConnection;
import com.digitalocean.api.models.DatabaseReplicaPrivateConnection;
import com.digitalocean.api.models.DatabaseReplicaStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseReplicaTests {
    @Test
    public void testDeserialize() {
        DatabaseReplica model = BinaryData.fromString("{\"name\":\"anizerwgudasmxub\",\"region\":\"bngfcocefhpri\",\"size\":\"fmpztraudsvh\",\"status\":\"online\",\"tags\":[\"lregpq\"],\"created_at\":\"2021-04-04T05:34:56Z\",\"private_network_uuid\":\"hvrztnvg\",\"connection\":{\"uri\":\"qrdgrtw\",\"database\":\"wjzl\",\"host\":\"kcfazzw\",\"port\":155020717,\"user\":\"erzrransybylpo\",\"password\":\"zrghsrleink\",\"ssl\":true},\"private_connection\":{\"uri\":\"ncjwvuag\",\"database\":\"wtltngvmreuptrk\",\"host\":\"m\",\"port\":2029772595,\"user\":\"wo\",\"password\":\"fsvagh\",\"ssl\":true}}").toObject(DatabaseReplica.class);
        Assertions.assertEquals("anizerwgudasmxub", model.getName());
        Assertions.assertEquals("bngfcocefhpri", model.getRegion());
        Assertions.assertEquals("fmpztraudsvh", model.getSize());
        Assertions.assertEquals("lregpq", model.getTags().get(0));
        Assertions.assertEquals("hvrztnvg", model.getPrivateNetworkUuid());
    }

    @Test
    public void testSerialize() {
        DatabaseReplica model = new DatabaseReplica().setName("anizerwgudasmxub").setRegion("bngfcocefhpri").setSize("fmpztraudsvh").setTags(Arrays.asList("lregpq")).setPrivateNetworkUuid("hvrztnvg").setConnection(new DatabaseReplicaConnection()).setPrivateConnection(new DatabaseReplicaPrivateConnection());
        model = BinaryData.fromObject(model).toObject(DatabaseReplica.class);
        Assertions.assertEquals("anizerwgudasmxub", model.getName());
        Assertions.assertEquals("bngfcocefhpri", model.getRegion());
        Assertions.assertEquals("fmpztraudsvh", model.getSize());
        Assertions.assertEquals("lregpq", model.getTags().get(0));
        Assertions.assertEquals("hvrztnvg", model.getPrivateNetworkUuid());
    }
}
