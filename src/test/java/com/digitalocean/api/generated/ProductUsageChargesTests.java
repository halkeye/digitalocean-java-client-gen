package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ProductChargeItem;
import com.digitalocean.api.models.ProductUsageCharges;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProductUsageChargesTests {
    @Test
    public void testDeserialize() {
        ProductUsageCharges model = BinaryData.fromString("{\"name\":\"tqjfgxxsaet\",\"amount\":\"dgvpyig\",\"items\":[{\"amount\":\"ilzdcduwj\",\"name\":\"dxngucaif\",\"count\":\"urwwgilfjq\"}]}").toObject(ProductUsageCharges.class);
        Assertions.assertEquals("tqjfgxxsaet", model.getName());
        Assertions.assertEquals("dgvpyig", model.getAmount());
        Assertions.assertEquals("ilzdcduwj", model.getItems().get(0).getAmount());
        Assertions.assertEquals("dxngucaif", model.getItems().get(0).getName());
        Assertions.assertEquals("urwwgilfjq", model.getItems().get(0).getCount());
    }

    @Test
    public void testSerialize() {
        ProductUsageCharges model = new ProductUsageCharges().setName("tqjfgxxsaet").setAmount("dgvpyig").setItems(Arrays.asList(new ProductChargeItem().setAmount("ilzdcduwj").setName("dxngucaif").setCount("urwwgilfjq")));
        model = BinaryData.fromObject(model).toObject(ProductUsageCharges.class);
        Assertions.assertEquals("tqjfgxxsaet", model.getName());
        Assertions.assertEquals("dgvpyig", model.getAmount());
        Assertions.assertEquals("ilzdcduwj", model.getItems().get(0).getAmount());
        Assertions.assertEquals("dxngucaif", model.getItems().get(0).getName());
        Assertions.assertEquals("urwwgilfjq", model.getItems().get(0).getCount());
    }
}
