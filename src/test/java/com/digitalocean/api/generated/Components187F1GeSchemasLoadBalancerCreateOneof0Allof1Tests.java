package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components187F1GeSchemasLoadBalancerCreateOneof0Allof1;
import com.digitalocean.api.models.RegionSlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components187F1GeSchemasLoadBalancerCreateOneof0Allof1Tests {
    @Test
    public void testDeserialize() {
        Components187F1GeSchemasLoadBalancerCreateOneof0Allof1 model =
                BinaryData.fromString("{\"region\":\"sfo1\"}")
                        .toObject(Components187F1GeSchemasLoadBalancerCreateOneof0Allof1.class);
        Assertions.assertEquals(RegionSlug.SFO1, model.getRegion());
    }

    @Test
    public void testSerialize() {
        Components187F1GeSchemasLoadBalancerCreateOneof0Allof1 model =
                new Components187F1GeSchemasLoadBalancerCreateOneof0Allof1().setRegion(RegionSlug.SFO1);
        model = BinaryData.fromObject(model).toObject(Components187F1GeSchemasLoadBalancerCreateOneof0Allof1.class);
        Assertions.assertEquals(RegionSlug.SFO1, model.getRegion());
    }
}
