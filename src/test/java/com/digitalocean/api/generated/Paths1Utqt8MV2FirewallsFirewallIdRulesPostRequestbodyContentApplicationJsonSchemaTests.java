package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.digitalocean.api.models.Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"yuf\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"fyjfd\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"jokgwesymzqh\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"ejtznxlue\"}]}")
                        .toObject(
                                Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("yuf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("fyjfd", model.getOutboundRules().get(0).getPorts());
    }

    @Test
    public void testSerialize() {
        Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema model =
                new Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema()
                        .setInboundRules(
                                Arrays.asList(
                                        new FirewallRulesInboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.ICMP)
                                                .setPorts("yuf")
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
                                                .setPorts("fyjfd")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.UDP)
                                                .setPorts("jokgwesymzqh")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList())),
                                        new FirewallRulesOutboundRulesItem()
                                                .setProtocol(FirewallRuleBaseProtocol.TCP)
                                                .setPorts("ejtznxlue")
                                                .setDestinations(
                                                        new FirewallRulesOutboundRulesAllOfProperties()
                                                                .setAddresses(Arrays.asList())
                                                                .setDropletIds(Arrays.asList())
                                                                .setLoadBalancerUids(Arrays.asList())
                                                                .setKubernetesIds(Arrays.asList()))));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("yuf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("fyjfd", model.getOutboundRules().get(0).getPorts());
    }
}
