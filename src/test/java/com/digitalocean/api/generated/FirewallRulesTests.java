package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRules;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRulesTests {
    @Test
    public void testDeserialize() {
        FirewallRules model =
                BinaryData.fromString(
                                "{\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"twgabdx\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"ooyvhtuqbpeln\"}]}")
                        .toObject(FirewallRules.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("twgabdx", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ooyvhtuqbpeln", model.getOutboundRules().get(0).getPorts());
    }

    @Test
    public void testSerialize() {
        FirewallRules model =
                new FirewallRules()
                        .setInboundRules(
                                Arrays.asList(
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                .setPorts("twgabdx")
                                                .setSources(
                                                        new FirewallRulesInboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList()))))
                        .setOutboundRules(
                                Arrays.asList(
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                .setPorts("ooyvhtuqbpeln")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(FirewallRules.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("twgabdx", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ooyvhtuqbpeln", model.getOutboundRules().get(0).getPorts());
    }
}
