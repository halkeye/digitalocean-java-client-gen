package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegionTests {
    @Test
    public void testDeserialize() {
        Region model = BinaryData.fromString("{\"name\":\"nhutjeltmrldhugj\",\"slug\":\"zdatqxhocdg\",\"available\":true}").toObject(Region.class);
        Assertions.assertEquals("nhutjeltmrldhugj", model.getName());
        Assertions.assertEquals("zdatqxhocdg", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }

    @Test
    public void testSerialize() {
        Region model = new Region().setName("nhutjeltmrldhugj").setSlug("zdatqxhocdg").setAvailable(true);
        model = BinaryData.fromObject(model).toObject(Region.class);
        Assertions.assertEquals("nhutjeltmrldhugj", model.getName());
        Assertions.assertEquals("zdatqxhocdg", model.getSlug());
        Assertions.assertEquals(true, model.isAvailable());
    }
}
