package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletAction;
import com.digitalocean.api.models.DropletActionRebuild;
import com.digitalocean.api.models.DropletActionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionRebuildTests {
    @Test
    public void testDeserialize() {
        DropletActionRebuild model = BinaryData.fromString("{\"type\":\"reboot\"}").toObject(DropletActionRebuild.class);
        Assertions.assertEquals(DropletActionType.REBOOT, model.getType());
    }

    @Test
    public void testSerialize() {
        DropletActionRebuild model = new DropletActionRebuild().setType(DropletActionType.REBOOT);
        model = BinaryData.fromObject(model).toObject(DropletActionRebuild.class);
        Assertions.assertEquals(DropletActionType.REBOOT, model.getType());
    }
}
