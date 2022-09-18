package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"firewall\":{\"id\":\"z\",\"status\":\"succeeded\",\"created_at\":\"2021-08-20T09:30:47Z\",\"pending_changes\":[{\"droplet_id\":1597472821,\"removing\":true,\"status\":\"ckyvnensmuffi\"},{\"droplet_id\":144155538,\"removing\":true,\"status\":\"bpzujqjtotdxp\"},{\"droplet_id\":132625960,\"removing\":true,\"status\":\"wuusiecktybh\"}],\"name\":\"xidhhxomil\",\"droplet_ids\":[1972558791],\"inbound_rules\":[{\"protocol\":\"icmp\",\"ports\":\"xwjwilm\"},{\"protocol\":\"icmp\",\"ports\":\"sl\"},{\"protocol\":\"icmp\",\"ports\":\"teptwujjzgxqgqwl\"},{\"protocol\":\"udp\",\"ports\":\"hgt\"}],\"outbound_rules\":[{\"protocol\":\"tcp\",\"ports\":\"qqy\"},{\"protocol\":\"icmp\",\"ports\":\"kkt\"}]}}").toObject(Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("xwjwilm", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("qqy", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("xidhhxomil", model.getFirewall().getName());
        Assertions.assertEquals(1972558791, model.getFirewall().getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema model = new Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema().setFirewall(new Firewall().setInboundRules(Arrays.asList(new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("xwjwilm"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("sl"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("teptwujjzgxqgqwl"), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("hgt"))).setOutboundRules(Arrays.asList(new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("qqy"), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("kkt"))).setName("xidhhxomil").setDropletIds(Arrays.asList(1972558791)));
        model = BinaryData.fromObject(model).toObject(Components1Ppd4D8ResponsesCreateFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("xwjwilm", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("qqy", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("xidhhxomil", model.getFirewall().getName());
        Assertions.assertEquals(1972558791, model.getFirewall().getDropletIds().get(0));
    }
}
