package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReserveToRegion0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReserveToRegion0Tests {
    @Test
    public void testDeserialize() {
        ReserveToRegion0 model = BinaryData.fromString("{\"region\":\"xxam\"}").toObject(ReserveToRegion0.class);
        Assertions.assertEquals("xxam", model.getRegion());
    }

    @Test
    public void testSerialize() {
        ReserveToRegion0 model = new ReserveToRegion0().setRegion("xxam");
        model = BinaryData.fromObject(model).toObject(ReserveToRegion0.class);
        Assertions.assertEquals("xxam", model.getRegion());
    }
}
