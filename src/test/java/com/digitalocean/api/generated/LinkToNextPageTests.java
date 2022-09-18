package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.LinkToNextPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LinkToNextPageTests {
    @Test
    public void testDeserialize() {
        LinkToNextPage model = BinaryData.fromString("{\"next\":\"kkvnipjox\"}").toObject(LinkToNextPage.class);
        Assertions.assertEquals("kkvnipjox", model.getNext());
    }

    @Test
    public void testSerialize() {
        LinkToNextPage model = new LinkToNextPage().setNext("kkvnipjox");
        model = BinaryData.fromObject(model).toObject(LinkToNextPage.class);
        Assertions.assertEquals("kkvnipjox", model.getNext());
    }
}
