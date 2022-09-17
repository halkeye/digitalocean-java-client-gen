package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ReservedIp;
import com.digitalocean.api.models.ReservedIpRegion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReservedIpTests {
    @Test
    public void testDeserialize() {
        ReservedIp model =
                BinaryData.fromString(
                                "{\"ip\":\"ulbylmgjzrycwpbg\",\"region\":{\"name\":\"whm\",\"slug\":\"pucknsastlp\",\"available\":true},\"locked\":false}")
                        .toObject(ReservedIp.class);
        Assertions.assertEquals("ulbylmgjzrycwpbg", model.getIp());
        Assertions.assertEquals("whm", model.getRegion().getName());
        Assertions.assertEquals("pucknsastlp", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals(false, model.isLocked());
    }

    @Test
    public void testSerialize() {
        ReservedIp model =
                new ReservedIp()
                        .setIp("ulbylmgjzrycwpbg")
                        .setRegion(new ReservedIpRegion().setName("whm").setSlug("pucknsastlp").setAvailable(true))
                        .setLocked(false);
        model = BinaryData.fromObject(model).toObject(ReservedIp.class);
        Assertions.assertEquals("ulbylmgjzrycwpbg", model.getIp());
        Assertions.assertEquals("whm", model.getRegion().getName());
        Assertions.assertEquals("pucknsastlp", model.getRegion().getSlug());
        Assertions.assertEquals(true, model.getRegion().isAvailable());
        Assertions.assertEquals(false, model.isLocked());
    }
}
