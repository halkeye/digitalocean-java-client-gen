package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.FloatingIp;
import com.digitalocean.api.models.FloatingIpRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"floating_ips\":[{\"ip\":\"uoxrqh\",\"region\":{\"name\":\"inpeswvnhqkgeb\",\"slug\":\"qzmcsviuj\",\"available\":false},\"locked\":false},{\"ip\":\"s\",\"region\":{\"name\":\"osxsxoxvim\",\"slug\":\"vetqhdbitqsbyujs\",\"available\":false},\"locked\":false},{\"ip\":\"u\",\"region\":{\"name\":\"rmsdbvqxgfyg\",\"slug\":\"kgxbdpb\",\"available\":true},\"locked\":true}]}").toObject(Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("uoxrqh", model.getFloatingIps().get(0).getIp());
        Assertions.assertEquals("inpeswvnhqkgeb", model.getFloatingIps().get(0).getRegion().getName());
        Assertions.assertEquals("qzmcsviuj", model.getFloatingIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getFloatingIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(false, model.getFloatingIps().get(0).isLocked());
    }

    @Test
    public void testSerialize() {
        Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0 model = new Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0().setFloatingIps(Arrays.asList(new FloatingIp().setIp("uoxrqh").setRegion(new FloatingIpRegion().setName("inpeswvnhqkgeb").setSlug("qzmcsviuj").setAvailable(false)).setLocked(false), new FloatingIp().setIp("s").setRegion(new FloatingIpRegion().setName("osxsxoxvim").setSlug("vetqhdbitqsbyujs").setAvailable(false)).setLocked(false), new FloatingIp().setIp("u").setRegion(new FloatingIpRegion().setName("rmsdbvqxgfyg").setSlug("kgxbdpb").setAvailable(true)).setLocked(true)));
        model = BinaryData.fromObject(model).toObject(Components4Ss6AcResponsesFloatingIpListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("uoxrqh", model.getFloatingIps().get(0).getIp());
        Assertions.assertEquals("inpeswvnhqkgeb", model.getFloatingIps().get(0).getRegion().getName());
        Assertions.assertEquals("qzmcsviuj", model.getFloatingIps().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getFloatingIps().get(0).getRegion().isAvailable());
        Assertions.assertEquals(false, model.getFloatingIps().get(0).isLocked());
    }
}
