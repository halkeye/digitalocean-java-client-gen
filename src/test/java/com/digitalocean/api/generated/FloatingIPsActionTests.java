package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FloatingIpActionAssign;
import com.digitalocean.api.models.FloatingIpActionUnassign;
import com.digitalocean.api.models.FloatingIPsAction;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FloatingIPsActionTests {
    @Test
    public void testDeserialize() {
        FloatingIPsAction model = BinaryData.fromString("{\"type\":\"FloatingIPsAction\"}").toObject(FloatingIPsAction.class);
    }

    @Test
    public void testSerialize() {
        FloatingIPsAction model = new FloatingIPsAction();
        model = BinaryData.fromObject(model).toObject(FloatingIPsAction.class);
    }
}
