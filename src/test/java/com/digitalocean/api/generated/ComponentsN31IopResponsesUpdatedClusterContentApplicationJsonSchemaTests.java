package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema model = BinaryData.fromString("{\"kubernetes_cluster\":{\"name\":\"ujybsrwz\",\"region\":\"mr\",\"version\":\"t\",\"cluster_subnet\":\"hmfppinmgi\",\"service_subnet\":\"smkw\",\"ipv4\":\"fragjhxerx\",\"endpoint\":\"bkdbtq\",\"tags\":[\"mniiqyholh\",\"nskbggicnqwl\",\"tmwpblxk\",\"kqgvxrktj\"],\"node_pools\":[{\"name\":\"cwt\",\"count\":1539742339,\"tags\":[],\"taints\":[],\"auto_scale\":false,\"min_nodes\":1618815780,\"max_nodes\":52591935,\"nodes\":[],\"size\":\"fp\"},{\"name\":\"d\",\"count\":1317989345,\"tags\":[],\"taints\":[],\"auto_scale\":false,\"min_nodes\":553712877,\"max_nodes\":1073521408,\"nodes\":[],\"size\":\"immrimaabsqqlonb\"},{\"name\":\"wcahdkmbjsmihr\",\"count\":1928815062,\"tags\":[],\"taints\":[],\"auto_scale\":false,\"min_nodes\":187514101,\"max_nodes\":2145710272,\"nodes\":[],\"size\":\"kvb\"}],\"maintenance_policy\":{\"start_time\":\"bsvbwyot\",\"duration\":\"nb\",\"day\":\"friday\"},\"auto_upgrade\":true,\"status\":{\"state\":\"error\",\"message\":\"xwc\"},\"created_at\":\"2021-06-28T00:32:03Z\",\"updated_at\":\"2021-09-29T08:54:58Z\",\"surge_upgrade\":true,\"ha\":false,\"registry_enabled\":true}}").toObject(ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujybsrwz", model.getKubernetesCluster().getName());
        Assertions.assertEquals("mr", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("t", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("mniiqyholh", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("fp", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("cwt", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1539742339, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(false, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(1618815780, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(52591935, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("bsvbwyot", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.FRIDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isHa());
    }

    @Test
    public void testSerialize() {
        ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema model = new ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema().setKubernetesCluster(new Cluster().setName("ujybsrwz").setRegion("mr").setVersion("t").setTags(Arrays.asList("mniiqyholh", "nskbggicnqwl", "tmwpblxk", "kqgvxrktj")).setNodePools(Arrays.asList(new KubernetesNodePool().setSize("fp").setName("cwt").setCount(1539742339).setTags(Arrays.asList()).setTaints(Arrays.asList()).setAutoScale(false).setMinNodes(1618815780).setMaxNodes(52591935), new KubernetesNodePool().setSize("immrimaabsqqlonb").setName("d").setCount(1317989345).setTags(Arrays.asList()).setTaints(Arrays.asList()).setAutoScale(false).setMinNodes(553712877).setMaxNodes(1073521408), new KubernetesNodePool().setSize("kvb").setName("wcahdkmbjsmihr").setCount(1928815062).setTags(Arrays.asList()).setTaints(Arrays.asList()).setAutoScale(false).setMinNodes(187514101).setMaxNodes(2145710272))).setMaintenancePolicy(new MaintenancePolicy().setStartTime("bsvbwyot").setDay(MaintenancePolicyDay.FRIDAY)).setAutoUpgrade(true).setSurgeUpgrade(true).setHa(false));
        model = BinaryData.fromObject(model).toObject(ComponentsN31IopResponsesUpdatedClusterContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujybsrwz", model.getKubernetesCluster().getName());
        Assertions.assertEquals("mr", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("t", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("mniiqyholh", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("fp", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("cwt", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1539742339, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(false, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(1618815780, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(52591935, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("bsvbwyot", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.FRIDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesCluster().isHa());
    }
}
