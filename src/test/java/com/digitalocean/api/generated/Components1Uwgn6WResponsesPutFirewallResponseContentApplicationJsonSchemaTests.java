package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"firewall\":{\"id\":\"vjkj\",\"status\":\"succeeded\",\"created_at\":\"2021-07-06T00:37:16Z\",\"pending_changes\":[{\"droplet_id\":2107949701,\"removing\":true,\"status\":\"dyolje\"}],\"name\":\"xqfmzsizzhravrcj\",\"droplet_ids\":[407184360,642090461],\"inbound_rules\":[{\"protocol\":\"udp\",\"ports\":\"xh\"},{\"protocol\":\"icmp\",\"ports\":\"xgzxlermkmer\"},{\"protocol\":\"tcp\",\"ports\":\"skirhn\"}],\"outbound_rules\":[{\"protocol\":\"tcp\",\"ports\":\"cbkfukd\"},{\"protocol\":\"icmp\",\"ports\":\"qnv\"},{\"protocol\":\"udp\",\"ports\":\"dydshk\"}]}}")
                        .toObject(Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(
                FirewallRuleBaseProtocol.UDP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("xh", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(
                FirewallRuleBaseProtocol.TCP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("cbkfukd", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("xqfmzsizzhravrcj", model.getFirewall().getName());
        Assertions.assertEquals(407184360, model.getFirewall().getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema model =
                new Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema()
                        .setFirewall(
                                new Firewall()
                                        .setInboundRules(
                                                Arrays.asList(
                                                        new FirewallRulesInboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                                .setPorts("xh"),
                                                        new FirewallRulesInboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                                .setPorts("xgzxlermkmer"),
                                                        new FirewallRulesInboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.TCP)
                                                                .setPorts("skirhn")))
                                        .setOutboundRules(
                                                Arrays.asList(
                                                        new FirewallRulesOutboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.TCP)
                                                                .setPorts("cbkfukd"),
                                                        new FirewallRulesOutboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                                .setPorts("qnv"),
                                                        new FirewallRulesOutboundRulesItem()
                                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                                .setPorts("dydshk")))
                                        .setName("xqfmzsizzhravrcj")
                                        .setDropletIds(Arrays.asList(407184360, 642090461)));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals(
                FirewallRuleBaseProtocol.UDP, model.getFirewall().getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("xh", model.getFirewall().getInboundRules().get(0).getPorts());
        Assertions.assertEquals(
                FirewallRuleBaseProtocol.TCP, model.getFirewall().getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("cbkfukd", model.getFirewall().getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("xqfmzsizzhravrcj", model.getFirewall().getName());
        Assertions.assertEquals(407184360, model.getFirewall().getDropletIds().get(0));
    }
}
