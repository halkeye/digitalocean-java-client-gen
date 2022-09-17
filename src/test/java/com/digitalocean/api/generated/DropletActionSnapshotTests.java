package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletActionSnapshot;
import com.digitalocean.api.models.DropletActionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionSnapshotTests {
    @Test
    public void testDeserialize() {
        DropletActionSnapshot model =
                BinaryData.fromString("{\"name\":\"txdqcmy\",\"type\":\"snapshot\"}")
                        .toObject(DropletActionSnapshot.class);
        Assertions.assertEquals(DropletActionType.SNAPSHOT, model.getType());
        Assertions.assertEquals("txdqcmy", model.getName());
    }

    @Test
    public void testSerialize() {
        DropletActionSnapshot model =
                new DropletActionSnapshot().setType(DropletActionType.SNAPSHOT).setName("txdqcmy");
        model = BinaryData.fromObject(model).toObject(DropletActionSnapshot.class);
        Assertions.assertEquals(DropletActionType.SNAPSHOT, model.getType());
        Assertions.assertEquals("txdqcmy", model.getName());
    }
}
