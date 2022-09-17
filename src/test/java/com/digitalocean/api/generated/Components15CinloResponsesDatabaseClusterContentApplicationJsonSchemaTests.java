package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseCluster;
import com.digitalocean.api.models.DatabaseClusterConnection;
import com.digitalocean.api.models.DatabaseClusterEngine;
import com.digitalocean.api.models.DatabaseClusterMaintenanceWindow;
import com.digitalocean.api.models.DatabaseClusterPrivateConnection;
import com.digitalocean.api.models.FirewallRule;
import com.digitalocean.api.models.FirewallRuleType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components15CinloResponsesDatabaseClusterContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"database\":{\"name\":\"qmzjqrbrpvnmdy\",\"engine\":\"redis\",\"version\":\"bojtjppglaohoqkp\",\"num_nodes\":8082327,\"size\":\"nqjilaywk\",\"region\":\"cwm\",\"status\":\"resizing\",\"created_at\":\"2021-01-18T02:03:45Z\",\"private_network_uuid\":\"mhxdqaolfy\",\"tags\":[\"kbjpjvlywlt\",\"fwobb\"],\"db_names\":[\"lwyjfnqzocrdz\",\"czeuntgx\",\"ncaqttiekoifu\",\"nyttzgix\"],\"connection\":{\"uri\":\"ihlgm\",\"database\":\"ehlq\",\"host\":\"nrflkndrndpg\",\"port\":1190992939,\"user\":\"hdaqotwfhipxwg\",\"password\":\"bvcip\",\"ssl\":true},\"private_connection\":{\"uri\":\"czuumljcir\",\"database\":\"efy\",\"host\":\"veitit\",\"port\":193923471,\"user\":\"zaj\",\"password\":\"sjhwjuyxx\",\"ssl\":true},\"users\":[{\"name\":\"vuaytuad\",\"role\":\"primary\",\"password\":\"qbwpntghyk\"},{\"name\":\"rcdrnxsluvlzlad\",\"role\":\"primary\",\"password\":\"pbqhvfdqqjwkr\"},{\"name\":\"zdanojis\",\"role\":\"primary\",\"password\":\"vokatu\"},{\"name\":\"jctibpvbkae\",\"role\":\"primary\",\"password\":\"zygdfwa\"}],\"maintenance_window\":{\"day\":\"eivmak\",\"hour\":\"hysowljuxlkbect\",\"pending\":true,\"description\":[\"skdchmaiubavl\",\"wp\"]},\"rules\":[{\"uuid\":\"lkzazmgok\",\"cluster_uuid\":\"gjqafkmkrokzr\",\"type\":\"k8s\",\"value\":\"qetwpqrtvaozn\",\"created_at\":\"2021-04-24T23:13:05Z\"},{\"uuid\":\"iezeagm\",\"cluster_uuid\":\"it\",\"type\":\"ip_addr\",\"value\":\"gedhfpjstlzm\",\"created_at\":\"2021-05-29T23:09:53Z\"}]}}")
                        .toObject(Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("qmzjqrbrpvnmdy", model.getDatabase().getName());
        Assertions.assertEquals(DatabaseClusterEngine.REDIS, model.getDatabase().getEngine());
        Assertions.assertEquals("bojtjppglaohoqkp", model.getDatabase().getVersion());
        Assertions.assertEquals(8082327, model.getDatabase().getNumNodes());
        Assertions.assertEquals("nqjilaywk", model.getDatabase().getSize());
        Assertions.assertEquals("cwm", model.getDatabase().getRegion());
        Assertions.assertEquals("mhxdqaolfy", model.getDatabase().getPrivateNetworkUuid());
        Assertions.assertEquals("kbjpjvlywlt", model.getDatabase().getTags().get(0));
        Assertions.assertEquals("eivmak", model.getDatabase().getMaintenanceWindow().getDay());
        Assertions.assertEquals("hysowljuxlkbect", model.getDatabase().getMaintenanceWindow().getHour());
        Assertions.assertEquals("lkzazmgok", model.getDatabase().getRules().get(0).getUuid());
        Assertions.assertEquals("gjqafkmkrokzr", model.getDatabase().getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.K8S, model.getDatabase().getRules().get(0).getType());
        Assertions.assertEquals("qetwpqrtvaozn", model.getDatabase().getRules().get(0).getValue());
    }

    @Test
    public void testSerialize() {
        Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema model =
                new Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema()
                        .setDatabase(
                                new DatabaseCluster()
                                        .setName("qmzjqrbrpvnmdy")
                                        .setEngine(DatabaseClusterEngine.REDIS)
                                        .setVersion("bojtjppglaohoqkp")
                                        .setNumNodes(8082327)
                                        .setSize("nqjilaywk")
                                        .setRegion("cwm")
                                        .setPrivateNetworkUuid("mhxdqaolfy")
                                        .setTags(Arrays.asList("kbjpjvlywlt", "fwobb"))
                                        .setConnection(new DatabaseClusterConnection())
                                        .setPrivateConnection(new DatabaseClusterPrivateConnection())
                                        .setMaintenanceWindow(
                                                new DatabaseClusterMaintenanceWindow()
                                                        .setDay("eivmak")
                                                        .setHour("hysowljuxlkbect"))
                                        .setRules(
                                                Arrays.asList(
                                                        new FirewallRule()
                                                                .setUuid("lkzazmgok")
                                                                .setClusterUuid("gjqafkmkrokzr")
                                                                .setType(FirewallRuleType.K8S)
                                                                .setValue("qetwpqrtvaozn"),
                                                        new FirewallRule()
                                                                .setUuid("iezeagm")
                                                                .setClusterUuid("it")
                                                                .setType(FirewallRuleType.IP_ADDR)
                                                                .setValue("gedhfpjstlzm"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components15CinloResponsesDatabaseClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("qmzjqrbrpvnmdy", model.getDatabase().getName());
        Assertions.assertEquals(DatabaseClusterEngine.REDIS, model.getDatabase().getEngine());
        Assertions.assertEquals("bojtjppglaohoqkp", model.getDatabase().getVersion());
        Assertions.assertEquals(8082327, model.getDatabase().getNumNodes());
        Assertions.assertEquals("nqjilaywk", model.getDatabase().getSize());
        Assertions.assertEquals("cwm", model.getDatabase().getRegion());
        Assertions.assertEquals("mhxdqaolfy", model.getDatabase().getPrivateNetworkUuid());
        Assertions.assertEquals("kbjpjvlywlt", model.getDatabase().getTags().get(0));
        Assertions.assertEquals("eivmak", model.getDatabase().getMaintenanceWindow().getDay());
        Assertions.assertEquals("hysowljuxlkbect", model.getDatabase().getMaintenanceWindow().getHour());
        Assertions.assertEquals("lkzazmgok", model.getDatabase().getRules().get(0).getUuid());
        Assertions.assertEquals("gjqafkmkrokzr", model.getDatabase().getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.K8S, model.getDatabase().getRules().get(0).getType());
        Assertions.assertEquals("qetwpqrtvaozn", model.getDatabase().getRules().get(0).getValue());
    }
}
