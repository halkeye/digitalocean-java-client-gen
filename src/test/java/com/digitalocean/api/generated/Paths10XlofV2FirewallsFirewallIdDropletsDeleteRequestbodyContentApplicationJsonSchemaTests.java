package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"droplet_ids\":[1527227132,1616197514]}")
                        .toObject(
                                Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(1527227132, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema model =
                new Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema()
                        .setDropletIds(Arrays.asList(1527227132, 1616197514));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(1527227132, model.getDropletIds().get(0));
    }
}
