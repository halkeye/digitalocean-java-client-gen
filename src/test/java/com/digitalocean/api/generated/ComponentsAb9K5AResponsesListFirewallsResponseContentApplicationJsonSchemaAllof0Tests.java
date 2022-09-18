package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Firewall;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"firewalls\":[{\"id\":\"lxrkgjnmzpasla\",\"status\":\"waiting\",\"created_at\":\"2021-07-24T16:32:35Z\",\"pending_changes\":[],\"name\":\"pieidzlvssqy\",\"droplet_ids\":[1480178625],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"dvikm\",\"status\":\"succeeded\",\"created_at\":\"2021-11-25T13:20:45Z\",\"pending_changes\":[],\"name\":\"xg\",\"droplet_ids\":[2123049533,869715957,1842512127],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"bijeiydy\",\"status\":\"waiting\",\"created_at\":\"2021-06-30T16:18:41Z\",\"pending_changes\":[],\"name\":\"ayrgwy\",\"droplet_ids\":[2103755905],\"inbound_rules\":[],\"outbound_rules\":[]}]}").toObject(ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("pieidzlvssqy", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(1480178625, model.getFirewalls().get(0).getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 model = new ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0().setFirewalls(Arrays.asList(new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("pieidzlvssqy").setDropletIds(Arrays.asList(1480178625)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("xg").setDropletIds(Arrays.asList(2123049533, 869715957, 1842512127)), new Firewall().setInboundRules(Arrays.asList()).setOutboundRules(Arrays.asList()).setName("ayrgwy").setDropletIds(Arrays.asList(2103755905))));
        model = BinaryData.fromObject(model).toObject(ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("pieidzlvssqy", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(1480178625, model.getFirewalls().get(0).getDropletIds().get(0));
    }
}
