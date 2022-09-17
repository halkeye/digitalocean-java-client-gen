package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MetaOptionalTotal;
import com.digitalocean.api.models.MetaProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetaOptionalTotalTests {
    @Test
    public void testDeserialize() {
        MetaOptionalTotal model =
                BinaryData.fromString("{\"meta\":{\"total\":219744218}}").toObject(MetaOptionalTotal.class);
        Assertions.assertEquals(219744218, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        MetaOptionalTotal model = new MetaOptionalTotal().setMeta(new MetaProperties().setTotal(219744218));
        model = BinaryData.fromObject(model).toObject(MetaOptionalTotal.class);
        Assertions.assertEquals(219744218, model.getMeta().getTotal());
    }
}
