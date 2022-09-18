package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppLogDestinationPapertrailSpecTests {
    @Test
    public void testDeserialize() {
        AppLogDestinationPapertrailSpec model = BinaryData.fromString("{\"endpoint\":\"njdgkynscliq\"}").toObject(AppLogDestinationPapertrailSpec.class);
        Assertions.assertEquals("njdgkynscliq", model.getEndpoint());
    }

    @Test
    public void testSerialize() {
        AppLogDestinationPapertrailSpec model = new AppLogDestinationPapertrailSpec().setEndpoint("njdgkynscliq");
        model = BinaryData.fromObject(model).toObject(AppLogDestinationPapertrailSpec.class);
        Assertions.assertEquals("njdgkynscliq", model.getEndpoint());
    }
}
