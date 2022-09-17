package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletAction;
import com.digitalocean.api.models.DropletActionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionTests {
    @Test
    public void testDeserialize() {
        DropletAction model = BinaryData.fromString("{\"type\":\"resize\"}").toObject(DropletAction.class);
        Assertions.assertEquals(DropletActionType.RESIZE, model.getType());
    }

    @Test
    public void testSerialize() {
        DropletAction model = new DropletAction().setType(DropletActionType.RESIZE);
        model = BinaryData.fromObject(model).toObject(DropletAction.class);
        Assertions.assertEquals(DropletActionType.RESIZE, model.getType());
    }
}
