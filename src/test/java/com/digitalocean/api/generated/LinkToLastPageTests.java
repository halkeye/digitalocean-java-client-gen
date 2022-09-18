package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.LinkToLastPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LinkToLastPageTests {
    @Test
    public void testDeserialize() {
        LinkToLastPage model = BinaryData.fromString("{\"last\":\"ryhtnapczwlokjy\"}").toObject(LinkToLastPage.class);
        Assertions.assertEquals("ryhtnapczwlokjy", model.getLast());
    }

    @Test
    public void testSerialize() {
        LinkToLastPage model = new LinkToLastPage().setLast("ryhtnapczwlokjy");
        model = BinaryData.fromObject(model).toObject(LinkToLastPage.class);
        Assertions.assertEquals("ryhtnapczwlokjy", model.getLast());
    }
}
