package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoicePreview;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoicePreviewTests {
    @Test
    public void testDeserialize() {
        InvoicePreview model =
                BinaryData.fromString(
                                "{\"invoice_uuid\":\"de\",\"amount\":\"qcwgaxfgvaknokz\",\"invoice_period\":\"jzrltixldzy\",\"updated_at\":\"ytpqsixymmpujiv\"}")
                        .toObject(InvoicePreview.class);
        Assertions.assertEquals("de", model.getInvoiceUuid());
        Assertions.assertEquals("qcwgaxfgvaknokz", model.getAmount());
        Assertions.assertEquals("jzrltixldzy", model.getInvoicePeriod());
        Assertions.assertEquals("ytpqsixymmpujiv", model.getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        InvoicePreview model =
                new InvoicePreview()
                        .setInvoiceUuid("de")
                        .setAmount("qcwgaxfgvaknokz")
                        .setInvoicePeriod("jzrltixldzy")
                        .setUpdatedAt("ytpqsixymmpujiv");
        model = BinaryData.fromObject(model).toObject(InvoicePreview.class);
        Assertions.assertEquals("de", model.getInvoiceUuid());
        Assertions.assertEquals("qcwgaxfgvaknokz", model.getAmount());
        Assertions.assertEquals("jzrltixldzy", model.getInvoicePeriod());
        Assertions.assertEquals("ytpqsixymmpujiv", model.getUpdatedAt());
    }
}
