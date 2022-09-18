package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRule;
import com.digitalocean.api.models.FirewallRuleType;
import com.digitalocean.api.models.Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"rules\":[{\"uuid\":\"nrswgkpjhboyik\",\"cluster_uuid\":\"huhkslgwlok\",\"type\":\"app\",\"value\":\"eoijyzcqypzqzufg\",\"created_at\":\"2021-10-23T10:54:32Z\"},{\"uuid\":\"jyvdwtfxptpqayam\",\"cluster_uuid\":\"cf\",\"type\":\"tag\",\"value\":\"bmxsnxoc\",\"created_at\":\"2021-06-29T16:16:22Z\"},{\"uuid\":\"ojkpoyh\",\"cluster_uuid\":\"wdjuxdbdljzgdy\",\"type\":\"k8s\",\"value\":\"vuqbsgzlrqhbjnqo\",\"created_at\":\"2021-09-14T15:35:47Z\"},{\"uuid\":\"bsfp\",\"cluster_uuid\":\"x\",\"type\":\"ip_addr\",\"value\":\"lflec\",\"created_at\":\"2021-10-26T08:04:02Z\"}]}").toObject(Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("nrswgkpjhboyik", model.getRules().get(0).getUuid());
        Assertions.assertEquals("huhkslgwlok", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.APP, model.getRules().get(0).getType());
        Assertions.assertEquals("eoijyzcqypzqzufg", model.getRules().get(0).getValue());
    }

    @Test
    public void testSerialize() {
        Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema model = new Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema().setRules(Arrays.asList(new FirewallRule().setUuid("nrswgkpjhboyik").setClusterUuid("huhkslgwlok").setType(FirewallRuleType.APP).setValue("eoijyzcqypzqzufg"), new FirewallRule().setUuid("jyvdwtfxptpqayam").setClusterUuid("cf").setType(FirewallRuleType.TAG).setValue("bmxsnxoc"), new FirewallRule().setUuid("ojkpoyh").setClusterUuid("wdjuxdbdljzgdy").setType(FirewallRuleType.K8S).setValue("vuqbsgzlrqhbjnqo"), new FirewallRule().setUuid("bsfp").setClusterUuid("x").setType(FirewallRuleType.IP_ADDR).setValue("lflec")));
        model = BinaryData.fromObject(model).toObject(Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("nrswgkpjhboyik", model.getRules().get(0).getUuid());
        Assertions.assertEquals("huhkslgwlok", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.APP, model.getRules().get(0).getType());
        Assertions.assertEquals("eoijyzcqypzqzufg", model.getRules().get(0).getValue());
    }
}
