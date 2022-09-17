package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordAaaa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordAaaaTests {
    @Test
    public void testDeserialize() {
        DomainRecordAaaa model =
                BinaryData.fromString(
                                "{\"id\":1932285332,\"type\":\"eimseobfsxstcyil\",\"name\":\"zmmx\",\"data\":\"zlquzexo\",\"priority\":1852997398,\"port\":531411541,\"ttl\":1440326594,\"weight\":1964355203,\"flags\":217627140,\"tag\":\"abwmvogljsv\"}")
                        .toObject(DomainRecordAaaa.class);
        Assertions.assertEquals("eimseobfsxstcyil", model.getType());
        Assertions.assertEquals("zmmx", model.getName());
        Assertions.assertEquals("zlquzexo", model.getData());
        Assertions.assertEquals(1852997398, model.getPriority());
        Assertions.assertEquals(531411541, model.getPort());
        Assertions.assertEquals(1440326594, model.getTtl());
        Assertions.assertEquals(1964355203, model.getWeight());
        Assertions.assertEquals(217627140, model.getFlags());
        Assertions.assertEquals("abwmvogljsv", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordAaaa model =
                new DomainRecordAaaa()
                        .setType("eimseobfsxstcyil")
                        .setName("zmmx")
                        .setData("zlquzexo")
                        .setPriority(1852997398)
                        .setPort(531411541)
                        .setTtl(1440326594)
                        .setWeight(1964355203)
                        .setFlags(217627140)
                        .setTag("abwmvogljsv");
        model = BinaryData.fromObject(model).toObject(DomainRecordAaaa.class);
        Assertions.assertEquals("eimseobfsxstcyil", model.getType());
        Assertions.assertEquals("zmmx", model.getName());
        Assertions.assertEquals("zlquzexo", model.getData());
        Assertions.assertEquals(1852997398, model.getPriority());
        Assertions.assertEquals(531411541, model.getPort());
        Assertions.assertEquals(1440326594, model.getTtl());
        Assertions.assertEquals(1964355203, model.getWeight());
        Assertions.assertEquals(217627140, model.getFlags());
        Assertions.assertEquals("abwmvogljsv", model.getTag());
    }
}
