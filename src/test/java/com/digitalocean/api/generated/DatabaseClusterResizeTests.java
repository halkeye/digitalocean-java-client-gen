package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseClusterResize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseClusterResizeTests {
    @Test
    public void testDeserialize() {
        DatabaseClusterResize model =
                BinaryData.fromString("{\"size\":\"xbg\",\"num_nodes\":2088842603}")
                        .toObject(DatabaseClusterResize.class);
        Assertions.assertEquals("xbg", model.getSize());
        Assertions.assertEquals(2088842603, model.getNumNodes());
    }

    @Test
    public void testSerialize() {
        DatabaseClusterResize model = new DatabaseClusterResize().setSize("xbg").setNumNodes(2088842603);
        model = BinaryData.fromObject(model).toObject(DatabaseClusterResize.class);
        Assertions.assertEquals("xbg", model.getSize());
        Assertions.assertEquals(2088842603, model.getNumNodes());
    }
}
