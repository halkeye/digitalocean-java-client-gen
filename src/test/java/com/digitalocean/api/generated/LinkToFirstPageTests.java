package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.LinkToFirstPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LinkToFirstPageTests {
    @Test
    public void testDeserialize() {
        LinkToFirstPage model = BinaryData.fromString("{\"first\":\"o\"}").toObject(LinkToFirstPage.class);
        Assertions.assertEquals("o", model.getFirst());
    }

    @Test
    public void testSerialize() {
        LinkToFirstPage model = new LinkToFirstPage().setFirst("o");
        model = BinaryData.fromObject(model).toObject(LinkToFirstPage.class);
        Assertions.assertEquals("o", model.getFirst());
    }
}
