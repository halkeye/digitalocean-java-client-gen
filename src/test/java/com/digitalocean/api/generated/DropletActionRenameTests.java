package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletAction;
import com.digitalocean.api.models.DropletActionRename;
import com.digitalocean.api.models.DropletActionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionRenameTests {
    @Test
    public void testDeserialize() {
        DropletActionRename model = BinaryData.fromString("{\"name\":\"igglclwalhvub\",\"type\":\"restore\"}").toObject(DropletActionRename.class);
        Assertions.assertEquals(DropletActionType.RESTORE, model.getType());
        Assertions.assertEquals("igglclwalhvub", model.getName());
    }

    @Test
    public void testSerialize() {
        DropletActionRename model = new DropletActionRename().setType(DropletActionType.RESTORE).setName("igglclwalhvub");
        model = BinaryData.fromObject(model).toObject(DropletActionRename.class);
        Assertions.assertEquals(DropletActionType.RESTORE, model.getType());
        Assertions.assertEquals("igglclwalhvub", model.getName());
    }
}
