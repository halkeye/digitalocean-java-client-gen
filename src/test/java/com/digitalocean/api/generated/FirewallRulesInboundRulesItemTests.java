package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBase;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesInboundRulesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRulesInboundRulesItemTests {
    @Test
    public void testDeserialize() {
        FirewallRulesInboundRulesItem model = BinaryData.fromString("{\"sources\":{\"addresses\":[\"ncgagdvc\",\"qhftzbpyfaofd\",\"phtnc\",\"mhjobzr\"],\"droplet_ids\":[478729922],\"load_balancer_uids\":[\"cqhyftcvbz\"],\"kubernetes_ids\":[\"h\",\"kg\"]},\"protocol\":\"icmp\",\"ports\":\"uoorssatfybipufd\"}").toObject(FirewallRulesInboundRulesItem.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("uoorssatfybipufd", model.getPorts());
        Assertions.assertEquals("ncgagdvc", model.getSources().getAddresses().get(0));
        Assertions.assertEquals(478729922, model.getSources().getDropletIds().get(0));
        Assertions.assertEquals("cqhyftcvbz", model.getSources().getLoadBalancerUids().get(0));
        Assertions.assertEquals("h", model.getSources().getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        FirewallRulesInboundRulesItem model = new FirewallRulesInboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("uoorssatfybipufd").setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList("ncgagdvc", "qhftzbpyfaofd", "phtnc", "mhjobzr")).setDropletIds(Arrays.asList(478729922)).setLoadBalancerUids(Arrays.asList("cqhyftcvbz")).setKubernetesIds(Arrays.asList("h", "kg")));
        model = BinaryData.fromObject(model).toObject(FirewallRulesInboundRulesItem.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("uoorssatfybipufd", model.getPorts());
        Assertions.assertEquals("ncgagdvc", model.getSources().getAddresses().get(0));
        Assertions.assertEquals(478729922, model.getSources().getDropletIds().get(0));
        Assertions.assertEquals("cqhyftcvbz", model.getSources().getLoadBalancerUids().get(0));
        Assertions.assertEquals("h", model.getSources().getKubernetesIds().get(0));
    }
}
