package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema model = BinaryData.fromString("{\"kubernetes_cluster\":{\"name\":\"dw\",\"region\":\"tf\",\"version\":\"bvtzldzchub\",\"cluster_subnet\":\"wnlzuvi\",\"service_subnet\":\"lghfrbzakpjtcqra\",\"ipv4\":\"jpsucmxi\",\"endpoint\":\"wqxynqjgsatkyvsc\",\"tags\":[\"gcru\",\"xhirc\",\"gcvsvkkjbjolpy\",\"klkvuznadvh\"],\"node_pools\":[{\"name\":\"oi\",\"count\":1423889561,\"tags\":[],\"taints\":[],\"auto_scale\":false,\"min_nodes\":944011358,\"max_nodes\":1145717220,\"nodes\":[],\"size\":\"emqwtq\"}],\"maintenance_policy\":{\"start_time\":\"gyksikaw\",\"duration\":\"vmwdvgjqcrbk\",\"day\":\"monday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"deleted\",\"message\":\"weoj\"},\"created_at\":\"2020-12-27T19:59:50Z\",\"updated_at\":\"2021-06-07T02:56:02Z\",\"surge_upgrade\":true,\"ha\":true,\"registry_enabled\":false}}").toObject(ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("dw", model.getKubernetesCluster().getName());
        Assertions.assertEquals("tf", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("bvtzldzchub", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("gcru", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("emqwtq", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("oi", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1423889561, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(false, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(944011358, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1145717220, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("gyksikaw", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.MONDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isHa());
    }

    @Test
    public void testSerialize() {
        ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema model = new ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema().setKubernetesCluster(new Cluster().setName("dw").setRegion("tf").setVersion("bvtzldzchub").setTags(Arrays.asList("gcru", "xhirc", "gcvsvkkjbjolpy", "klkvuznadvh")).setNodePools(Arrays.asList(new KubernetesNodePool().setSize("emqwtq").setName("oi").setCount(1423889561).setTags(Arrays.asList()).setTaints(Arrays.asList()).setAutoScale(false).setMinNodes(944011358).setMaxNodes(1145717220))).setMaintenancePolicy(new MaintenancePolicy().setStartTime("gyksikaw").setDay(MaintenancePolicyDay.MONDAY)).setAutoUpgrade(false).setSurgeUpgrade(true).setHa(true));
        model = BinaryData.fromObject(model).toObject(ComponentsTzd5NlResponsesClusterCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("dw", model.getKubernetesCluster().getName());
        Assertions.assertEquals("tf", model.getKubernetesCluster().getRegion());
        Assertions.assertEquals("bvtzldzchub", model.getKubernetesCluster().getVersion());
        Assertions.assertEquals("gcru", model.getKubernetesCluster().getTags().get(0));
        Assertions.assertEquals("emqwtq", model.getKubernetesCluster().getNodePools().get(0).getSize());
        Assertions.assertEquals("oi", model.getKubernetesCluster().getNodePools().get(0).getName());
        Assertions.assertEquals(1423889561, model.getKubernetesCluster().getNodePools().get(0).getCount());
        Assertions.assertEquals(false, model.getKubernetesCluster().getNodePools().get(0).isAutoScale());
        Assertions.assertEquals(944011358, model.getKubernetesCluster().getNodePools().get(0).getMinNodes());
        Assertions.assertEquals(1145717220, model.getKubernetesCluster().getNodePools().get(0).getMaxNodes());
        Assertions.assertEquals("gyksikaw", model.getKubernetesCluster().getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.MONDAY, model.getKubernetesCluster().getMaintenancePolicy().getDay());
        Assertions.assertEquals(false, model.getKubernetesCluster().isAutoUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isSurgeUpgrade());
        Assertions.assertEquals(true, model.getKubernetesCluster().isHa());
    }
}
