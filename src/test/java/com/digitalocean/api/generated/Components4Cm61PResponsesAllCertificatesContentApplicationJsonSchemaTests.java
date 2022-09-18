package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateType;
import com.digitalocean.api.models.Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":582809262},\"certificates\":[{\"name\":\"ujpdsxzak\",\"not_after\":\"2021-11-27T20:04:30Z\",\"sha1_fingerprint\":\"mvbi\",\"created_at\":\"2021-01-04T23:31:13Z\",\"dns_names\":[\"qcvov\",\"uf\"],\"state\":\"pending\",\"type\":\"custom\"}]}").toObject(Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujpdsxzak", model.getCertificates().get(0).getName());
        Assertions.assertEquals("qcvov", model.getCertificates().get(0).getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getCertificates().get(0).getType());
        Assertions.assertEquals(582809262, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema model = new Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema().setCertificates(Arrays.asList(new Certificate().setName("ujpdsxzak").setDnsNames(Arrays.asList("qcvov", "uf")).setType(CertificateType.CUSTOM))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(582809262));
        model = BinaryData.fromObject(model).toObject(Components4Cm61PResponsesAllCertificatesContentApplicationJsonSchema.class);
        Assertions.assertEquals("ujpdsxzak", model.getCertificates().get(0).getName());
        Assertions.assertEquals("qcvov", model.getCertificates().get(0).getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getCertificates().get(0).getType());
        Assertions.assertEquals(582809262, model.getMeta().getTotal());
    }
}
