package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceItemTests {
    @Test
    public void testDeserialize() {
        InvoiceItem model =
                BinaryData.fromString(
                                "{\"product\":\"l\",\"resource_uuid\":\"rhuzgfxonjtpu\",\"resource_id\":\"l\",\"group_description\":\"pvti\",\"description\":\"zbpdbo\",\"amount\":\"gryfqiuasig\",\"duration\":\"wsocnequygdjbo\",\"duration_unit\":\"rmtqjkqevadr\",\"start_time\":\"wiu\",\"end_time\":\"vcmjzkxiidisczsk\",\"project_name\":\"woqiqazugamxzkrr\"}")
                        .toObject(InvoiceItem.class);
        Assertions.assertEquals("l", model.getProduct());
        Assertions.assertEquals("rhuzgfxonjtpu", model.getResourceUuid());
        Assertions.assertEquals("l", model.getResourceId());
        Assertions.assertEquals("pvti", model.getGroupDescription());
        Assertions.assertEquals("zbpdbo", model.getDescription());
        Assertions.assertEquals("gryfqiuasig", model.getAmount());
        Assertions.assertEquals("wsocnequygdjbo", model.getDuration());
        Assertions.assertEquals("rmtqjkqevadr", model.getDurationUnit());
        Assertions.assertEquals("wiu", model.getStartTime());
        Assertions.assertEquals("vcmjzkxiidisczsk", model.getEndTime());
        Assertions.assertEquals("woqiqazugamxzkrr", model.getProjectName());
    }

    @Test
    public void testSerialize() {
        InvoiceItem model =
                new InvoiceItem()
                        .setProduct("l")
                        .setResourceUuid("rhuzgfxonjtpu")
                        .setResourceId("l")
                        .setGroupDescription("pvti")
                        .setDescription("zbpdbo")
                        .setAmount("gryfqiuasig")
                        .setDuration("wsocnequygdjbo")
                        .setDurationUnit("rmtqjkqevadr")
                        .setStartTime("wiu")
                        .setEndTime("vcmjzkxiidisczsk")
                        .setProjectName("woqiqazugamxzkrr");
        model = BinaryData.fromObject(model).toObject(InvoiceItem.class);
        Assertions.assertEquals("l", model.getProduct());
        Assertions.assertEquals("rhuzgfxonjtpu", model.getResourceUuid());
        Assertions.assertEquals("l", model.getResourceId());
        Assertions.assertEquals("pvti", model.getGroupDescription());
        Assertions.assertEquals("zbpdbo", model.getDescription());
        Assertions.assertEquals("gryfqiuasig", model.getAmount());
        Assertions.assertEquals("wsocnequygdjbo", model.getDuration());
        Assertions.assertEquals("rmtqjkqevadr", model.getDurationUnit());
        Assertions.assertEquals("wiu", model.getStartTime());
        Assertions.assertEquals("vcmjzkxiidisczsk", model.getEndTime());
        Assertions.assertEquals("woqiqazugamxzkrr", model.getProjectName());
    }
}
