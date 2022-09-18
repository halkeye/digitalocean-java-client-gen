package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.FirewallPendingChangesItem;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRules;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.digitalocean.api.models.FirewallStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallTests {
    @Test
    public void testDeserialize() {
        Firewall model = BinaryData.fromString("{\"id\":\"mtsdixchwk\",\"status\":\"failed\",\"created_at\":\"2021-08-08T03:56:34Z\",\"pending_changes\":[{\"droplet_id\":653289494,\"removing\":false,\"status\":\"gair\"}],\"name\":\"qzoof\",\"droplet_ids\":[1617198604,1634501666],\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"berpyljeknf\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"owkdnjr\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"ehycpn\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"r\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"afbjzmpy\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"bko\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"rmxkbcjwwdxom\"}]}").toObject(Firewall.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("berpyljeknf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("r", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("qzoof", model.getName());
        Assertions.assertEquals(1617198604, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Firewall model = new Firewall().setInboundRules(Arrays.asList(new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("berpyljeknf").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("owkdnjr").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("ehycpn").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setOutboundRules(Arrays.asList(new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("r").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("afbjzmpy").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("bko").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("rmxkbcjwwdxom").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setName("qzoof").setDropletIds(Arrays.asList(1617198604, 1634501666));
        model = BinaryData.fromObject(model).toObject(Firewall.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("berpyljeknf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("r", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("qzoof", model.getName());
        Assertions.assertEquals(1617198604, model.getDropletIds().get(0));
    }
}
