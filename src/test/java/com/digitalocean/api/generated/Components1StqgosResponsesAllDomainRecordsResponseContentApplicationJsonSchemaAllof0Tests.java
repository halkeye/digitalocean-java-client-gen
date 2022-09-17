package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.DomainRecord;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"domain_records\":[{\"id\":319967168,\"type\":\"aboohxbmsgyc\",\"name\":\"xrmdvewuyqaeohpj\",\"data\":\"ejkbvhhdaurgho\",\"priority\":548250063,\"port\":457624188,\"ttl\":42981175,\"weight\":1446009255,\"flags\":1802879670,\"tag\":\"oez\"},{\"id\":1137090144,\"type\":\"rkdknko\",\"name\":\"ktmbozomtzami\",\"data\":\"igwcdgzsezn\",\"priority\":1589753042,\"port\":1097107425,\"ttl\":1843059221,\"weight\":168864863,\"flags\":7684953,\"tag\":\"dlqjbedpfixlhu\"}]}")
                        .toObject(
                                Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals("aboohxbmsgyc", model.getDomainRecords().get(0).getType());
        Assertions.assertEquals("xrmdvewuyqaeohpj", model.getDomainRecords().get(0).getName());
        Assertions.assertEquals("ejkbvhhdaurgho", model.getDomainRecords().get(0).getData());
        Assertions.assertEquals(548250063, model.getDomainRecords().get(0).getPriority());
        Assertions.assertEquals(457624188, model.getDomainRecords().get(0).getPort());
        Assertions.assertEquals(42981175, model.getDomainRecords().get(0).getTtl());
        Assertions.assertEquals(1446009255, model.getDomainRecords().get(0).getWeight());
        Assertions.assertEquals(1802879670, model.getDomainRecords().get(0).getFlags());
        Assertions.assertEquals("oez", model.getDomainRecords().get(0).getTag());
    }

    @Test
    public void testSerialize() {
        Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 model =
                new Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0()
                        .setDomainRecords(
                                Arrays.asList(
                                        new DomainRecord()
                                                .setType("aboohxbmsgyc")
                                                .setName("xrmdvewuyqaeohpj")
                                                .setData("ejkbvhhdaurgho")
                                                .setPriority(548250063)
                                                .setPort(457624188)
                                                .setTtl(42981175)
                                                .setWeight(1446009255)
                                                .setFlags(1802879670)
                                                .setTag("oez"),
                                        new DomainRecord()
                                                .setType("rkdknko")
                                                .setName("ktmbozomtzami")
                                                .setData("igwcdgzsezn")
                                                .setPriority(1589753042)
                                                .setPort(1097107425)
                                                .setTtl(1843059221)
                                                .setWeight(168864863)
                                                .setFlags(7684953)
                                                .setTag("dlqjbedpfixlhu")));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals("aboohxbmsgyc", model.getDomainRecords().get(0).getType());
        Assertions.assertEquals("xrmdvewuyqaeohpj", model.getDomainRecords().get(0).getName());
        Assertions.assertEquals("ejkbvhhdaurgho", model.getDomainRecords().get(0).getData());
        Assertions.assertEquals(548250063, model.getDomainRecords().get(0).getPriority());
        Assertions.assertEquals(457624188, model.getDomainRecords().get(0).getPort());
        Assertions.assertEquals(42981175, model.getDomainRecords().get(0).getTtl());
        Assertions.assertEquals(1446009255, model.getDomainRecords().get(0).getWeight());
        Assertions.assertEquals(1802879670, model.getDomainRecords().get(0).getFlags());
        Assertions.assertEquals("oez", model.getDomainRecords().get(0).getTag());
    }
}
