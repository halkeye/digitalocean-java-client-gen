package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1;
import com.digitalocean.api.models.FirewallRulesOutboundRulesAllOfProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1Tests {
    @Test
    public void testDeserialize() {
        ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 model =
                BinaryData.fromString(
                                "{\"destinations\":{\"addresses\":[\"j\",\"itzovnkr\",\"iklsmni\"],\"droplet_ids\":[1033805471,2137030825,1786707472],\"load_balancer_uids\":[\"yiibh\"],\"kubernetes_ids\":[\"bgbudav\",\"d\"]}}")
                        .toObject(ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1.class);
        Assertions.assertEquals("j", model.getDestinations().getAddresses().get(0));
        Assertions.assertEquals(1033805471, model.getDestinations().getDropletIds().get(0));
        Assertions.assertEquals("yiibh", model.getDestinations().getLoadBalancerUids().get(0));
        Assertions.assertEquals("bgbudav", model.getDestinations().getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1 model =
                new ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1()
                        .setDestinations(
                                new FirewallRulesOutboundRulesAllOfProperties()
                                        .setAddresses(Arrays.asList("j", "itzovnkr", "iklsmni"))
                                        .setDropletIds(Arrays.asList(1033805471, 2137030825, 1786707472))
                                        .setLoadBalancerUids(Arrays.asList("yiibh"))
                                        .setKubernetesIds(Arrays.asList("bgbudav", "d")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsZea7QwSchemasFirewallRulesPropertiesOutboundRulesItemsAllof1.class);
        Assertions.assertEquals("j", model.getDestinations().getAddresses().get(0));
        Assertions.assertEquals(1033805471, model.getDestinations().getDropletIds().get(0));
        Assertions.assertEquals("yiibh", model.getDestinations().getLoadBalancerUids().get(0));
        Assertions.assertEquals("bgbudav", model.getDestinations().getKubernetesIds().get(0));
    }
}
