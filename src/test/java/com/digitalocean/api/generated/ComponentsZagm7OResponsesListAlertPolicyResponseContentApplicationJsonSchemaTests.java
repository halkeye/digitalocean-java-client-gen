package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AlertPolicy;
import com.digitalocean.api.models.AlertPolicyCompare;
import com.digitalocean.api.models.AlertPolicyType;
import com.digitalocean.api.models.AlertPolicyWindow;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1922672653},\"policies\":[{\"alerts\":{\"email\":[],\"slack\":[]},\"compare\":\"GreaterThan\",\"description\":\"fmvswx\",\"enabled\":true,\"entities\":[\"leif\"],\"tags\":[\"d\"],\"type\":\"v1/insights/lbaas/avg_cpu_utilization_percent\",\"uuid\":\"wwulkrybpaevy\",\"value\":42.44321,\"window\":\"1h\"},{\"alerts\":{\"email\":[],\"slack\":[]},\"compare\":\"GreaterThan\",\"description\":\"ecrqkw\",\"enabled\":true,\"entities\":[\"chsfoulborcx\",\"ibsdqbdyblpe\"],\"tags\":[\"sm\"],\"type\":\"v1/insights/lbaas/avg_cpu_utilization_percent\",\"uuid\":\"gweoqhbjql\",\"value\":54.34152,\"window\":\"10m\"},{\"alerts\":{\"email\":[],\"slack\":[]},\"compare\":\"LessThan\",\"description\":\"erufollcshjuc\",\"enabled\":true,\"entities\":[\"y\",\"jjvtpnerx\",\"jeazrahelhbimyii\"],\"tags\":[\"a\",\"cthtpq\",\"fzdos\"],\"type\":\"v1/insights/lbaas/avg_cpu_utilization_percent\",\"uuid\":\"kdi\",\"value\":39.829086,\"window\":\"10m\"},{\"alerts\":{\"email\":[],\"slack\":[]},\"compare\":\"GreaterThan\",\"description\":\"gzhcwj\",\"enabled\":true,\"entities\":[\"hcrx\",\"f\",\"rutvnpccxz\"],\"tags\":[\"xpmhzghhhk\"],\"type\":\"v1/insights/droplet/load_1\",\"uuid\":\"njdtujqzvhnj\",\"value\":34.559555,\"window\":\"10m\"}]}")
                        .toObject(ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicies().get(0).getCompare());
        Assertions.assertEquals("fmvswx", model.getPolicies().get(0).getDescription());
        Assertions.assertEquals(true, model.getPolicies().get(0).isEnabled());
        Assertions.assertEquals("leif", model.getPolicies().get(0).getEntities().get(0));
        Assertions.assertEquals("d", model.getPolicies().get(0).getTags().get(0));
        Assertions.assertEquals(
                AlertPolicyType.V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT, model.getPolicies().get(0).getType());
        Assertions.assertEquals("wwulkrybpaevy", model.getPolicies().get(0).getUuid());
        Assertions.assertEquals(42.44321f, model.getPolicies().get(0).getValue());
        Assertions.assertEquals(AlertPolicyWindow.ONEH, model.getPolicies().get(0).getWindow());
        Assertions.assertEquals(1922672653, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema model =
                new ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema()
                        .setPolicies(
                                Arrays.asList(
                                        new AlertPolicy()
                                                .setAlerts(
                                                        new Alerts()
                                                                .setEmail(Arrays.asList())
                                                                .setSlack(Arrays.asList()))
                                                .setCompare(AlertPolicyCompare.GREATER_THAN)
                                                .setDescription("fmvswx")
                                                .setEnabled(true)
                                                .setEntities(Arrays.asList("leif"))
                                                .setTags(Arrays.asList("d"))
                                                .setType(AlertPolicyType.V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT)
                                                .setUuid("wwulkrybpaevy")
                                                .setValue(42.44321f)
                                                .setWindow(AlertPolicyWindow.ONEH),
                                        new AlertPolicy()
                                                .setAlerts(
                                                        new Alerts()
                                                                .setEmail(Arrays.asList())
                                                                .setSlack(Arrays.asList()))
                                                .setCompare(AlertPolicyCompare.GREATER_THAN)
                                                .setDescription("ecrqkw")
                                                .setEnabled(true)
                                                .setEntities(Arrays.asList("chsfoulborcx", "ibsdqbdyblpe"))
                                                .setTags(Arrays.asList("sm"))
                                                .setType(AlertPolicyType.V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT)
                                                .setUuid("gweoqhbjql")
                                                .setValue(54.34152f)
                                                .setWindow(AlertPolicyWindow.TENM),
                                        new AlertPolicy()
                                                .setAlerts(
                                                        new Alerts()
                                                                .setEmail(Arrays.asList())
                                                                .setSlack(Arrays.asList()))
                                                .setCompare(AlertPolicyCompare.LESS_THAN)
                                                .setDescription("erufollcshjuc")
                                                .setEnabled(true)
                                                .setEntities(Arrays.asList("y", "jjvtpnerx", "jeazrahelhbimyii"))
                                                .setTags(Arrays.asList("a", "cthtpq", "fzdos"))
                                                .setType(AlertPolicyType.V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT)
                                                .setUuid("kdi")
                                                .setValue(39.829086f)
                                                .setWindow(AlertPolicyWindow.TENM),
                                        new AlertPolicy()
                                                .setAlerts(
                                                        new Alerts()
                                                                .setEmail(Arrays.asList())
                                                                .setSlack(Arrays.asList()))
                                                .setCompare(AlertPolicyCompare.GREATER_THAN)
                                                .setDescription("gzhcwj")
                                                .setEnabled(true)
                                                .setEntities(Arrays.asList("hcrx", "f", "rutvnpccxz"))
                                                .setTags(Arrays.asList("xpmhzghhhk"))
                                                .setType(AlertPolicyType.V1INSIGHTS_DROPLET_LOAD1)
                                                .setUuid("njdtujqzvhnj")
                                                .setValue(34.559555f)
                                                .setWindow(AlertPolicyWindow.TENM)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1922672653));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsZagm7OResponsesListAlertPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicies().get(0).getCompare());
        Assertions.assertEquals("fmvswx", model.getPolicies().get(0).getDescription());
        Assertions.assertEquals(true, model.getPolicies().get(0).isEnabled());
        Assertions.assertEquals("leif", model.getPolicies().get(0).getEntities().get(0));
        Assertions.assertEquals("d", model.getPolicies().get(0).getTags().get(0));
        Assertions.assertEquals(
                AlertPolicyType.V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT, model.getPolicies().get(0).getType());
        Assertions.assertEquals("wwulkrybpaevy", model.getPolicies().get(0).getUuid());
        Assertions.assertEquals(42.44321f, model.getPolicies().get(0).getValue());
        Assertions.assertEquals(AlertPolicyWindow.ONEH, model.getPolicies().get(0).getWindow());
        Assertions.assertEquals(1922672653, model.getMeta().getTotal());
    }
}
