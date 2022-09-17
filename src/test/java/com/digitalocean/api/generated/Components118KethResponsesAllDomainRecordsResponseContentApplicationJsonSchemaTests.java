package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.DomainRecord;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1147160390},\"domain_records\":[{\"id\":969217353,\"type\":\"khxrmexznlwkbf\",\"name\":\"xkhupzeruf\",\"data\":\"blcdrmyf\",\"priority\":1613638320,\"port\":253764482,\"ttl\":75791275,\"weight\":226597669,\"flags\":33792220,\"tag\":\"lugekdfqnhtt\"},{\"id\":1510670078,\"type\":\"wrczfjjnnuxxrk\",\"name\":\"hmnulwem\",\"data\":\"cifrhjulrsulwzpf\",\"priority\":1510870728,\"port\":1134501499,\"ttl\":614223056,\"weight\":752546927,\"flags\":1282458881,\"tag\":\"tfriyrgko\"},{\"id\":555453673,\"type\":\"zwx\",\"name\":\"xh\",\"data\":\"hctxbxmolpcqyd\",\"priority\":1239350448,\"port\":1412707963,\"ttl\":366021001,\"weight\":1057619140,\"flags\":1934247518,\"tag\":\"jei\"}]}")
                        .toObject(Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("khxrmexznlwkbf", model.getDomainRecords().get(0).getType());
        Assertions.assertEquals("xkhupzeruf", model.getDomainRecords().get(0).getName());
        Assertions.assertEquals("blcdrmyf", model.getDomainRecords().get(0).getData());
        Assertions.assertEquals(1613638320, model.getDomainRecords().get(0).getPriority());
        Assertions.assertEquals(253764482, model.getDomainRecords().get(0).getPort());
        Assertions.assertEquals(75791275, model.getDomainRecords().get(0).getTtl());
        Assertions.assertEquals(226597669, model.getDomainRecords().get(0).getWeight());
        Assertions.assertEquals(33792220, model.getDomainRecords().get(0).getFlags());
        Assertions.assertEquals("lugekdfqnhtt", model.getDomainRecords().get(0).getTag());
        Assertions.assertEquals(1147160390, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema model =
                new Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema()
                        .setDomainRecords(
                                Arrays.asList(
                                        new DomainRecord()
                                                .setType("khxrmexznlwkbf")
                                                .setName("xkhupzeruf")
                                                .setData("blcdrmyf")
                                                .setPriority(1613638320)
                                                .setPort(253764482)
                                                .setTtl(75791275)
                                                .setWeight(226597669)
                                                .setFlags(33792220)
                                                .setTag("lugekdfqnhtt"),
                                        new DomainRecord()
                                                .setType("wrczfjjnnuxxrk")
                                                .setName("hmnulwem")
                                                .setData("cifrhjulrsulwzpf")
                                                .setPriority(1510870728)
                                                .setPort(1134501499)
                                                .setTtl(614223056)
                                                .setWeight(752546927)
                                                .setFlags(1282458881)
                                                .setTag("tfriyrgko"),
                                        new DomainRecord()
                                                .setType("zwx")
                                                .setName("xh")
                                                .setData("hctxbxmolpcqyd")
                                                .setPriority(1239350448)
                                                .setPort(1412707963)
                                                .setTtl(366021001)
                                                .setWeight(1057619140)
                                                .setFlags(1934247518)
                                                .setTag("jei")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1147160390));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components118KethResponsesAllDomainRecordsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("khxrmexznlwkbf", model.getDomainRecords().get(0).getType());
        Assertions.assertEquals("xkhupzeruf", model.getDomainRecords().get(0).getName());
        Assertions.assertEquals("blcdrmyf", model.getDomainRecords().get(0).getData());
        Assertions.assertEquals(1613638320, model.getDomainRecords().get(0).getPriority());
        Assertions.assertEquals(253764482, model.getDomainRecords().get(0).getPort());
        Assertions.assertEquals(75791275, model.getDomainRecords().get(0).getTtl());
        Assertions.assertEquals(226597669, model.getDomainRecords().get(0).getWeight());
        Assertions.assertEquals(33792220, model.getDomainRecords().get(0).getFlags());
        Assertions.assertEquals("lugekdfqnhtt", model.getDomainRecords().get(0).getTag());
        Assertions.assertEquals(1147160390, model.getMeta().getTotal());
    }
}
