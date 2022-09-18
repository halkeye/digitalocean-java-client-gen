package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AlertPolicyRequest;
import com.digitalocean.api.models.AlertPolicyRequestCompare;
import com.digitalocean.api.models.AlertPolicyRequestType;
import com.digitalocean.api.models.AlertPolicyRequestWindow;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.SlackDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AlertPolicyRequestTests {
    @Test
    public void testDeserialize() {
        AlertPolicyRequest model = BinaryData.fromString("{\"alerts\":{\"email\":[\"zoszjg\"],\"slack\":[{\"channel\":\"nkfnyskwwunq\",\"url\":\"czavoj\"},{\"channel\":\"slhip\",\"url\":\"ukvbljpxpr\"},{\"channel\":\"vchyluqalpcufj\",\"url\":\"f\"}]},\"compare\":\"GreaterThan\",\"description\":\"izt\",\"enabled\":false,\"entities\":[\"tahhhsa\",\"xxsri\",\"rcwbaae\",\"yyefmxwoqotiiqb\"],\"tags\":[\"asrvrmtist\",\"ikjhorlxkpypkenn\"],\"type\":\"v1/insights/droplet/load_5\",\"value\":65.502754,\"window\":\"10m\"}").toObject(AlertPolicyRequest.class);
        Assertions.assertEquals("zoszjg", model.getAlerts().getEmail().get(0));
        Assertions.assertEquals("nkfnyskwwunq", model.getAlerts().getSlack().get(0).getChannel());
        Assertions.assertEquals("czavoj", model.getAlerts().getSlack().get(0).getUrl());
        Assertions.assertEquals(AlertPolicyRequestCompare.GREATER_THAN, model.getCompare());
        Assertions.assertEquals("izt", model.getDescription());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("tahhhsa", model.getEntities().get(0));
        Assertions.assertEquals("asrvrmtist", model.getTags().get(0));
        Assertions.assertEquals(AlertPolicyRequestType.V1INSIGHTS_DROPLET_LOAD5, model.getType());
        Assertions.assertEquals(65.502754f, model.getValue());
        Assertions.assertEquals(AlertPolicyRequestWindow.TENM, model.getWindow());
    }

    @Test
    public void testSerialize() {
        AlertPolicyRequest model = new AlertPolicyRequest().setAlerts(new Alerts().setEmail(Arrays.asList("zoszjg")).setSlack(Arrays.asList(new SlackDetails().setChannel("nkfnyskwwunq").setUrl("czavoj"), new SlackDetails().setChannel("slhip").setUrl("ukvbljpxpr"), new SlackDetails().setChannel("vchyluqalpcufj").setUrl("f")))).setCompare(AlertPolicyRequestCompare.GREATER_THAN).setDescription("izt").setEnabled(false).setEntities(Arrays.asList("tahhhsa", "xxsri", "rcwbaae", "yyefmxwoqotiiqb")).setTags(Arrays.asList("asrvrmtist", "ikjhorlxkpypkenn")).setType(AlertPolicyRequestType.V1INSIGHTS_DROPLET_LOAD5).setValue(65.502754f).setWindow(AlertPolicyRequestWindow.TENM);
        model = BinaryData.fromObject(model).toObject(AlertPolicyRequest.class);
        Assertions.assertEquals("zoszjg", model.getAlerts().getEmail().get(0));
        Assertions.assertEquals("nkfnyskwwunq", model.getAlerts().getSlack().get(0).getChannel());
        Assertions.assertEquals("czavoj", model.getAlerts().getSlack().get(0).getUrl());
        Assertions.assertEquals(AlertPolicyRequestCompare.GREATER_THAN, model.getCompare());
        Assertions.assertEquals("izt", model.getDescription());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("tahhhsa", model.getEntities().get(0));
        Assertions.assertEquals("asrvrmtist", model.getTags().get(0));
        Assertions.assertEquals(AlertPolicyRequestType.V1INSIGHTS_DROPLET_LOAD5, model.getType());
        Assertions.assertEquals(65.502754f, model.getValue());
        Assertions.assertEquals(AlertPolicyRequestWindow.TENM, model.getWindow());
    }
}
