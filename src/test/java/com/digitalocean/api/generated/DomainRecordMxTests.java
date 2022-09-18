package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecord;
import com.digitalocean.api.models.DomainRecordMx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordMxTests {
    @Test
    public void testDeserialize() {
        DomainRecordMx model = BinaryData.fromString("{\"id\":1042017046,\"type\":\"s\",\"name\":\"iaieswhddzydi\",\"data\":\"uepy\",\"priority\":1970437533,\"port\":213451574,\"ttl\":1295638315,\"weight\":2079087223,\"flags\":1590298036,\"tag\":\"diiaocqibzji\"}").toObject(DomainRecordMx.class);
        Assertions.assertEquals("s", model.getType());
        Assertions.assertEquals("iaieswhddzydi", model.getName());
        Assertions.assertEquals("uepy", model.getData());
        Assertions.assertEquals(1970437533, model.getPriority());
        Assertions.assertEquals(213451574, model.getPort());
        Assertions.assertEquals(1295638315, model.getTtl());
        Assertions.assertEquals(2079087223, model.getWeight());
        Assertions.assertEquals(1590298036, model.getFlags());
        Assertions.assertEquals("diiaocqibzji", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordMx model = new DomainRecordMx().setType("s").setName("iaieswhddzydi").setData("uepy").setPriority(1970437533).setPort(213451574).setTtl(1295638315).setWeight(2079087223).setFlags(1590298036).setTag("diiaocqibzji");
        model = BinaryData.fromObject(model).toObject(DomainRecordMx.class);
        Assertions.assertEquals("s", model.getType());
        Assertions.assertEquals("iaieswhddzydi", model.getName());
        Assertions.assertEquals("uepy", model.getData());
        Assertions.assertEquals(1970437533, model.getPriority());
        Assertions.assertEquals(213451574, model.getPort());
        Assertions.assertEquals(1295638315, model.getTtl());
        Assertions.assertEquals(2079087223, model.getWeight());
        Assertions.assertEquals(1590298036, model.getFlags());
        Assertions.assertEquals("diiaocqibzji", model.getTag());
    }
}
