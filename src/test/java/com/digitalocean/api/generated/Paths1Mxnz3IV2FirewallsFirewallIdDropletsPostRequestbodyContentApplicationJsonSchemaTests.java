package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"droplet_ids\":[1496067796,1965532334]}").toObject(Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1496067796, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema model = new Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema().setDropletIds(Arrays.asList(1496067796, 1965532334));
        model = BinaryData.fromObject(model).toObject(Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1496067796, model.getDropletIds().get(0));
    }
}
