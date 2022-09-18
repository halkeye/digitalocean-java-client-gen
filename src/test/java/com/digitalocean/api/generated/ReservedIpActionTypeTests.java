package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReservedIpActionAssign;
import com.digitalocean.api.models.ReservedIpActionType;
import com.digitalocean.api.models.ReservedIpActionUnassign;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReservedIpActionTypeTests {
    @Test
    public void testDeserialize() {
        ReservedIpActionType model = BinaryData.fromString("{\"type\":\"ReservedIpActionType\"}").toObject(ReservedIpActionType.class);
    }

    @Test
    public void testSerialize() {
        ReservedIpActionType model = new ReservedIpActionType();
        model = BinaryData.fromObject(model).toObject(ReservedIpActionType.class);
    }
}
