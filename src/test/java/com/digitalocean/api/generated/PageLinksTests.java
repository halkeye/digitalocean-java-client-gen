package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PageLinksTests {
    @Test
    public void testDeserialize() {
        PageLinks model = BinaryData.fromString("{}").toObject(PageLinks.class);
    }

    @Test
    public void testSerialize() {
        PageLinks model = new PageLinks();
        model = BinaryData.fromObject(model).toObject(PageLinks.class);
    }
}
