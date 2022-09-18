package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ForwardLinks;
import com.digitalocean.api.models.LinkToLastPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForwardLinksTests {
    @Test
    public void testDeserialize() {
        ForwardLinks model = BinaryData.fromString("{\"next\":\"tfwvukxgaudc\",\"last\":\"nhsjcnyej\"}").toObject(ForwardLinks.class);
        Assertions.assertEquals("nhsjcnyej", model.getLast());
        Assertions.assertEquals("tfwvukxgaudc", model.getNext());
    }

    @Test
    public void testSerialize() {
        ForwardLinks model = new ForwardLinks().setLast("nhsjcnyej").setNext("tfwvukxgaudc");
        model = BinaryData.fromObject(model).toObject(ForwardLinks.class);
        Assertions.assertEquals("nhsjcnyej", model.getLast());
        Assertions.assertEquals("tfwvukxgaudc", model.getNext());
    }
}
