package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ProductChargeItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProductChargeItemTests {
    @Test
    public void testDeserialize() {
        ProductChargeItem model = BinaryData.fromString("{\"amount\":\"cdmkxwxdcvjw\",\"name\":\"z\",\"count\":\"keciqchxrtuicd\"}").toObject(ProductChargeItem.class);
        Assertions.assertEquals("cdmkxwxdcvjw", model.getAmount());
        Assertions.assertEquals("z", model.getName());
        Assertions.assertEquals("keciqchxrtuicd", model.getCount());
    }

    @Test
    public void testSerialize() {
        ProductChargeItem model = new ProductChargeItem().setAmount("cdmkxwxdcvjw").setName("z").setCount("keciqchxrtuicd");
        model = BinaryData.fromObject(model).toObject(ProductChargeItem.class);
        Assertions.assertEquals("cdmkxwxdcvjw", model.getAmount());
        Assertions.assertEquals("z", model.getName());
        Assertions.assertEquals("keciqchxrtuicd", model.getCount());
    }
}
