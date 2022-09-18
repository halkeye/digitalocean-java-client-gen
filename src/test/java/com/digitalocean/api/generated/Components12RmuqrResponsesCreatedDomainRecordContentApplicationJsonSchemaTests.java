package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema;
import com.digitalocean.api.models.DomainRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema model = BinaryData.fromString("{\"domain_record\":{\"id\":133600558,\"type\":\"romv\",\"name\":\"ysemtmesrfsvpin\",\"data\":\"pat\",\"priority\":1838924635,\"port\":1014316985,\"ttl\":574098117,\"weight\":852211061,\"flags\":689179131,\"tag\":\"ojazbbgspfte\"}}").toObject(Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema.class);
        Assertions.assertEquals("romv", model.getDomainRecord().getType());
        Assertions.assertEquals("ysemtmesrfsvpin", model.getDomainRecord().getName());
        Assertions.assertEquals("pat", model.getDomainRecord().getData());
        Assertions.assertEquals(1838924635, model.getDomainRecord().getPriority());
        Assertions.assertEquals(1014316985, model.getDomainRecord().getPort());
        Assertions.assertEquals(574098117, model.getDomainRecord().getTtl());
        Assertions.assertEquals(852211061, model.getDomainRecord().getWeight());
        Assertions.assertEquals(689179131, model.getDomainRecord().getFlags());
        Assertions.assertEquals("ojazbbgspfte", model.getDomainRecord().getTag());
    }

    @Test
    public void testSerialize() {
        Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema model = new Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema().setDomainRecord(new DomainRecord().setType("romv").setName("ysemtmesrfsvpin").setData("pat").setPriority(1838924635).setPort(1014316985).setTtl(574098117).setWeight(852211061).setFlags(689179131).setTag("ojazbbgspfte"));
        model = BinaryData.fromObject(model).toObject(Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema.class);
        Assertions.assertEquals("romv", model.getDomainRecord().getType());
        Assertions.assertEquals("ysemtmesrfsvpin", model.getDomainRecord().getName());
        Assertions.assertEquals("pat", model.getDomainRecord().getData());
        Assertions.assertEquals(1838924635, model.getDomainRecord().getPriority());
        Assertions.assertEquals(1014316985, model.getDomainRecord().getPort());
        Assertions.assertEquals(574098117, model.getDomainRecord().getTtl());
        Assertions.assertEquals(852211061, model.getDomainRecord().getWeight());
        Assertions.assertEquals(689179131, model.getDomainRecord().getFlags());
        Assertions.assertEquals("ojazbbgspfte", model.getDomainRecord().getTag());
    }
}
