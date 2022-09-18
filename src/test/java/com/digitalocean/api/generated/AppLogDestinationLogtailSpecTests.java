package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppLogDestinationLogtailSpecTests {
    @Test
    public void testDeserialize() {
        AppLogDestinationLogtailSpec model = BinaryData.fromString("{\"token\":\"otppnv\"}").toObject(AppLogDestinationLogtailSpec.class);
        Assertions.assertEquals("otppnv", model.getToken());
    }

    @Test
    public void testSerialize() {
        AppLogDestinationLogtailSpec model = new AppLogDestinationLogtailSpec().setToken("otppnv");
        model = BinaryData.fromObject(model).toObject(AppLogDestinationLogtailSpec.class);
        Assertions.assertEquals("otppnv", model.getToken());
    }
}
