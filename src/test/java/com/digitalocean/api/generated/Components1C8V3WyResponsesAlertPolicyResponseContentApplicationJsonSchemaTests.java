package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AlertPolicy;
import com.digitalocean.api.models.AlertPolicyCompare;
import com.digitalocean.api.models.AlertPolicyType;
import com.digitalocean.api.models.AlertPolicyWindow;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"policy\":{\"alerts\":{\"email\":[\"xxwtdmbqjtsuh\"],\"slack\":[]},\"compare\":\"GreaterThan\",\"description\":\"oxtdyqavfx\",\"enabled\":true,\"entities\":[\"zxsyaks\",\"npaami\",\"wb\",\"hvwt\"],\"tags\":[\"bgchcgsfzhbjkiy\",\"qbjsdjpgxeysgw\",\"cfferznzc\"],\"type\":\"v1/insights/lbaas/tls_connections_per_second_utilization_percent\",\"uuid\":\"voveomkhfeqcoop\",\"value\":94.25597,\"window\":\"10m\"}}")
                        .toObject(Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("xxwtdmbqjtsuh", model.getPolicy().getAlerts().getEmail().get(0));
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicy().getCompare());
        Assertions.assertEquals("oxtdyqavfx", model.getPolicy().getDescription());
        Assertions.assertEquals(true, model.getPolicy().isEnabled());
        Assertions.assertEquals("zxsyaks", model.getPolicy().getEntities().get(0));
        Assertions.assertEquals("bgchcgsfzhbjkiy", model.getPolicy().getTags().get(0));
        Assertions.assertEquals(
                AlertPolicyType.V1INSIGHTS_LBAAS_TLS_CONNECTIONS_PER_SECOND_UTILIZATION_PERCENT,
                model.getPolicy().getType());
        Assertions.assertEquals("voveomkhfeqcoop", model.getPolicy().getUuid());
        Assertions.assertEquals(94.25597f, model.getPolicy().getValue());
        Assertions.assertEquals(AlertPolicyWindow.TENM, model.getPolicy().getWindow());
    }

    @Test
    public void testSerialize() {
        Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema model =
                new Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema()
                        .setPolicy(
                                new AlertPolicy()
                                        .setAlerts(
                                                new Alerts()
                                                        .setEmail(Arrays.asList("xxwtdmbqjtsuh"))
                                                        .setSlack(Arrays.asList()))
                                        .setCompare(AlertPolicyCompare.GREATER_THAN)
                                        .setDescription("oxtdyqavfx")
                                        .setEnabled(true)
                                        .setEntities(Arrays.asList("zxsyaks", "npaami", "wb", "hvwt"))
                                        .setTags(Arrays.asList("bgchcgsfzhbjkiy", "qbjsdjpgxeysgw", "cfferznzc"))
                                        .setType(
                                                AlertPolicyType
                                                        .V1INSIGHTS_LBAAS_TLS_CONNECTIONS_PER_SECOND_UTILIZATION_PERCENT)
                                        .setUuid("voveomkhfeqcoop")
                                        .setValue(94.25597f)
                                        .setWindow(AlertPolicyWindow.TENM));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("xxwtdmbqjtsuh", model.getPolicy().getAlerts().getEmail().get(0));
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicy().getCompare());
        Assertions.assertEquals("oxtdyqavfx", model.getPolicy().getDescription());
        Assertions.assertEquals(true, model.getPolicy().isEnabled());
        Assertions.assertEquals("zxsyaks", model.getPolicy().getEntities().get(0));
        Assertions.assertEquals("bgchcgsfzhbjkiy", model.getPolicy().getTags().get(0));
        Assertions.assertEquals(
                AlertPolicyType.V1INSIGHTS_LBAAS_TLS_CONNECTIONS_PER_SECOND_UTILIZATION_PERCENT,
                model.getPolicy().getType());
        Assertions.assertEquals("voveomkhfeqcoop", model.getPolicy().getUuid());
        Assertions.assertEquals(94.25597f, model.getPolicy().getValue());
        Assertions.assertEquals(AlertPolicyWindow.TENM, model.getPolicy().getWindow());
    }
}
