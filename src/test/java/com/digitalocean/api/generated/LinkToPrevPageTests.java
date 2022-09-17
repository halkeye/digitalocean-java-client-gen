package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.LinkToPrevPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LinkToPrevPageTests {
    @Test
    public void testDeserialize() {
        LinkToPrevPage model = BinaryData.fromString("{\"prev\":\"yahux\"}").toObject(LinkToPrevPage.class);
        Assertions.assertEquals("yahux", model.getPrev());
    }

    @Test
    public void testSerialize() {
        LinkToPrevPage model = new LinkToPrevPage().setPrev("yahux");
        model = BinaryData.fromObject(model).toObject(LinkToPrevPage.class);
        Assertions.assertEquals("yahux", model.getPrev());
    }
}
