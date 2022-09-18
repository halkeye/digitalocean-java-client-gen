package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceSummaryOverages;
import com.digitalocean.api.models.SimpleCharge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryOveragesTests {
    @Test
    public void testDeserialize() {
        InvoiceSummaryOverages model = BinaryData.fromString("{\"name\":\"wdfmmpzhzzwvywr\",\"amount\":\"ngydgr\"}").toObject(InvoiceSummaryOverages.class);
        Assertions.assertEquals("wdfmmpzhzzwvywr", model.getName());
        Assertions.assertEquals("ngydgr", model.getAmount());
    }

    @Test
    public void testSerialize() {
        InvoiceSummaryOverages model = new InvoiceSummaryOverages().setName("wdfmmpzhzzwvywr").setAmount("ngydgr");
        model = BinaryData.fromObject(model).toObject(InvoiceSummaryOverages.class);
        Assertions.assertEquals("wdfmmpzhzzwvywr", model.getName());
        Assertions.assertEquals("ngydgr", model.getAmount());
    }
}
