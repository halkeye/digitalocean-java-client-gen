package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"kubernetes_cluster\":{\"name\":\"awk\",\"region\":\"hkapitsks\",\"version\":\"fyfttibjepzwh\",\"cluster_subnet\":\"nfd\",\"service_subnet\":\"ggcj\",\"ipv4\":\"blivw\",\"endpoint\":\"sudy\",\"tags\":[\"bhdosmbngkql\",\"xzduvxdmxexat\"],\"node_pools\":[{\"name\":\"rsenxoi\",\"count\":1156669978,\"tags\":[],\"taints\":[],\"auto_scale\":true,\"min_nodes\":373872535,\"max_nodes\":521262525,\"nodes\":[],\"size\":\"zsoxznntwgk\"},{\"name\":\"hpsapzupz\",\"count\":2147008649,\"tags\":[],\"taints\":[],\"auto_scale\":true,\"min_nodes\":553825209,\"max_nodes\":95078563,\"nodes\":[],\"size\":\"gfmxpqkjnpyr\"},{\"name\":\"totc\",\"count\":1903783101,\"tags\":[],\"taints\":[],\"auto_scale\":false,\"min_nodes\":1818566408,\"max_nodes\":856518798,\"nodes\":[],\"size\":\"wdonbexftedaubh\"}],\"maintenance_policy\":{\"start_time\":\"gzgrnq\",\"duration\":\"fozuumrtgjq\",\"day\":\"monday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"degraded\",\"message\":\"xz\"},\"created_at\":\"2021-04-19T05:47:45Z\",\"updated_at\":\"2021-01-15T09:39:56Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":true}}")
                        .toObject(ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("awk", model.getKubernetesCluster().getName());
        Assertions.assertEquals("hkapitsks", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("fyfttibjepzwh", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("bhdosmbngkql", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("zsoxznntwgk", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("rsenxoi", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1156669978, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(true, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(373872535, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(521262525, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("gzgrnq", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(
                MaintenancePolicyDay.MONDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isHa());
    }

    @Test
    public void testSerialize() {
        ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema model =
                new ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema()
                        .setKubernetesCluster(
                                new Cluster()
                                        .setName("awk")
                                        .setRegion("hkapitsks")
                                        .setVersion("fyfttibjepzwh")
                                        .setTags(Arrays.asList("bhdosmbngkql", "xzduvxdmxexat"))
                                        .setNodePools(
                                                Arrays.asList(
                                                        new KubernetesNodePool()
                                                                .setSize("zsoxznntwgk")
                                                                .setName("rsenxoi")
                                                                .setCount(1156669978)
                                                                .setTags(Arrays.asList())
                                                                .setTaints(Arrays.asList())
                                                                .setAutoScale(true)
                                                                .setMinNodes(373872535)
                                                                .setMaxNodes(521262525),
                                                        new KubernetesNodePool()
                                                                .setSize("gfmxpqkjnpyr")
                                                                .setName("hpsapzupz")
                                                                .setCount(2147008649)
                                                                .setTags(Arrays.asList())
                                                                .setTaints(Arrays.asList())
                                                                .setAutoScale(true)
                                                                .setMinNodes(553825209)
                                                                .setMaxNodes(95078563),
                                                        new KubernetesNodePool()
                                                                .setSize("wdonbexftedaubh")
                                                                .setName("totc")
                                                                .setCount(1903783101)
                                                                .setTags(Arrays.asList())
                                                                .setTaints(Arrays.asList())
                                                                .setAutoScale(false)
                                                                .setMinNodes(1818566408)
                                                                .setMaxNodes(856518798)))
                                        .setMaintenancePolicy(
                                                new MaintenancePolicy()
                                                        .setStartTime("gzgrnq")
                                                        .setDay(MaintenancePolicyDay.MONDAY))
                                        .setAutoUpgrade(false)
                                        .setSurgeUpgrade(false)
                                        .setHa(false));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsH2S4NkResponsesExistingClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("awk", model.getKubernetesCluster().getName());
        Assertions.assertEquals("hkapitsks", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("fyfttibjepzwh", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("bhdosmbngkql", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("zsoxznntwgk", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("rsenxoi", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1156669978, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(true, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(373872535, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(521262525, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("gzgrnq", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(
                MaintenancePolicyDay.MONDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isHa());
    }
}
