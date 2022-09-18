package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema;
import com.digitalocean.api.models.InvoicePreview;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":289338077},\"invoices\":[{\"invoice_uuid\":\"oynkrxwetwkdrcyr\",\"amount\":\"pcunnuzdq\",\"invoice_period\":\"oenodnaienh\",\"updated_at\":\"skndnelqkaadlknw\"}],\"invoice_preview\":{\"invoice_uuid\":\"nniyopetxi\",\"amount\":\"nrlyxnuc\",\"invoice_period\":\"p\",\"updated_at\":\"lkwq\"}}").toObject(Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema.class);
        Assertions.assertEquals("oynkrxwetwkdrcyr", model.getInvoices().get(0).getInvoiceUuid());
        Assertions.assertEquals("pcunnuzdq", model.getInvoices().get(0).getAmount());
        Assertions.assertEquals("oenodnaienh", model.getInvoices().get(0).getInvoicePeriod());
        Assertions.assertEquals("skndnelqkaadlknw", model.getInvoices().get(0).getUpdatedAt());
        Assertions.assertEquals("nniyopetxi", model.getInvoicePreview().getInvoiceUuid());
        Assertions.assertEquals("nrlyxnuc", model.getInvoicePreview().getAmount());
        Assertions.assertEquals("p", model.getInvoicePreview().getInvoicePeriod());
        Assertions.assertEquals("lkwq", model.getInvoicePreview().getUpdatedAt());
        Assertions.assertEquals(289338077, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema model = new Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema().setInvoices(Arrays.asList(new InvoicePreview().setInvoiceUuid("oynkrxwetwkdrcyr").setAmount("pcunnuzdq").setInvoicePeriod("oenodnaienh").setUpdatedAt("skndnelqkaadlknw"))).setInvoicePreview(new InvoicePreview().setInvoiceUuid("nniyopetxi").setAmount("nrlyxnuc").setInvoicePeriod("p").setUpdatedAt("lkwq")).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(289338077));
        model = BinaryData.fromObject(model).toObject(Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema.class);
        Assertions.assertEquals("oynkrxwetwkdrcyr", model.getInvoices().get(0).getInvoiceUuid());
        Assertions.assertEquals("pcunnuzdq", model.getInvoices().get(0).getAmount());
        Assertions.assertEquals("oenodnaienh", model.getInvoices().get(0).getInvoicePeriod());
        Assertions.assertEquals("skndnelqkaadlknw", model.getInvoices().get(0).getUpdatedAt());
        Assertions.assertEquals("nniyopetxi", model.getInvoicePreview().getInvoiceUuid());
        Assertions.assertEquals("nrlyxnuc", model.getInvoicePreview().getAmount());
        Assertions.assertEquals("p", model.getInvoicePreview().getInvoicePeriod());
        Assertions.assertEquals("lkwq", model.getInvoicePreview().getUpdatedAt());
        Assertions.assertEquals(289338077, model.getMeta().getTotal());
    }
}
