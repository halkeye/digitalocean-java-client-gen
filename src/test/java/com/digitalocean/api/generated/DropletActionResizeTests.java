package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletAction;
import com.digitalocean.api.models.DropletActionResize;
import com.digitalocean.api.models.DropletActionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionResizeTests {
    @Test
    public void testDeserialize() {
        DropletActionResize model = BinaryData.fromString("{\"disk\":false,\"size\":\"ftpzcrryklleyn\",\"type\":\"reboot\"}").toObject(DropletActionResize.class);
        Assertions.assertEquals(DropletActionType.REBOOT, model.getType());
        Assertions.assertEquals(false, model.isDisk());
        Assertions.assertEquals("ftpzcrryklleyn", model.getSize());
    }

    @Test
    public void testSerialize() {
        DropletActionResize model = new DropletActionResize().setType(DropletActionType.REBOOT).setDisk(false).setSize("ftpzcrryklleyn");
        model = BinaryData.fromObject(model).toObject(DropletActionResize.class);
        Assertions.assertEquals(DropletActionType.REBOOT, model.getType());
        Assertions.assertEquals(false, model.isDisk());
        Assertions.assertEquals("ftpzcrryklleyn", model.getSize());
    }
}
