package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 model =
                BinaryData.fromString("{\"droplet_ids\":[1913061819]}")
                        .toObject(ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0.class);
        Assertions.assertEquals(1913061819, model.getDropletIds().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0 model =
                new ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0().setDropletIds(Arrays.asList(1913061819));
        model = BinaryData.fromObject(model).toObject(ComponentsKhgghzSchemasLoadBalancerCreateOneof0Allof0.class);
        Assertions.assertEquals(1913061819, model.getDropletIds().get(0));
    }
}
