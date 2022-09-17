package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
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

public final class DatabaseClusterTests {
    @Test
    public void testDeserialize() {
        DatabaseCluster model =
                BinaryData.fromString(
                                "{\"name\":\"nuzejgvkveb\",\"engine\":\"mysql\",\"version\":\"zllrz\",\"num_nodes\":817821495,\"size\":\"mmdqgmihzpimc\",\"region\":\"rh\",\"status\":\"resizing\",\"created_at\":\"2021-09-20T05:50:56Z\",\"private_network_uuid\":\"klogx\",\"tags\":[\"zarhzvqnsqktcmbj\",\"zzoslpkyb\",\"glwkzpgajsqj\",\"emqbmfuvqarwzxuq\"],\"db_names\":[\"lui\",\"mbwxsfg\"],\"connection\":{\"uri\":\"b\",\"database\":\"ekraokqkbudbt\",\"host\":\"okbavlyttaak\",\"port\":504494608,\"user\":\"ke\",\"password\":\"mhpdu\",\"ssl\":true},\"private_connection\":{\"uri\":\"toleksc\",\"database\":\"tnanqimwb\",\"host\":\"pdcldpka\",\"port\":137160246,\"user\":\"laimouxwk\",\"password\":\"mud\",\"ssl\":true},\"users\":[{\"name\":\"bicziuswswj\",\"role\":\"primary\",\"password\":\"sjhbtq\",\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}},{\"name\":\"fs\",\"role\":\"primary\",\"password\":\"wbivqvogfuyzwvbh\",\"mysql_settings\":{\"auth_plugin\":\"mysql_native_password\"}}],\"maintenance_window\":{\"day\":\"yqe\",\"hour\":\"r\",\"pending\":true,\"description\":[\"kcdrdaasaxxobsm\",\"kwiy\",\"v\"]},\"rules\":[{\"uuid\":\"r\",\"cluster_uuid\":\"wnvz\",\"type\":\"ip_addr\",\"value\":\"n\",\"created_at\":\"2021-02-18T23:03:38Z\"},{\"uuid\":\"sxvjabjqqaxuyvy\",\"cluster_uuid\":\"nudn\",\"type\":\"tag\",\"value\":\"abhjx\",\"created_at\":\"2021-11-20T20:32:51Z\"},{\"uuid\":\"euipmpvksmitnsq\",\"cluster_uuid\":\"l\",\"type\":\"droplet\",\"value\":\"lkrdpqgfhy\",\"created_at\":\"2021-09-03T10:13:51Z\"},{\"uuid\":\"kkld\",\"cluster_uuid\":\"c\",\"type\":\"k8s\",\"value\":\"cmfcnrjajq\",\"created_at\":\"2021-02-19T13:44:50Z\"}]}")
                        .toObject(DatabaseCluster.class);
        Assertions.assertEquals("nuzejgvkveb", model.getName());
        Assertions.assertEquals(DatabaseClusterEngine.MYSQL, model.getEngine());
        Assertions.assertEquals("zllrz", model.getVersion());
        Assertions.assertEquals(817821495, model.getNumNodes());
        Assertions.assertEquals("mmdqgmihzpimc", model.getSize());
        Assertions.assertEquals("rh", model.getRegion());
        Assertions.assertEquals("klogx", model.getPrivateNetworkUuid());
        Assertions.assertEquals("zarhzvqnsqktcmbj", model.getTags().get(0));
        Assertions.assertEquals("yqe", model.getMaintenanceWindow().getDay());
        Assertions.assertEquals("r", model.getMaintenanceWindow().getHour());
        Assertions.assertEquals("r", model.getRules().get(0).getUuid());
        Assertions.assertEquals("wnvz", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.IP_ADDR, model.getRules().get(0).getType());
        Assertions.assertEquals("n", model.getRules().get(0).getValue());
    }

    @Test
    public void testSerialize() {
        DatabaseCluster model =
                new DatabaseCluster()
                        .setName("nuzejgvkveb")
                        .setEngine(DatabaseClusterEngine.MYSQL)
                        .setVersion("zllrz")
                        .setNumNodes(817821495)
                        .setSize("mmdqgmihzpimc")
                        .setRegion("rh")
                        .setPrivateNetworkUuid("klogx")
                        .setTags(Arrays.asList("zarhzvqnsqktcmbj", "zzoslpkyb", "glwkzpgajsqj", "emqbmfuvqarwzxuq"))
                        .setConnection(new DatabaseClusterConnection())
                        .setPrivateConnection(new DatabaseClusterPrivateConnection())
                        .setMaintenanceWindow(new DatabaseClusterMaintenanceWindow().setDay("yqe").setHour("r"))
                        .setRules(
                                Arrays.asList(
                                        new FirewallRule()
                                                .setUuid("r")
                                                .setClusterUuid("wnvz")
                                                .setType(FirewallRuleType.IP_ADDR)
                                                .setValue("n"),
                                        new FirewallRule()
                                                .setUuid("sxvjabjqqaxuyvy")
                                                .setClusterUuid("nudn")
                                                .setType(FirewallRuleType.TAG)
                                                .setValue("abhjx"),
                                        new FirewallRule()
                                                .setUuid("euipmpvksmitnsq")
                                                .setClusterUuid("l")
                                                .setType(FirewallRuleType.DROPLET)
                                                .setValue("lkrdpqgfhy"),
                                        new FirewallRule()
                                                .setUuid("kkld")
                                                .setClusterUuid("c")
                                                .setType(FirewallRuleType.K8S)
                                                .setValue("cmfcnrjajq")));
        model = BinaryData.fromObject(model).toObject(DatabaseCluster.class);
        Assertions.assertEquals("nuzejgvkveb", model.getName());
        Assertions.assertEquals(DatabaseClusterEngine.MYSQL, model.getEngine());
        Assertions.assertEquals("zllrz", model.getVersion());
        Assertions.assertEquals(817821495, model.getNumNodes());
        Assertions.assertEquals("mmdqgmihzpimc", model.getSize());
        Assertions.assertEquals("rh", model.getRegion());
        Assertions.assertEquals("klogx", model.getPrivateNetworkUuid());
        Assertions.assertEquals("zarhzvqnsqktcmbj", model.getTags().get(0));
        Assertions.assertEquals("yqe", model.getMaintenanceWindow().getDay());
        Assertions.assertEquals("r", model.getMaintenanceWindow().getHour());
        Assertions.assertEquals("r", model.getRules().get(0).getUuid());
        Assertions.assertEquals("wnvz", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.IP_ADDR, model.getRules().get(0).getType());
        Assertions.assertEquals("n", model.getRules().get(0).getValue());
    }
}
