package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OneClicks;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OneClicksTests {
    @Test
    public void testDeserialize() {
        OneClicks model = BinaryData.fromString("{\"slug\":\"sx\",\"type\":\"obhdxbmtqioqjze\"}").toObject(OneClicks.class);
        Assertions.assertEquals("sx", model.getSlug());
        Assertions.assertEquals("obhdxbmtqioqjze", model.getType());
    }

    @Test
    public void testSerialize() {
        OneClicks model = new OneClicks().setSlug("sx").setType("obhdxbmtqioqjze");
        model = BinaryData.fromObject(model).toObject(OneClicks.class);
        Assertions.assertEquals("sx", model.getSlug());
        Assertions.assertEquals("obhdxbmtqioqjze", model.getType());
    }
}
