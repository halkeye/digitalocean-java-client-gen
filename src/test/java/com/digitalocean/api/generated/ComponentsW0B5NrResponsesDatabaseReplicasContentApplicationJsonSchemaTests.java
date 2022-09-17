package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseReplica;
import com.digitalocean.api.models.DatabaseReplicaConnection;
import com.digitalocean.api.models.DatabaseReplicaPrivateConnection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"replicas\":[{\"name\":\"hilzzdzzq\",\"region\":\"uezayov\",\"size\":\"bqlotokhtvwtazn\",\"status\":\"creating\",\"tags\":[\"xwjyofgwhnk\",\"tlwljssmcts\",\"ldkpwolgisu\",\"xbteogfgfiijryk\"],\"created_at\":\"2021-07-14T02:00:07Z\",\"private_network_uuid\":\"k\",\"connection\":{\"uri\":\"ceazfpxgnmqvz\",\"database\":\"uyqqaiosssc\",\"host\":\"aifppuacvfyeowp\",\"port\":117233906,\"user\":\"jdhsoy\",\"password\":\"pvtyqfttehdpbouj\",\"ssl\":true},\"private_connection\":{\"uri\":\"vdshxcdedsuen\",\"database\":\"nxcgjtfrnquk\",\"host\":\"fnslnlrxsmy\",\"port\":1380376282,\"user\":\"ntf\",\"password\":\"bgwjdxwnaz\",\"ssl\":true}},{\"name\":\"drey\",\"region\":\"whsetwwjwzzqs\",\"size\":\"zuukykcyqhyqq\",\"status\":\"online\",\"tags\":[\"keys\",\"ewfopazdazg\"],\"created_at\":\"2021-03-13T10:02:50Z\",\"private_network_uuid\":\"pew\",\"connection\":{\"uri\":\"utmdpvozg\",\"database\":\"jbkn\",\"host\":\"clctzey\",\"port\":1465756285,\"user\":\"dcov\",\"password\":\"zqauxzan\",\"ssl\":true},\"private_connection\":{\"uri\":\"ruw\",\"database\":\"drbcp\",\"host\":\"xudqyemebunaucmc\",\"port\":1750008323,\"user\":\"eemmjauwcgx\",\"password\":\"noh\",\"ssl\":true}}]}")
                        .toObject(ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema.class);
        Assertions.assertEquals("hilzzdzzq", model.getReplicas().get(0).getName());
        Assertions.assertEquals("uezayov", model.getReplicas().get(0).getRegion());
        Assertions.assertEquals("bqlotokhtvwtazn", model.getReplicas().get(0).getSize());
        Assertions.assertEquals("xwjyofgwhnk", model.getReplicas().get(0).getTags().get(0));
        Assertions.assertEquals("k", model.getReplicas().get(0).getPrivateNetworkUuid());
    }

    @Test
    public void testSerialize() {
        ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema model =
                new ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema()
                        .setReplicas(
                                Arrays.asList(
                                        new DatabaseReplica()
                                                .setName("hilzzdzzq")
                                                .setRegion("uezayov")
                                                .setSize("bqlotokhtvwtazn")
                                                .setTags(
                                                        Arrays.asList(
                                                                "xwjyofgwhnk",
                                                                "tlwljssmcts",
                                                                "ldkpwolgisu",
                                                                "xbteogfgfiijryk"))
                                                .setPrivateNetworkUuid("k")
                                                .setConnection(new DatabaseReplicaConnection())
                                                .setPrivateConnection(new DatabaseReplicaPrivateConnection()),
                                        new DatabaseReplica()
                                                .setName("drey")
                                                .setRegion("whsetwwjwzzqs")
                                                .setSize("zuukykcyqhyqq")
                                                .setTags(Arrays.asList("keys", "ewfopazdazg"))
                                                .setPrivateNetworkUuid("pew")
                                                .setConnection(new DatabaseReplicaConnection())
                                                .setPrivateConnection(new DatabaseReplicaPrivateConnection())));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsW0B5NrResponsesDatabaseReplicasContentApplicationJsonSchema.class);
        Assertions.assertEquals("hilzzdzzq", model.getReplicas().get(0).getName());
        Assertions.assertEquals("uezayov", model.getReplicas().get(0).getRegion());
        Assertions.assertEquals("bqlotokhtvwtazn", model.getReplicas().get(0).getSize());
        Assertions.assertEquals("xwjyofgwhnk", model.getReplicas().get(0).getTags().get(0));
        Assertions.assertEquals("k", model.getReplicas().get(0).getPrivateNetworkUuid());
    }
}
