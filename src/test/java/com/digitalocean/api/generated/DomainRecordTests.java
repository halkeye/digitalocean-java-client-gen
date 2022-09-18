package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordTests {
    @Test
    public void testDeserialize() {
        DomainRecord model = BinaryData.fromString("{\"id\":1570012392,\"type\":\"mihzbdnpxp\",\"name\":\"dpr\",\"data\":\"xelyicghflr\",\"priority\":216422946,\"port\":574077072,\"ttl\":2140503117,\"weight\":1056053067,\"flags\":1781553839,\"tag\":\"kb\"}").toObject(DomainRecord.class);
        Assertions.assertEquals("mihzbdnpxp", model.getType());
        Assertions.assertEquals("dpr", model.getName());
        Assertions.assertEquals("xelyicghflr", model.getData());
        Assertions.assertEquals(216422946, model.getPriority());
        Assertions.assertEquals(574077072, model.getPort());
        Assertions.assertEquals(2140503117, model.getTtl());
        Assertions.assertEquals(1056053067, model.getWeight());
        Assertions.assertEquals(1781553839, model.getFlags());
        Assertions.assertEquals("kb", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecord model = new DomainRecord().setType("mihzbdnpxp").setName("dpr").setData("xelyicghflr").setPriority(216422946).setPort(574077072).setTtl(2140503117).setWeight(1056053067).setFlags(1781553839).setTag("kb");
        model = BinaryData.fromObject(model).toObject(DomainRecord.class);
        Assertions.assertEquals("mihzbdnpxp", model.getType());
        Assertions.assertEquals("dpr", model.getName());
        Assertions.assertEquals("xelyicghflr", model.getData());
        Assertions.assertEquals(216422946, model.getPriority());
        Assertions.assertEquals(574077072, model.getPort());
        Assertions.assertEquals(2140503117, model.getTtl());
        Assertions.assertEquals(1056053067, model.getWeight());
        Assertions.assertEquals(1781553839, model.getFlags());
        Assertions.assertEquals("kb", model.getTag());
    }
}
