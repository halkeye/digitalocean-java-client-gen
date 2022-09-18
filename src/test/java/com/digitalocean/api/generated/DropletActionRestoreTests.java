package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletAction;
import com.digitalocean.api.models.DropletActionRestore;
import com.digitalocean.api.models.DropletActionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletActionRestoreTests {
    @Test
    public void testDeserialize() {
        DropletActionRestore model = BinaryData.fromString("{\"image\":385160177,\"type\":\"rename\"}").toObject(DropletActionRestore.class);
        Assertions.assertEquals(DropletActionType.RENAME, model.getType());
        Assertions.assertEquals(385160177, model.getImage());
    }

    @Test
    public void testSerialize() {
        DropletActionRestore model = new DropletActionRestore().setType(DropletActionType.RENAME).setImage(385160177);
        model = BinaryData.fromObject(model).toObject(DropletActionRestore.class);
        Assertions.assertEquals(DropletActionType.RENAME, model.getType());
        Assertions.assertEquals(385160177, model.getImage());
    }
}
