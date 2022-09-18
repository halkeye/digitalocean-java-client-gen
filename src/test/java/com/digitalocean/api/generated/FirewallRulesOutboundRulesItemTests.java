package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBase;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRulesOutboundRulesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRulesOutboundRulesItemTests {
    @Test
    public void testDeserialize() {
        FirewallRulesOutboundRulesItem model = BinaryData.fromString("{\"destinations\":{\"addresses\":[\"xvsc\"],\"droplet_ids\":[699693500,1422207579],\"load_balancer_uids\":[\"ky\",\"kgaf\",\"czvfcc\"],\"kubernetes_ids\":[\"twlety\",\"eszr\",\"lhpdhwynctaczcnj\"]},\"protocol\":\"icmp\",\"ports\":\"b\"}").toObject(FirewallRulesOutboundRulesItem.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("b", model.getPorts());
        Assertions.assertEquals("xvsc", model.getDestinations().getAddresses().get(0));
        Assertions.assertEquals(699693500, model.getDestinations().getDropletIds().get(0));
        Assertions.assertEquals("ky", model.getDestinations().getLoadBalancerUids().get(0));
        Assertions.assertEquals("twlety", model.getDestinations().getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        FirewallRulesOutboundRulesItem model = new FirewallRulesOutboundRulesItem().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("b").setDestinations(new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList("xvsc")).setDropletIds(Arrays.asList(699693500, 1422207579)).setLoadBalancerUids(Arrays.asList("ky", "kgaf", "czvfcc")).setKubernetesIds(Arrays.asList("twlety", "eszr", "lhpdhwynctaczcnj")));
        model = BinaryData.fromObject(model).toObject(FirewallRulesOutboundRulesItem.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("b", model.getPorts());
        Assertions.assertEquals("xvsc", model.getDestinations().getAddresses().get(0));
        Assertions.assertEquals(699693500, model.getDestinations().getDropletIds().get(0));
        Assertions.assertEquals("ky", model.getDestinations().getLoadBalancerUids().get(0));
        Assertions.assertEquals("twlety", model.getDestinations().getKubernetesIds().get(0));
    }
}
