package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":162424717},\"firewalls\":[{\"id\":\"mgsdaluyckhefrbh\",\"status\":\"failed\",\"created_at\":\"2021-08-01T09:04:40Z\",\"pending_changes\":[],\"name\":\"xebjl\",\"droplet_ids\":[1672299180,1383021224,1310590136,240222931],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"pryj\",\"status\":\"failed\",\"created_at\":\"2021-04-22T18:14:39Z\",\"pending_changes\":[],\"name\":\"uxlymsvvyl\",\"droplet_ids\":[1062595906,141398680],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"qylmpctwjwdsd\",\"status\":\"waiting\",\"created_at\":\"2021-08-13T01:26:56Z\",\"pending_changes\":[],\"name\":\"xx\",\"droplet_ids\":[1145040996],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"omvvhxowpc\",\"status\":\"failed\",\"created_at\":\"2021-07-31T22:42:59Z\",\"pending_changes\":[],\"name\":\"qawbmpspfe\",\"droplet_ids\":[1509995040,1732921110,1084512341,1461342536],\"inbound_rules\":[],\"outbound_rules\":[]}]}").toObject(ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("xebjl", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(1672299180, model.getFirewalls().get(0).getDropletIds().get(0));
        Assertions.assertEquals(162424717, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema model = new ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema().setFirewalls(Arrays.asList(new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("xebjl").setDropletIds(Arrays.asList(1672299180, 1383021224, 1310590136, 240222931)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("uxlymsvvyl").setDropletIds(Arrays.asList(1062595906, 141398680)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("xx").setDropletIds(Arrays.asList(1145040996)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("qawbmpspfe").setDropletIds(Arrays.asList(1509995040, 1732921110, 1084512341, 1461342536)))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(162424717));
        model = BinaryData.fromObject(model).toObject(ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("xebjl", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(1672299180, model.getFirewalls().get(0).getDropletIds().get(0));
        Assertions.assertEquals(162424717, model.getMeta().getTotal());
    }
}
