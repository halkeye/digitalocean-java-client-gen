package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import com.digitalocean.api.models.FirewallRuleTarget;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRulesOutboundRulesAllOfPropertiesTests {
    @Test
    public void testDeserialize() {
        FirewallRulesOutboundRulesAllOfProperties model = BinaryData.fromString("{\"addresses\":[\"cqcdhthojv\",\"irknucosaw\"],\"droplet_ids\":[1427690458,86351878,948503325],\"load_balancer_uids\":[\"gpyai\",\"ihzqjjtsmuy\",\"qfttkacybdueur\"],\"kubernetes_ids\":[\"dcpks\",\"lojermhzicsbfd\",\"hyaaknyukibxiglh\"]}").toObject(FirewallRulesOutboundRulesAllOfProperties.class);
        Assertions.assertEquals("cqcdhthojv", model.getAddresses().get(0));
        Assertions.assertEquals(1427690458, model.getDropletIds().get(0));
        Assertions.assertEquals("gpyai", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("dcpks", model.getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        FirewallRulesOutboundRulesAllOfProperties model = new FirewallRulesOutboundRulesAllOfProperties().setAddresses(Arrays.asList("cqcdhthojv", "irknucosaw")).setDropletIds(Arrays.asList(1427690458, 86351878, 948503325)).setLoadBalancerUids(Arrays.asList("gpyai", "ihzqjjtsmuy", "qfttkacybdueur")).setKubernetesIds(Arrays.asList("dcpks", "lojermhzicsbfd", "hyaaknyukibxiglh"));
        model = BinaryData.fromObject(model).toObject(FirewallRulesOutboundRulesAllOfProperties.class);
        Assertions.assertEquals("cqcdhthojv", model.getAddresses().get(0));
        Assertions.assertEquals(1427690458, model.getDropletIds().get(0));
        Assertions.assertEquals("gpyai", model.getLoadBalancerUids().get(0));
        Assertions.assertEquals("dcpks", model.getKubernetesIds().get(0));
    }
}
