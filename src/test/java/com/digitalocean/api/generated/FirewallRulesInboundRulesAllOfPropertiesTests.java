package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRuleTarget;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRulesInboundRulesAllOfPropertiesTests {
    @Test
    public void testDeserialize() {
        FirewallRulesInboundRulesAllOfProperties model = BinaryData.fromString("{\"addresses\":[\"nmotpuwnnoh\"],\"droplet_ids\":[1117526151,1229503991,146984176,14114597],\"load_balancer_uids\":[\"juypwyiulaynosu\"],\"kubernetes_ids\":[\"haxttpf\",\"mwgsghq\"]}").toObject(FirewallRulesInboundRulesAllOfProperties.class);
        Assertions.assertEquals("nmotpuwnnoh", model.getAddresses().get(0));
        Assertions.assertEquals(1117526151, model.getDropletIds().get(0));
        Assertions.assertEquals("juypwyiulaynosu", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("haxttpf", model.getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        FirewallRulesInboundRulesAllOfProperties model = new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList("nmotpuwnnoh")).setDropletIds(Arrays.asList(1117526151, 1229503991, 146984176, 14114597)).setLoadBalancerUids(Arrays.asList("juypwyiulaynosu")).setKubernetesIds(Arrays.asList("haxttpf", "mwgsghq"));
        model = BinaryData.fromObject(model).toObject(FirewallRulesInboundRulesAllOfProperties.class);
        Assertions.assertEquals("nmotpuwnnoh", model.getAddresses().get(0));
        Assertions.assertEquals(1117526151, model.getDropletIds().get(0));
        Assertions.assertEquals("juypwyiulaynosu", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("haxttpf", model.getKubernetesIds().get(0));
    }
}
