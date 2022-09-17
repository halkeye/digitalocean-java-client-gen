package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletActionChangeKernel;
import com.digitalocean.api.models.DropletActionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionChangeKernelTests {
    @Test
    public void testDeserialize() {
        DropletActionChangeKernel model =
                BinaryData.fromString("{\"kernel\":1884703702,\"type\":\"snapshot\"}")
                        .toObject(DropletActionChangeKernel.class);
        Assertions.assertEquals(DropletActionType.SNAPSHOT, model.getType());
        Assertions.assertEquals(1884703702, model.getKernel());
    }

    @Test
    public void testSerialize() {
        DropletActionChangeKernel model =
                new DropletActionChangeKernel().setType(DropletActionType.SNAPSHOT).setKernel(1884703702);
        model = BinaryData.fromObject(model).toObject(DropletActionChangeKernel.class);
        Assertions.assertEquals(DropletActionType.SNAPSHOT, model.getType());
        Assertions.assertEquals(1884703702, model.getKernel());
    }
}
