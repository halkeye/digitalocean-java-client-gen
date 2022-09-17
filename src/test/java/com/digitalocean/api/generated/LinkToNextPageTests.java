package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.LinkToNextPage;
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
