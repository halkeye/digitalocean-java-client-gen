package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AlertPolicy;
import com.digitalocean.api.models.AlertPolicyCompare;
import com.digitalocean.api.models.AlertPolicyType;
import com.digitalocean.api.models.AlertPolicyWindow;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.SlackDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AlertPolicyTests {
    @Test
    public void testDeserialize() {
        AlertPolicy model =
                BinaryData.fromString(
                                "{\"alerts\":{\"email\":[\"iigeeu\"],\"slack\":[{\"channel\":\"rn\",\"url\":\"yxfedqnetd\"}]},\"compare\":\"LessThan\",\"description\":\"yn\",\"enabled\":true,\"entities\":[\"gvbzpg\",\"pw\",\"eyobqaj\"],\"tags\":[\"irv\",\"vrvkgpogplb\",\"uvlnhxnrnjhinaeg\"],\"type\":\"v1/insights/droplet/cpu\",\"uuid\":\"bx\",\"value\":87.99935,\"window\":\"5m\"}")
                        .toObject(AlertPolicy.class);
        Assertions.assertEquals("iigeeu", model.getAlerts().getEmail().get(0));
        Assertions.assertEquals("rn", model.getAlerts().getSlack().get(0).getChannel());
        Assertions.assertEquals("yxfedqnetd", model.getAlerts().getSlack().get(0).getUrl());
        Assertions.assertEquals(AlertPolicyCompare.LESS_THAN, model.getCompare());
        Assertions.assertEquals("yn", model.getDescription());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("gvbzpg", model.getEntities().get(0));
        Assertions.assertEquals("irv", model.getTags().get(0));
        Assertions.assertEquals(AlertPolicyType.V1INSIGHTS_DROPLET_CPU, model.getType());
        Assertions.assertEquals("bx", model.getUuid());
        Assertions.assertEquals(87.99935f, model.getValue());
        Assertions.assertEquals(AlertPolicyWindow.FIVEM, model.getWindow());
    }

    @Test
    public void testSerialize() {
        AlertPolicy model =
                new AlertPolicy()
                        .setAlerts(
                                new Alerts()
                                        .setEmail(Arrays.asList("iigeeu"))
                                        .setSlack(
                                                Arrays.asList(
                                                        new SlackDetails().setChannel("rn").setUrl("yxfedqnetd"))))
                        .setCompare(AlertPolicyCompare.LESS_THAN)
                        .setDescription("yn")
                        .setEnabled(true)
                        .setEntities(Arrays.asList("gvbzpg", "pw", "eyobqaj"))
                        .setTags(Arrays.asList("irv", "vrvkgpogplb", "uvlnhxnrnjhinaeg"))
                        .setType(AlertPolicyType.V1INSIGHTS_DROPLET_CPU)
                        .setUuid("bx")
                        .setValue(87.99935f)
                        .setWindow(AlertPolicyWindow.FIVEM);
        model = BinaryData.fromObject(model).toObject(AlertPolicy.class);
        Assertions.assertEquals("iigeeu", model.getAlerts().getEmail().get(0));
        Assertions.assertEquals("rn", model.getAlerts().getSlack().get(0).getChannel());
        Assertions.assertEquals("yxfedqnetd", model.getAlerts().getSlack().get(0).getUrl());
        Assertions.assertEquals(AlertPolicyCompare.LESS_THAN, model.getCompare());
        Assertions.assertEquals("yn", model.getDescription());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("gvbzpg", model.getEntities().get(0));
        Assertions.assertEquals("irv", model.getTags().get(0));
        Assertions.assertEquals(AlertPolicyType.V1INSIGHTS_DROPLET_CPU, model.getType());
        Assertions.assertEquals("bx", model.getUuid());
        Assertions.assertEquals(87.99935f, model.getValue());
        Assertions.assertEquals(AlertPolicyWindow.FIVEM, model.getWindow());
    }
}
