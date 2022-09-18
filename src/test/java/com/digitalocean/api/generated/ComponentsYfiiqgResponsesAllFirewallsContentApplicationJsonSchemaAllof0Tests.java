package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Firewall;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"firewalls\":[{\"id\":\"o\",\"status\":\"waiting\",\"created_at\":\"2021-05-19T21:23:31Z\",\"pending_changes\":[],\"name\":\"rkjg\",\"droplet_ids\":[715641821,1803427824,745319010,1919720488],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"mijpdvzvfbhwbdq\",\"status\":\"failed\",\"created_at\":\"2021-01-18T22:04:24Z\",\"pending_changes\":[],\"name\":\"laqrwyam\",\"droplet_ids\":[320025450,1553710393],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"jqut\",\"status\":\"waiting\",\"created_at\":\"2021-04-17T23:51:41Z\",\"pending_changes\":[],\"name\":\"rvrk\",\"droplet_ids\":[1274004293],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"lghnysvlp\",\"status\":\"failed\",\"created_at\":\"2021-10-08T06:38:04Z\",\"pending_changes\":[],\"name\":\"ixqbolxvhhyqqeg\",\"droplet_ids\":[935452411,1542919185],\"inbound_rules\":[],\"outbound_rules\":[]}]}").toObject(ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rkjg", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(715641821, model.getFirewalls().get(0).getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0 model = new ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0().setFirewalls(Arrays.asList(new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("rkjg").setDropletIds(Arrays.asList(715641821, 1803427824, 745319010, 1919720488)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("laqrwyam").setDropletIds(Arrays.asList(320025450, 1553710393)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("rvrk").setDropletIds(Arrays.asList(1274004293)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("ixqbolxvhhyqqeg").setDropletIds(Arrays.asList(935452411, 1542919185))));
        model = BinaryData.fromObject(model).toObject(ComponentsYfiiqgResponsesAllFirewallsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("rkjg", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(715641821, model.getFirewalls().get(0).getDropletIds().get(0));
    }
}
