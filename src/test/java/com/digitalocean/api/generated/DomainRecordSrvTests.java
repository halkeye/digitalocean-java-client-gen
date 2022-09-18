package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecord;
import com.digitalocean.api.models.DomainRecordSrv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordSrvTests {
    @Test
    public void testDeserialize() {
        DomainRecordSrv model = BinaryData.fromString("{\"id\":860957040,\"type\":\"wa\",\"name\":\"qnjckhmocg\",\"data\":\"hgouarh\",\"priority\":767118603,\"port\":1482799442,\"ttl\":1502515308,\"weight\":902896501,\"flags\":1216537782,\"tag\":\"bsjrclrv\"}").toObject(DomainRecordSrv.class);
        Assertions.assertEquals("wa", model.getType());
        Assertions.assertEquals("qnjckhmocg", model.getName());
        Assertions.assertEquals("hgouarh", model.getData());
        Assertions.assertEquals(767118603, model.getPriority());
        Assertions.assertEquals(1482799442, model.getPort());
        Assertions.assertEquals(1502515308, model.getTtl());
        Assertions.assertEquals(902896501, model.getWeight());
        Assertions.assertEquals(1216537782, model.getFlags());
        Assertions.assertEquals("bsjrclrv", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordSrv model = new DomainRecordSrv().setType("wa").setName("qnjckhmocg").setData("hgouarh").setPriority(767118603).setPort(1482799442).setTtl(1502515308).setWeight(902896501).setFlags(1216537782).setTag("bsjrclrv");
        model = BinaryData.fromObject(model).toObject(DomainRecordSrv.class);
        Assertions.assertEquals("wa", model.getType());
        Assertions.assertEquals("qnjckhmocg", model.getName());
        Assertions.assertEquals("hgouarh", model.getData());
        Assertions.assertEquals(767118603, model.getPriority());
        Assertions.assertEquals(1482799442, model.getPort());
        Assertions.assertEquals(1502515308, model.getTtl());
        Assertions.assertEquals(902896501, model.getWeight());
        Assertions.assertEquals(1216537782, model.getFlags());
        Assertions.assertEquals("bsjrclrv", model.getTag());
    }
}
