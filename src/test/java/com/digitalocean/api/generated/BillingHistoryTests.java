package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BillingHistory;
import com.digitalocean.api.models.BillingHistoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BillingHistoryTests {
    @Test
    public void testDeserialize() {
        BillingHistory model = BinaryData.fromString("{\"description\":\"ifdf\",\"amount\":\"fyzyzeyuub\",\"invoice_id\":\"ds\",\"invoice_uuid\":\"fytoi\",\"date\":\"2021-06-27T18:12:19Z\",\"type\":\"Credit\"}").toObject(BillingHistory.class);
        Assertions.assertEquals("ifdf", model.getDescription());
        Assertions.assertEquals("fyzyzeyuub", model.getAmount());
        Assertions.assertEquals("ds", model.getInvoiceId());
        Assertions.assertEquals("fytoi", model.getInvoiceUuid());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-27T18:12:19Z"), model.getDate());
        Assertions.assertEquals(BillingHistoryType.CREDIT, model.getType());
    }

    @Test
    public void testSerialize() {
        BillingHistory model = new BillingHistory().setDescription("ifdf").setAmount("fyzyzeyuub").setInvoiceId("ds").setInvoiceUuid("fytoi").setDate(OffsetDateTime.parse("2021-06-27T18:12:19Z")).setType(BillingHistoryType.CREDIT);
        model = BinaryData.fromObject(model).toObject(BillingHistory.class);
        Assertions.assertEquals("ifdf", model.getDescription());
        Assertions.assertEquals("fyzyzeyuub", model.getAmount());
        Assertions.assertEquals("ds", model.getInvoiceId());
        Assertions.assertEquals("fytoi", model.getInvoiceUuid());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-27T18:12:19Z"), model.getDate());
        Assertions.assertEquals(BillingHistoryType.CREDIT, model.getType());
    }
}
