package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"droplet_ids\":[1663871632,688475668,126960416,428114220]}").toObject(PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1663871632, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema model = new PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema().setDropletIds(Arrays.asList(1663871632, 688475668, 126960416, 428114220));
        model = BinaryData.fromObject(model).toObject(PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1663871632, model.getDropletIds().get(0));
    }
}
