package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordSoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordSoaTests {
    @Test
    public void testDeserialize() {
        DomainRecordSoa model =
                BinaryData.fromString(
                                "{\"id\":1100129775,\"type\":\"ijmri\",\"name\":\"lk\",\"data\":\"eyttlrcxiv\",\"priority\":1144305763,\"port\":1818001448,\"ttl\":9729258,\"weight\":686419317,\"flags\":921492923,\"tag\":\"fluxynbpvz\"}")
                        .toObject(DomainRecordSoa.class);
        Assertions.assertEquals("ijmri", model.getType());
        Assertions.assertEquals("lk", model.getName());
        Assertions.assertEquals("eyttlrcxiv", model.getData());
        Assertions.assertEquals(1144305763, model.getPriority());
        Assertions.assertEquals(1818001448, model.getPort());
        Assertions.assertEquals(9729258, model.getTtl());
        Assertions.assertEquals(686419317, model.getWeight());
        Assertions.assertEquals(921492923, model.getFlags());
        Assertions.assertEquals("fluxynbpvz", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordSoa model =
                new DomainRecordSoa()
                        .setType("ijmri")
                        .setName("lk")
                        .setData("eyttlrcxiv")
                        .setPriority(1144305763)
                        .setPort(1818001448)
                        .setTtl(9729258)
                        .setWeight(686419317)
                        .setFlags(921492923)
                        .setTag("fluxynbpvz");
        model = BinaryData.fromObject(model).toObject(DomainRecordSoa.class);
        Assertions.assertEquals("ijmri", model.getType());
        Assertions.assertEquals("lk", model.getName());
        Assertions.assertEquals("eyttlrcxiv", model.getData());
        Assertions.assertEquals(1144305763, model.getPriority());
        Assertions.assertEquals(1818001448, model.getPort());
        Assertions.assertEquals(9729258, model.getTtl());
        Assertions.assertEquals(686419317, model.getWeight());
        Assertions.assertEquals(921492923, model.getFlags());
        Assertions.assertEquals("fluxynbpvz", model.getTag());
    }
}
