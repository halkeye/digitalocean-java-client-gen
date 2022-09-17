package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceSummaryProductCharges;
import com.digitalocean.api.models.ProductChargeItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryProductChargesTests {
    @Test
    public void testDeserialize() {
        InvoiceSummaryProductCharges model =
                BinaryData.fromString(
                                "{\"name\":\"pvelszerqze\",\"amount\":\"o\",\"items\":[{\"amount\":\"txwaljglzo\",\"name\":\"qwaafrqulhm\",\"count\":\"qb\"},{\"amount\":\"vafjrqpjiyrqj\",\"name\":\"gaxwmzwdfkbnrzo\",\"count\":\"dltb\"}]}")
                        .toObject(InvoiceSummaryProductCharges.class);
        Assertions.assertEquals("pvelszerqze", model.getName());
        Assertions.assertEquals("o", model.getAmount());
        Assertions.assertEquals("txwaljglzo", model.getItems().get(0).getAmount());
        Assertions.assertEquals("qwaafrqulhm", model.getItems().get(0).getName());
        Assertions.assertEquals("qb", model.getItems().get(0).getCount());
    }

    @Test
    public void testSerialize() {
        InvoiceSummaryProductCharges model =
                new InvoiceSummaryProductCharges()
                        .setName("pvelszerqze")
                        .setAmount("o")
                        .setItems(
                                Arrays.asList(
                                        new ProductChargeItem()
                                                .setAmount("txwaljglzo")
                                                .setName("qwaafrqulhm")
                                                .setCount("qb"),
                                        new ProductChargeItem()
                                                .setAmount("vafjrqpjiyrqj")
                                                .setName("gaxwmzwdfkbnrzo")
                                                .setCount("dltb")));
        model = BinaryData.fromObject(model).toObject(InvoiceSummaryProductCharges.class);
        Assertions.assertEquals("pvelszerqze", model.getName());
        Assertions.assertEquals("o", model.getAmount());
        Assertions.assertEquals("txwaljglzo", model.getItems().get(0).getAmount());
        Assertions.assertEquals("qwaafrqulhm", model.getItems().get(0).getName());
        Assertions.assertEquals("qb", model.getItems().get(0).getCount());
    }
}
