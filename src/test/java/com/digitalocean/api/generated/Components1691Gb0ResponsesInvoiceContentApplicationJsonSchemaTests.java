package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.InvoiceItem;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1691Gb0ResponsesInvoiceContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1752119196},\"invoice_items\":[{\"product\":\"mbmslzoyov\",\"resource_uuid\":\"dbpqvybefgvm\",\"resource_id\":\"okcvtlubses\",\"group_description\":\"cua\",\"description\":\"rhunlp\",\"amount\":\"ykycndzfqi\",\"duration\":\"reuykbbmnwagl\",\"duration_unit\":\"xoe\",\"start_time\":\"nqlnfwmyymvqd\",\"end_time\":\"bhfckdvezcrcssb\",\"project_name\":\"ddubbnqfblhkal\"}]}").toObject(Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema.class);
        Assertions.assertEquals("mbmslzoyov", model.getInvoiceItems().get(0).getProduct());
        Assertions.assertEquals("dbpqvybefgvm", model.getInvoiceItems().get(0).getResourceUuid());
        Assertions.assertEquals("okcvtlubses", model.getInvoiceItems().get(0).getResourceId());
        Assertions.assertEquals("cua", model.getInvoiceItems().get(0).getGroupDescription());
        Assertions.assertEquals("rhunlp", model.getInvoiceItems().get(0).getDescription());
        Assertions.assertEquals("ykycndzfqi", model.getInvoiceItems().get(0).getAmount());
        Assertions.assertEquals("reuykbbmnwagl", model.getInvoiceItems().get(0).getDuration());
        Assertions.assertEquals("xoe", model.getInvoiceItems().get(0).getDurationUnit());
        Assertions.assertEquals("nqlnfwmyymvqd", model.getInvoiceItems().get(0).getStartTime());
        Assertions.assertEquals("bhfckdvezcrcssb", model.getInvoiceItems().get(0).getEndTime());
        Assertions.assertEquals("ddubbnqfblhkal", model.getInvoiceItems().get(0).getProjectName());
        Assertions.assertEquals(1752119196, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema model = new Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema().setInvoiceItems(Arrays.asList(new InvoiceItem().setProduct("mbmslzoyov").setResourceUuid("dbpqvybefgvm").setResourceId("okcvtlubses").setGroupDescription("cua").setDescription("rhunlp").setAmount("ykycndzfqi").setDuration("reuykbbmnwagl").setDurationUnit("xoe").setStartTime("nqlnfwmyymvqd").setEndTime("bhfckdvezcrcssb").setProjectName("ddubbnqfblhkal"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1752119196));
        model = BinaryData.fromObject(model).toObject(Components1691Gb0ResponsesInvoiceContentApplicationJsonSchema.class);
        Assertions.assertEquals("mbmslzoyov", model.getInvoiceItems().get(0).getProduct());
        Assertions.assertEquals("dbpqvybefgvm", model.getInvoiceItems().get(0).getResourceUuid());
        Assertions.assertEquals("okcvtlubses", model.getInvoiceItems().get(0).getResourceId());
        Assertions.assertEquals("cua", model.getInvoiceItems().get(0).getGroupDescription());
        Assertions.assertEquals("rhunlp", model.getInvoiceItems().get(0).getDescription());
        Assertions.assertEquals("ykycndzfqi", model.getInvoiceItems().get(0).getAmount());
        Assertions.assertEquals("reuykbbmnwagl", model.getInvoiceItems().get(0).getDuration());
        Assertions.assertEquals("xoe", model.getInvoiceItems().get(0).getDurationUnit());
        Assertions.assertEquals("nqlnfwmyymvqd", model.getInvoiceItems().get(0).getStartTime());
        Assertions.assertEquals("bhfckdvezcrcssb", model.getInvoiceItems().get(0).getEndTime());
        Assertions.assertEquals("ddubbnqfblhkal", model.getInvoiceItems().get(0).getProjectName());
        Assertions.assertEquals(1752119196, model.getMeta().getTotal());
    }
}
