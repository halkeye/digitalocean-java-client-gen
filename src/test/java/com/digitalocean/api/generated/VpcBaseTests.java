package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcBaseTests {
    @Test
    public void testDeserialize() {
        VpcBase model = BinaryData.fromString("{\"urn\":\"uyyaescjxna\",\"created_at\":\"2021-03-15T06:32:17Z\"}").toObject(VpcBase.class);
        Assertions.assertEquals("uyyaescjxna", model.getUrn());
    }

    @Test
    public void testSerialize() {
        VpcBase model = new VpcBase().setUrn("uyyaescjxna");
        model = BinaryData.fromObject(model).toObject(VpcBase.class);
        Assertions.assertEquals("uyyaescjxna", model.getUrn());
    }
}
