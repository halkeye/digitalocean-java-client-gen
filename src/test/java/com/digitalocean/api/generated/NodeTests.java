package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Node;
import com.digitalocean.api.models.NodeStatus;
import com.digitalocean.api.models.NodeStatusState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NodeTests {
    @Test
    public void testDeserialize() {
        Node model = BinaryData.fromString("{\"name\":\"tpfcudvafnbfbqv\",\"status\":{\"state\":\"running\"},\"droplet_id\":\"hgko\",\"created_at\":\"2021-09-24T21:54:57Z\",\"updated_at\":\"2021-11-17T19:07:05Z\"}").toObject(Node.class);
        Assertions.assertEquals("tpfcudvafnbfbqv", model.getName());
        Assertions.assertEquals(NodeStatusState.RUNNING, model.getStatus().getState());
        Assertions.assertEquals("hgko", model.getDropletId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-24T21:54:57Z"), model.getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-17T19:07:05Z"), model.getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        Node model = new Node().setName("tpfcudvafnbfbqv").setStatus(new NodeStatus().setState(NodeStatusState.RUNNING)).setDropletId("hgko").setCreatedAt(OffsetDateTime.parse("2021-09-24T21:54:57Z")).setUpdatedAt(OffsetDateTime.parse("2021-11-17T19:07:05Z"));
        model = BinaryData.fromObject(model).toObject(Node.class);
        Assertions.assertEquals("tpfcudvafnbfbqv", model.getName());
        Assertions.assertEquals(NodeStatusState.RUNNING, model.getStatus().getState());
        Assertions.assertEquals("hgko", model.getDropletId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-24T21:54:57Z"), model.getCreatedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-17T19:07:05Z"), model.getUpdatedAt());
    }
}
