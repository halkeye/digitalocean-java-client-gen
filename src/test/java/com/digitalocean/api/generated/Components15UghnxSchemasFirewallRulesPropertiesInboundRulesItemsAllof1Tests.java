package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1;
import com.digitalocean.api.models.FirewallRulesInboundRulesAllOfProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1Tests {
    @Test
    public void testDeserialize() {
        Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 model = BinaryData.fromString("{\"sources\":{\"addresses\":[\"ttuxvzfqayopbt\",\"ixhg\"],\"droplet_ids\":[2099170935],\"load_balancer_uids\":[\"dztgsqja\",\"qm\"],\"kubernetes_ids\":[\"neibpgbrhbjdq\"]}}").toObject(Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1.class);
        Assertions.assertEquals("ttuxvzfqayopbt", model.getSources().getAddresses().get(0));
        Assertions.assertEquals(2099170935, model.getSources().getDropletIds().get(0));
        Assertions.assertEquals("dztgsqja", model.getSources().getLoadBalancerUids().get(0));
        Assertions.assertEquals("neibpgbrhbjdq", model.getSources().getKubernetesIds().get(0));
    }

    @Test
    public void testSerialize() {
        Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1 model = new Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1().setSources(new FirewallRulesInboundRulesAllOfProperties().setAddresses(Arrays.asList("ttuxvzfqayopbt", "ixhg")).setDropletIds(Arrays.asList(2099170935)).setLoadBalancerUids(Arrays.asList("dztgsqja", "qm")).setKubernetesIds(Arrays.asList("neibpgbrhbjdq")));
        model = BinaryData.fromObject(model).toObject(Components15UghnxSchemasFirewallRulesPropertiesInboundRulesItemsAllof1.class);
        Assertions.assertEquals("ttuxvzfqayopbt", model.getSources().getAddresses().get(0));
        Assertions.assertEquals(2099170935, model.getSources().getDropletIds().get(0));
        Assertions.assertEquals("dztgsqja", model.getSources().getLoadBalancerUids().get(0));
        Assertions.assertEquals("neibpgbrhbjdq", model.getSources().getKubernetesIds().get(0));
    }
}
