package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcCreateTests {
    @Test
    public void testDeserialize() {
        VpcCreate model =
                BinaryData.fromString("{\"region\":\"czepdpc\",\"ip_range\":\"g\"}").toObject(VpcCreate.class);
        Assertions.assertEquals("czepdpc", model.getRegion());
        Assertions.assertEquals("g", model.getIpRange());
    }

    @Test
    public void testSerialize() {
        VpcCreate model = new VpcCreate().setRegion("czepdpc").setIpRange("g");
        model = BinaryData.fromObject(model).toObject(VpcCreate.class);
        Assertions.assertEquals("czepdpc", model.getRegion());
        Assertions.assertEquals("g", model.getIpRange());
    }
}
