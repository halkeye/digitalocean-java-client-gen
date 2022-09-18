package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReserveToRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReserveToRegionTests {
    @Test
    public void testDeserialize() {
        ReserveToRegion model = BinaryData.fromString("{\"region\":\"oha\"}").toObject(ReserveToRegion.class);
        Assertions.assertEquals("oha", model.getRegion());
    }

    @Test
    public void testSerialize() {
        ReserveToRegion model = new ReserveToRegion().setRegion("oha");
        model = BinaryData.fromObject(model).toObject(ReserveToRegion.class);
        Assertions.assertEquals("oha", model.getRegion());
    }
}
