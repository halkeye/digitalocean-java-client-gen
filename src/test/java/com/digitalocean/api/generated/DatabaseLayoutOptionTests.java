package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseLayoutOption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseLayoutOptionTests {
    @Test
    public void testDeserialize() {
        DatabaseLayoutOption model =
                BinaryData.fromString("{\"num_nodes\":1452137809,\"sizes\":[\"xnx\"]}")
                        .toObject(DatabaseLayoutOption.class);
        Assertions.assertEquals(1452137809, model.getNumNodes());
    }

    @Test
    public void testSerialize() {
        DatabaseLayoutOption model = new DatabaseLayoutOption().setNumNodes(1452137809);
        model = BinaryData.fromObject(model).toObject(DatabaseLayoutOption.class);
        Assertions.assertEquals(1452137809, model.getNumNodes());
    }
}
