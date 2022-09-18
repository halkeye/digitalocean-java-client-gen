package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeleteAppResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeleteAppResponseTests {
    @Test
    public void testDeserialize() {
        AppsDeleteAppResponse model = BinaryData.fromString("{\"id\":\"xxgewpk\"}").toObject(AppsDeleteAppResponse.class);
        Assertions.assertEquals("xxgewpk", model.getId());
    }

    @Test
    public void testSerialize() {
        AppsDeleteAppResponse model = new AppsDeleteAppResponse().setId("xxgewpk");
        model = BinaryData.fromObject(model).toObject(AppsDeleteAppResponse.class);
        Assertions.assertEquals("xxgewpk", model.getId());
    }
}
