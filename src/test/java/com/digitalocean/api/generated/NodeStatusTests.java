package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.NodeStatus;
import com.digitalocean.api.models.NodeStatusState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NodeStatusTests {
    @Test
    public void testDeserialize() {
        NodeStatus model = BinaryData.fromString("{\"state\":\"running\"}").toObject(NodeStatus.class);
        Assertions.assertEquals(NodeStatusState.RUNNING, model.getState());
    }

    @Test
    public void testSerialize() {
        NodeStatus model = new NodeStatus().setState(NodeStatusState.RUNNING);
        model = BinaryData.fromObject(model).toObject(NodeStatus.class);
        Assertions.assertEquals(NodeStatusState.RUNNING, model.getState());
    }
}
