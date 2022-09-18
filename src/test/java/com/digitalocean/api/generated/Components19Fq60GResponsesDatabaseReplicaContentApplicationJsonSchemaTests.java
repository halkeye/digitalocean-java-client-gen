package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseReplica;
import com.digitalocean.api.models.DatabaseReplicaConnection;
import com.digitalocean.api.models.DatabaseReplicaPrivateConnection;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema model = BinaryData.fromString("{\"replica\":{\"name\":\"lyotg\",\"region\":\"sxnsrqorcge\",\"size\":\"vcebxeetqujxcxxq\",\"status\":\"online\",\"tags\":[\"kedwqurcgojmrv\",\"xwjongzse\",\"qqrsil\",\"chskxxka\"],\"created_at\":\"2021-12-04T06:38:55Z\",\"private_network_uuid\":\"ia\",\"connection\":{\"uri\":\"tojrulfucte\",\"database\":\"thcfj\",\"host\":\"xlyubqjrostv\",\"port\":632993810,\"user\":\"mtzzbeq\",\"password\":\"trx\",\"ssl\":false},\"private_connection\":{\"uri\":\"habsrwrsnrh\",\"database\":\"a\",\"host\":\"wk\",\"port\":134052535,\"user\":\"nxkvvcsemsv\",\"password\":\"djkqxetqmm\",\"ssl\":false}}}").toObject(Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema.class);
        Assertions.assertEquals("lyotg", model.getReplica().getName());
        Assertions.assertEquals("sxnsrqorcge", model.getReplica().getRegion());
        Assertions.assertEquals("vcebxeetqujxcxxq", model.getReplica().getSize());
        Assertions.assertEquals("kedwqurcgojmrv", model.getReplica().getTags().get(0));
        Assertions.assertEquals("ia", model.getReplica().getPrivateNetworkUuid());
    }

    @Test
    public void testSerialize() {
        Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema model = new Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema().setReplica(new DatabaseReplica().setName("lyotg").setRegion("sxnsrqorcge").setSize("vcebxeetqujxcxxq").setTags(Arrays.asList("kedwqurcgojmrv", "xwjongzse", "qqrsil", "chskxxka")).setPrivateNetworkUuid("ia").setConnection(new DatabaseReplicaConnection()).setPrivateConnection(new DatabaseReplicaPrivateConnection()));
        model = BinaryData.fromObject(model).toObject(Components19Fq60GResponsesDatabaseReplicaContentApplicationJsonSchema.class);
        Assertions.assertEquals("lyotg", model.getReplica().getName());
        Assertions.assertEquals("sxnsrqorcge", model.getReplica().getRegion());
        Assertions.assertEquals("vcebxeetqujxcxxq", model.getReplica().getSize());
        Assertions.assertEquals("kedwqurcgojmrv", model.getReplica().getTags().get(0));
        Assertions.assertEquals("ia", model.getReplica().getPrivateNetworkUuid());
    }
}
