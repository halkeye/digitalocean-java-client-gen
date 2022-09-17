package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordCaa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordCaaTests {
    @Test
    public void testDeserialize() {
        DomainRecordCaa model =
                BinaryData.fromString(
                                "{\"id\":387760911,\"type\":\"idnwceha\",\"name\":\"do\",\"data\":\"l\",\"priority\":1237789789,\"port\":1849168573,\"ttl\":1019863501,\"weight\":460615176,\"flags\":801948793,\"tag\":\"aeapfsergd\"}")
                        .toObject(DomainRecordCaa.class);
        Assertions.assertEquals("idnwceha", model.getType());
        Assertions.assertEquals("do", model.getName());
        Assertions.assertEquals("l", model.getData());
        Assertions.assertEquals(1237789789, model.getPriority());
        Assertions.assertEquals(1849168573, model.getPort());
        Assertions.assertEquals(1019863501, model.getTtl());
        Assertions.assertEquals(460615176, model.getWeight());
        Assertions.assertEquals(801948793, model.getFlags());
        Assertions.assertEquals("aeapfsergd", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordCaa model =
                new DomainRecordCaa()
                        .setType("idnwceha")
                        .setName("do")
                        .setData("l")
                        .setPriority(1237789789)
                        .setPort(1849168573)
                        .setTtl(1019863501)
                        .setWeight(460615176)
                        .setFlags(801948793)
                        .setTag("aeapfsergd");
        model = BinaryData.fromObject(model).toObject(DomainRecordCaa.class);
        Assertions.assertEquals("idnwceha", model.getType());
        Assertions.assertEquals("do", model.getName());
        Assertions.assertEquals("l", model.getData());
        Assertions.assertEquals(1237789789, model.getPriority());
        Assertions.assertEquals(1849168573, model.getPort());
        Assertions.assertEquals(1019863501, model.getTtl());
        Assertions.assertEquals(460615176, model.getWeight());
        Assertions.assertEquals(801948793, model.getFlags());
        Assertions.assertEquals("aeapfsergd", model.getTag());
    }
}
