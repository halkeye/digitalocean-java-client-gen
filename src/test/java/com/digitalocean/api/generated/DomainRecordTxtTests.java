package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecord;
import com.digitalocean.api.models.DomainRecordTxt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordTxtTests {
    @Test
    public void testDeserialize() {
        DomainRecordTxt model = BinaryData.fromString("{\"id\":1203432151,\"type\":\"nrbctbhpjhxpcvrd\",\"name\":\"eitaneqadynzjahw\",\"data\":\"uomzczfki\",\"priority\":1238351045,\"port\":9296318,\"ttl\":2097914392,\"weight\":1864136114,\"flags\":34596520,\"tag\":\"axikhfjqebglcxk\"}").toObject(DomainRecordTxt.class);
        Assertions.assertEquals("nrbctbhpjhxpcvrd", model.getType());
        Assertions.assertEquals("eitaneqadynzjahw", model.getName());
        Assertions.assertEquals("uomzczfki", model.getData());
        Assertions.assertEquals(1238351045, model.getPriority());
        Assertions.assertEquals(9296318, model.getPort());
        Assertions.assertEquals(2097914392, model.getTtl());
        Assertions.assertEquals(1864136114, model.getWeight());
        Assertions.assertEquals(34596520, model.getFlags());
        Assertions.assertEquals("axikhfjqebglcxk", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordTxt model = new DomainRecordTxt().setType("nrbctbhpjhxpcvrd").setName("eitaneqadynzjahw").setData("uomzczfki").setPriority(1238351045).setPort(9296318).setTtl(2097914392).setWeight(1864136114).setFlags(34596520).setTag("axikhfjqebglcxk");
        model = BinaryData.fromObject(model).toObject(DomainRecordTxt.class);
        Assertions.assertEquals("nrbctbhpjhxpcvrd", model.getType());
        Assertions.assertEquals("eitaneqadynzjahw", model.getName());
        Assertions.assertEquals("uomzczfki", model.getData());
        Assertions.assertEquals(1238351045, model.getPriority());
        Assertions.assertEquals(9296318, model.getPort());
        Assertions.assertEquals(2097914392, model.getTtl());
        Assertions.assertEquals(1864136114, model.getWeight());
        Assertions.assertEquals(34596520, model.getFlags());
        Assertions.assertEquals("axikhfjqebglcxk", model.getTag());
    }
}
