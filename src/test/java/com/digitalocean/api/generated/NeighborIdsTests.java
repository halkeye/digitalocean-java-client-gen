package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.NeighborIds;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NeighborIdsTests {
    @Test
    public void testDeserialize() {
        NeighborIds model = BinaryData.fromString("{\"neighbor_ids\":[[707987603,1784459849,162803375,1822413913]]}").toObject(NeighborIds.class);
        Assertions.assertEquals(707987603, model.getNeighborIds().get(0).get(0));
    }

    @Test
    public void testSerialize() {
        NeighborIds model = new NeighborIds().setNeighborIds(Arrays.asList(Arrays.asList(707987603, 1784459849, 162803375, 1822413913)));
        model = BinaryData.fromObject(model).toObject(NeighborIds.class);
        Assertions.assertEquals(707987603, model.getNeighborIds().get(0).get(0));
    }
}
