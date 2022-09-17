package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallRuleBase;
import com.digitalocean.api.models.FirewallRuleBaseProtocol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallRuleBaseTests {
    @Test
    public void testDeserialize() {
        FirewallRuleBase model =
                BinaryData.fromString("{\"protocol\":\"icmp\",\"ports\":\"uqbdq\"}").toObject(FirewallRuleBase.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("uqbdq", model.getPorts());
    }

    @Test
    public void testSerialize() {
        FirewallRuleBase model = new FirewallRuleBase().setProtocol(FirewallRuleBaseProtocol.ICMP).setPorts("uqbdq");
        model = BinaryData.fromObject(model).toObject(FirewallRuleBase.class);
        Assertions.assertEquals(FirewallRuleBaseProtocol.ICMP, model.getProtocol());
        Assertions.assertEquals("uqbdq", model.getPorts());
    }
}
