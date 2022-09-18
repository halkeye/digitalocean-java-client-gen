package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema;
import com.digitalocean.api.models.DomainRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema model = BinaryData.fromString("{\"domain_record\":{\"id\":262113779,\"type\":\"pvpvd\",\"name\":\"ytcovqs\",\"data\":\"srfjbdxzfxnx\",\"priority\":144885282,\"port\":278111652,\"ttl\":1373368105,\"weight\":404347705,\"flags\":1750181750,\"tag\":\"ihdcyyyzlw\"}}").toObject(Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema.class);
        Assertions.assertEquals("pvpvd", model.getDomainRecord().getType());
        Assertions.assertEquals("ytcovqs", model.getDomainRecord().getName());
        Assertions.assertEquals("srfjbdxzfxnx", model.getDomainRecord().getData());
        Assertions.assertEquals(144885282, model.getDomainRecord().getPriority());
        Assertions.assertEquals(278111652, model.getDomainRecord().getPort());
        Assertions.assertEquals(1373368105, model.getDomainRecord().getTtl());
        Assertions.assertEquals(404347705, model.getDomainRecord().getWeight());
        Assertions.assertEquals(1750181750, model.getDomainRecord().getFlags());
        Assertions.assertEquals("ihdcyyyzlw", model.getDomainRecord().getTag());
    }

    @Test
    public void testSerialize() {
        Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema model = new Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema().setDomainRecord(new DomainRecord().setType("pvpvd").setName("ytcovqs").setData("srfjbdxzfxnx").setPriority(144885282).setPort(278111652).setTtl(1373368105).setWeight(404347705).setFlags(1750181750).setTag("ihdcyyyzlw"));
        model = BinaryData.fromObject(model).toObject(Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema.class);
        Assertions.assertEquals("pvpvd", model.getDomainRecord().getType());
        Assertions.assertEquals("ytcovqs", model.getDomainRecord().getName());
        Assertions.assertEquals("srfjbdxzfxnx", model.getDomainRecord().getData());
        Assertions.assertEquals(144885282, model.getDomainRecord().getPriority());
        Assertions.assertEquals(278111652, model.getDomainRecord().getPort());
        Assertions.assertEquals(1373368105, model.getDomainRecord().getTtl());
        Assertions.assertEquals(404347705, model.getDomainRecord().getWeight());
        Assertions.assertEquals(1750181750, model.getDomainRecord().getFlags());
        Assertions.assertEquals("ihdcyyyzlw", model.getDomainRecord().getTag());
    }
}
