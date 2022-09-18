package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"firewall\":{\"id\":\"ejogmkor\",\"status\":\"failed\",\"created_at\":\"2021-11-28T18:11:05Z\",\"pending_changes\":[{\"droplet_id\":1430715530,\"removing\":false,\"status\":\"bsn\"},{\"droplet_id\":269831289,\"removing\":false,\"status\":\"wkmz\"}],\"name\":\"fetya\",\"droplet_ids\":[725690227],\"inbound_rules\":[{\"protocol\":\"icmp\",\"ports\":\"zgbjbhrpgi\"},{\"protocol\":\"tcp\",\"ports\":\"ttcucrcm\"},{\"protocol\":\"icmp\",\"ports\":\"ixpqj\"},{\"protocol\":\"tcp\",\"ports\":\"ifhb\"}],\"outbound_rules\":[{\"protocol\":\"icmp\",\"ports\":\"ttohqclna\"}]}}").toObject(ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("zgbjbhrpgi", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ttohqclna", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("fetya", model.getFirewall().getName());
        Assertions.assertEquals(725690227, model.getFirewall().getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema model = new ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema().setFirewall(new Firewall().setInboundRules(Arrays.asList(new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("zgbjbhrpgi"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("ttcucrcm"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("ixpqj"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("ifhb"))).setOutboundRules(Arrays.asList(new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("ttohqclna"))).setName("fetya").setDropletIds(Arrays.asList(725690227)));
        model = BinaryData.fromObject(model).toObject(ComponentsUxeeyiResponsesGetFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("zgbjbhrpgi", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ttohqclna", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("fetya", model.getFirewall().getName());
        Assertions.assertEquals(725690227, model.getFirewall().getDropletIds().get(0));
    }
}
