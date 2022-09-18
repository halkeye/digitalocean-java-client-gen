package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Firewall;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.digitalocean.api.models.Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"id\":\"tgs\",\"status\":\"failed\",\"created_at\":\"2021-11-14T18:27:58Z\",\"pending_changes\":[{\"droplet_id\":658482742,\"removing\":false,\"status\":\"glxkoikmtrawrqk\"}],\"name\":\"wb\",\"droplet_ids\":[1314097120],\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"prnejzltkaszf\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"uxapgrcqebmvrdjo\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"vdlsflxkqesdfeds\"},{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"inm\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"ltvdhqnufbx\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"ojovfnybydh\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"udhuaorhjk\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"sqircamqprlobrug\"}]}").toObject(Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("prnejzltkaszf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ltvdhqnufbx", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("wb", model.getName());
        Assertions.assertEquals(1314097120, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema model = new Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema().setInboundRules(Arrays.asList(new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("prnejzltkaszf").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("uxapgrcqebmvrdjo").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("vdlsflxkqesdfeds").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("inm").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setOutboundRules(Arrays.asList(new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("ltvdhqnufbx").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("ojovfnybydh").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("udhuaorhjk").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("sqircamqprlobrug").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setName("wb").setDropletIds(Arrays.asList(1314097120));
        model = BinaryData.fromObject(model).toObject(Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("prnejzltkaszf", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("ltvdhqnufbx", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("wb", model.getName());
        Assertions.assertEquals(1314097120, model.getDropletIds().get(0));
    }
}
