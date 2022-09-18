package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRuleTargetTests {
    @Test
    public void testDeserialize() {
        FirewallRuleTarget model = BinaryData.fromString("{\"addresses\":[\"lddauqmllfe\",\"thxuarigrjdl\",\"lkqhvkrbzkua\"],\"droplet_ids\":[450518329,567743563,1658926692],\"load_balancer_uids\":[\"uul\"],\"kubernetes_ids\":[\"t\"]}").toObject(FirewallRuleTarget.class);
        Assertions.assertEquals("lddauqmllfe", model.getAddresses().get(0));
        Assertions.assertEquals(450518329, model.getDropletIds().get(0));
        Assertions.assertEquals("uul", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("t", model.getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        FirewallRuleTarget model = new FirewallRuleTarget().setAddresses(Arrays.asList("lddauqmllfe", "thxuarigrjdl", "lkqhvkrbzkua")).setDropletIds(Arrays.asList(450518329, 567743563, 1658926692)).setLoadBalancerUids(Arrays.asList("uul")).setKubernetesIds(Arrays.asList("t"));
        model = BinaryData.fromObject(model).toObject(FirewallRuleTarget.class);
        Assertions.assertEquals("lddauqmllfe", model.getAddresses().get(0));
        Assertions.assertEquals(450518329, model.getDropletIds().get(0));
        Assertions.assertEquals("uul", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("t", model.getKubernetesIds().get(0));
    }
}
