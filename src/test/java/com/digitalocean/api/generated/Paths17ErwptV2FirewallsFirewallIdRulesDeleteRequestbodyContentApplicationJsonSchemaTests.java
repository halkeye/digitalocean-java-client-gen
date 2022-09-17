package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.digitalocean.api.models.Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"mwejlwbkbpjzobdw\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"kuhydtnaczkfwfat\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"kivdwgtqcume\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"qbdiuycsbskowkr\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"mqowiuasfgqg\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"mqvdru\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"eoehgfmqmskkixvl\"}]}")
                        .toObject(
                                Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("mwejlwbkbpjzobdw", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("mqowiuasfgqg", model.getOutboundRules().get(0).getPorts());
    }

    @Test
    public void testSerialize() {
        Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema model =
                new Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema()
                        .setInboundRules(
                                Arrays.asList(
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                .setPorts("mwejlwbkbpjzobdw")
                                                .setSources(
                                                        new FirewallRulesInboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                .setPorts("kuhydtnaczkfwfat")
                                                .setSources(
                                                        new FirewallRulesInboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                .setPorts("kivdwgtqcume")
                                                .setSources(
                                                        new FirewallRulesInboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.TCP)
                                                .setPorts("qbdiuycsbskowkr")
                                                .setSources(
                                                        new FirewallRulesInboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList()))))
                        .setOutboundRules(
                                Arrays.asList(
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                .setPorts("mqowiuasfgqg")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.TCP)
                                                .setPorts("mqvdru")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                .setPorts("eoehgfmqmskkixvl")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList()))));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("mwejlwbkbpjzobdw", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("mqowiuasfgqg", model.getOutboundRules().get(0).getPorts());
    }
}
