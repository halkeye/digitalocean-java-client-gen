package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BillingHistory;
import com.digitalocean.api.models.BillingHistoryType;
import com.digitalocean.api.models.ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaProperties;
import com.digitalocean.api.models.PageLinks;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1963500650},\"billing_history\":[{\"description\":\"wnv\",\"amount\":\"cfhzagxnvhycv\",\"invoice_id\":\"mwrzregzgyufutrw\",\"invoice_uuid\":\"eryekzkdhmeottaw\",\"date\":\"2020-12-28T03:47:18Z\",\"type\":\"Invoice\"},{\"description\":\"whnhjtfv\",\"amount\":\"dpmiljpn\",\"invoice_id\":\"nudqllz\",\"invoice_uuid\":\"uzpjlxeehux\",\"date\":\"2021-08-20T14:24:50Z\",\"type\":\"Reversal\"},{\"description\":\"aymezx\",\"amount\":\"kihmxrfdsajredn\",\"invoice_id\":\"yshtuwgmev\",\"invoice_uuid\":\"fpwzyifrkgwltx\",\"date\":\"2021-01-03T22:58Z\",\"type\":\"CreditExpiration\"},{\"description\":\"zdyi\",\"amount\":\"fayorpravkjoges\",\"invoice_id\":\"bnsmjkwynqxaek\",\"invoice_uuid\":\"ykvwjtqpkevmyltj\",\"date\":\"2021-06-13T23:37:41Z\",\"type\":\"Adjustment\"}]}")
                        .toObject(ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema.class);
        Assertions.assertEquals("wnv", model.getBillingHistory().get(0).getDescription());
        Assertions.assertEquals("cfhzagxnvhycv", model.getBillingHistory().get(0).getAmount());
        Assertions.assertEquals("mwrzregzgyufutrw", model.getBillingHistory().get(0).getInvoiceId());
        Assertions.assertEquals("eryekzkdhmeottaw", model.getBillingHistory().get(0).getInvoiceUuid());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-28T03:47:18Z"), model.getBillingHistory().get(0).getDate());
        Assertions.assertEquals(BillingHistoryType.INVOICE, model.getBillingHistory().get(0).getType());
        Assertions.assertEquals(1963500650, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema model =
                new ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema()
                        .setBillingHistory(
                                Arrays.asList(
                                        new BillingHistory()
                                                .setDescription("wnv")
                                                .setAmount("cfhzagxnvhycv")
                                                .setInvoiceId("mwrzregzgyufutrw")
                                                .setInvoiceUuid("eryekzkdhmeottaw")
                                                .setDate(OffsetDateTime.parse("2020-12-28T03:47:18Z"))
                                                .setType(BillingHistoryType.INVOICE),
                                        new BillingHistory()
                                                .setDescription("whnhjtfv")
                                                .setAmount("dpmiljpn")
                                                .setInvoiceId("nudqllz")
                                                .setInvoiceUuid("uzpjlxeehux")
                                                .setDate(OffsetDateTime.parse("2021-08-20T14:24:50Z"))
                                                .setType(BillingHistoryType.REVERSAL),
                                        new BillingHistory()
                                                .setDescription("aymezx")
                                                .setAmount("kihmxrfdsajredn")
                                                .setInvoiceId("yshtuwgmev")
                                                .setInvoiceUuid("fpwzyifrkgwltx")
                                                .setDate(OffsetDateTime.parse("2021-01-03T22:58Z"))
                                                .setType(BillingHistoryType.CREDIT_EXPIRATION),
                                        new BillingHistory()
                                                .setDescription("zdyi")
                                                .setAmount("fayorpravkjoges")
                                                .setInvoiceId("bnsmjkwynqxaek")
                                                .setInvoiceUuid("ykvwjtqpkevmyltj")
                                                .setDate(OffsetDateTime.parse("2021-06-13T23:37:41Z"))
                                                .setType(BillingHistoryType.ADJUSTMENT)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaProperties().setTotal(1963500650));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema.class);
        Assertions.assertEquals("wnv", model.getBillingHistory().get(0).getDescription());
        Assertions.assertEquals("cfhzagxnvhycv", model.getBillingHistory().get(0).getAmount());
        Assertions.assertEquals("mwrzregzgyufutrw", model.getBillingHistory().get(0).getInvoiceId());
        Assertions.assertEquals("eryekzkdhmeottaw", model.getBillingHistory().get(0).getInvoiceUuid());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-28T03:47:18Z"), model.getBillingHistory().get(0).getDate());
        Assertions.assertEquals(BillingHistoryType.INVOICE, model.getBillingHistory().get(0).getType());
        Assertions.assertEquals(1963500650, model.getMeta().getTotal());
    }
}
