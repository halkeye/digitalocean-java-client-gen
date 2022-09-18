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
import com.digitalocean.api.models.Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"id\":\"tnorwaigsioct\",\"status\":\"succeeded\",\"created_at\":\"2021-04-15T18:14:41Z\",\"pending_changes\":[{\"droplet_id\":1045792223,\"removing\":true,\"status\":\"f\"}],\"name\":\"jnwosst\",\"droplet_ids\":[615570355],\"inbound_rules\":[{\"sources\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"udp\",\"ports\":\"rr\"}],\"outbound_rules\":[{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"tcp\",\"ports\":\"hjmbji\"},{\"destinations\":{\"addresses\":[],\"droplet_ids\":[],\"load_balancer_uids\":[],\"kubernetes_ids\":[]},\"protocol\":\"icmp\",\"ports\":\"sohcwhpyvdkgd\"}]}").toObject(Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("rr", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("hjmbji", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("jnwosst", model.getName());
        Assertions.assertEquals(615570355, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema model = new Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema().setInboundRules(Arrays.asList(new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.UDP).setPorts("rr").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setOutboundRules(Arrays.asList(new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.TCP).setPorts("hjmbji").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())), new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("sohcwhpyvdkgd").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList()).setDropletIds(Arrays.asList()).setLoadBalancerUids(Arrays.asList()).setKubernetesIds(Arrays.asList())))).setName("jnwosst").setDropletIds(Arrays.asList(615570355));
        model = BinaryData.fromObject(model).toObject(Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.UDP, model.getInboundRules().get(0).getProtocol());
        Assertions.assertEquals("rr", model.getInboundRules().get(0).getPorts());
        Assertions.assertEquals(FirewallRuleBaseProtocol.TCP, model.getOutboundRules().get(0).getProtocol());
        Assertions.assertEquals("hjmbji", model.getOutboundRules().get(0).getPorts());
        Assertions.assertEquals("jnwosst", model.getName());
        Assertions.assertEquals(615570355, model.getDropletIds().get(0));
    }
}
