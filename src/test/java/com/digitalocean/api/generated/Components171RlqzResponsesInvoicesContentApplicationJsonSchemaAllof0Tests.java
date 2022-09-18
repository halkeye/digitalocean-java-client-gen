package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.InvoicePreview;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"invoices\":[{\"invoice_uuid\":\"bqsdtcjbctvi\",\"amount\":\"zqymtuowogtgits\",\"invoice_period\":\"zvbrzcdbanfzndsc\",\"updated_at\":\"xeatkd\"}],\"invoice_preview\":{\"invoice_uuid\":\"nrd\",\"amount\":\"ibqbnaomhjrm\",\"invoice_period\":\"hmaxljalfi\",\"updated_at\":\"jmobca\"}}").toObject(Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("bqsdtcjbctvi", model.getInvoices().get(0).getInvoiceUuid());
        Assertions.assertEquals("zqymtuowogtgits", model.getInvoices().get(0).getAmount());
        Assertions.assertEquals("zvbrzcdbanfzndsc", model.getInvoices().get(0).getInvoicePeriod());
        Assertions.assertEquals("xeatkd", model.getInvoices().get(0).getUpdatedAt());
        Assertions.assertEquals("nrd", model.getInvoicePreview().getInvoiceUuid());
        Assertions.assertEquals("ibqbnaomhjrm", model.getInvoicePreview().getAmount());
        Assertions.assertEquals("hmaxljalfi", model.getInvoicePreview().getInvoicePeriod());
        Assertions.assertEquals("jmobca", model.getInvoicePreview().getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 model = new Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0().setInvoices(Arrays.asList(new InvoicePreview().setInvoiceUuid("bqsdtcjbctvi").setAmount("zqymtuowogtgits").setInvoicePeriod("zvbrzcdbanfzndsc").setUpdatedAt("xeatkd"))).setInvoicePreview(new InvoicePreview().setInvoiceUuid("nrd").setAmount("ibqbnaomhjrm").setInvoicePeriod("hmaxljalfi").setUpdatedAt("jmobca"));
        model = BinaryData.fromObject(model).toObject(Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("bqsdtcjbctvi", model.getInvoices().get(0).getInvoiceUuid());
        Assertions.assertEquals("zqymtuowogtgits", model.getInvoices().get(0).getAmount());
        Assertions.assertEquals("zvbrzcdbanfzndsc", model.getInvoices().get(0).getInvoicePeriod());
        Assertions.assertEquals("xeatkd", model.getInvoices().get(0).getUpdatedAt());
        Assertions.assertEquals("nrd", model.getInvoicePreview().getInvoiceUuid());
        Assertions.assertEquals("ibqbnaomhjrm", model.getInvoicePreview().getAmount());
        Assertions.assertEquals("hmaxljalfi", model.getInvoicePreview().getInvoicePeriod());
        Assertions.assertEquals("jmobca", model.getInvoicePreview().getUpdatedAt());
    }
}
