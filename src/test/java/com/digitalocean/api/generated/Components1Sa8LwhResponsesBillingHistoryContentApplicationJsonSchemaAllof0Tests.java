package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BillingHistory;
import com.digitalocean.api.models.BillingHistoryType;
import com.digitalocean.api.models.Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"billing_history\":[{\"description\":\"r\",\"amount\":\"lfg\",\"invoice_id\":\"nnnoytz\",\"invoice_uuid\":\"sewxigpxvkqm\",\"date\":\"2021-05-06T23:25:16Z\",\"type\":\"Adjustment\"}]}").toObject(Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("r", model.getBillingHistory().get(0).getDescription());
        Assertions.assertEquals("lfg", model.getBillingHistory().get(0).getAmount());
        Assertions.assertEquals("nnnoytz", model.getBillingHistory().get(0).getInvoiceId());
        Assertions.assertEquals("sewxigpxvkqm", model.getBillingHistory().get(0).getInvoiceUuid());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T23:25:16Z"), model.getBillingHistory().get(0).getDate());
        Assertions.assertEquals(BillingHistoryType.ADJUSTMENT, model.getBillingHistory().get(0).getType());
    }

    @Test
    public void testSerialize() {
        Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 model = new Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0().setBillingHistory(Arrays.asList(new BillingHistory().setDescription("r").setAmount("lfg").setInvoiceId("nnnoytz").setInvoiceUuid("sewxigpxvkqm").setDate(OffsetDateTime.parse("2021-05-06T23:25:16Z")).setType(BillingHistoryType.ADJUSTMENT)));
        model = BinaryData.fromObject(model).toObject(Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("r", model.getBillingHistory().get(0).getDescription());
        Assertions.assertEquals("lfg", model.getBillingHistory().get(0).getAmount());
        Assertions.assertEquals("nnnoytz", model.getBillingHistory().get(0).getInvoiceId());
        Assertions.assertEquals("sewxigpxvkqm", model.getBillingHistory().get(0).getInvoiceUuid());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T23:25:16Z"), model.getBillingHistory().get(0).getDate());
        Assertions.assertEquals(BillingHistoryType.ADJUSTMENT, model.getBillingHistory().get(0).getType());
    }
}
