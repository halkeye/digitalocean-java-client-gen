package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Timescaledb;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TimescaledbTests {
    @Test
    public void testDeserialize() {
        Timescaledb model = BinaryData.fromString("{\"max_background_workers\":2114672543}").toObject(Timescaledb.class);
        Assertions.assertEquals(2114672543, model.getMaxBackgroundWorkers());
    }

    @Test
    public void testSerialize() {
        Timescaledb model = new Timescaledb().setMaxBackgroundWorkers(2114672543);
        model = BinaryData.fromObject(model).toObject(Timescaledb.class);
        Assertions.assertEquals(2114672543, model.getMaxBackgroundWorkers());
    }
}
