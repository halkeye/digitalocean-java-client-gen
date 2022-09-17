package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0Tests {
    @Test
    public void testDeserialize() {
        Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 model =
                BinaryData.fromString("{\"tag\":\"uszxacdwukokgoo\"}")
                        .toObject(Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0.class);
        Assertions.assertEquals("uszxacdwukokgoo", model.getTag());
    }

    @Test
    public void testSerialize() {
        Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 model =
                new Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0().setTag("uszxacdwukokgoo");
        model = BinaryData.fromObject(model).toObject(Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0.class);
        Assertions.assertEquals("uszxacdwukokgoo", model.getTag());
    }
}
