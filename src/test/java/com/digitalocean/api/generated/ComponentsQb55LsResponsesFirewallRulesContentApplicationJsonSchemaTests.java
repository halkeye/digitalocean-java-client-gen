package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema;
import com.digitalocean.api.models.FirewallRule;
import com.digitalocean.api.models.FirewallRuleType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"rules\":[{\"uuid\":\"vqchoadhrs\",\"cluster_uuid\":\"vzvsp\",\"type\":\"app\",\"value\":\"dsrgfajg\",\"created_at\":\"2021-10-09T22:42:19Z\"},{\"uuid\":\"ubklrxhj\",\"cluster_uuid\":\"tcetjdv\",\"type\":\"ip_addr\",\"value\":\"dieq\",\"created_at\":\"2021-06-20T01:11:06Z\"},{\"uuid\":\"ruwdxvqzxoebwgj\",\"cluster_uuid\":\"ibanb\",\"type\":\"app\",\"value\":\"pwtzvpakloz\",\"created_at\":\"2021-09-22T14:56:47Z\"},{\"uuid\":\"rpejp\",\"cluster_uuid\":\"s\",\"type\":\"app\",\"value\":\"bttt\",\"created_at\":\"2021-08-13T23:55:04Z\"}]}")
                        .toObject(ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema.class);
        Assertions.assertEquals("vqchoadhrs", model.getRules().get(0).getUuid());
        Assertions.assertEquals("vzvsp", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.APP, model.getRules().get(0).getType());
        Assertions.assertEquals("dsrgfajg", model.getRules().get(0).getValue());
    }

    @Test
    public void testSerialize() {
        ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema model =
                new ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema()
                        .setRules(
                                Arrays.asList(
                                        new FirewallRule()
                                                .setUuid("vqchoadhrs")
                                                .setClusterUuid("vzvsp")
                                                .setType(FirewallRuleType.APP)
                                                .setValue("dsrgfajg"),
                                        new FirewallRule()
                                                .setUuid("ubklrxhj")
                                                .setClusterUuid("tcetjdv")
                                                .setType(FirewallRuleType.IP_ADDR)
                                                .setValue("dieq"),
                                        new FirewallRule()
                                                .setUuid("ruwdxvqzxoebwgj")
                                                .setClusterUuid("ibanb")
                                                .setType(FirewallRuleType.APP)
                                                .setValue("pwtzvpakloz"),
                                        new FirewallRule()
                                                .setUuid("rpejp")
                                                .setClusterUuid("s")
                                                .setType(FirewallRuleType.APP)
                                                .setValue("bttt")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsQb55LsResponsesFirewallRulesContentApplicationJsonSchema.class);
        Assertions.assertEquals("vqchoadhrs", model.getRules().get(0).getUuid());
        Assertions.assertEquals("vzvsp", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.APP, model.getRules().get(0).getType());
        Assertions.assertEquals("dsrgfajg", model.getRules().get(0).getValue());
    }
}
