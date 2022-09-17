package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRule;
import com.digitalocean.api.models.FirewallRuleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRuleTests {
    @Test
    public void testDeserialize() {
        FirewallRule model =
                BinaryData.fromString(
                                "{\"uuid\":\"igvjrktp\",\"cluster_uuid\":\"eukyaw\",\"type\":\"ip_addr\",\"value\":\"pmwhqnuc\",\"created_at\":\"2021-05-02T03:10:04Z\"}")
                        .toObject(FirewallRule.class);
        Assertions.assertEquals("igvjrktp", model.getUuid());
        Assertions.assertEquals("eukyaw", model.getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.IP_ADDR, model.getType());
        Assertions.assertEquals("pmwhqnuc", model.getValue());
    }

    @Test
    public void testSerialize() {
        FirewallRule model =
                new FirewallRule()
                        .setUuid("igvjrktp")
                        .setClusterUuid("eukyaw")
                        .setType(FirewallRuleType.IP_ADDR)
                        .setValue("pmwhqnuc");
        model = BinaryData.fromObject(model).toObject(FirewallRule.class);
        Assertions.assertEquals("igvjrktp", model.getUuid());
        Assertions.assertEquals("eukyaw", model.getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.IP_ADDR, model.getType());
        Assertions.assertEquals("pmwhqnuc", model.getValue());
    }
}
