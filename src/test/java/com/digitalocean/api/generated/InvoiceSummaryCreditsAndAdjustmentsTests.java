package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceSummaryCreditsAndAdjustments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryCreditsAndAdjustmentsTests {
    @Test
    public void testDeserialize() {
        InvoiceSummaryCreditsAndAdjustments model =
                BinaryData.fromString("{\"name\":\"xhqf\",\"amount\":\"ka\"}")
                        .toObject(InvoiceSummaryCreditsAndAdjustments.class);
        Assertions.assertEquals("xhqf", model.getName());
        Assertions.assertEquals("ka", model.getAmount());
    }

    @Test
    public void testSerialize() {
        InvoiceSummaryCreditsAndAdjustments model =
                new InvoiceSummaryCreditsAndAdjustments().setName("xhqf").setAmount("ka");
        model = BinaryData.fromObject(model).toObject(InvoiceSummaryCreditsAndAdjustments.class);
        Assertions.assertEquals("xhqf", model.getName());
        Assertions.assertEquals("ka", model.getAmount());
    }
}
