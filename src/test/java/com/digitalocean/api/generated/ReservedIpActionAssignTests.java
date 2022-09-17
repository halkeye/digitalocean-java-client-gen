package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReservedIpActionAssign;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReservedIpActionAssignTests {
    @Test
    public void testDeserialize() {
        ReservedIpActionAssign model =
                BinaryData.fromString("{\"type\":\"assign\",\"droplet_id\":353284121}")
                        .toObject(ReservedIpActionAssign.class);
        Assertions.assertEquals(353284121, model.getDropletId());
    }

    @Test
    public void testSerialize() {
        ReservedIpActionAssign model = new ReservedIpActionAssign().setDropletId(353284121);
        model = BinaryData.fromObject(model).toObject(ReservedIpActionAssign.class);
        Assertions.assertEquals(353284121, model.getDropletId());
    }
}
