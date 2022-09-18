package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceSummaryTaxes;
import com.digitalocean.api.models.SimpleCharge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryTaxesTests {
    @Test
    public void testDeserialize() {
        InvoiceSummaryTaxes model = BinaryData.fromString("{\"name\":\"lamgglvlmfejdo\",\"amount\":\"ykglt\"}").toObject(InvoiceSummaryTaxes.class);
        Assertions.assertEquals("lamgglvlmfejdo", model.getName());
        Assertions.assertEquals("ykglt", model.getAmount());
    }

    @Test
    public void testSerialize() {
        InvoiceSummaryTaxes model = new InvoiceSummaryTaxes().setName("lamgglvlmfejdo").setAmount("ykglt");
        model = BinaryData.fromObject(model).toObject(InvoiceSummaryTaxes.class);
        Assertions.assertEquals("lamgglvlmfejdo", model.getName());
        Assertions.assertEquals("ykglt", model.getAmount());
    }
}
