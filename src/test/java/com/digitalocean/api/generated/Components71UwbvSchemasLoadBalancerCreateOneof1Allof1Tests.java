package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components71UwbvSchemasLoadBalancerCreateOneof1Allof1;
import com.digitalocean.api.models.RegionSlug;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components71UwbvSchemasLoadBalancerCreateOneof1Allof1Tests {
    @Test
    public void testDeserialize() {
        Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 model = BinaryData.fromString("{\"region\":\"sfo3\"}").toObject(Components71UwbvSchemasLoadBalancerCreateOneof1Allof1.class);
        Assertions.assertEquals(RegionSlug.SFO3, model.getRegion());
    }

    @Test
    public void testSerialize() {
        Components71UwbvSchemasLoadBalancerCreateOneof1Allof1 model = new Components71UwbvSchemasLoadBalancerCreateOneof1Allof1().setRegion(RegionSlug.SFO3);
        model = BinaryData.fromObject(model).toObject(Components71UwbvSchemasLoadBalancerCreateOneof1Allof1.class);
        Assertions.assertEquals(RegionSlug.SFO3, model.getRegion());
    }
}
