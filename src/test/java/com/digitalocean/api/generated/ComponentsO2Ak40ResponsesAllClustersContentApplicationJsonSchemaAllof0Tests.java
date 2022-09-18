package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"kubernetes_clusters\":[{\"name\":\"qfy\",\"region\":\"yt\",\"version\":\"slyekcgn\",\"cluster_subnet\":\"arlcjiwgsxfaiocw\",\"service_subnet\":\"ujjgnfgrzxbarc\",\"ipv4\":\"efzq\",\"endpoint\":\"mjw\",\"tags\":[\"cytesmf\",\"crtfodqhuauzm\",\"iv\",\"trfzhhezvh\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"dyyrudma\",\"duration\":\"wtvdkxb\",\"day\":\"thursday\"},\"auto_upgrade\":true,\"status\":{\"state\":\"upgrading\",\"message\":\"dxbvwf\"},\"created_at\":\"2021-11-21T21:22:49Z\",\"updated_at\":\"2021-03-29T11:51:19Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":false},{\"name\":\"xndmuvar\",\"region\":\"lmzjotprrmu\",\"version\":\"cuhtuzlxiwy\",\"cluster_subnet\":\"garp\",\"service_subnet\":\"twrapczdo\",\"ipv4\":\"vzesipiys\",\"endpoint\":\"qy\",\"tags\":[\"a\",\"c\",\"dazabundtse\",\"kaupwhlz\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"emgjlm\",\"duration\":\"dorsirxxhy\",\"day\":\"wednesday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"provisioning\",\"message\":\"freprfvm\"},\"created_at\":\"2021-04-03T05:33:52Z\",\"updated_at\":\"2021-10-12T15:49Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":false},{\"name\":\"xbcejop\",\"region\":\"lblfs\",\"version\":\"rrwcsp\",\"cluster_subnet\":\"tc\",\"service_subnet\":\"fx\",\"ipv4\":\"tzfslxizhqikmgo\",\"endpoint\":\"iqemcdiiisklbon\",\"tags\":[\"pjxvtrkfkg\",\"njqnnpjwkosny\",\"igfoujjcxgdqmr\",\"hnzkwopswnyinxu\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"yxwjezb\",\"duration\":\"ployuekdcpvu\",\"day\":\"sunday\"},\"auto_upgrade\":false,\"status\":{\"state\":\"degraded\",\"message\":\"vujnj\"},\"created_at\":\"2021-01-22T09:50:59Z\",\"updated_at\":\"2021-04-22T08:09:12Z\",\"surge_upgrade\":false,\"ha\":true,\"registry_enabled\":false},{\"name\":\"pkdbx\",\"region\":\"tfbjampq\",\"version\":\"c\",\"cluster_subnet\":\"nnmxynlsuqbwzstr\",\"service_subnet\":\"gvp\",\"ipv4\":\"gjjktfinfhoksmm\",\"endpoint\":\"lwkqic\",\"tags\":[\"okr\"],\"node_pools\":[],\"maintenance_policy\":{\"start_time\":\"gaojbtqpqsdo\",\"duration\":\"p\",\"day\":\"wednesday\"},\"auto_upgrade\":true,\"status\":{\"state\":\"upgrading\",\"message\":\"dsgxcelujiswlluu\"},\"created_at\":\"2021-09-21T11:08:59Z\",\"updated_at\":\"2021-07-01T03:17:45Z\",\"surge_upgrade\":false,\"ha\":false,\"registry_enabled\":false}]}").toObject(ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("qfy", model.getKubernetesClusters().get(0).getName());
        Assertions.assertEquals("yt", model.getKubernetesClusters().get(0).getRegion());
        Assertions.assertEquals("slyekcgn", model.getKubernetesClusters().get(0).getVersion());
        Assertions.assertEquals("cytesmf", model.getKubernetesClusters().get(0).getTags().get(0));
        Assertions.assertEquals("dyyrudma", model.getKubernetesClusters().get(0).getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.THURSDAY, model.getKubernetesClusters().get(0).getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.getKubernetesClusters().get(0).isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isHa());
    }

    @Test
    public void testSerialize() {
        ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0 model = new ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0().setKubernetesClusters(Arrays.asList(new Cluster().setName("qfy").setRegion("yt").setVersion("slyekcgn").setTags(Arrays.asList("cytesmf", "crtfodqhuauzm", "iv", "trfzhhezvh")).setNodePools(Arrays.asList()).setMaintenancePolicy(new MaintenancePolicy().setStartTime("dyyrudma").setDay(MaintenancePolicyDay.THURSDAY)).setAutoUpgrade(true).setSurgeUpgrade(false).setHa(false), new Cluster().setName("xndmuvar").setRegion("lmzjotprrmu").setVersion("cuhtuzlxiwy").setTags(Arrays.asList("a", "c", "dazabundtse", "kaupwhlz")).setNodePools(Arrays.asList()).setMaintenancePolicy(new MaintenancePolicy().setStartTime("emgjlm").setDay(MaintenancePolicyDay.WEDNESDAY)).setAutoUpgrade(false).setSurgeUpgrade(false).setHa(false), new Cluster().setName("xbcejop").setRegion("lblfs").setVersion("rrwcsp").setTags(Arrays.asList("pjxvtrkfkg", "njqnnpjwkosny", "igfoujjcxgdqmr", "hnzkwopswnyinxu")).setNodePools(Arrays.asList()).setMaintenancePolicy(new MaintenancePolicy().setStartTime("yxwjezb").setDay(MaintenancePolicyDay.SUNDAY)).setAutoUpgrade(false).setSurgeUpgrade(false).setHa(true), new Cluster().setName("pkdbx").setRegion("tfbjampq").setVersion("c").setTags(Arrays.asList("okr")).setNodePools(Arrays.asList()).setMaintenancePolicy(new MaintenancePolicy().setStartTime("gaojbtqpqsdo").setDay(MaintenancePolicyDay.WEDNESDAY)).setAutoUpgrade(true).setSurgeUpgrade(false).setHa(false)));
        model = BinaryData.fromObject(model).toObject(ComponentsO2Ak40ResponsesAllClustersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("qfy", model.getKubernetesClusters().get(0).getName());
        Assertions.assertEquals("yt", model.getKubernetesClusters().get(0).getRegion());
        Assertions.assertEquals("slyekcgn", model.getKubernetesClusters().get(0).getVersion());
        Assertions.assertEquals("cytesmf", model.getKubernetesClusters().get(0).getTags().get(0));
        Assertions.assertEquals("dyyrudma", model.getKubernetesClusters().get(0).getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.THURSDAY, model.getKubernetesClusters().get(0).getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.getKubernetesClusters().get(0).isAutoUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isSurgeUpgrade());
        Assertions.assertEquals(false, model.getKubernetesClusters().get(0).isHa());
    }
}
