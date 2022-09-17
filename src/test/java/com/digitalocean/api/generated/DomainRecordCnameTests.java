package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordCname;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordCnameTests {
    @Test
    public void testDeserialize() {
        DomainRecordCname model =
                BinaryData.fromString(
                                "{\"id\":585851582,\"type\":\"qnacyheq\",\"name\":\"pqqncju\",\"data\":\"hjozf\",\"priority\":1317599816,\"port\":169938072,\"ttl\":375285538,\"weight\":905389946,\"flags\":1902620686,\"tag\":\"vliqiips\"}")
                        .toObject(DomainRecordCname.class);
        Assertions.assertEquals("qnacyheq", model.getType());
        Assertions.assertEquals("pqqncju", model.getName());
        Assertions.assertEquals("hjozf", model.getData());
        Assertions.assertEquals(1317599816, model.getPriority());
        Assertions.assertEquals(169938072, model.getPort());
        Assertions.assertEquals(375285538, model.getTtl());
        Assertions.assertEquals(905389946, model.getWeight());
        Assertions.assertEquals(1902620686, model.getFlags());
        Assertions.assertEquals("vliqiips", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordCname model =
                new DomainRecordCname()
                        .setType("qnacyheq")
                        .setName("pqqncju")
                        .setData("hjozf")
                        .setPriority(1317599816)
                        .setPort(169938072)
                        .setTtl(375285538)
                        .setWeight(905389946)
                        .setFlags(1902620686)
                        .setTag("vliqiips");
        model = BinaryData.fromObject(model).toObject(DomainRecordCname.class);
        Assertions.assertEquals("qnacyheq", model.getType());
        Assertions.assertEquals("pqqncju", model.getName());
        Assertions.assertEquals("hjozf", model.getData());
        Assertions.assertEquals(1317599816, model.getPriority());
        Assertions.assertEquals(169938072, model.getPort());
        Assertions.assertEquals(375285538, model.getTtl());
        Assertions.assertEquals(905389946, model.getWeight());
        Assertions.assertEquals(1902620686, model.getFlags());
        Assertions.assertEquals("vliqiips", model.getTag());
    }
}
