package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":116536150},\"firewalls\":[{\"id\":\"xikjm\",\"status\":\"succeeded\",\"created_at\":\"2020-12-24T03:53:35Z\",\"pending_changes\":[],\"name\":\"pcwybsz\",\"droplet_ids\":[344966057,1205013654],\"inbound_rules\":[],\"outbound_rules\":[]},{\"id\":\"aebwfwhxorpwa\",\"status\":\"succeeded\",\"created_at\":\"2021-02-06T18:53Z\",\"pending_changes\":[],\"name\":\"ojfccylhtrht\",\"droplet_ids\":[1454821604,61329763,1455942611,874959986],\"inbound_rules\":[],\"outbound_rules\":[]}]}")
                        .toObject(Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema.class);
        Assertions.assertEquals("pcwybsz", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(344966057, model.getFirewalls().get(0).getDropletIds().get(0));
        Assertions.assertEquals(116536150, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema model =
                new Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema()
                        .setFirewalls(
                                Arrays.asList(
                                        new Firewall()
                                                .setInboundRules(Arrays.asList())
                                                .setOutboundRules(Arrays.asList())
                                                .setName("pcwybsz")
                                                .setDropletIds(Arrays.asList(344966057, 1205013654)),
                                        new Firewall()
                                                .setInboundRules(Arrays.asList())
                                                .setOutboundRules(Arrays.asList())
                                                .setName("ojfccylhtrht")
                                                .setDropletIds(
                                                        Arrays.asList(1454821604, 61329763, 1455942611, 874959986))))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(116536150));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components9Q18FmResponsesAllFirewallsContentApplicationJsonSchema.class);
        Assertions.assertEquals("pcwybsz", model.getFirewalls().get(0).getName());
        Assertions.assertEquals(344966057, model.getFirewalls().get(0).getDropletIds().get(0));
        Assertions.assertEquals(116536150, model.getMeta().getTotal());
    }
}
