package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterTests {
    @Test
    public void testDeserialize() {
        Cluster model =
                BinaryData.fromString(
                                "{\"name\":\"geupcknece\",\"region\":\"kgrvfpsjd\",\"version\":\"ngsy\",\"cluster_subnet\":\"pdz\",\"service_subnet\":\"xcn\",\"ipv4\":\"oxcgz\",\"endpoint\":\"jqfbifop\",\"tags\":[\"dwdrpazqjkrfmbwo\",\"fcuuugtjigpg\",\"yiawohfmhnnz\",\"ecjjkmq\"],\"node_pools\":[{\"name\":\"idzr\",\"count\":1078210995,\"tags\":[\"oiovslvivq\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":2035745663,\"max_nodes\":1771574336,\"nodes\":[],\"size\":\"khcyoaqxuk\"},{\"name\":\"juf\",\"count\":615875297,\"tags\":[\"oanduewfhvpxjhx\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":1175768129,\"max_nodes\":1919209295,\"nodes\":[],\"size\":\"zuaixcdckixspsa\"},{\"name\":\"vkmvyxzerejrkp\",\"count\":1748610259,\"tags\":[\"tjx\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":931200749,\"max_nodes\":1579451655,\"nodes\":[],\"size\":\"ecgihzbpemnrr\"},{\"name\":\"vrwwx\",\"count\":1460970309,\"tags\":[\"spboxhifp\",\"skpeswyhhmifjua\"],\"taints\":[],\"auto_scale\":false,\"min_nodes\":220302704,\"max_nodes\":1261334026,\"nodes\":[],\"size\":\"uqvcmlaexbzbqufp\"}],\"maintenance_policy\":{\"start_time\":\"sjzaymldrorhyog\",\"duration\":\"simehtcuu\",\"day\":\"sunday\"},\"auto_upgrade\":true,\"status\":{\"state\":\"upgrading\",\"message\":\"nim\"},\"created_at\":\"2021-08-28T05:11:45Z\",\"updated_at\":\"2021-11-30T19:00:44Z\",\"surge_upgrade\":true,\"ha\":true,\"registry_enabled\":true}")
                        .toObject(Cluster.class);
        Assertions.assertEquals("geupcknece", model.getName());
        Assertions.assertEquals("kgrvfpsjd", model.getRegion());
        Assertions.assertEquals("ngsy", model.getVersion());
        Assertions.assertEquals("dwdrpazqjkrfmbwo", model.getTags().get(0));
        Assertions.assertEquals("khcyoaqxuk", model.getNodePools().get(0).getSize());
        Assertions.assertEquals("idzr", model.getNodePools().get(0).getName());
        Assertions.assertEquals(1078210995, model.getNodePools().get(0).getCount());
        Assertions.assertEquals("oiovslvivq", model.getNodePools().get(0).getTags().get(0));
        Assertions.assertEquals(false, model.getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(2035745663, model.getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1771574336, model.getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("sjzaymldrorhyog", model.getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.SUNDAY, model.getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.isAutoUpgrade());
        Assertions.assertEquals(true, model.isSurgeUpgrade());
        Assertions.assertEquals(true, model.isHa());
    }

    @Test
    public void testSerialize() {
        Cluster model =
                new Cluster()
                        .setName("geupcknece")
                        .setRegion("kgrvfpsjd")
                        .setVersion("ngsy")
                        .setTags(Arrays.asList("dwdrpazqjkrfmbwo", "fcuuugtjigpg", "yiawohfmhnnz", "ecjjkmq"))
                        .setNodePools(
                                Arrays.asList(
                                        new KubernetesNodePool()
                                                .setSize("khcyoaqxuk")
                                                .setName("idzr")
                                                .setCount(1078210995)
                                                .setTags(Arrays.asList("oiovslvivq"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(2035745663)
                                                .setMaxNodes(1771574336),
                                        new KubernetesNodePool()
                                                .setSize("zuaixcdckixspsa")
                                                .setName("juf")
                                                .setCount(615875297)
                                                .setTags(Arrays.asList("oanduewfhvpxjhx"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(1175768129)
                                                .setMaxNodes(1919209295),
                                        new KubernetesNodePool()
                                                .setSize("ecgihzbpemnrr")
                                                .setName("vkmvyxzerejrkp")
                                                .setCount(1748610259)
                                                .setTags(Arrays.asList("tjx"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(931200749)
                                                .setMaxNodes(1579451655),
                                        new KubernetesNodePool()
                                                .setSize("uqvcmlaexbzbqufp")
                                                .setName("vrwwx")
                                                .setCount(1460970309)
                                                .setTags(Arrays.asList("spboxhifp", "skpeswyhhmifjua"))
                                                .setTaints(Arrays.asList())
                                                .setAutoScale(false)
                                                .setMinNodes(220302704)
                                                .setMaxNodes(1261334026)))
                        .setMaintenancePolicy(
                                new MaintenancePolicy()
                                        .setStartTime("sjzaymldrorhyog")
                                        .setDay(MaintenancePolicyDay.SUNDAY))
                        .setAutoUpgrade(true)
                        .setSurgeUpgrade(true)
                        .setHa(true);
        model = BinaryData.fromObject(model).toObject(Cluster.class);
        Assertions.assertEquals("geupcknece", model.getName());
        Assertions.assertEquals("kgrvfpsjd", model.getRegion());
        Assertions.assertEquals("ngsy", model.getVersion());
        Assertions.assertEquals("dwdrpazqjkrfmbwo", model.getTags().get(0));
        Assertions.assertEquals("khcyoaqxuk", model.getNodePools().get(0).getSize());
        Assertions.assertEquals("idzr", model.getNodePools().get(0).getName());
        Assertions.assertEquals(1078210995, model.getNodePools().get(0).getCount());
        Assertions.assertEquals("oiovslvivq", model.getNodePools().get(0).getTags().get(0));
        Assertions.assertEquals(false, model.getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(2035745663, model.getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1771574336, model.getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("sjzaymldrorhyog", model.getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.SUNDAY, model.getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.isAutoUpgrade());
        Assertions.assertEquals(true, model.isSurgeUpgrade());
        Assertions.assertEquals(true, model.isHa());
    }
}
