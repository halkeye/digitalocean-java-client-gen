package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"droplet_ids\":[1755553996,867784580,569973171,1547486643]}").toObject(PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1755553996, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema model = new PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema().setDropletIds(Arrays.asList(1755553996, 867784580, 569973171, 1547486643));
        model = BinaryData.fromObject(model).toObject(PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(1755553996, model.getDropletIds().get(0));
    }
}
