package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.NetworkV4;
import com.digitalocean.api.models.NetworkV4Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkV4Tests {
    @Test
    public void testDeserialize() {
        NetworkV4 model =
                BinaryData.fromString(
                                "{\"ip_address\":\"fdxaglzfytlbtlq\",\"netmask\":\"pxouvmr\",\"gateway\":\"flikyypzkgxfxfmy\",\"type\":\"private\"}")
                        .toObject(NetworkV4.class);
        Assertions.assertEquals("fdxaglzfytlbtlq", model.getIpAddress());
        Assertions.assertEquals("pxouvmr", model.getNetmask());
        Assertions.assertEquals("flikyypzkgxfxfmy", model.getGateway());
        Assertions.assertEquals(NetworkV4Type.PRIVATE, model.getType());
    }

    @Test
    public void testSerialize() {
        NetworkV4 model =
                new NetworkV4()
                        .setIpAddress("fdxaglzfytlbtlq")
                        .setNetmask("pxouvmr")
                        .setGateway("flikyypzkgxfxfmy")
                        .setType(NetworkV4Type.PRIVATE);
        model = BinaryData.fromObject(model).toObject(NetworkV4.class);
        Assertions.assertEquals("fdxaglzfytlbtlq", model.getIpAddress());
        Assertions.assertEquals("pxouvmr", model.getNetmask());
        Assertions.assertEquals("flikyypzkgxfxfmy", model.getGateway());
        Assertions.assertEquals(NetworkV4Type.PRIVATE, model.getType());
    }
}
