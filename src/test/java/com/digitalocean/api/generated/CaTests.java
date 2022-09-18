package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Ca;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CaTests {
    @Test
    public void testDeserialize() {
        Ca model = BinaryData.fromString("{\"certificate\":\"ikpsimsfeypof\"}").toObject(Ca.class);
    }

    @Test
    public void testSerialize() {
        Ca model = new Ca();
        model = BinaryData.fromObject(model).toObject(Ca.class);
    }
}
