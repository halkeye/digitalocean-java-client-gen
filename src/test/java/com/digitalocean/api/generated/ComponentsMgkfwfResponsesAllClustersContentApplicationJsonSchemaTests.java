package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1305408761},\"kubernetes_clusters\":[{\"name\":\"nqzubfonfdbgmk\",\"region\":\"wmjcwtewfhxw\",\"version\":\"rk\",\"cluster_subnet\":\"ehzlry\",\"service_subnet\":\"pcha\",\"ipv4\":\"eplrajubowuywevt\",\"endpoint\":\"ieikmwlaoklfnis\",\"tags\":[\"ucb\",\"tredscnnstjc\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"tzrxzhcle\",\"duration\":\"wtzqzcloyhy\",\"day\":\"any\"},\"auto_upgrade\":false,\"status\":{\"state\":\"deleted\",\"message\":\"re\"},\"created_at\":\"2021-02-25T11:48:50Z\",\"updated_at\":\"2021-04-21T09:02:26Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":false},{\"name\":\"jplbchych\",\"region\":\"kvy\",\"version\":\"fbqvumkxqj\",\"cluster_subnet\":\"uepm\",\"service_subnet\":\"fnzlpqmp\",\"ipv4\":\"efvulblmr\",\"endpoint\":\"xyprhfcaeooifqdy\",\"tags\":[\"lobha\",\"qmomfe\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"fr\",\"duration\":\"gbmxldjmz\",\"day\":\"thursday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"upgrading\",\"message\":\"lurb\"},\"created_at\":\"2021-02-03T12:22:19Z\",\"updated_at\":\"2021-07-02T17:37:34Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":false},{\"name\":\"qscag\",\"region\":\"yvouprsytq\",\"version\":\"ss\",\"cluster_subnet\":\"mgw\",\"service_subnet\":\"ivrxpfduiol\",\"ipv4\":\"qvpbfjpoqzucfzl\",\"endpoint\":\"zdquurbo\",\"tags\":[\"hvzielbp\",\"nqujywz\",\"qyggmnwsvhb\",\"gqiwy\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"bdrrpnrehkunsb\",\"duration\":\"hhlwtpk\",\"day\":\"thursday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"deleted\",\"message\":\"kgtzqnwqsttewu\"},\"created_at\":\"2021-10-10T21:49Z\",\"updated_at\":\"2021-01-12T03:12:56Z\",\"surge_upgrade\":true,\"ha\":false,\"registry_enabled\":false},{\"name\":\"pditfnonpi\",\"region\":\"uxlvrhprrvbwonl\",\"version\":\"qflvtlrvbst\",\"cluster_subnet\":\"uy\",\"service_subnet\":\"n\",\"ipv4\":\"tlnrj\",\"endpoint\":\"zdbuzici\",\"tags\":[\"oqvgpnewuhw\",\"wjnoxuo\",\"tfnressfepgck\",\"cjmgvsnvbtqdxfm\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"n\",\"duration\":\"luqllbsupub\",\"day\":\"any\"},\"auto_upgrade\":false,\"status\":{\"state\":\"provisioning\",\"message\":\"hcu\"},\"created_at\":\"2021-05-24T00:48:35Z\",\"updated_at\":\"2021-06-02T10:14:24Z\",\"surge_upgrade\":true,\"ha\":true,\"registry_enabled\":true}]}")
                        .toObject(ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema.class);
        Assertions.assertEquals("nqzubfonfdbgmk", model.getKubernetesClusters().get(0).getName());
        Assertions.assertEquals("wmjcwtewfhxw", model.getKubernetesClusters().get(0).getRegion());
        Assertions.assertEquals("rk", model.getKubernetesClusters().get(0).getVersion());
        Assertions.assertEquals("ucb", model.getKubernetesClusters().get(0).getTags().get(0));
        Assertions.assertEquals(
                "tzrxzhcle", model.getKubernetesClusters().get(0).getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(
                MaintenancePolicyDay.ANY, model.getKubernetesClusters().get(0).getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isHa());
        Assertions.assertEquals(1305408761, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema model =
                new ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema()
                        .setKubernetesClusters(
                                Arrays.asList(
                                        new Cluster()
                                                .setName("nqzubfonfdbgmk")
                                                .setRegion("wmjcwtewfhxw")
                                                .setVersion("rk")
                                                .setTags(Arrays.asList("ucb", "tredscnnstjc"))
                                                .setNodePools(Arrays.asList())
                                                .setMaintenancePolicy(
                                                        new MaintenancePolicy()
                                                                .setStartTime("tzrxzhcle")
                                                                .setDay(MaintenancePolicyDay.ANY))
                                                .setAutoUpgrade(false)
                                                .setSurgeUpgrade(false)
                                                .setHa(false),
                                        new Cluster()
                                                .setName("jplbchych")
                                                .setRegion("kvy")
                                                .setVersion("fbqvumkxqj")
                                                .setTags(Arrays.asList("lobha", "qmomfe"))
                                                .setNodePools(Arrays.asList())
                                                .setMaintenancePolicy(
                                                        new MaintenancePolicy()
                                                                .setStartTime("fr")
                                                                .setDay(MaintenancePolicyDay.THURSDAY))
                                                .setAutoUpgrade(false)
                                                .setSurgeUpgrade(false)
                                                .setHa(false),
                                        new Cluster()
                                                .setName("qscag")
                                                .setRegion("yvouprsytq")
                                                .setVersion("ss")
                                                .setTags(Arrays.asList("hvzielbp", "nqujywz", "qyggmnwsvhb", "gqiwy"))
                                                .setNodePools(Arrays.asList())
                                                .setMaintenancePolicy(
                                                        new MaintenancePolicy()
                                                                .setStartTime("bdrrpnrehkunsb")
                                                                .setDay(MaintenancePolicyDay.THURSDAY))
                                                .setAutoUpgrade(false)
                                                .setSurgeUpgrade(true)
                                                .setHa(false),
                                        new Cluster()
                                                .setName("pditfnonpi")
                                                .setRegion("uxlvrhprrvbwonl")
                                                .setVersion("qflvtlrvbst")
                                                .setTags(
                                                        Arrays.asList(
                                                                "oqvgpnewuhw",
                                                                "wjnoxuo",
                                                                "tfnressfepgck",
                                                                "cjmgvsnvbtqdxfm"))
                                                .setNodePools(Arrays.asList())
                                                .setMaintenancePolicy(
                                                        new MaintenancePolicy()
                                                                .setStartTime("n")
                                                                .setDay(MaintenancePolicyDay.ANY))
                                                .setAutoUpgrade(false)
                                                .setSurgeUpgrade(true)
                                                .setHa(true)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1305408761));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsMgkfwfResponsesAllClustersContentApplicationJsonSchema.class);
        Assertions.assertEquals("nqzubfonfdbgmk", model.getKubernetesClusters().get(0).getName());
        Assertions.assertEquals("wmjcwtewfhxw", model.getKubernetesClusters().get(0).getRegion());
        Assertions.assertEquals("rk", model.getKubernetesClusters().get(0).getVersion());
        Assertions.assertEquals("ucb", model.getKubernetesClusters().get(0).getTags().get(0));
        Assertions.assertEquals(
                "tzrxzhcle", model.getKubernetesClusters().get(0).getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(
                MaintenancePolicyDay.ANY, model.getKubernetesClusters().get(0).getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isHa());
        Assertions.assertEquals(1305408761, model.getMeta().getTotal());
    }
}
