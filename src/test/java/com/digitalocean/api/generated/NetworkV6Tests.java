package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.NetworkV6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkV6Tests {
    @Test
    public void testDeserialize() {
        NetworkV6 model =
                BinaryData.fromString("{\"ip_address\":\"bpoks\",\"netmask\":500323149,\"gateway\":\"h\"}")
                        .toObject(NetworkV6.class);
        Assertions.assertEquals("bpoks", model.getIpAddress());
        Assertions.assertEquals(500323149, model.getNetmask());
        Assertions.assertEquals("h", model.getGateway());
    }

    @Test
    public void testSerialize() {
        NetworkV6 model = new NetworkV6().setIpAddress("bpoks").setNetmask(500323149).setGateway("h");
        model = BinaryData.fromObject(model).toObject(NetworkV6.class);
        Assertions.assertEquals("bpoks", model.getIpAddress());
        Assertions.assertEquals(500323149, model.getNetmask());
        Assertions.assertEquals("h", model.getGateway());
    }
}
