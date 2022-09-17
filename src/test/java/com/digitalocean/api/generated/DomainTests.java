package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainTests {
    @Test
    public void testDeserialize() {
        Domain model =
                BinaryData.fromString(
                                "{\"name\":\"hkeizcp\",\"ip_address\":\"tdmiwjekptyca\",\"ttl\":1419017791,\"zone_file\":\"zcqymlcfn\"}")
                        .toObject(Domain.class);
        Assertions.assertEquals("hkeizcp", model.getName());
        Assertions.assertEquals("tdmiwjekptyca", model.getIpAddress());
    }

    @Test
    public void testSerialize() {
        Domain model = new Domain().setName("hkeizcp").setIpAddress("tdmiwjekptyca");
        model = BinaryData.fromObject(model).toObject(Domain.class);
        Assertions.assertEquals("hkeizcp", model.getName());
        Assertions.assertEquals("tdmiwjekptyca", model.getIpAddress());
    }
}
