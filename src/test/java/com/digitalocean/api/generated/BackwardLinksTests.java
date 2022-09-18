package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BackwardLinks;
import com.digitalocean.api.models.LinkToFirstPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BackwardLinksTests {
    @Test
    public void testDeserialize() {
        BackwardLinks model = BinaryData.fromString("{\"prev\":\"nchgej\",\"first\":\"odmailzyd\"}").toObject(BackwardLinks.class);
        Assertions.assertEquals("odmailzyd", model.getFirst());
        Assertions.assertEquals("nchgej", model.getPrev());
    }

    @Test
    public void testSerialize() {
        BackwardLinks model = new BackwardLinks().setFirst("odmailzyd").setPrev("nchgej");
        model = BinaryData.fromObject(model).toObject(BackwardLinks.class);
        Assertions.assertEquals("odmailzyd", model.getFirst());
        Assertions.assertEquals("nchgej", model.getPrev());
    }
}
