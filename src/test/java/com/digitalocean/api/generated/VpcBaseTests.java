package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcBaseTests {
    @Test
    public void testDeserialize() {
        VpcBase model =
                BinaryData.fromString("{\"urn\":\"uyyaescjxna\",\"created_at\":\"2021-03-15T06:32:17Z\"}")
                        .toObject(VpcBase.class);
        Assertions.assertEquals("uyyaescjxna", model.getUrn());
    }

    @Test
    public void testSerialize() {
        VpcBase model = new VpcBase().setUrn("uyyaescjxna");
        model = BinaryData.fromObject(model).toObject(VpcBase.class);
        Assertions.assertEquals("uyyaescjxna", model.getUrn());
    }
}
