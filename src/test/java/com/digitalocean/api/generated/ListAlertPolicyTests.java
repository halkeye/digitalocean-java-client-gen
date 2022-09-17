package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AlertPolicy;
import com.digitalocean.api.models.AlertPolicyCompare;
import com.digitalocean.api.models.AlertPolicyType;
import com.digitalocean.api.models.AlertPolicyWindow;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.ListAlertPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ListAlertPolicyTests {
    @Test
    public void testDeserialize() {
        ListAlertPolicy model =
                BinaryData.fromString(
                                "{\"policies\":[{\"alerts\":{\"email\":[],\"slack\":[]},\"compare\":\"GreaterThan\",\"description\":\"htmzstqlfxolrwv\",\"enabled\":false,\"entities\":[\"x\",\"fjswequflzyyopoa\",\"twwgwqubot\"],\"tags\":[\"ufrkwjiemimdt\",\"powewjs\"],\"type\":\"v1/insights/lbaas/droplet_health\",\"uuid\":\"eeedddrftfquulp\",\"value\":13.92169,\"window\":\"10m\"}]}")
                        .toObject(ListAlertPolicy.class);
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicies().get(0).getCompare());
        Assertions.assertEquals("htmzstqlfxolrwv", model.getPolicies().get(0).getDescription());
        Assertions.assertEquals(false, model.getPolicies().get(0).isEnabled());
        Assertions.assertEquals("x", model.getPolicies().get(0).getEntities().get(0));
        Assertions.assertEquals("ufrkwjiemimdt", model.getPolicies().get(0).getTags().get(0));
        Assertions.assertEquals(AlertPolicyType.V1INSIGHTS_LBAAS_DROPLET_HEALTH, model.getPolicies().get(0).getType());
        Assertions.assertEquals("eeedddrftfquulp", model.getPolicies().get(0).getUuid());
        Assertions.assertEquals(13.92169f, model.getPolicies().get(0).getValue());
        Assertions.assertEquals(AlertPolicyWindow.TENM, model.getPolicies().get(0).getWindow());
    }

    @Test
    public void testSerialize() {
        ListAlertPolicy model =
                new ListAlertPolicy()
                        .setPolicies(
                                Arrays.asList(
                                        new AlertPolicy()
                                                .setAlerts(
                                                        new Alerts()
                                                                .setEmail(Arrays.asList())
                                                                .setSlack(Arrays.asList()))
                                                .setCompare(AlertPolicyCompare.GREATER_THAN)
                                                .setDescription("htmzstqlfxolrwv")
                                                .setEnabled(false)
                                                .setEntities(Arrays.asList("x", "fjswequflzyyopoa", "twwgwqubot"))
                                                .setTags(Arrays.asList("ufrkwjiemimdt", "powewjs"))
                                                .setType(AlertPolicyType.V1INSIGHTS_LBAAS_DROPLET_HEALTH)
                                                .setUuid("eeedddrftfquulp")
                                                .setValue(13.92169f)
                                                .setWindow(AlertPolicyWindow.TENM)));
        model = BinaryData.fromObject(model).toObject(ListAlertPolicy.class);
        Assertions.assertEquals(AlertPolicyCompare.GREATER_THAN, model.getPolicies().get(0).getCompare());
        Assertions.assertEquals("htmzstqlfxolrwv", model.getPolicies().get(0).getDescription());
        Assertions.assertEquals(false, model.getPolicies().get(0).isEnabled());
        Assertions.assertEquals("x", model.getPolicies().get(0).getEntities().get(0));
        Assertions.assertEquals("ufrkwjiemimdt", model.getPolicies().get(0).getTags().get(0));
        Assertions.assertEquals(AlertPolicyType.V1INSIGHTS_LBAAS_DROPLET_HEALTH, model.getPolicies().get(0).getType());
        Assertions.assertEquals("eeedddrftfquulp", model.getPolicies().get(0).getUuid());
        Assertions.assertEquals(13.92169f, model.getPolicies().get(0).getValue());
        Assertions.assertEquals(AlertPolicyWindow.TENM, model.getPolicies().get(0).getWindow());
    }
}
