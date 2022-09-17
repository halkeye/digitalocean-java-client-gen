package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordATests {
    @Test
    public void testDeserialize() {
        DomainRecordA model =
                BinaryData.fromString(
                                "{\"id\":1572850968,\"type\":\"mgmqfmef\",\"name\":\"qcpdwjgquxwey\",\"data\":\"andkd\",\"priority\":27796894,\"port\":654444535,\"ttl\":1274109411,\"weight\":1603371705,\"flags\":527155493,\"tag\":\"wnrrnquoxso\"}")
                        .toObject(DomainRecordA.class);
        Assertions.assertEquals("mgmqfmef", model.getType());
        Assertions.assertEquals("qcpdwjgquxwey", model.getName());
        Assertions.assertEquals("andkd", model.getData());
        Assertions.assertEquals(27796894, model.getPriority());
        Assertions.assertEquals(654444535, model.getPort());
        Assertions.assertEquals(1274109411, model.getTtl());
        Assertions.assertEquals(1603371705, model.getWeight());
        Assertions.assertEquals(527155493, model.getFlags());
        Assertions.assertEquals("wnrrnquoxso", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordA model =
                new DomainRecordA()
                        .setType("mgmqfmef")
                        .setName("qcpdwjgquxwey")
                        .setData("andkd")
                        .setPriority(27796894)
                        .setPort(654444535)
                        .setTtl(1274109411)
                        .setWeight(1603371705)
                        .setFlags(527155493)
                        .setTag("wnrrnquoxso");
        model = BinaryData.fromObject(model).toObject(DomainRecordA.class);
        Assertions.assertEquals("mgmqfmef", model.getType());
        Assertions.assertEquals("qcpdwjgquxwey", model.getName());
        Assertions.assertEquals("andkd", model.getData());
        Assertions.assertEquals(27796894, model.getPriority());
        Assertions.assertEquals(654444535, model.getPort());
        Assertions.assertEquals(1274109411, model.getTtl());
        Assertions.assertEquals(1603371705, model.getWeight());
        Assertions.assertEquals(527155493, model.getFlags());
        Assertions.assertEquals("wnrrnquoxso", model.getTag());
    }
}
